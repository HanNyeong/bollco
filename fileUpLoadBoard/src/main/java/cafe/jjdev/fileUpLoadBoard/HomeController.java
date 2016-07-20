package cafe.jjdev.fileUpLoadBoard;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cafe.jjdev.fileUpLoadBoard.model.ArticleCommend;
import cafe.jjdev.fileUpLoadBoard.service.ArticleService;
import cafe.jjdev.fileUpLoadBoard.service.ArticleServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Autowired
	private ArticleService articleService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/addArticle", method = RequestMethod.GET)
	public String addArticle(){
		
		return "addArticle";
	}
	
	@RequestMapping(value="/addArticle", method = RequestMethod.POST)
	public String addArticle(ArticleCommend articleCommend){
		logger.info("겟투더겟"+articleCommend);
		try {
			articleService.addArticle(articleCommend);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/";
	}
	
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
