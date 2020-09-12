/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package som.sstech.sb.rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Sep 12, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeRestController {

	@GetMapping("/msg")
	public String wisgMsg() {
		
		String msg="Welcome To Swain Software Technology";
		return msg;
		
	}
}
