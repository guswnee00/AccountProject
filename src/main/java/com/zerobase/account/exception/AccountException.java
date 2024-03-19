package com.zerobase.account.exception;

import com.zerobase.account.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountException extends RuntimeException {
    private ErrorCode errorCode;
    private String ErrorMessage;

    public AccountException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.ErrorMessage = errorCode.getDescription();
    }
}
