package com.plan.service.impl;

import com.alibaba.fastjson.JSON;
import com.plan.dao.PlanMapper;
import com.plan.entity.Plan;
import com.plan.service.PlanService;
import com.plan.utils.bean.MessengerVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlanServiceImpl implements PlanService {

    private final static Logger logger = LoggerFactory.getLogger(PlanServiceImpl.class);

    @Resource
    PlanMapper PlanMapper;

    public MessengerVo queryPlan(MessengerVo messenger) {
        MessengerVo resVo = new MessengerVo();
        logger.info("通过id查询Plan信息参数:{}", JSON.toJSONString(messenger));
        String id = messenger.getString("id");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        List<Map<String, Object>> planList = PlanMapper.getPlanList(map);
        resVo.setInfo("planList", planList);
        logger.info("通过id查询Plan信息结果:{}", JSON.toJSONString(resVo));
        return resVo;
    }
}
