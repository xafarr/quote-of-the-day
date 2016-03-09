package com.performancecentre;

import com.performancecentre.domain.Quote;
import com.performancecentre.repository.QuoteRepository;
import com.performancecentre.service.QuoteService;
import com.performancecentre.service.QuoteServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class QuoteOfTheDayApplicationTests {

    @Mock
    private QuoteRepository quoteRepository;

    private QuoteService quoteService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        quoteService = new QuoteServiceImpl(quoteRepository);
    }

    @Test
    public void should_Return_Quote() {
        when(quoteRepository.findQuoteOfTheDay()).thenReturn(new Quote());
		Quote quote = quoteService.getRandomQuote();
        assertNotNull(quote);
        verify(quoteRepository).findQuoteOfTheDay();
    }

}
