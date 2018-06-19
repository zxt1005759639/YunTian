package com.yuntian.oss.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class CreateURl {
	public static void main(String[] args) throws InterruptedException {
		CreateURl createURl=new CreateURl();
		createURl.spiderForDepth("http://news.baidu.com/?tn=news","习近平",3);
	}
	
	
	//单链接深度无限爬,url and stringName关键字
	public void spiderForA(String url,String stringName,Boolean ifDepth) throws InterruptedException {
		Document doc = null;
		try {
			doc = Jsoup.connect(url).ignoreContentType(true).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		Elements links = doc.select("a[href]");  
		
		System.out.println(links.size());
		
		for (Element link : links) {  
			
			if (link.text().contains(stringName)&&(link.attr("href").contains("http://")||link.attr("href").contains("https://"))) {
				System.out.println("href："+link.attr("href"));
			    System.out.println("text : " + link.text());
			    URL url1;    
		        try { 
		             url1 = new URL(link.attr("href"));    
		             InputStream in = url1.openStream();    
		             System.out.println("连接可用");  
		        } catch (Exception e1) {    
		             System.out.println("连接打不开!");    
		             url1 = null;    
		        }    
			   TimeUnit.SECONDS.sleep(1);
				String urltest=link.attr("href");
				spiderForA(urltest,stringName,ifDepth);
			}
		   
		}
	}
	
	//深度设置爬,url and stringName关键字 and depth深度
	public void spiderForDepth(String url,String stringName,int depth) throws InterruptedException {
		Document doc=null;
		boolean isDepth=true;
		Element link_one;
		try {
			doc = Jsoup.connect(url).ignoreContentType(true).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		Elements links = doc.select("a[href]");  
		System.out.println(links.size());
			for (Element link : links) {  
			link_one=link;
			if (link.text().contains(stringName)&&(link.attr("href").contains("http://")||link.attr("href").contains("https://"))) {
				for (int i = 1; i <= depth; i++) {
					if (i<=depth) {
						spiderForA(link.attr("href"),stringName,true);
					}else {
						spiderForA(link.attr("href"),stringName,false);
					}
						
					}
				
				}
			}
		
		
	}
	
	
	
	

}
