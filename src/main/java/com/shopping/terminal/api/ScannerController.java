package com.shopping.terminal.api;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.terminal.service.PointOfSaleService;

@RestController
@RequestMapping("/scan")
public class ScannerController {
	
	@Autowired
	private PointOfSaleService pointOfSaleService;
	
	@PostMapping("/total")
	 public ResponseEntity<BigDecimal> getTotal(@RequestBody List<String> productCodes) {
		return ResponseEntity.status(HttpStatus.OK).body(pointOfSaleService.calculateTotal(productCodes));
	}

}
