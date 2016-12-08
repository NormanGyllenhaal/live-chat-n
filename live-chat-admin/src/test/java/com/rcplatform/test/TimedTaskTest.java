package com.rcplatform.test;

import com.rcplatform.livechat.Application;
import com.rcplatform.livechat.task.PushTask;
import com.rcplatform.livechat.task.TimedTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by admin on 2016/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TimedTaskTest {

    @Autowired
    private TimedTask timedTask;


    @Test
    public void testPushTask(){
        timedTask.userStatisticsTask();
    }


    @Test
    public void testDayTask(){
        timedTask.statisticsDayTask();
    }


    @Test
    public void testPayTask(){
        timedTask.payStatDayTask();
    }

    @Test
    public void testMatchTask(){
        timedTask.matchNumDayTask();
    }
}
