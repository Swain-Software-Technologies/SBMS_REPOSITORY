/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package som.sstech.sb.rest.resources;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/ssi", method = RequestMethod.GET)
public class BookStoreRestController {

	@RequestMapping(value = "/showbook/{ISBN}", method = RequestMethod.GET)
	public String showBookDetails(@PathVariable String ISBN, Model model) {
		
		model.addAttribute("ISBN",ISBN);
		return "ISBN "+ISBN;
	}
	
}
