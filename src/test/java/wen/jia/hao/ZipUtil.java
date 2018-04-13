/*
 * 
 * Copyright 2016 by www.cgbchina.com.cn All rights reserved.
 * 
 */
package wen.jia.hao;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQObjectMessage;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.apache.commons.lang3.StringUtils;
import wen.jia.hao.entity.Test1Entity;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.io.*;
import java.util.Dictionary;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * 日期 : 2016年6月22日<br>
 * 作者 : liuyc<br>
 * 项目 : cgb-common<br>
 * 功能 : zip文件压缩/解压缩用工具类<br>
 */
public class ZipUtil {
	public static void main(String[] args) throws Exception {
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, "failover:(tcp://118.89.40.42:61616)");
		QueueConnection queueConnection = activeMQConnectionFactory.createQueueConnection();
		queueConnection.start();
		Session session = queueConnection.createSession(true, Session.AUTO_ACKNOWLEDGE);
		MessageConsumer hao = session.createConsumer(session.createQueue("duilie"));
		hao.setMessageListener(new MessageListener() {
			@Override
			public void onMessage(Message message)  {
				try {
					System.err.println(((TextMessage) message).getText());
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		});
		session.commit();
		/*Queue duilie = session.createQueue("duilie");
		TextMessage textMessage = session.createTextMessage();
		textMessage.setText("nima");
		MessageProducer producer = session.createProducer(duilie);
		producer.send(textMessage);*/



	}


}
