package com.eyfinance.backend.repository;

import com.eyfinance.backend.entity.FinanceTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceTransactionRepository extends JpaRepository<FinanceTransaction, Long> {
}