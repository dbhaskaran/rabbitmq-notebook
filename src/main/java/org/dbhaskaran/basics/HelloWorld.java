package org.dbhaskaran.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	private static final Logger Logger = LoggerFactory.getLogger(HelloWorld.class);
	public static void main(String[] args) throws Exception {
		
		Logger.info("Hello RabbitMQ 🐰!");
		Logger.info("Starting Receiver-----------");
		Recv.main(null);
		Logger.info("Sleep for 2 seconds-----------");
		Thread.sleep(2000);
		Logger.info("Starting Sender-----------");
		Send.main(null);

	}

}
