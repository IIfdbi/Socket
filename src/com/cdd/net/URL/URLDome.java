package com.cdd.net.URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 资源定位：
 * url:  统一资源定位符   
 * uri:  统一资源
 * 
 * 由四部分组成:协议-->存放资源的主机域名-->端口-->资源文件名(/之后的)
 * 
 * 
 * URL类：
 * URL(String spec);绝对路径创建
 * URL(URL context, String spec);相对路劲创建
 * URL(String protocol, String host, int port, String file);一部分一部分的构建
 * @author chendongdong
 *
 */
public class URLDome {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com:80/index.xml#aa?uname=cdd");
		System.out.println("协议"+url.getProtocol());
		System.out.println("域名"+url.getHost());
		System.out.println("端口"+url.getPort());
		System.out.println("资源"+url.getFile());
		System.out.println("相对路径"+url.getPath());
		System.out.println("锚点"+url.getRef());
		System.out.println("参数"+url.getQuery());//当存在锚点，参数返回null
		
		
		url = new URL("http://www.baidu.com:80/");
		url = new URL(url,"index.xml#aa?uname=cdd");
		System.out.println(url);
	}
}
