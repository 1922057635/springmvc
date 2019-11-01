package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import springmvc.pojo.Items;

public class ItemController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<Items> lists=new ArrayList<Items>();
		Items item1=new Items();
		item1.setId(1);
		item1.setName("Â·±ó½Ü");
		Items item2=new Items();
		item2.setId(1);
		item2.setName("Â·±ó½Ü");
		lists.add(item1);
		lists.add(item2);
		ModelAndView modeandview=new ModelAndView();
		modeandview.addObject("items",lists);
		modeandview.setViewName("/item/items.jsp");
		return modeandview;
	}

}
