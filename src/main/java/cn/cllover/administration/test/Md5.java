package cn.cllover.administration.test;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.testng.annotations.Test;
//密码测试
public class Md5 {

    @Test
    public void md5test(){

    String pass = "082999";
        Md5Hash md5Hash = new Md5Hash(pass,"adilm",3);
        System.out.println(md5Hash);
    }
}
