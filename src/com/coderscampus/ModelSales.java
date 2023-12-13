package com.coderscampus;

public class ModelSales {
	private String monthYear;
	private String sales;

	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return monthYear + " --> " + sales + "\n";
	}

}
