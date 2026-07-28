package a0727.homework;

import java.util.Scanner;

// 문제 5. 중복 개수 세기

// int[] num = {3, 5, 3, 7, 3, 9, 5};
// 숫자 3이 몇 번 나오는지 출력하세요.

// 출력
// 3은 3번 나왔습니다.

public class Homework5_ {
    public static void main(String[] args) {
        int[] num = {3, 5, 3, 7, 3, 9, 5};
        int targetCount = 0;
        int target = 3;

        for(int i=0; i<num.length; i++) {
            int value = num[i];
            if(value==target) {
                targetCount++;
            }
        }

        System.out.print(target + "의 개수 : ");
        System.out.println(targetCount + "개");
    }
    
}