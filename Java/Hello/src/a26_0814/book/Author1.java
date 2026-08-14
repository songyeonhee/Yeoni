package a26_0814.book;

public class Author1 {
    private String name;
    private String country;
    
    public Author1(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author1 [name=" + name + ", country=" + country + "]";
    }
}
