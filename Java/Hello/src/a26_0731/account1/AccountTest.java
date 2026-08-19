package a26_0731.account1;

public class AccountTest {

    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);

        while (a.transfer(b, 3000)) {
            ; // 아무것도 안한다.
        }
        ;

        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }

}
// public class Account {}
// 하나의 .java 파일에는 public 클래스 하나만 생성 가능

class Account {
    String num;
    int balance;

    public Account(String num, int balance) {
        this.num = num; // 계좌번호
        this.balance = balance; // 잔액
    }

    public String toStr() {
        return String.format("num : %s, balance : %d", num, balance);
    }

    public boolean transfer(Account b, int i) {
        if (balance < i) {
            return false; // 잔액이 송금액보다 작으면 거짓을 리턴
        }
        balance = balance - i; // a의 잔액이 3000 감소
        b.balance = b.balance + i;
        return true;
    }

}

// 처음 a=10,000, b=10,000

// balance < i이므로 while문이 계속 돌아감
// 첫 번째 송금 a >b 3,000 / a=7,000 b=13,000
// 두 번째 송금 a >b 3,000 / a=4,000 b=16,000
// 세 번째 송금 a >b 3,000 / a=1,000 b=19,000

// 네 번째 송금에서 balance < i를 충족하지 않기 때문에 return false 실행