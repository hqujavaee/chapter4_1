package cn.edu.hqu.javaee.chapter4_1.repository;

import java.util.List;

import cn.edu.hqu.javaee.chapter4_1.entity.Message;

public interface MessageRepository {
	
	public List<Message> findMessageByUserName(String userName);
	public void save(Message message);

}
