package model.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import food.exception.NotExistException;
import food.model.util.PublicCommon;
import lombok.extern.slf4j.Slf4j;
import model.entity.SpecificEntity;

@Slf4j
public class SpecificDAO {
	// cid로 해당 세부 카테고리 정보 반환
	public static ArrayList<SpecificEntity> getSpecific(String cid) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		ArrayList<SpecificEntity> list = null;

		try {
			list = (ArrayList<SpecificEntity>) em
					.createNativeQuery("select * from specific where c_id=?", SpecificEntity.class).setParameter(1, cid)
					.getResultList();
			if (list == null) {
				log.info("select specific 실패");
				throw new NotExistException("select specific 실패");
			}
		} catch (Exception e) {
			log.warn("getSpecific : 오류발생");
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return list;
	}

	// sname으로 해당 s_id 반환
	public static String getSid(String sname) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		String sid = null;

		try {
			sid = String.valueOf(em.createNativeQuery("select s_id from specific where s_name=?")
					.setParameter(1, sname).getSingleResult());
			if (sid == null) {
				log.info("select specific id 실패");
				throw new NotExistException("select specific id 실패");
			}
		} catch (Exception e) {
			log.warn("getSid : 오류발생");
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return sid;
	}
	// sname로 해당 specificentity 반환
	public static SpecificEntity getSpecificEntity(String sname) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		SpecificEntity s = null;

		try {
			s = (SpecificEntity) em.createNativeQuery("select * from specific where s_name=?", SpecificEntity.class)
					.setParameter(1, sname).getSingleResult();
			if (s == null) {
				log.info("select specific 실패");
				throw new NotExistException("select specific 실패");
			}
		} catch (Exception e) {
			log.warn("getSpecificEntity : 오류발생");
			e.printStackTrace();
			throw e;
		} finally {
			em.close();
		}
		return s;
	}
}
