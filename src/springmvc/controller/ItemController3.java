package springmvc.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import springmvc.pojo.Items;
//ʹ��Controllerע����Խ����ඨ��Ϊһ��Handle
@Controller
public class ItemController3{
	@RequestMapping("/query3.action")
	public ModelAndView query3()throws Exception {
		List<Items> lists=new ArrayList<Items>();
		System.out.println("AIIBŶ");
		Items item1=new Items();
		item1.setId(1);
		item1.setName("·���");
		Items item2=new Items();
		item2.setId(1);
		item2.setName("·���");
		lists.add(item1);
		lists.add(item2);
		ModelAndView modeandview=new ModelAndView();
		modeandview.addObject("items",lists);
		modeandview.setViewName("items");
		return modeandview;
		
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		List<Items> lists=new ArrayList<Items>();
//		Items item1=new Items();
//		item1.setId(1);
//		item1.setName("·���");
//		Items item2=new Items();
//		item2.setId(1);
//		item2.setName("·���");
//		lists.add(item1);
//		lists.add(item2);
//		ModelAndView modeandview=new ModelAndView();
//		modeandview.addObject("items",lists);
//		modeandview.setViewName("/item/items.jsp");
//		return modeandview;
//	}

}
