package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo_Client {
    public static void main(String[] args) throws IOException {

        Socket scoket = new Socket("127.0.0.1",12345);
        InputStream is = scoket.getInputStream();
        OutputStream os = scoket.getOutputStream();

        byte[] arr = new byte[1024];
        int len = is.read(arr);

        System.out.println(new String(arr,0,len));

        os.write("学习挖掘机哪家强".getBytes());
        scoket.close();




    }
}
