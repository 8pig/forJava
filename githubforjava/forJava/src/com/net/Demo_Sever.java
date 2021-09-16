package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo_Sever {
    public static void main(String[] args) throws IOException {
        ServerSocket  server = new ServerSocket(12345);
        Socket scoket = server.accept();
        InputStream is = scoket.getInputStream();
        OutputStream os = scoket.getOutputStream();

        os.write("百度一下你就知道11111".getBytes());

        byte[] arr = new byte[1024];
        int len = is.read(arr);
        System.out.println(new String(arr,0,len));
        scoket.close();


    }
}
