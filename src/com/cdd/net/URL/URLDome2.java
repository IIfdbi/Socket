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
		//����һ��URL
		URL url = new URL("http://www.baidu.com");
		//ͨ��url.openStream()��ȡһ���������������Ǹ�URL��htmlҳ������
		InputStream input = url.openStream();
		//��װ���������
		BufferedReader buffreader = new BufferedReader(new InputStreamReader(
				input, "utf-8"));
		//����һ�������������������Ķ���copy����
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
