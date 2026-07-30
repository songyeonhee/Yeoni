package a0727.homework;

// 문제 4. 짝수는 더하고 홀수는 빼기

// int[] num = {2, 7, 4, 9, 6};
// 짝수 → 더하기
// 홀수 → 빼기
// 계산 결과를 출력하세요.

// 예시
// 0
// +2
// -7
// +4
// -9
// +6

// 최종 결과
// -4

public class Homework4 {
    public static void main(String[] args) {
        int[] num = {2, 7, 4, 9, 6};
        int total = 0;
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;

        System.out.println(total);
        for(int i=0; i<num.length; i++) {
            int value = num[i];
            if(value%2==0) {
                total += value;
                evenSum += value;
                evenCount++;
                System.out.println("+" + value);
            }else {
                total -= value;
                oddSum += value;
                oddCount++;
                System.out.println("-" +value);
            }
        }
        System.out.println("=================");
        System.out.println("짝수 : " + evenCount + "개");
        System.out.println("짝수 합계 : " + evenSum);
        System.out.println("-----------------");
        System.out.println("홀수 : " + oddCount + "개");
        System.out.println("홀수 합계: " + oddSum);
        System.out.println("-----------------");
        System.out.print("최종 결과 : "+ evenSum+ "-"+ oddSum + " = ");
        System.out.println(total);


    }
}


// 최종 결과뿐 아니라 중간 과정 출력하기

// 출력:

// 0
// +2
// -7
// +4
// -9
// +6

// 최종 결과 : -4

// 또는

// 짝수의 개수와 홀수의 개수도 출력하기

// 결과:

// 짝수 개수 : 3
// 홀수 개수 : 2
// 최종 결과 : -4