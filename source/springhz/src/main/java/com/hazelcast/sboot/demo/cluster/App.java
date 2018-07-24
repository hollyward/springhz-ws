// throwaway class for first time running springboot
package com.hazelcast.sboot.demo.cluster;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class App
	{
		public static void main(String[] args)
			{
//				System.setProperty("spring.main.web-environment", "false");
	//			.info("In our main method, about to invoke the Spring Application 'run' method");
				System.out.println("This is the app class. ");
			//	SpringApplication.run(App.class, args);
				

				System.setProperty("spring.main.web-environment", "false");
//				l.info("In our main method, about to invoke the Spring Application 'run' method");
//				SpringApplication.run(ServerV1.class, args);
				SpringApplication.run(App.class, args);

			}

		@Bean
		public CommandLineRunner commandLineRunner()
			{

				return args -> {
					System.out.println("This is a string!");
				};
			}

		@RequestMapping("/hello/{fname}/{lname}")
		public String hello(@PathVariable String fname, @PathVariable String lname)
			{
	//			System.out.println("In the hello method.");
				return "hello " + fname + " "+ lname;
			}

	}
