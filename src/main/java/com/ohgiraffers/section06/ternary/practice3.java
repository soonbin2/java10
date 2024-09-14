package com.ohgiraffers.section06.ternary;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
//        문제 1. 화씨를 섭씨로 바꾸는 코드 작성하세요
//                (공식) - (화씨 − 32) × 5/9 = °C , 섭씨는 강제 형변환으로 정수로 출력
//
//        문제 2. 공을 전부 넣기 위해 필요한 상자의 개수를 구하세요 . 상자 하나당 공은5개가 들어감
//        삼항 연산자 사용
//        ex) 공이 23개면 상자는 5개가 필요
        int hwa = 1;
        double sup =0.0;
        int sup2 = (int) sup;
        sup2 = (hwa-32) * 5 / 9;
        System.out.println(sup2);


        Scanner sc = new Scanner(System.in);
        System.out.print("넣을 공 갯수를 적으시오 : ");
        int ball = sc.nextInt();

        int box = (ball <= 5) ? 1 :
                (ball <= 10) ? 2 :
                        (ball <= 15) ? 3 :
                                (ball <=20) ? 4 :
                                        (ball<=25) ? 5 :0; if(box==0){
            System.out.println("박스가 부족합니다 ㅠ");

        }else{
            System.out.println("공의 갯수는 " + ball + "개 이므로 상자는 " +box+ "개가 필요합니다. " );
        }

    }
}
