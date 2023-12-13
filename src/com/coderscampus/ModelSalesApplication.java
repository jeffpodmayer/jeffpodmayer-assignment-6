package com.coderscampus;

import java.io.IOException;
import java.time.YearMonth;
import java.util.List;

public class ModelSalesApplication {

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		ModelSalesService modelSalesService = new ModelSalesService();
		
		System.out.println("Model 3 Yearly Sales Report");
		System.out.println("---------------------");
		
		List<ModelSales> model3Sales = fileService.getSalesInfoFromCSV("model3.csv");
		Long model3Sales2017 = modelSalesService.totalNumberOfSalesPerYear(model3Sales, "17");
		Long model3Sales2018 = modelSalesService.totalNumberOfSalesPerYear(model3Sales, "18");
		Long model3Sales2019 = modelSalesService.totalNumberOfSalesPerYear(model3Sales, "19");
		
		System.out.println("2017 -> " + model3Sales2017); 
		System.out.println("2018 -> " + model3Sales2018); 
		System.out.println("2019 -> " + model3Sales2019); 
		
		System.out.println("");
		YearMonth bestModel3Sales = modelSalesService.findBestMonthYearForSales(model3Sales);
		System.out.println("The best month for Model 3 was: " + bestModel3Sales);
//		System.out.println("The worst month for Model 3 was: ");//call method here
//		
		System.out.println("");
		System.out.println("Model S Yearly Sales Report");
		System.out.println("---------------------");
		
		List<ModelSales> modelSSales = fileService.getSalesInfoFromCSV("modelS.csv");
		Long modelSSales2016 = modelSalesService.totalNumberOfSalesPerYear(modelSSales, "16");
		Long modelSSales2017 = modelSalesService.totalNumberOfSalesPerYear(modelSSales, "17");
		Long modelSSales2018 = modelSalesService.totalNumberOfSalesPerYear(modelSSales, "18");
		Long modelSSales2019 = modelSalesService.totalNumberOfSalesPerYear(modelSSales, "19");
		
		System.out.println("2016 -> " + modelSSales2016 ); 
		System.out.println("2017 -> " + modelSSales2017); 
		System.out.println("2018 -> " + modelSSales2018); 
		System.out.println("2019 -> " + modelSSales2019); 
		
		
//		System.out.println("The best month for Model S was: ");//call method here
//		System.out.println("The worst month for Model S was: ");//call method here
//		
		System.out.println("");
		System.out.println("Model X Yearly Sales Report");
		System.out.println("---------------------");
		
		List<ModelSales> modelXSales = fileService.getSalesInfoFromCSV("modelX.csv");
		Long modelXSales2016 = modelSalesService.totalNumberOfSalesPerYear(modelXSales, "16");
		Long modelXSales2017 = modelSalesService.totalNumberOfSalesPerYear(modelXSales, "17");
		Long modelXSales2018 = modelSalesService.totalNumberOfSalesPerYear(modelXSales, "18");
		Long modelXSales2019 = modelSalesService.totalNumberOfSalesPerYear(modelXSales, "19");
		
		System.out.println("2016 -> " + modelXSales2016); 
		System.out.println("2017 -> " + modelXSales2017); 
		System.out.println("2018 -> " + modelXSales2018); 
		System.out.println("2019 -> " + modelXSales2019); 
		
//		System.out.println("The best month for Model X was: ");//call method here
//		System.out.println("The worst month for Model X was: ");//call method here
	}

}
