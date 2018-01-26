package com.yuwubao.hz_International.controllers.sys;

import com.yuwubao.hz_International.entities.BonousDetailEntity;
import com.yuwubao.hz_International.entities.ConsumerEntity;
import com.yuwubao.hz_International.entities.MoneyDetailEntity;
import com.yuwubao.hz_International.entities.RechargeConfigEntity;
import com.yuwubao.hz_International.entities.vo.BackstageRechargeVo;
import com.yuwubao.hz_International.services.BonousDetailService;
import com.yuwubao.hz_International.services.ConsumerService;
import com.yuwubao.hz_International.services.MoneyDetailService;
import com.yuwubao.hz_International.services.RechargeConfigService;
import com.yuwubao.hz_International.util.Const;
import com.yuwubao.hz_International.util.RestApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by yangyu on 2018/1/26.
 */
@RestController
@RequestMapping("/sys/rechargeManage")
@Transactional
@CrossOrigin
public class RechargeManageController {

    private final static Logger logger = LoggerFactory.getLogger(RechargeManageController.class);

    @Autowired
    private MoneyDetailService moneyDetailService;

    @Autowired
    private RechargeConfigService rechargeConfigService;

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private BonousDetailService bonousDetailService;

    /**
     * 会员充值
     * @param backstageRechargeVo
     * @return
     */
    @PostMapping("/consumerRecharge")
    public RestApiResponse<Boolean> consumerRecharge(@RequestBody BackstageRechargeVo backstageRechargeVo) {
        RestApiResponse<Boolean> result = new RestApiResponse<Boolean>();
        try {
            ConsumerEntity consumerEntity = consumerService.findByPhone(backstageRechargeVo.getPhone());
            if (consumerEntity == null) {
                result.failedApiResponse(Const.FAILED, "该会员不存在,请确认后再充值");
                return result;
            }
            RechargeConfigEntity rechargeConfig = rechargeConfigService.findById(consumerEntity.getRechargeConfigId());
            if (rechargeConfig == null) {
                result.failedApiResponse(Const.FAILED, "请在活动管理-比例设置-充值管理中配置后再充值");
                return result;
            }
            if (backstageRechargeVo.getRechargeMoney().compareTo(rechargeConfig.getMinRechargeMoney()) == -1) {
                result.failedApiResponse(Const.FAILED, "起充金额为" + rechargeConfig.getMinRechargeMoney());
                return result;
            }

            //消费金充值记录
            MoneyDetailEntity moneyDetail = new MoneyDetailEntity();
            moneyDetail.setConsumerId(consumerEntity.getId());
            moneyDetail.setCreateTime(new Date());
            moneyDetail.setMoney(backstageRechargeVo.getRechargeMoney());
            moneyDetail.setPayType(backstageRechargeVo.getType());
            moneyDetail.setBonouse(backstageRechargeVo.getBonous());
            MoneyDetailEntity moneyDetailEntity =  moneyDetailService.save(moneyDetail);

            //积分记录
            BonousDetailEntity bonousDetail = new BonousDetailEntity();


        } catch (Exception e) {
            logger.warn("充值异常", e);
            result.failedApiResponse(Const.FAILED, "充值异常");
        }
        return result;
    }


}
