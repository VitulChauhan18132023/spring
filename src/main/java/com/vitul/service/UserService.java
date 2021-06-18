package com.vitul.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vitul.model.User;
import com.vitul.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		List<User> user = new ArrayList<User>();
		userRepository.findAll().forEach(user1 -> user.add(user1));
		return user;

	}

	public User getBooksById(int userid) {
		return userRepository.findById(userid).get();
	}

	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}

	public void delete(int userid) {
		userRepository.deleteById(userid);
	}

	public void update(User user, int userid) {
		userRepository.save(user);
	}

}
