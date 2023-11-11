package com.example.taxcalculatedemo.Service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double calculateTax(double income) {
        // 税率和扣除标准的简化版示例
        double taxRate;
        double deduction;

        if (income <= 3000) {
            taxRate = 0.03;
            deduction = 0;
        } else if (income <= 12000) {
            taxRate = 0.1;
            deduction = 210;
        } else if (income <= 25000) {
            taxRate = 0.2;
            deduction = 1410;
        } else {
            taxRate = 0.3;
            deduction = 2660;
        }

        return (income * taxRate) - deduction;
    }
}


