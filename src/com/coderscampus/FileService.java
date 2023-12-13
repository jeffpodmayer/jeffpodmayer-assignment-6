package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	BufferedReader fileReader = null;

	public List<ModelSales> getSalesInfoFromCSV(String fileName) throws IOException {
		List<ModelSales> modelSales = new ArrayList<>();
		String line;
		fileReader = new BufferedReader(new FileReader(fileName));

		fileReader.readLine();
		while ((line = fileReader.readLine()) != null) {
			String[] salesInfo = line.split(",");
			ModelSales monthySales = new ModelSales();
			monthySales.setMonthYear(salesInfo[0]);
			monthySales.setSales(salesInfo[1]);
			modelSales.add(monthySales);

		}
		fileReader.close();
		return modelSales;

	}
}
