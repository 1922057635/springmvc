package springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import springmvc.pojo.Items;

public class ItemController2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Items> lists=new ArrayList<Items>();
		System.out.println("AIIBÅ¶");
		Items item1=new Items();
		item1.setId(1);
		item1.setName("Â·±ó½Ü");
		Items item2=new Items();
		item2.setId(1);
		item2.setName("Â·±ó½Ü");
		lists.add(item1);
		lists.add(item2);
		arg0.setAttribute("items", lists);
		arg0.getRequestDispatcher("/item/items.jsp").forward(arg0, arg1);
		
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		List<Items> lists=new ArrayList<Items>();
//		Items item1=new Items();
//		item1.setId(1);
//		item1.setName("Â·±ó½Ü");
//		Items item2=new Items();
//		item2.setId(1);
//		item2.setName("Â·±ó½Ü");
//		lists.add(item1);
//		lists.add(item2);
//		ModelAndView modeandview=new ModelAndView();
//		modeandview.addObject("items",lists);
//		modeandview.setViewName("/item/items.jsp");
//		return modeandview;
//	}

}
