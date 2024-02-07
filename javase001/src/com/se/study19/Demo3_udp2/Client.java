package com.se.study19.Demo3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            if ("exit".equals(msg)) {
                System.out.println("欢迎下次光临！退出成功！");
                socket.close();
                break;
            }
            byte[] bytes=msg.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),6666);

            socket.send(packet);
        }
    }
}
