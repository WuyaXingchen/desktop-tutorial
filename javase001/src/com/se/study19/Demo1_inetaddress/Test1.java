package com.se.study19.Demo1_inetaddress;

import java.io.IOException;
import java.net.InetAddress;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.获取本机ip地址对象
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2.获取指定IP或者域名的IP地址对象。
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        // ping www.baidu.com
        System.out.println(ip2.isReachable(6000));
    }
}
