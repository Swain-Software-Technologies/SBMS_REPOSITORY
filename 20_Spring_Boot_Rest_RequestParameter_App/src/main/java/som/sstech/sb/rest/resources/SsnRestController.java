/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package som.sstech.sb.rest.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Sep 12, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/ssa", method = RequestMethod.GET)
public class SsnRestController {

	@RequestMapping(value = "/fpdscore" ,method = RequestMethod.GET)
	public String getFpdScores(@RequestParam(value = "ssn",required = false,defaultValue = "9856324587") Long ssnNumber) {
		
//		Logic to retrive ssn from DB
		return "Your SSN number is "+ssnNumber;
		
	}
}
