package cn.edu.wic.Dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.edu.wic.Dao.UserDao;
import cn.edu.wic.bean.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
