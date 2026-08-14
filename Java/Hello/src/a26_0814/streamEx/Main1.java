package a26_0814.streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan =  new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 700),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );

// 문제 1# 2011년 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬
        practice1(transactions);

// 문제 2# 거래자가 근무하는 모든 도시를 중복없이 나열
        practice2(transactions);

// 문제 3# Combridge에서 근무하는 모든 거래자를 찾아 이름순으로 정렬
        practice3(transactions);

// 문제 4# 밀라노 내 거래자 유무
        practice4(transactions);
        

// 문제 5# Combridge에 거주하는 모든 트랜잭션 값 출력
        practice5(transactions);

// 문제 6# 모든 거래자의 이름을 알파벳 순으로 정렬 
        practice6(transactions);

// 문제 7# 최대 값 구하기
        practice7(transactions);

// 문제 8#  최소값 구하기
       practice8(transactions);
    }


// 문제 1# 2011년 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬
    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(transaction -> 2011 == transaction.getYear())
            .sorted(Comparator.comparing(Transaction::getValue))
            // .sorted(Comparator.comparing(t -> t.getValue()))
            .toList();
        System.out.println(result);
        System.out.println();
    }

// 문제 2# 거래자가 근무하는 모든 도시를 중복없이 나열
    private static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
            .map((tran) -> tran.getTrader().getCity())
            .distinct()
            .toList();
        result.forEach(System.out::println);
        System.out.println();
    }

// 문제 3# Combridge에서 근무하는 모든 거래자를 찾아 이름순으로 정렬   
    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> ("Cambridge").equals(trader.getCity()))
            .distinct()
            .sorted(Comparator.comparing(Trader::getName))
            .toList();
        System.out.println();
    }

// 문제 4# 밀라노 내 거래자 유무
    private static void practice4(List<Transaction> transactions) {
        boolean result = transactions.stream()
        // .anyMatch : 조건을 만족하는 요소가 하나라도 있으면 true 반환
            .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity()));
        
        System.out.println(result);
        System.out.println();
    }

// 문제 5# Combridge에 거주하는 모든 트랜잭션 값 출력
    private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
            .toList();

        System.out.println(result);
    }
    
// 문제 6# 모든 거래자의 이름을 알파벳 순으로 정렬 
    private static void practice6(List<Transaction> transactions) {
        List<String> result = transactions.stream()
            .map(tran -> tran.getTrader().getName())
            .distinct()
            .sorted()
            .toList();
         System.out.println(result);
         System.out.println();
    }
    
// 문제 7#
    private static void practice7(List<Transaction> transactions) {
        Transaction result = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue))
            .orElse(null); 
            //값이 없으면 null 있으면 객체반환 (min인 max 는 null값 처리)
            System.out.println(result);
    }


// 문제 8#
    private static void practice8(List<Transaction> transactions) {
       Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));
        System.out.println(result);
        System.out.println(result.get().getValue());    

    }

}
