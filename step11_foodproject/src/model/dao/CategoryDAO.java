package model.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import food.exception.NotExistException;
import food.model.util.PublicCommon;
import lombok.extern.slf4j.Slf4j;
import model.entity.CategoryEntity;

@Slf4j
public class CategoryDAO {
	//cname으로 cid 찾아오기
	public static String getCid(String cname) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		String cid = null;

		try {
			 cid = String.valueOf(em.createNativeQuery("select c_id from category where c_name=?")
					.setParameter(1, cname).getSingleResult());
				if (cid == null) {
				log.info("select category id 실패");
				throw new NotExistException("select category id 실패");
			}
		} catch (Exception e) {
			log.warn("getCid : 오류발생");
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return cid;
	}
}
