package com.yuwubao.hz_International.controllers.app;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.yuwubao.hz_International.entities.ConsumerEntity;
import com.yuwubao.hz_International.services.ConsumerService;
import com.yuwubao.hz_International.util.Const;
import com.yuwubao.hz_International.util.MD5;
import com.yuwubao.hz_International.util.RestApiResponse;
import com.yuwubao.hz_International.util.SMSUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

/**
 * Created by yangyu on 2018/1/25.
 */
@RestController
@RequestMapping("/app/consumer")
@Transactional
@CrossOrigin
public class ConsumerController {

    private final static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private ConsumerService consumerService;

    /**
     * 发送短信验证码
     */
    @GetMapping("/getSMSCaptcha")
    public RestApiResponse<String> getSMSCaptcha(@RequestParam String mobile) {
        RestApiResponse<String> result = new RestApiResponse<String>();
        try {
            String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
            SendSmsResponse sendSmsResponse = SMSUtil.sendSms(mobile, verifyCode);
            if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                result.successResponse(Const.SUCCESS, verifyCode, "获取验证码成功");
                return result;
            }
            result.failedApiResponse(Const.FAILED, "获取验证码失败");
        } catch (ClientException e) {
            logger.warn("获取短信验证码异常", e);
            result.failedApiResponse(Const.FAILED, "获取短信验证码异常");
        }
        return result;
    }

    /**
     * 注册
     * @return
     */
    @PostMapping("/register")
    public RestApiResponse<ConsumerEntity> register(@RequestParam String phone,
                                                    @RequestParam String password,
                                                    @RequestParam String invitePhone) {
        RestApiResponse<ConsumerEntity> result = new RestApiResponse<ConsumerEntity>();
        try {
            ConsumerEntity consumerEntity = consumerService.findByPhone(phone);
            if (consumerEntity != null) {
                result.failedApiResponse(Const.FAILED, "您已注册");
                return result;
            }

            ConsumerEntity createConsumerEntity = new ConsumerEntity();
            createConsumerEntity.setPhone(phone);
            createConsumerEntity.setPassword(MD5.md5(password));
            createConsumerEntity.setCreateTime(new Date());
            createConsumerEntity.setInvitePhone(invitePhone);
            ConsumerEntity entity = consumerService.save(createConsumerEntity);
            if (entity == null) {
                result.failedApiResponse(Const.FAILED, "注册失败,请稍后再试");
                return result;
            }

            result.successResponse(Const.SUCCESS, entity, "注册成功");

        } catch (Exception e) {
            logger.warn("注册异常", e);
            result.failedApiResponse(Const.FAILED, "注册异常");
        }
        return result;
    }

    /**
     * 登录
     * @return
     */
    @PostMapping("/login")
    public RestApiResponse<ConsumerEntity> login(@RequestParam String phone,
                                                 @RequestParam String password) {
        RestApiResponse<ConsumerEntity> result = new RestApiResponse<ConsumerEntity>();
        try {
            ConsumerEntity consumerEntity = consumerService.findByPhone(phone);
            if (consumerEntity == null) {
                result.failedApiResponse(Const.FAILED, "您还未注册,请先注册");
                return result;
            }
            String pwd = MD5.md5(password);
            ConsumerEntity entity = consumerService.findByPhoneAndPassword(phone, pwd);
            if (entity == null) {
                result.failedApiResponse(Const.FAILED, "密码错误");
                return result;
            }
            result.successResponse(Const.SUCCESS, entity, "登录成功");
        } catch (Exception e) {
            logger.warn("登录异常", e);
            result.failedApiResponse(Const.FAILED, "登录异常");
        }
        return null;
    }


}
