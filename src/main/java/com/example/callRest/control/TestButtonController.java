package com.example.callRest.control;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.callRest.dao.PropertyDao;
import com.example.callRest.entity.Property;


@Controller
@RequestMapping("test")
public class TestButtonController {

	@Autowired
	PropertyDao propertyDao;
	
	@GetMapping("testHtmlPage")
	public String testHtml() {

		return "TestHtmlPage";

	}

	@GetMapping("/testDynamicJar")
	public String testDynamicJar() {
		System.out.println("hello world testDynamicJar");
		return "testDynamicJar";

	}

	@GetMapping("testDynamicJarDo")
	public String testDynamicJarDo(@RequestParam("inputUrl") String inputUrl,
			@RequestParam("value") String value,Model model,RedirectAttributes ru) {

		String msg = "test_hello";
		try {

			List<Property> byPropertyKeyLike = propertyDao.findByPropertyKeyLike("%DYNAMIC%");
			Map<String,String> propMap = byPropertyKeyLike.stream().collect(Collectors.toMap(x->x.getPropertyKey(), x->x.getPropertyValue()));
			
			String jarPath = propMap.get("DYNAMIC_JAR_PATH");
			String className = propMap.get("DYNAMIC_CLASS_NAME");
			String setMethod = propMap.get("DYNAMIC_SET_METHOD_NAME");
			String processMethod = propMap.get("DYNAMIC_PROCESS_METHOD_NAME");
			
			File file = new File(jarPath);
			URL url = file.toURI().toURL();
			
			URLClassLoader child = new URLClassLoader(new URL[]{url},this.getClass().getClassLoader());
			Class<?> classToLoad = Class.forName(className, true, child);
			
//			Object instance = classToLoad.newInstance();
			Object instance = classToLoad.getDeclaredConstructor().newInstance();


//			classToLoad.getDeclaredMethod(setMethod, String.class).invoke(instance, value);
			classToLoad.getMethod(setMethod, String.class).invoke(instance, value);
			
//			Method getDataMethod = classToLoad.getDeclaredMethod(getMethod);
			Method getDataMethod = classToLoad.getMethod(processMethod);
			getDataMethod.setAccessible(true);
			Object result1 = getDataMethod.invoke(instance);
			msg = (String)result1;
			
			
			
//			LoadClass l = new LoadClass();
//			l.setUrl("test");
//			l.getData();
			
//			public class MWebController {
//			String responsePage = (String) mWebService.getClass()
//					.getMethod(methodName, String.class, Map.class, Model.class, HttpSession.class)
//					.invoke(mWebService, decMid, decryptedRequestJson, model, session);
//			
			
//					URLClassLoader classLoader = (URLClassLoader)ClassLoader.getSystemClassLoader();
//					Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
//					method.setAccessible(true);
//					Object invoke = method.invoke(classLoader, url);
//					msg = invoke.toString();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		ru.addFlashAttribute("showValue", msg);
		ru.addFlashAttribute("message", msg);
//		return "testDynamicJar";
		return "redirect:testDynamicJar";

	}

}
