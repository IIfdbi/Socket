package com.cdd.net.IP;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * 概念
 * 一、网络：将不同区域的计算机连接到一起  局域网  城域网  互联网
 * 二、地址：IP地址 确定网络上一个绝对地址|位置-->房子的地址
 * 三、端口号：区分计算机的软件          -->长度是两个字节    0-65535   一共65536
 * 			在同一个协议上端口号不能重复，在不同协议上端口号可以重复
 *			1024以下的尽量不要使用，是给系统预留的
 * 四、资源定位：url  统一资源定位符   uri:统一资源
 * 五、数据的传输：
 * 		协议：tcp和udp协议
 * 				tcp:类似于电话  面向连接   安全可靠  效率低下
 * 				udp:类似于短信  非面向连接  效率高
 * 六、传输：
 * 	1、先封装
 * 	2、后拆分
 * 
 * ======类
 * IP:
 * 	java.net.InetAddress
 * IP+端口号
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
	 * 1、java.net.InetAddress:封装计算机的ip地址和DNS解析，没有端口
	 * 		getHostAddress(); 返回 IP 地址字符串（以文本表现形式）。
	 * 		getHostName() ;   获取此 IP 地址的主机名。
	 * 		getLocalHost();   返回本地主机
	 * 		getByName(String host);  在给定主机名的情况下确定主机的 IP 地址
	 * 2、java.net.InetSocketAddress:封装计算机的ip地址和DNS解析，有端口
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
		//通过getLocalHost()得到InetAddress对象
		InetAddress addr1 = InetAddress.getLocalHost();
		System.out.println(addr1.getHostAddress()); // 返回本机ip
		System.out.println(addr1.getHostName()); // 返回本机计算机名
		// 通过getByName("www.baidu.com")得到InetAddress对象
		System.out.println("=================================");
		InetAddress addr2 = InetAddress.getByName("www.hao123.com");
		System.out.println(addr2.getHostAddress());// 返回域名解析后的ip
		System.out.println(addr2.getHostName()); // 返回域名
		// 通过getByName("119.75.218.70")得到InetAddress对象
		System.out.println("=================================");
		InetAddress addr4 = InetAddress.getByName("119.75.218.70");
		System.out.println(addr4.getHostAddress());
		System.out.println(addr4.getHostName()); // 如果ip能解析就返回域名，如果不能解析返回ip
		// 通过getByAddress("192.168.1.1".getBytes())得到InetAddress对象
		System.out.println("=================================");
		byte[] addrs = { (byte) 119, (byte) 75, (byte) 222, (byte) 10 };
		InetAddress addr3 = InetAddress.getByAddress(addrs);
		System.out.println(addr3.getHostAddress());
		System.out.println(addr3.getHostName()); // 如果ip能解析就返回域名，如果不能解析返回ip
	}
}
