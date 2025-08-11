package com.eyfinance.backend.controller;

import com.eyfinance.backend.dto.TransactionSaveRequest;
import com.eyfinance.backend.entity.FinanceTransaction;
import com.eyfinance.backend.repository.FinanceTransactionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final FinanceTransactionRepository financeTransactionRepository;

    public TransactionController(FinanceTransactionRepository financeTransactionRepository) {
        this.financeTransactionRepository = financeTransactionRepository;
    }

    @PostMapping("/save")
    public ResponseEntity<FinanceTransaction> saveTransaction(@RequestBody TransactionSaveRequest request) {
        FinanceTransaction toSave = new FinanceTransaction();
        toSave.setAmount(request.getAmount());
        toSave.setType(request.getType());
        toSave.setDescription(request.getDescription());

        FinanceTransaction saved = financeTransactionRepository.save(toSave);
        return ResponseEntity.ok(saved);
    }
}