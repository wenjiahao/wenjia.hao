package wen.jia.hao.serviceImpl;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
import javax.jms.*;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Receiver_hao {
    public static void main(String[] args) {
        // ConnectionFactory ：连接工厂，JMS 用它创建连接
        ConnectionFactory connectionFactory;
        // Connection ：JMS 客户端到JMS Provider 的连接
        Connection connection = null;
        // Session： 一个发送或接收消息的线程
        Session session;
        // Destination ：消息的目的地;消息发送给谁.
        //Topic destination;
        Destination destination;
        // 消费者，消息接收者
        MessageConsumer consumer;
        connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD,
                "failover:(tcp://192.168.146.111:51511,tcp://192.168.146.112:51512,tcp://192.168.146.113:51513)");
        try {
            // 构造从工厂得到连接对象
            connection = connectionFactory.createConnection();
            connection.setClientID("chijiudingyue");
            // 启动
            connection.start();
            // 获取操作连接
            session = connection.createSession(Boolean.FALSE,
                    Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("nimaqueue");
            consumer = session.createConsumer(destination);
            //TopicSubscriber durableSubscriber = session.createDurableSubscriber(niamtopic, "1111");
            while (true) {
                //设置接收者接收消息的时间，为了便于测试，这里谁定为100s
                TextMessage message = (TextMessage) consumer.receive(100000);
                if (null != message) {
                    System.out.println("收到消息" + message.getText());
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection)
                    connection.close();
            } catch (Throwable ignore) {
            }
        }
    }
}