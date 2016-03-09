package com.performancecentre.repository;

import com.performancecentre.domain.Quote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Muhammad Zafar
 *
 * @apiNote Repository interface for raw database call. This is Data Access Object
 */
@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long> {

    /**
     *
     * @implNote Query to return random record from database. No need for implementation,
     * Spring automatically provides implementation at runtime
     */
    @Query(value = "select * from QUOTE order by random() limit 1", nativeQuery = true)
    Quote findQuoteOfTheDay();
}
