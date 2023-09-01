package com.operation.promotion;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Service
@AllArgsConstructor
@NoArgsConstructor

public class Promotion {

   private int promotionId;
   private int adId;
   private String promotionCategory;
   private String email;
   private String cardNumber;
   private String expireDate;
   private String cvv;
   private String cardHolderName;
   private String mfs;
   private String mfsNumber;
   private String tsNumber;
   private double subTotal;
   private double vat;
   private double total;
   
}
