package org.koushik.javabrains.messenger.service;

import java.util.HashMap;
import java.util.Map;

import org.koushik.javabrains.messenger.model.Message;

public class StaticMapDatabase {
	
   private static Map<Long,Message> messageMap =new HashMap<Long,Message>();

	public static Map<Long, Message> getMessageMap() {
		return messageMap;
	}

}
