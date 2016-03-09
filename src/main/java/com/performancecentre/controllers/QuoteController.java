package com.performancecentre.controllers;

import com.performancecentre.domain.Quote;
import com.performancecentre.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xafarr on 9/03/2016.
 */
@Controller
public class QuoteController {
    private int counter = 0;
    private QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping(path = {"/", "/quote"})
    public String getQuoteOfTheDay(Model model) {
        counter++;
        if (counter == 7) {
            counter = 0;
            return "prize";
        }
        Quote quote = quoteService.getRandomQuote();
        model.addAttribute("randomQuote", quote);
        return "quote";
    }
}
