package wen.jia.hao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wen.jia.hao.serviceImpl.AcountServiceImpl;

import java.io.FileInputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring.xml")
public class TestClass extends AbstractJUnit4SpringContextTests {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    public void test() {


        wen.jia.hao.Test test = new wen.jia.hao.Test();
         test.nima();



    }

}
