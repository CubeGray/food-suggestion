package food.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class PublicCommon {
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("step11_foodproject");
		log.warn("DB 접속 기록");
	}
	
	public static EntityManager getEntityManger() {
		EntityManager em = emf.createEntityManager();
		log.warn("Entity Manager 리턴 기록");
		return em;
	}
	
	public static void close() {
		emf.close();
		log.warn("DB 접속 해제 기록");
	}
}
