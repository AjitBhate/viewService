package com.stock.StockView.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/viewstock/")
public class StockViewController {
	
		
		 @RequestMapping("/view")
		public String getViewStock()
		{
			return "Test";
		}

	

}
