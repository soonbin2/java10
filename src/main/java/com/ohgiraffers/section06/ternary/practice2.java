package com.ohgiraffers.section06.ternary;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

//        온라인 쇼핑몰에서 고객이 장바구니에 담은 총 금액에 따라 할인 혜택을 적용해야 합니다.
//
//                장바구니 총 금액이 500,000원 이상이면 20% 할인을 적용합니다.
//                장바구니 총 금액이 300,000원 이상 500,000원 미만이면 10% 할인을 적용합니다.
//                장바구니 총 금액이 100,000원 이상 300,000원 미만이면 5% 할인을 적용합니다.
//                장바구니 총 금액이 100,000원 미만이면 할인이 없습니다.
//        단, 할인 후의 금액과 적용된 할인율을 출력해야 합니다.
//
//        삼항 연산자를 사용하여 이 계산기를 구현하세요.
        Scanner scanner = new Scanner(System.in);

        System.out.print("장바구니의 총 금액을 입력하세요 (원): ");
        double totalAmount = scanner.nextDouble();

        // 할인율을 결정합니다.
        double discountRate = (totalAmount >= 500000) ? 0.20 :
                (totalAmount >= 300000) ? 0.10 :
                        (totalAmount >= 100000) ? 0.05 : 0.00;

        // 할인 후 금액을 계산합니다.
        double discountedAmount = totalAmount * (1 - discountRate);

        // 할인율과 할인 후 금액을 출력합니다.
        System.out.println("적용된 할인율: "+ discountRate * 100);
        System.out.println("할인 후 금액: "+ discountedAmount);
    }
}
