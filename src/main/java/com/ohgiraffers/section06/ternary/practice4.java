package com.ohgiraffers.section06.ternary;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        // 1. 80.8인 몸무게를 형변환을 통해 정수로 나타내세요

        double weight =80.8;
        int weight2 = (int) weight;
        System.out.println(weight2);

        // 2. 정수형 변수를 선언하여 점수를 저장하고,
//    삼항 연산자를 사용하여 점수가 80점 이상이면 “합격”,
//    그렇지 않으면 “불합격” 을 출력하는 프로그램을 작성하세요.

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();
        String result = (score >=80)? "합격" : "불합격";
        System.out.println(result);
    }
}
