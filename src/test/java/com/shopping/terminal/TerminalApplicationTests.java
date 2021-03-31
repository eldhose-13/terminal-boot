package com.shopping.terminal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shopping.terminal.service.PointOfSaleService;

@SpringBootTest
class TerminalApplicationTests {

	@Autowired
	private PointOfSaleService pointOfSaleService;
	
	@Test
	void calculateTotaltest() {
		
		List<String> testProducts = new ArrayList<String>(); 
		testProducts.add("A1");
		testProducts.add("3-Q");
		testProducts.add("45K11");
		testProducts.add("X1");
		testProducts.add("A1");
		testProducts.add("3-Q");
		testProducts.add("A1");
		
		BigDecimal total = new BigDecimal(0);
		try {
			total = pointOfSaleService.calculateTotal(testProducts);
		} catch (Exception e) {
			fail();
		}
		assertEquals(new BigDecimal(13.25), total);
	}
	
	@Test
	void calculateInvalidTotaltest() {
		
		List<String> testProducts = new ArrayList<String>(); 
		testProducts.add("A1");
		testProducts.add("3-Q");
		testProducts.add("45K11");
		testProducts.add("X1");
		testProducts.add("A1");
		testProducts.add("3-Q");
		testProducts.add("QQQ");
		
		BigDecimal total = new BigDecimal(0);
		try {
			total = pointOfSaleService.calculateTotal(testProducts);
		} catch (Exception e) {
			assertTrue("Error! Couldn't load price for Product with code QQQ".equals(e.getLocalizedMessage()));
		}
		
	}
	
	@Test
	public void calculateTotaltest2() {
		
		List<String> testProducts = new ArrayList<String>(); 
		testProducts.add("A1");
		testProducts.add("3-Q");
		testProducts.add("45K11");
		testProducts.add("X1");
		
		BigDecimal total = new BigDecimal(0);
		try {
			total = pointOfSaleService.calculateTotal(testProducts);
		} catch (Exception e) {
			fail();
		}
		assertEquals(new BigDecimal(7.25), total);
		
	}

}
