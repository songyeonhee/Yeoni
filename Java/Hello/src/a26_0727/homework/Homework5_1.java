package a26_0727.homework;

import java.util.Scanner;

public class Homework5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {3, 5, 3, 7, 3, 9, 5};
        int targetCount = 0;

        System.out.print("찾아볼 숫자 입력 : ");
        int target = sc.nextInt(); 

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

        sc.close();
    }
    
}
