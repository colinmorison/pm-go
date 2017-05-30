package cn.mfy.pmgo.service;

import cn.mfy.pmgo.model.User;

public interface UserService {
	User addUser(User user);
	User deleteUser(Long id);
//	List<User> findAll(String userId);
	User findById(Long id);
	User update(User user);
}
