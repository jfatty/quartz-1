package com.hsl.quartz02.quartz;

import com.hsl.quartz02.service.ScheduleTriggerParamService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MyJob1 implements Job {

    @Autowired
    private ScheduleTriggerParamService scheduleTriggerParamService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail jobDetail =
                jobExecutionContext.getJobDetail();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        System.out.println(new Date().toLocaleString()+"-->携带参数个数:"+jobDataMap.size());
    }
}