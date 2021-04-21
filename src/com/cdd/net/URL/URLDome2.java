package com.cdd.net.URL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.URL;

import com.cdd.net.Util.Close;

public class URLDome2 {
	public static void main(String[] args) throws IOException {
		//创建一个URL
		URL url = new URL("http://www.baidu.com");
		//通过url.openStream()获取一个输入流，里面是该URL的html页面数据
		InputStream input = url.openStream();
		//包装这个输入流
		BufferedReader buffreader = new BufferedReader(new InputStreamReader(
				input, "utf-8"));
		//创建一个输出流，把输入流里的东西copy出来
		BufferedWriter buffwriter = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("baidu.html"), "utf-8"));
		String string = null;
		while (null != (string = buffreader.readLine())) {
			buffwriter.append(string);
			buffwriter.newLine();
		}
		buffwriter.flush();
		Close.close(buffwriter,buffreader);
	}
}
