package a0728;

// 문제 3: 배열의 최댓값 찾기 (배열 활용)
// 요구사항: 정수형 배열을 매개변수로 받아, 
// 배열 안의 원소 중 가장 큰 값을 찾아 반환하는 
// 메서드 getMax를 작성하세요.

// 메서드 시그니처 예시: public static int getMax(int[] arr)

public class MethodPractice3 {
    public static void main(String[] args) {
        int[] score = {70, 85, 100, 30};
        System.out.println(max(score));
    }

    private static int max(int[] arr) {
        int num1 = 0;
        for(int i=0; i<arr.length; i++) {
           if(arr[i] > num1) {
            num1=arr[i];
           }
        }
        return num1;
}
}
        
