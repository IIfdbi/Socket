package com.cdd.net.URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ��Դ��λ��
 * url:  ͳһ��Դ��λ��   
 * uri:  ͳһ��Դ
 * 
 * ���Ĳ������:Э��-->�����Դ����������-->�˿�-->��Դ�ļ���(/֮���)
 * 
 * 
 * URL�ࣺ
 * URL(String spec);����·������
 * URL(URL context, String spec);���·������
 * URL(String protocol, String host, int port, String file);һ����һ���ֵĹ���
 * @author chendongdong
 *
 */
public class URLDome {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com:80/index.xml#aa?uname=cdd");
		System.out.println("Э��"+url.getProtocol());
		System.out.println("����"+url.getHost());
		System.out.println("�˿�"+url.getPort());
		System.out.println("��Դ"+url.getFile());
		System.out.println("���·��"+url.getPath());
		System.out.println("ê��"+url.getRef());
		System.out.println("����"+url.getQuery());//������ê�㣬��������null
		
		
		url = new URL("http://www.baidu.com:80/");
		url = new URL(url,"index.xml#aa?uname=cdd");
		System.out.println(url);
	}
}
