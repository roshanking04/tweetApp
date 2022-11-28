package com.tweet.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweet.user.dto.RegisterDTO;
import com.tweet.user.entity.RegisterEntity;
import com.tweet.user.repositroy.RegisterRepositry;

/**
 * @author rosha
 *
 */
@Service
public class UserServiceImpl implements UserServices {

	
	/**
	 * 
	 */
	@Autowired
	private RegisterRepositry  registerRepositry;


	/**
	 *
	 */
	public RegisterDTO addUser(RegisterDTO dto) {
		RegisterEntity entity = new RegisterEntity();
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setUserid(dto.getUserid());
		entity.setEmail(dto.getEmail()); 
		entity.setContactNum(dto.getContactNum());
		entity.setPassword(dto.getPassword());
		RegisterEntity addUser = registerRepositry.addUser(entity);
 
		return dto;
	}

	/**
	 *
	 */
	public void getAllUser(RegisterDTO registerDTO) {
		RegisterEntity entity = new RegisterEntity();
		entity.setFirstName(registerDTO.getFirstName());
		entity.setLastName(registerDTO.getLastName());
		entity.setUserid(registerDTO.getUserid()); 
		entity.setEmail(registerDTO.getEmail());
		entity.setContactNum(registerDTO.getContactNum());
		entity.setPassword(registerDTO.getPassword());
		registerRepositry.getAllUser(entity);
	}


	/**
	 *
	 */
	public RegisterDTO getAllTweet(RegisterDTO listTweet) {
		// TODO Auto-generated method stub
		return null;
	}

//	public void addNewUser() {
//
//		Session s = Hibconnection.getSession();
//
//		Transaction t = s.beginTransaction();
//
//		RegisterDTO reg = new RegisterDTO();
//		if(reg.getDto()==null) {
//			
//		}//else 
//			//throw 
//		//userloging.setFirstName("");
//		//userloging.setFirstName("");
//		
//		s.save(reg);
//		t.commit();
//		s.close();
//
//	}
//	public void regiterNewTweet() {
//		 
//		Session s = Hibconnection.getSession();
//
//		TweetDTO  usertweet= new TweetDTO();
//		RegisterDTO userloging = new RegisterDTO();
//		usertweet.setName();
//		Transaction t = s.beginTransaction();
//		s.save(userloging);
//		t.commit();
//		s.close();
//
//	}
//	public void delete(int pid) {
//
//		Session s = hibernateSession.getSession();
//
//		inpatientdetails data = (inpatientdetails) s.get(inpatientdetails.class, pid);
//
//		Transaction t = s.beginTransaction();
//		s.delete(data);
//
//		t.commit();
//		s.close();
//
//	}
//
//	public void getdata() {
//
//		Session s = hibernateSession.getSession();
//
//		Query q = s.createQuery("from inpatientdetails");
//
//		List<inpatientdetails> data = q.list();
//
//		for (inpatientdetails r : data) {
//
//			System.out.println(r);
//
//		}
//
//	}
//
//	public void getSpecifiedData() {
//
//		Session s = hibernateSession.getSession();
//
//		Query q = s.createQuery("Select p.pname,p.pDocter from inpatientdetails p order by p.pname asc");
//
//		List<Object[]> data = q.list();
//
//		for (Object[] o : data) {
//
//			System.out.println("name" + "-->" + o[0] + "::" + "age" + "-->" + o[1]);
//
//		}
//
//	}
//
//	public void getSpecifiedDatabyId() {
//
//		Session s = hibernateSession.getSession();
//
//		Query q = s.createQuery("Select p.pname,p.pDocter from inpatientdetails p where p.pid=:id");
//
//		q.setParameter("id", 1);
//
//		List<Object[]> data = q.list();
//
//		for (Object[] o : data) {
//
//			System.out.println("name" + "-->" + o[0] + "::" + "age" + "-->" + o[1]);
//
//		}
//
//	}
//
//	public void hqlUpdate() {
//
//		Session s = hibernateSession.getSession();
//		Transaction t = s.beginTransaction();
//		Query q = s.createQuery("update  inpatientdetails set pname =:x ,page =:y where pid=:z");
//
//		q.setParameter("x", "gopi");
//		q.setParameter("y", 25);
//		q.setParameter("z", 1);
//		int row = q.executeUpdate();
//
//		System.out.println("number of rows updated ---> " + row);
//		t.commit();
//		s.close();
//
//	}
//
//	public void hqldelete() {
//
//		Session s = hibernateSession.getSession();
//		Transaction t = s.beginTransaction();
//		Query q = s.createQuery("delete from inpatientdetails where pid=:id");
//
//		q.setParameter("id", 1);
//		int row = q.executeUpdate();
//
//		System.out.println("number of rows deleted ---> " + row);
//		t.commit();
//		s.close();
//
//	}

}
