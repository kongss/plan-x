package com.plan.api;

import com.plan.utils.bean.MessengerVo;

public interface DProjectService {

    MessengerVo queryProject(MessengerVo messenger);

    MessengerVo queryProjectList(MessengerVo messenger);

    MessengerVo updateProject(MessengerVo messenger);

    MessengerVo deleteProject(MessengerVo messenger);
}
