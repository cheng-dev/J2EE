package service;

import dao.AtmDao;
import domain.Atm;
import util.MySpring;

/**
 * @author xiao
 * @date 2019/11/15 下午 9:25
 */
public class AtmService {
    private AtmDao atmDao = MySpring.getBean("dao.AtmDao");

    public String login(String aname, String apassword) {
        Atm atm = atmDao.selectOne(aname);
        if (atm != null && apassword.equals(atm.getApassword())) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }

    public Float queryBalance(String aname) {
        return atmDao.selectOne(aname).getAbalance();
    }

    //查询业务方法
    public Float inquiry(String aname) {
        return atmDao.selectOne(aname).getAbalance();
    }

    //存钱业务方法
    public void deposit(String aname, Float depositBalance) {
        Atm atm = atmDao.selectOne(aname);
        atm.setAbalance(atm.getAbalance() + depositBalance);//临时的atm对象改掉啦
        atmDao.update(atm);
    }

    //存钱业务方法
    public void withdraw(String aname, Float withdrawMoney) throws Exception {
        Atm atm = atmDao.selectOne(aname);
        if (atm.getAbalance() < withdrawMoney) {
            throw new Exception("钱不够");
        }
        atm.setAbalance(atm.getAbalance() - withdrawMoney);//临时的atm对象改掉啦
        atmDao.update(atm);
    }
}

