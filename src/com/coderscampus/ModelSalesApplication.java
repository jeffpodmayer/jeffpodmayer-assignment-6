package com.coderscampus;

import java.io.IOException;

public class ModelSalesApplication {

	public static void main(String[] args) throws IOException {
		ModelSalesService modelSalesService = new ModelSalesService();

		modelSalesService.printYearlySalesReports("Model 3", "model3.csv");
		modelSalesService.printYearlySalesReports("Model S", "modelS.csv");
		modelSalesService.printYearlySalesReports("Model X", "modelX.csv");

	}

}
