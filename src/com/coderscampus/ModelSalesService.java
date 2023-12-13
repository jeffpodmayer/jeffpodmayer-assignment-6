package com.coderscampus;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;


public class ModelSalesService {
	
	public Long totalNumberOfSalesPerYear(List<ModelSales> modelSalesList, String year) {
		IntSummaryStatistics  totalSales = modelSalesList.stream()
					  									 .filter(modelSales -> modelSales.getMonthYear().contains(year))
					  									 .mapToInt(modelSales -> Integer.parseInt((modelSales).getSales()))
					  									 .summaryStatistics();
			Long yearSales = totalSales.getSum();
			return yearSales;
	}
	
	public YearMonth findBestMonthYearForSales(List<ModelSales> modelSalesList) {
		Optional<ModelSales> bestSalesNum = modelSalesList.stream()
											 .max(Comparator.comparingInt(modelSales -> Integer.parseInt(modelSales.getSales())));
		
		return bestSalesNum.map(modelSales -> YearMonth.parse(modelSales.getMonthYear(),DateTimeFormatter.ofPattern("MMM-yy")))
						   .orElseThrow(() -> new RuntimeException("No best sales found"));
		
	}
}
