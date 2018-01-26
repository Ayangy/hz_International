package com.yuwubao.hz_International.controllers.sys;

import com.yuwubao.hz_International.entities.SysConfigEntity;
import com.yuwubao.hz_International.services.SysConfigService;
import com.yuwubao.hz_International.util.Const;
import com.yuwubao.hz_International.util.RestApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yangyu on 2018/1/25.
 */
@RestController
@RequestMapping("/sys")
@Transactional
@CrossOrigin
public class SysLoginController {

    private final static Logger logger = LoggerFactory.getLogger(SysLoginController.class);

    @Autowired
    private SysConfigService sysConfigService;

    @PostMapping("/login")
    public RestApiResponse<SysConfigEntity> login(@RequestParam String userAccount,
                                                  @RequestParam String password) {
        RestApiResponse<SysConfigEntity> result = new RestApiResponse<SysConfigEntity>();
        try {
            SysConfigEntity sysConfigEntity = sysConfigService.findByUserAccountAndPassword(userAccount, password);
            if (sysConfigEntity == null) {
                result.failedApiResponse(Const.FAILED, "账号或密码错误");
                return result;
            }
            result.successResponse(Const.SUCCESS, sysConfigEntity, "登录成功");
        } catch (Exception e) {
            logger.warn("登录异常", e);
            result.failedApiResponse(Const.FAILED, "登录异常");
        }
        return result;
    }


}
