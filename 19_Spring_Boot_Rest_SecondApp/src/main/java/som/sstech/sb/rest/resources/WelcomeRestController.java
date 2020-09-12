/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package som.sstech.sb.rest.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author TRINATH, Sep 12, 2020
 *
 * @Description :
 */
@Controller
@ResponseBody
@RequestMapping(value = "/welcome")
public class WelcomeRestController {
	
	public WelcomeRestController() {
		System.out.println("WelcomeRestController.WelcomeRestController()");
	}

	@GetMapping(value = "/wishmsg")
	public String wishMsg() {
		String msg="Welcome To SSTechnology";
		return msg;
	}
	@GetMapping(value = "/greet")
	public String greet() {
		String msg="Welcome To RestFul!!!!!!!";
		return msg;
	}
}
