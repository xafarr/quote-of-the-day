package com.performancecentre.service;

import com.performancecentre.domain.Quote;
import com.performancecentre.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xafarr on 9/03/2016.
 */
@Service
public class QuoteService {

    private QuoteRepository quoteRepository;

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public Quote getRandomQuote() {
        return quoteRepository.findQuoteOfTheDay();
    }
}
