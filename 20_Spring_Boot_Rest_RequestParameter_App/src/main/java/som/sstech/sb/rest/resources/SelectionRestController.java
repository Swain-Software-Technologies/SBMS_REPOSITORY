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
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/ssi")
public class SelectionRestController {

	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public String getCourseDetails(@RequestParam("cname") String courseName,
									@RequestParam("tname") String trainerName) {
		if("JRTP".equals(courseName) && "Ashok".equals(trainerName)) {
			return "STARTING FROM 20-09-2020 At 11.00 o'Clock ";
		}
		return "Plesae Check Our Website For More Details";
	}
}
