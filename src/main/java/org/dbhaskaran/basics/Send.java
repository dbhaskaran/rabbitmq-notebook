package org.dbhaskaran.basics;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

  private final static String QUEUE_NAME = "hello";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("0.0.0.0");
    factory.setUsername("admin");
    factory.setPassword("admin");
    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
    
    for(int i=0; i<=25 ; i++) {
    		sendMsg(channel);
    }
    

    channel.close();
    connection.close();
  }

private static void sendMsg(Channel channel) throws IOException, UnsupportedEncodingException, InterruptedException {
	String message;
	Random rand = new Random();
	int  n = rand.nextInt(100) + 1;
	message = String.format("Testing %x", n);
    channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
    System.out.println(" [x] Sent '" + message + "'");
    Thread.sleep(2000);
}
}
