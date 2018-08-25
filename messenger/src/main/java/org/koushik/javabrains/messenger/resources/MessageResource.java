package org.koushik.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService =new MessageService();
	
	@GET
	@Path("/j")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getjasonMessages() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("messageid")  long messageid ) {
		return messageService.geMesssage(messageid);
	}
	
	@GET
	@Path("/j/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessageJason(@PathParam("messageid")  long messageid ) {
		return messageService.geMesssage(messageid);
	}
	
	@POST
	@Path("/x")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Message postMessage(Message m ) {
		return messageService.insertMesssage(m);
	}
	
	@POST
	@Path("/j")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message postJMessage(Message m ) {
		return messageService.insertMesssage(m);
	}
	
	@PUT
	@Path("/x/{messageid}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Message putMessage(@PathParam("messageid")  long messageid ,Message m ) {
		m.setId(messageid);
		return messageService.updateMesssage(m, messageid);
	}
	
	@PUT
	@Path("/j/{messageid}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message putJMessage(@PathParam("messageid")  long messageid ,Message m ) {
		return messageService.updateMesssage(m, messageid);
	}
	
	@DELETE
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_XML)
	public Message deleteMessage(@PathParam("messageid")  long messageid ) {
		return messageService.deleteMesssage(messageid);
	}
	
	@DELETE
	@Path("/j/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message deletejMessage(@PathParam("messageid")  long messageid ) {
		return messageService.deleteMesssage(messageid);
	}
	
	
/*	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}*/
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public List<Message> getMessages() {
//		return MessageService.getAllMessages() ;
//	}
}
