package com.example.ejercicio4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@SpringBootApplication
public class Ejercicio4Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Ejercicio4Application.class, args);
	}


		@PostConstruct
		public void primeraFuncion(){
			System.out.println("Hola desde clase inicial");
		}

	@Bean
	public CommandLineRunner segundaFuncion(){
		return p->
		{
			System.out.println("Hola desde la segunda funcion");
		};

	}
	@Bean
	public CommandLineRunner terceraFuncion(String... args){

			return p->
		{
			for(String arg : args)
				System.out.println(arg);
		};
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola desde clase inicial 2");
	}

	}

