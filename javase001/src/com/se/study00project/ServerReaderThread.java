package com.se.study00project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class ServerReaderThread extends Thread {
    private Socket socket;
    static SocketAddress addressRadio;
    static SocketAddress addressStudent;
    static SocketAddress addressTeacher;
    static SocketAddress addressManager;


    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String msg = dis.readUTF();
                    switch (msg) {
                        case "广播":
                            addressRadio = socket.getRemoteSocketAddress();
                            break;
                        case "学生":
                            addressStudent = socket.getRemoteSocketAddress();
                            break;
                        case "老师":
                            addressTeacher = socket.getRemoteSocketAddress();
                            break;
                        case "管理员":
                            addressManager = socket.getRemoteSocketAddress();
                            break;
                        default:
                            System.out.println(msg);
                            sendMsgToAll(msg, socket.getRemoteSocketAddress());
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("有人下线了：" + socket.getRemoteSocketAddress());
                    SchoolServer.inSchoolSockets.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }

    }

    private void sendMsgToAll(String msg, SocketAddress address) throws Exception {
        if (address.equals(addressRadio)) {
            for (Socket inSchoolSocket : SchoolServer.inSchoolSockets) {
                if (inSchoolSocket.getRemoteSocketAddress().equals(address)) {
                    continue;
                } else {
                    OutputStream os = inSchoolSocket.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    dos.writeUTF("广播通知:");
                    dos.writeUTF(msg);
                    dos.flush();
                }
            }
        } else {
            for (Socket inSchoolSocket1 : SchoolServer.inSchoolSockets) {
                System.out.println(inSchoolSocket1.getRemoteSocketAddress());
                if (inSchoolSocket1.getRemoteSocketAddress().equals(addressRadio)) {
                    OutputStream os = inSchoolSocket1.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(os);
                    dos.writeUTF("-----");
                    if (address.equals(addressStudent))
                        dos.writeUTF("学生：");
                    else if (address.equals(addressTeacher))
                        dos.writeUTF("老师：");
                    else if (address.equals(addressManager))
                        dos.writeUTF("管理员：");
                    dos.writeUTF(msg);
                    dos.flush();
                }
            }
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
