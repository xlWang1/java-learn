package UerLoin;

public class Account {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Account(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return name+"-"+pwd;
    }
}

