package a26_0805.array;

public class Student1 {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student1(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student1 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    

    
}
