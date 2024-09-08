package com.ohgiraffers.section06.ternary;

public class practice {
    public static void main(String[] args) {

       //문제 1. int를 byte로 강제 형변환 했을시 데이터가 손상되게 하라.`
        int num = 200;
        byte num2 = (byte) num;
        System.out.println(num2);

      //문제 2. 문자형 a를 int 정수형으로 자동변환 했을시 나오는 출력 값은?`
        char ch = 'a';
        int ch2 = (int) ch;
        System.out.println(ch2); //97
    }
}
