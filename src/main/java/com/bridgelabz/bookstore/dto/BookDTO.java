package com.bridgelabz.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    public int bookID;
    private String name;
    private String author;
    private float price;
    private LocalDate arrivalDate;
    private String coverImage;
    private int quantity;
}
