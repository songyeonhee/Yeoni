package a26_0727.homework;

import java.util.Scanner;

// 응용 1
// 배열도 사용자 입력으로 받기

// 몇 개의 숫자를 저장할까요? 5
// 1번째 숫자 : 3
// 2번째 숫자 : 5
// 3번째 숫자 : 3
// 4번째 숫자 : 7
// 5번째 숫자 : 3

// 찾을 숫자 : 3

// 결과 : 3은 3번 있습니다.


// 배열 안의 모든 숫자 개수 출력하기
// 결과:
// 3 : 3개
// 5 : 2개
// 7 : 1개
// 9 : 1개

public class Homework5_2 {
    public static void main(String[] args) {
        Scanner targetSc = new Scanner(System.in);
        Scanner arraySc = new Scanner(System.in);
        Scanner valueSc = new Scanner(System.in);

        
        int target = targetSc.nextInt(); 
        int targetCount = 0;

        int[] num = {3, 5, 3, 7, 3, 9, 5};

        System.out.print("찾아볼 숫자 입력 : ");

        for(int i=0; i<num.length; i++) {
            int value = num[i];
            if(value==target) {
                targetCount++;
            }
        }

        if(targetCount>0) {
        System.out.print(target + "의 개수 : ");
        System.out.println(targetCount + "개");
        }else {
            System.out.println(targetCount+" : 존재하지 않습니다.");
        }
    }
    
}
