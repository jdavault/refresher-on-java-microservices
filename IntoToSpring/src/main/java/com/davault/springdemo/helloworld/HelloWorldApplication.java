package com.davault.springdemo.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

    //What are the beans?  //added @Component annotations
    //What are the dependencies?  //added @Autowired
    //Where to search for beans?

    public static void main(String[] args) {
        //BinarySearchImpl searchImpl = new BinarySearchImpl(new QuickSortAlgorithm());

        ApplicationContext appContext = SpringApplication.run(HelloWorldApplication.class, args);
        BinarySearchImpl searchImpl = appContext.getBean(BinarySearchImpl.class);
        int result = searchImpl.binarySearch(new int[] {1,3,2}, 3);
        System.out.println("Number Found: " + result);

//        for (String name : appContext.getBeanDefinitionNames()) {
//            System.out.println("Bean Found: " + name);
//        }
    }

}
