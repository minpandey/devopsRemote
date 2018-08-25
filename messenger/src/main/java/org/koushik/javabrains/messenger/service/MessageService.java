package org.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.koushik.javabrains.messenger.model.Message;

public class MessageService {
	
  Map<Long,Message> message = StaticMapDatabase.getMessageMap();
	 

  
  
  public MessageService() {
	message.put(1L,new Message(1L,"Hello min","min"));
	message.put(4L,new Message(4L,"Hello Pratiksha","Pari"));
	message.put(2L,new Message(2L,"Hello Bhabi ","Bhabi"));
	message.put(3L, new Message(3L,"Hello Jamkala","Jam"));
	
}

  public List<Message> getAllMessages(){
	  return new ArrayList<Message>(message.values());
  }

  
  public Message geMesssage(Long key){
	  return message.get(key);
  }
  
  
  public Message insertMesssage(Message m){
	  long id =message.size()+1; 
	  m.setId(id);
	  return message.put(id, m);
  }
  
  
  public Message updateMesssage(Message m,long key){
	 // message.remove(key);
	  return (key<0)?null : message.put(key, m);
	 
  }
  
  
  public Message deleteMesssage(Long key){
	  return message.remove(key);
  }
/*public List<Message> getAllMessages(){

	Message m1 =new Message(1L,"Hello min","min");
	Message m2 =new Message(2L,"Hello Bhabi ","Bhabi");
	Message m3 =new Message(3L,"Hello Jamkala","Jam");
	Message m4 =new Message(4L,"Hello Pratiksha","Pari");
	List<Message> list = new ArrayList<Message>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	return list;	
	
}*/

}
