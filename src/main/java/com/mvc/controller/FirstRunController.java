package com.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.mvc.vo.Teacher;

/**
 * 
 * @author GinKo.Wang
 * @mail <a href="mailto:yingosen@gmail.com">yingosen@gmail.com</a>
 * @date 2016年1月14日 下午3:45:33
 *
 */
@Controller
@RequestMapping("first")
public class FirstRunController {

	@RequestMapping(path = "index")
	public FastJsonJsonView index() {
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher("1", 1));
		list.add(new Teacher("2", 2));
		list.add(new Teacher("3", 3));
		FastJsonJsonView view = new FastJsonJsonView();
		Map<String, Object> attributes = new HashMap<>();
		attributes.put("data", list);
		view.setAttributesMap(attributes);
		view.setBeanName("fastjson");
		return view;
	}

}
