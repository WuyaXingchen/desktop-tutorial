package com.se.study19.Demo2_udp;

import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建客户端对象
        DatagramSocket socket=new DatagramSocket(7777);

        //2.创建数据包对象封装要发出去的数据
        byte[] bytes="这里是客户端".getBytes();
        DatagramPacket packet =new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);

        //3.开始正式发送这个数据包的数据出去了
        socket.send(packet);

        System.out.println("客户端数据发送完毕~~~");
        //释放资源
        socket.close();
    }
}
