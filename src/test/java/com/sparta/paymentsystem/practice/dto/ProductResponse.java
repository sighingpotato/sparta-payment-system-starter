package com.sparta.paymentsystem.practice;

public record ProductResponse(
        int id,
        String title,
        double price,
        int stock,
        String category
) {}