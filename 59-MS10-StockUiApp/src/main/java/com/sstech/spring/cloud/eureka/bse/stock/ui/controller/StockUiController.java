/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.bse.stock.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sstech.spring.cloud.eureka.bse.stock.ui.service.StockUiService;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@Controller
public class StockUiController {
	
	@Autowired
	private StockUiService stockUiService;

	@GetMapping("/")
	public String loadForm() {
		return "index";
	}
	@GetMapping("/getTotalCount")
	public String getTotalCount(HttpServletRequest servletRequest,Model model) {
		
		String companyName = servletRequest.getParameter("companyName");
		String quantity=servletRequest.getParameter("quantity");
		
		String response = stockUiService.getTotalStockPrice(companyName, Integer.parseInt(quantity));
		model.addAttribute("msg",response);
		return "index";
		
	}
}
