package com.se.study19.Demo7_tcp_test;

import com.se.study19.Demo6_tcp_thread.SeverReaderThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("-----服务端启动-----");
        //1.创建ServerSocket的对象，同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            //2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            System.out.println("有人上线了："+socket.getRemoteSocketAddress());

            new SeverReaderThread(socket).start();
        }
    }
}
