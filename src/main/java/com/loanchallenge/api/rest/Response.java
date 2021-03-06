package com.loanchallenge.api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
    private T data;
    private List<String> errorMessages;

    public T getData() {
        return data;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public ResponseEntity<Response<T>> asAccepted(T body) {
        data = body;
        return ResponseEntity.status(HttpStatus.CREATED).body(this);
    }

    public ResponseEntity<Response<T>> asBadRequest(BindingResult bindingResult) {
        bindingResult.getAllErrors().forEach(error -> addErrorMessage(error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(this);
    }

    private void addErrorMessage(String message) {
        if (errorMessages == null) errorMessages = new ArrayList<>();
        errorMessages.add(message);
    }
}
