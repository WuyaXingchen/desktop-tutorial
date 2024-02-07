package com.se.study19.Demo3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("----服务端启动----");
        //1.创建一个服务端对象
        DatagramSocket socket = new DatagramSocket(6666);

        //2.创建一个数据包对象，用于接收数据的
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        while (true) {
            //3.开始正式使用数据包来接收客户端发来的数据
            socket.receive(packet);

            //4.从字节数组中，把接收到的数据直接打印出来
            int len = packet.getLength();

            String rs = new String(bytes, 0, len);
            System.out.println(rs);

            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            System.out.println("--------------------------------------");
        }
    }
}
