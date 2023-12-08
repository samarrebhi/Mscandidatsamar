package com.example.stock_bibliotheque_microservices.Repositories;

import com.example.stock_bibliotheque_microservices.Entities.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    @Query("select s from Stock s where s.numstock like :numstock")
    public Page<Stock> StockByNum(@Param("numstock") String num, Pageable pageable);
}


