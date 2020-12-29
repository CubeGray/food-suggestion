# food suggestion
## description
매번 점심 메뉴를 정하느라 낭비하는 시간을 절약하기 위해 play data학원을 중심으로 한식, 중식, 양식, 일식 카테고리 별로 맛집을 추천해주는 프로그램

## ERDiagram
![food_erg](./image/food_erd.PNG)

## oven url 페이지 프로세스
https://ovenapp.io/view/1AGe1dM0HzIfbU4de1wGfCy8VWyBBqGu/

## issue
> 1. 
- select * 인 경우 entity.class로 매핑됨
- select id 인 경우 String이 결과로 반환되기 때문에 entity class로 매핑이 안됨.
- 따라서 Query createNativeQuery(String sqlString, Class resultClass)메소드 대신 Query createNativeQuery(String sqlString)메소드 사용하여 해결
<details>
<summary>문제 발생 부분</summary>
<div markdown="1">

```java
@Slf4j
public class CategoryDAO {
	//cname으로 cid 찾아오기
	public static String getCid(String cname) throws Exception {
		EntityManager em = PublicCommon.getEntityManger();
		String cid = null;

		try {
			 cid = String.valueOf(em.createNativeQuery("select c_id from category where c_name=?",CategoryEntity.class)
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
```
</div>
</details>

<details>
<summary>Query createNativeQuery 메소드</summary>
<div markdown="1">

```java
    /**
     * Create an instance of <code>Query</code> for executing
     * a native SQL query.
     * @param sqlString a native SQL query string
     * @param resultClass the class of the resulting instance(s)
     * @return the new query instance
     */
    public Query createNativeQuery(String sqlString, Class resultClass);

    /**
     * Create an instance of <code>Query</code> for executing
     * a native SQL statement, e.g., for update or delete.
     * If the query is not an update or delete query, query
     * execution will result in each row of the SQL result
     * being returned as a result of type Object[] (or a result
     * of type Object if there is only one column in the select
     * list.)  Column values are returned in the order of their
     * appearance in the select list and default JDBC type
     * mappings are applied.
     * @param sqlString a native SQL query string
     * @return the new query instance
     */
    public Query createNativeQuery(String sqlString);
```
</div>
</details>