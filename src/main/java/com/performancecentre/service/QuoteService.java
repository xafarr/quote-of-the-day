package com.performancecentre.service;

import com.performancecentre.domain.Quote;

/**
 * @author Muhammad Zafar
 */
public interface QuoteService {
    /**
     * @apiNote Service class that talks to DAO object and provides service to Controller.
     * @return Quote
     */
    Quote getRandomQuote();
}
