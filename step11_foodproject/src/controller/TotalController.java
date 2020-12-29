package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.FoodService;
import model.entity.RestaurantEntity;
import model.entity.SpecificEntity;


@WebServlet("/total")
public class TotalController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String command = request.getParameter("command");

		if(command ==null) {
			response.sendRedirect("index.html");
			return;
		}

		try{
			if(command.equals("restaurantgetAll")){
				restaurantgetAll(request, response);
			}else if(command.equals("restaurantUpdate")){
				restaurantUpdate(request, response);
			}else if(command.equals("restaurantUpdateReq")){
				restaurantUpdateReq(request, response);
			}else if(command.equals("restaurantInsert")){
				restaurantInsert(request, response);
			}else if(command.equals("restaurantDelete")){
				restaurantDelete(request, response);
			}else if(command.equals("getSpecifics")){
				getSpecifics(request, response);
			}else if(command.equals("getRestaurants")){
				getRestaurants(request, response);
			}
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
			request.getRequestDispatcher("showError.jsp").forward(request, response);
			s.printStackTrace();
		}
	}

	//모든 식당 검색 메소드
	public void restaurantgetAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		try {
			request.getSession().setAttribute("restaurantAll", FoodService.getAllRestaurant());
			request.getSession().setAttribute("successMsg", "레스토랑 검색 성공");
			url = "restaurantList.jsp";
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
		}
		request.getRequestDispatcher(url).forward(request, response);
	}



	//식당 수정 	
	public void restaurantUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		try {
			FoodService.updateRestaurant(request.getParameter("rid"), request.getParameter("maplink"));
			request.getSession().setAttribute("restaurant",FoodService.getSingleRestaurant(request.getParameter("rid")));
			request.getSession().setAttribute("successMsg", "수정 완료");	
			url = "restaurantDetail.jsp";
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
			s.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}


	//식당 요구	
	public void restaurantUpdateReq(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		try {	
			request.getSession().setAttribute("re", FoodService.getSingleRestaurant(request.getParameter("rid")));
			url = "restaurantUpdate.jsp";
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
			s.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}


	//레스토랑 추가 메소드
	protected void restaurantInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		String rid = request.getParameter("rid");
		String rname = request.getParameter("rname");
		SpecificEntity sid=null;
		String maplink = request.getParameter("maplink");
		String pagelink = request.getParameter("pagelink");
		
		try{
			sid = FoodService.getSpecificEntity(request.getParameter("sname"));
			RestaurantEntity restaurant = new RestaurantEntity(rid, rname, sid, maplink, pagelink);
			
			if(rid!=null && rid.length() !=0 && rname!=null && rname.length() !=0
					&& request.getParameter("sname")!=null && request.getParameter("sname").length() !=0 
					&& maplink!=null && maplink.length() !=0 && pagelink!=null && pagelink.length() !=0) {

				boolean result = FoodService.addRestaurant(restaurant);
				
				if(result){
					request.getSession().setAttribute("restaurant", restaurant);
					request.getSession().setAttribute("successMsg", "레스토랑 추가완료");
					
					url = "restaurantDetail.jsp";
				}else{
					request.getSession().setAttribute("errorMsg", "레스토랑 생성시 오류");
				}
			}else {
				request.getSession().setAttribute("errorMsg", "모든 요소 값들을 입력해주세요!");
			}
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
		}
		request.getRequestDispatcher(url).forward(request, response);
	}


	//레스토랑 삭제 메소드
	public void restaurantDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		String rid = request.getParameter("rid");

		try {
			boolean result = FoodService.deleteRestaurant(rid);
			if(result) {
				request.getSession().setAttribute("restaurantAll",FoodService.getAllRestaurant());
				request.getSession().setAttribute("seccessMsg","레스토랑 삭제완료");
				url = "restaurantList.jsp";
			}else {
				request.getSession().setAttribute("errorMsg", "레스토랑 삭제실패");
			}
		}catch(Exception s){			
			request.getSession().setAttribute("errorMsg", s.getMessage());
			s.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}	

	//한중양일 선택 (cid로 sid 불러오기)
	public void getSpecifics(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String url = "showError.jsp";
		
		try {
			String cid = FoodService.getCid(request.getParameter("cname"));
			request.getSession().setAttribute("successMsg", "검색 성공");
			request.getSession().setAttribute("specifics", FoodService.getSpecific(cid));
			url = "specificList.jsp";
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
			s.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	//sname으로 레스토랑 정보가져오기
	public void getRestaurants(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String url = "showError.jsp";
		
		try {
			String sid = FoodService.getSid(request.getParameter("sname"));
			request.getSession().setAttribute("successMsg", "검색 성공");
			request.getSession().setAttribute("restaurants", FoodService.getRestaurant(sid));
			url = "resultList.jsp";	//수정삭제기능 없는 음식점들 출력화면
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
			s.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}	
}
