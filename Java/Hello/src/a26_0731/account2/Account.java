package a26_0731.account2;

public class Account {
    private String owner;
    private int balance;
    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
   
    public void deposit(int money) {
        balance += money;
        System.out.printf("[%s] %,d원 입금 → 잔액 : %,d원\n", owner, money, balance);
    }

    public boolean withdraw(int money) {
        if(money > balance) {
            System.out.printf("[%s] 출금 실패 (잔액 부족)\n", owner);
            return false;
        } balance -= money;
         System.out.printf("[%s] %,d원 출금 → 잔액 : %,d원\n", owner, money, balance);
         return true;
    }

    public boolean transfer(Account target, int money) {
        if(balance < money) {
            System.out.printf("[%s] → [%s] 송금 실패 (잔액 부족)\n", owner, target.owner);
            return false;
        } 
        this.balance -= money; // 철수의 잔액 감소
        target.balance += money;
        System.out.printf("[%s] → [%s] 송금 완료\n", owner, target.owner);
         System.out.printf("[%s 잔액] : %,d원\n", owner, balance);
         System.out.printf("[%s 잔액] : %,d원\n", target.owner, target.balance);
        return true;
    }
}
