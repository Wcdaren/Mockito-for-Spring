package com.wcdaren.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountJob {

	@Autowired
	private SMSTask smsTask;

	public void process() throws InterruptedException, ExecutionException {
		System.out.println("Going to find defaulters... ");
		Future<Boolean> asyncResult =smsTask.send("1", "2", "3");
		System.out
				.println("Defaulter Job Complete. SMS will be sent to all defaulter");
		
		Boolean result = asyncResult.get();
		 
        System.out.println("Was SMS sent? " + result);
	}
}
