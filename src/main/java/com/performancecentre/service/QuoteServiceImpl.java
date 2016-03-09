package com.performancecentre.service;

import com.performancecentre.domain.Quote;
import com.performancecentre.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Muhammad Zafar
 */
@Service
public class QuoteServiceImpl implements QuoteService {

    private QuoteRepository quoteRepository;

    @Autowired
    public QuoteServiceImpl(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    /**
     * @return Quote
     */
    @Override
    public Quote getRandomQuote() {
        return quoteRepository.findQuoteOfTheDay();
    }
}
