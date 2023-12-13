package com.coderscampus;

import java.io.IOException;

public class ModelSalesApplication {

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		
		fileService.getSalesInfoFromCSV("model3.csv");

	}

}
