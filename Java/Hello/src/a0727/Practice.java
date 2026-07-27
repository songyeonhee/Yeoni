package a0727;

// 홀수 번째만 합, 짝수 번째만 곱
// 배열의 인덱스를 기준으로

// 홀수 인덱스 값들의 합
// 짝수 인덱스 값들의 곱
// 을 각각 구한 뒤, 합 - 곱 결과를 출력하시오.
// (인덱스는 0부터. 짝수 인덱스가 없으면 곱은 1로 처리)
// 예시

// 입력: [2, 3, 4, 5]
// 짝수 인덱스: 2 * 4 = 8
// 홀수 인덱스: 3 + 5 = 8
// 출력: 0

public class Practice {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 5};
        int even = 1;

        int odd = 0;
        
        
System.out.print("입력 : ");
            for(int i=0; i<num.length; i++) {
                System.out.print(num[i] + " ");
                if(i%2 != 0) {
                    odd += num[i];
                }else if(i%2 == 0) {
                    even *= num[i];
                }
            }
            System.out.println("\n홀수 인덱스 : 3 + 5 = " + odd);   
            System.out.println("짝수 인덱스 : 2 * 4 = " + even);
            System.out.println("합 - 곱 = " + (odd-even));
        }
       
        
    }

