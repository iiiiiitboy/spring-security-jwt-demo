package ex.aaronfae.graduation.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ex.aaronfae.graduation.entity.User;
import ex.aaronfae.graduation.service.UserService;

/**
 * 用户服务接口实现类
 * 
 * @author AaronFae
 *
 */
@Service
public class UserServiceImpl implements UserService {

	// TODO 添加持久层
	@Override
	public User findByUsername(String username) {
		User user = new User();
		user.setId(1L);
		user.setUsername(username);
		String password = new BCryptPasswordEncoder().encode("123");
		user.setPassword(password);
		return user;
	}

	@Override
	public Set<String> findPermissions(String username) {
		Set<String> permissions = new HashSet<>();
		permissions.add("sys:user:view");
		permissions.add("sys:user:add");
		permissions.add("sys:user:edit");
		permissions.add("sys:user:delete");
		return permissions;
	}

}