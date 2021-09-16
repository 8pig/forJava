package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class D2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();

        BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));  // 字节流包装字符流
        PrintStream ps = new PrintStream(socket.getOutputStream());



    }
}
