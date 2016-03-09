package com.performancecentre.service;

import com.performancecentre.domain.Quote;
import com.performancecentre.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Muhammad Zafar
 */
@Service
public class QuoteService {

    private QuoteRepository quoteRepository;

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    /**
     * @apiNote Service class that talks to DAO object and provides service to Controller.
     * @return Quote
     */
    public Quote getRandomQuote() {
        return quoteRepository.findQuoteOfTheDay();
    }
}
