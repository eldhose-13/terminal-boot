/**
 * 
 */
package com.shopping.terminal.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * PointOfSaleService Interface
 * @author 91859
 * 
 */
@Component
public interface PointOfSaleService {

	/**
	 * Calculates total price for
	 * the scanned items
	 * @param List of String with
	 * product codes
	 * @exception  Exception
	 * @return BigDecimal
	 */
	public BigDecimal calculateTotal(List<String> scannedProducts);
}
