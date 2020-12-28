package model.dao;

import java.util.ArrayList;

import model.entity.RestaurantEntity;
import model.entity.SpecificEntity;

public class FoodService {

	// category
	public static String getCid(String cname) throws Exception {
		return CategoryDAO.getCid(cname);
	}

	
	// specific
	// cid로 해당하는 정보들 반환
	public static ArrayList<SpecificEntity> getSpecific(String cid) throws Exception {
		return SpecificDAO.getSpecific(cid);
	}

	// 세부카테고리 이름으로 ID값 반환
	public static String getSid(String sname) throws Exception {
		return SpecificDAO.getSid(sname);
	}
	
	// 세부카테고리 이름으로 SpecificEntity 반환
	public static SpecificEntity getSpecificEntity(String sname) throws Exception {
		return SpecificDAO.getSpecificEntity(sname);
	}	
	
	// Restaurant
	// 추가
	public static boolean addRestaurant(RestaurantEntity r) throws Exception {
		return RestaurantDAO.addRestaurant(r);
	}

	// 수정
	public static boolean updateRestaurant(String rid, String mlink) throws Exception {
		return RestaurantDAO.updateRestaurant(rid, mlink);
	}

	// 삭제
	public static boolean deleteRestaurant(String rid) throws Exception {
		return RestaurantDAO.deleteRestaurant(rid);
	}

	// rid로 특정 음식점 정보 반환
	public static RestaurantEntity getSingleRestaurant(String rid) throws Exception{
		return RestaurantDAO.getSingleRestaurant(rid);
	}
	
	// sid로 특정 음식점들 정보 반환
	public static ArrayList<RestaurantEntity> getRestaurant(String sid) throws Exception {
		return RestaurantDAO.getRestaurant(sid);
	}

	// 모든 음식점 정보 반환
	public static ArrayList<RestaurantEntity> getAllRestaurant() throws Exception {
		return RestaurantDAO.getAllRestaurant();
	}

}
