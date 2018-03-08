package com.yiche.rabbitmq.test;

import com.yiche.rabbitmqtest.Application;
import com.yiche.rabbitmqtest.MessageCreater;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(value=SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RabbitTests {

    @Autowired
    private MessageCreater msgSender;

    @Test
    public void sendTest() throws Exception {
        while(true){
            String msg = new Date().toString();
            msgSender.send(msg);
            Thread.sleep(1000);
        }
    }
}

