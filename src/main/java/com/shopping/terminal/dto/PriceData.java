package com.shopping.terminal.dto;

/**
 * PriceData - hold the pricing structure for a product
 * @author 91859
 *
 */
public class PriceData {

	double unitPrice;
	int groupCount;
	double groupPrice;

	public PriceData(double unitPrice, int groupCount, double groupPrice) {
		setUnitPrice(unitPrice);
		setGroupCount(groupCount);
		setGroupPrice(groupPrice);
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getGroupCount() {
		return groupCount;
	}

	public void setGroupCount(int groupCount) {
		this.groupCount = groupCount;
	}

	public double getGroupPrice() {
		return groupPrice;
	}

	public void setGroupPrice(double groupPrice) {
		this.groupPrice = groupPrice;
	}

}
