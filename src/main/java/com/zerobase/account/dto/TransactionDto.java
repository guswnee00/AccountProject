package com.zerobase.account.dto;

import com.zerobase.account.domain.Transaction;
import com.zerobase.account.type.TransactionResultType;
import com.zerobase.account.type.TransactionType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDto {
    private String accountNumber;
    private TransactionType transactionType;
    private TransactionResultType transactionResultType;
    private Long amount;
    private Long balanceSnapShot;
    private String transactionId;
    private LocalDateTime transactedAt;

    public static TransactionDto fromEntity(Transaction transaction) {
        return TransactionDto.builder()
                .accountNumber(transaction.getAccount().getAccountNumber())
                .transactionType(transaction.getTransactionType())
                .transactionResultType(transaction.getTransactionResultType())
                .amount(transaction.getAmount())
                .balanceSnapShot(transaction.getBalanceSnapShot())
                .transactionId(transaction.getTransactionId())
                .transactedAt(transaction.getTransactedAt())
                .build();
    }
}
