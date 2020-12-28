package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import food.exception.NotExistException;
import food.model.util.PublicCommon;
import lombok.extern.slf4j.Slf4j;
import model.entity.RestaurantEntity;

@Slf4j
public class RestaurantDAO {
	//레스토랑 추가
	public static boolean addRestaurant(RestaurantEntity r) throws Exception{
		EntityManager em = PublicCommon.getEntityManger();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		boolean flag=false;
		
		try {
			int result = em.createNativeQuery("insert into restaurant values(?, ?, ?, ?,?)")
					.setParameter(1, r.getRid()).setParameter(2, r.getRname())
					.setParameter(3, r.getSid()).setParameter(4, r.getMaplink()).setParameter(5, r.getPagelink()).executeUpdate();
			if(result==0) {
				log.info("insert into restaurant 실패");
				throw new NotExistException("insert into restaurant 실패");
			}else {
				flag = true;
			}
			tx.commit();
		}catch (Exception e) {
			log.warn("addRestaurant : 오류발생");
			tx.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			em.close();
		}
		return flag;
	}
	
	// 레스토랑수정
	// rid로 maplink내용 수정하기
	public static boolean updateRestaurant(String rid, String mlink) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		EntityTransaction tx = em.getTransaction();
		boolean flag=false;
		
		tx.begin();
		try {
			int result = em.createNativeQuery("update restaurant set map_link=? where r_id=?")
					.setParameter(1, mlink).setParameter(2, rid).executeUpdate();
			if (result == 0) {
				log.info("update restaurant 실패");
				throw new NotExistException("update restaurant 실패");				
			}else {
				flag = true;
			}
			tx.commit();
		} catch (Exception e) {
			log.warn("updateRestaurant : 오류발생");
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return flag;
	}

	// rid로 레스토랑 삭제
	public static boolean deleteRestaurant(String rid) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		EntityTransaction tx = em.getTransaction();
		boolean flag = false;
		
		tx.begin();
		try {
			int result = em.createNativeQuery("delete from restaurant where r_id=?").setParameter(1, rid).executeUpdate();
			if (result == 0) {
				log.info("delete restaurant 실패");
				throw new NotExistException("delete restaurant 실패");				
			}else {
				flag = true;
			}
			tx.commit();
		} catch (Exception e) {
			log.warn("deleteRestaurant : 오류발생");
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return flag;
	}
	// rid로 해당 레스토랑 모든 정보 반환
		public static RestaurantEntity getSingleRestaurant(String rid) throws Exception {
			EntityManager em = PublicCommon.getEntityManger();
			RestaurantEntity r = null;
			
			try {
				r = (RestaurantEntity) em.createNativeQuery("select * from restaurant where r_id=?", RestaurantEntity.class)
						.setParameter(1, rid).getSingleResult();
				if (r == null) {
					log.info("select restaurant 실패");
					throw new NotExistException("select restaurant 실패");	
				}
			} catch (Exception e) {
				log.warn("getRestaurant : 오류발생");
				e.printStackTrace();
				throw e;
			} finally {
				em.close();
			}
			return r;
		}
	
	// sid로 해당 레스토랑 모든 정보 반환
	public static ArrayList<RestaurantEntity> getRestaurant(String sid) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		ArrayList<RestaurantEntity> list = null;
		
		try {
			list = (ArrayList<RestaurantEntity>) em.createNativeQuery("select * from restaurant where s_id=?", RestaurantEntity.class)
					.setParameter(1, sid).getResultList();
			if (list == null) {
				log.info("select restaurant 실패");
				throw new NotExistException("select restaurant 실패");	
			}
		} catch (Exception e) {
			log.warn("getRestaurant : 오류발생");
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return list;
	}
	
	//전체 레스토랑 리스트 모든정보 반환
	public static ArrayList<RestaurantEntity> getAllRestaurant() throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		ArrayList<RestaurantEntity> list = null;
		
		try {
			list = (ArrayList<RestaurantEntity>) em.createNativeQuery("select * from restaurant", RestaurantEntity.class)
					.getResultList();
			if (list == null) {
				log.info("select all restaurant 실패");
				throw new NotExistException("select all restaurant 실패");	
			}
		} catch (Exception e) {
			log.warn("getAllRestaurant : 오류발생");
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return list;
	}
}
