package com.coderscampus;

import java.io.IOException;

public class ModelSalesApplication {

	public static void main(String[] args) throws IOException {
		ModelSalesService modelSalesService = new ModelSalesService();

		modelSalesService.printYearlySalesReport("Model 3", "model3.csv");
		modelSalesService.printYearlySalesReport("Model S", "modelS.csv");
		modelSalesService.printYearlySalesReport("Model X", "modelX.csv");

	}

}
