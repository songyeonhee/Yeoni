package a0727.homework;

// 문제 3. 가장 큰 짝수 찾기 

// int[] num = {11, 24, 38, 17, 46, 29};
// 짝수 중에서 가장 큰 값을 출력하세요.

// 출력 예시
// 가장 큰 짝수 : 46

public class Homework3 {
    public static void main(String[] args) {
        int[] num = {11, 24, 38, 17, 46, 29};
        int max = 0; 
        for(int i=0; i<num.length; i++){
            if(num[i]%2 ==0 && num[i]>max) {
                max = num[i];
            }
            
        }
        if(max%2==0) {
            System.out.println("가장 큰 짝수 : " + max);
        }else if(max%2 != 0) {
            System.out.println(
                "짝수가 존재하지 않습니다."
            );
        }
        
    }
}

        
    

