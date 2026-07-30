package a26_0723;

public class Array3 {
    public static void main(String[] args) {
        int[] score = {90, 85, 78, 95, 88};
        
        // 배열을 바꿀 수 없음
        // for(int i=0; i <5; i++){
        //     System.out.println(score[i]);
        // }


        // score.length> 배열의 크기가 바뀌어도 코드를 수정할 필요가 없음
        for(int i =0; i < score.length ; i++){
            // System.out.println(score[i]);
            System.out.println(i + "번 째 인덱스" + score[i]);
    }
}}
