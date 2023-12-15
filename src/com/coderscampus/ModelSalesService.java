package com.coderscampus;

import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class ModelSalesService {
	FileService fileService = new FileService();
	

	public static Long totalNumberOfSalesPerYear(List<ModelSales> modelSalesList, String year) {
		IntSummaryStatistics totalSales = modelSalesList.stream()
				.filter(modelSales -> modelSales.getMonthYear().contains(year))
				.mapToInt(modelSales -> Integer.parseInt((modelSales).getSales())).summaryStatistics();

		Long yearSales = totalSales.getSum();
		return yearSales;
	}

	public static YearMonth findBestMonthYearForSales(List<ModelSales> modelSalesList) {
		Optional<ModelSales> bestSalesNum = modelSalesList.stream()
				.max(Comparator.comparingInt(modelSales -> Integer.parseInt(modelSales.getSales())));

		return bestSalesNum
				.map(modelSales -> YearMonth.parse(modelSales.getMonthYear(), DateTimeFormatter.ofPattern("MMM-yy")))
				.orElseThrow(() -> new RuntimeException("Not found"));
	}

	public static YearMonth findWorstMonthYearForSales(List<ModelSales> modelSalesList) {
		Optional<ModelSales> worstSalesNum = modelSalesList.stream()
				.min(Comparator.comparingInt(modelSales -> Integer.parseInt(modelSales.getSales())));

		return worstSalesNum
				.map(modelSales -> YearMonth.parse(modelSales.getMonthYear(), DateTimeFormatter.ofPattern("MMM-yy")))
				.orElseThrow(() -> new RuntimeException("Not found"));
	}

	public void printYearlySalesReports(String modelName, String fileName) throws IOException {
		System.out.println(modelName + " Yearly Sales Report");
		System.out.println("---------------------");

		List<ModelSales> modelSales = fileService.getSalesInfoFromCSV(fileName);

		for (int i = 16; i <= 19; i++) {
			String year = String.valueOf(i);
			Long totalSales = ModelSalesService.totalNumberOfSalesPerYear(modelSales, year);

			if (totalSales > 0) {
				System.out.println("20" + year + " -> " + totalSales);
			}
		}

		System.out.println("");

		YearMonth bestMonth = ModelSalesService.findBestMonthYearForSales(modelSales);
		YearMonth worstMonth = ModelSalesService.findWorstMonthYearForSales(modelSales);

		System.out.println("The BEST month for " + modelName + " was: " + bestMonth);
		System.out.println("The WORST month for " + modelName + " was: " + worstMonth);

		System.out.println("");
	}

}
