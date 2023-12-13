package com.coderscampus;

import java.io.IOException;

public class ModelSalesApplication {

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		
		System.out.println("Model 3 Yearly Sales Report");
		System.out.println("---------------------");
		
		fileService.getSalesInfoFromCSV("model3.csv");
		
		System.out.println("2017 -> "); //call method here
		System.out.println("2018 -> "); //call method here
		System.out.println("2019 -> "); //call method here
		
		System.out.println("The best month for Model 3 was: ");//call method here
		System.out.println("The worst month for Model 3 was: ");//call method here
		
		System.out.println("Model S Yearly Sales Report");
		System.out.println("---------------------");
		
		fileService.getSalesInfoFromCSV("modelS.csv");
		
		System.out.println("2016 -> "); //call method here
		System.out.println("2017 -> "); //call method here
		System.out.println("2018 -> "); //call method here
		System.out.println("2019 -> "); //call method here
		
		System.out.println("The best month for Model S was: ");//call method here
		System.out.println("The worst month for Model S was: ");//call method here
		
		System.out.println("Model X Yearly Sales Report");
		System.out.println("---------------------");
		
		fileService.getSalesInfoFromCSV("modelX.csv");
		
		System.out.println("2016 -> "); //call method here
		System.out.println("2017 -> "); //call method here
		System.out.println("2018 -> "); //call method here
		System.out.println("2019 -> "); //call method here
		
		System.out.println("The best month for Model X was: ");//call method here
		System.out.println("The worst month for Model X was: ");//call method here
	}

}
