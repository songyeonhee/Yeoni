package a26_0807.bankapp;

public class Bank1 {
    private String ano;
    private String owner;
    private int balance = 0;
    
    public Bank1(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public Bank1(String ano, String owner) {
        this.ano = ano;
        this.owner = owner;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
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

    @Override
    public String toString() {
        return "계좌 번호 > " + ano + " | 예금주 > " + owner + "님 | 잔액 > " + balance + "원";
    }

    
}
