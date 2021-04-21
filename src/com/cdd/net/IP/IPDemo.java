package com.cdd.net.IP;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * ����
 * һ�����磺����ͬ����ļ�������ӵ�һ��  ������  ������  ������
 * ������ַ��IP��ַ ȷ��������һ�����Ե�ַ|λ��-->���ӵĵ�ַ
 * �����˿ںţ����ּ���������          -->�����������ֽ�    0-65535   һ��65536
 * 			��ͬһ��Э���϶˿ںŲ����ظ����ڲ�ͬЭ���϶˿ںſ����ظ�
 *			1024���µľ�����Ҫʹ�ã��Ǹ�ϵͳԤ����
 * �ġ���Դ��λ��url  ͳһ��Դ��λ��   uri:ͳһ��Դ
 * �塢���ݵĴ��䣺
 * 		Э�飺tcp��udpЭ��
 * 				tcp:�����ڵ绰  ��������   ��ȫ�ɿ�  Ч�ʵ���
 * 				udp:�����ڶ���  ����������  Ч�ʸ�
 * �������䣺
 * 	1���ȷ�װ
 * 	2������
 * 
 * ======��
 * IP:
 * 	java.net.InetAddress
 * IP+�˿ں�
 * 	java.net.InetSocketAddress
 * URL:
 * 	java.net.URL
 * TCP:
 * 	java.net.ServerSocket
 * 	java.net.Socket
 * UDP:
 * 	java.net.DatagramSocket
 * 	java.net.DatagramPacket
 * @author chendongdong
 *
 */
public class IPDemo {
	/*
	 * 1��java.net.InetAddress:��װ�������ip��ַ��DNS������û�ж˿�
	 * 		getHostAddress(); ���� IP ��ַ�ַ��������ı�������ʽ����
	 * 		getHostName() ;   ��ȡ�� IP ��ַ����������
	 * 		getLocalHost();   ���ر�������
	 * 		getByName(String host);  �ڸ����������������ȷ�������� IP ��ַ
	 * 2��java.net.InetSocketAddress:��װ�������ip��ַ��DNS�������ж˿�
	 * 		InetSocketAddress(InetAddress addr, int port)
	 * 		InetSocketAddress(int port) 
	 * 		InetSocketAddress(String hostname, int port) 
	 */
	public static void main(String[] args) throws UnknownHostException {
		Inet();
//		InetSocket();
	}
	/*
	 * getAddress() 
	 * getHostName() 
	 * getPort()
	 */
	public static void InetSocket(){
		InetSocketAddress isaddr = new InetSocketAddress("127.0.0.0",8888);
		System.out.println(isaddr.getHostName());
		System.out.println(isaddr.getHostString());
		System.out.println(isaddr.getPort());
		System.out.println(isaddr.getAddress());
	}
	public static void Inet() throws UnknownHostException{
		//ͨ��getLocalHost()�õ�InetAddress����
		InetAddress addr1 = InetAddress.getLocalHost();
		System.out.println(addr1.getHostAddress()); // ���ر���ip
		System.out.println(addr1.getHostName()); // ���ر����������
		// ͨ��getByName("www.baidu.com")�õ�InetAddress����
		System.out.println("=================================");
		InetAddress addr2 = InetAddress.getByName("www.hao123.com");
		System.out.println(addr2.getHostAddress());// ���������������ip
		System.out.println(addr2.getHostName()); // ��������
		// ͨ��getByName("119.75.218.70")�õ�InetAddress����
		System.out.println("=================================");
		InetAddress addr4 = InetAddress.getByName("119.75.218.70");
		System.out.println(addr4.getHostAddress());
		System.out.println(addr4.getHostName()); // ���ip�ܽ����ͷ���������������ܽ�������ip
		// ͨ��getByAddress("192.168.1.1".getBytes())�õ�InetAddress����
		System.out.println("=================================");
		byte[] addrs = { (byte) 119, (byte) 75, (byte) 222, (byte) 10 };
		InetAddress addr3 = InetAddress.getByAddress(addrs);
		System.out.println(addr3.getHostAddress());
		System.out.println(addr3.getHostName()); // ���ip�ܽ����ͷ���������������ܽ�������ip
	}
}
