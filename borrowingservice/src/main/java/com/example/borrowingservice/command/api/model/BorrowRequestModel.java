package com.example.borrowingservice.command.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowRequestModel {
    private String id ;

    private String bookId;
    private String employeeId;
    private Date borrowingDate;
    private Date returnDate;

}
