package com.se.study00project;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8888);
        new ClientReaderThread(socket).start();
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("管理员");
        dos.flush();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("欢迎您下次光临！退出成功！");
                dos.close();
                socket.close();
                break;
            }
            //4.开始写数据
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
