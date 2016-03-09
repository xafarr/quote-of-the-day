package com.performancecentre.repository;

import com.performancecentre.domain.Quote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Muhammad Zafar
 *
 */
@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {

    @Query(value = "select * from QUOTE order by random() limit 1", nativeQuery = true)
    Quote findQuoteOfTheDay();
}
