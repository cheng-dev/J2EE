package domain;

/**
 * @author xiao
 * @date 2019/11/24 下午 4:11
 */
public class User {
    private String uname;
    private String upassword;

    public User(String uname, String upassword) {
        this.uname = uname;
        this.upassword = upassword;
    }

    public String testGetValue() {
        return "测试EL使用方法";
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
