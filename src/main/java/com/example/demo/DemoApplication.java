package com.example.demo;

import com.example.demo.propertysource.PropertyDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		var context =SpringApplication.run(DemoApplication.class, args);

//		Controller obj = context.getBean(Controller.class);
//		System.out.println(obj.getControl());
//		VegPizza vegPizza=context.getBean(VegPizza.class);
//		System.out.println(vegPizza.getPizza());
//		MyController myController=context.getBean(MyController.class);
//		System.out.println(myController.hello());
//
//		MyService myService=context.getBean(MyService.class);
//		System.out.println(myService.hello());
//
//		MyRepository myRepository=context.getBean(MyRepository.class);
//		System.out.println(myRepository.hello());
//
//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

//		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean3.hashCode());
//
//		ProtoTypeBean protoTypeBean1 = context.getBean(ProtoTypeBean.class);
//		System.out.println(protoTypeBean1.hashCode());
//		ProtoTypeBean protoTypeBean2 = context.getBean(ProtoTypeBean.class);
//		System.out.println(protoTypeBean2.hashCode());
//		ProtoTypeBean protoTypeBean3 = context.getBean(ProtoTypeBean.class);
//		System.out.println(protoTypeBean3.hashCode());

//		ValueDemo valueDemo = context.getBean(ValueDemo.class);
//		System.out.println(valueDemo.getDefaultName());
//		System.out.println(valueDemo.getHost());
//		System.out.println(valueDemo.getEmail());
//		System.out.println(valueDemo.getPassword());
//		System.out.println(valueDemo.getJavaHome());

		PropertyDemo propertyDemo = context.getBean(PropertyDemo.class);
		System.out.println(propertyDemo.getHost());
		System.out.println(propertyDemo.getEmail());
		System.out.println(propertyDemo.getPassword());
	}
}