package domain;

/**
 * @author xiao
 * @date 2019/11/24 下午 1:52
 */
public class Atm {

    private String aname;
    private String apassword;
    private Float abalance;

    @Override
    public String toString() {
        return "{" + aname + "," + apassword + "," + abalance + "}";
    }

    public Atm() {
    }

    public Atm(String aname, String apassword, Float abalance) {
        this.aname = aname;
        this.apassword = apassword;
        this.abalance = abalance;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public Float getAbalance() {
        return abalance;
    }

    public void setAbalance(Float abalance) {
        this.abalance = abalance;
    }
}
