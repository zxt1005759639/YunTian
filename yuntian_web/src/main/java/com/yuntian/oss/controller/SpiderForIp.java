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

public class SpiderForIp {
	public static void main(String[] args) {
		SpiderForIp spiderForIp=new SpiderForIp();
		try {
			spiderForIp.spiderForA("http://www.xicidaili.com/nt/");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void spiderForA(String url) throws InterruptedException {
		Document doc = null;
		try {
			doc = Jsoup.connect(url).ignoreContentType(true).timeout(20000).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		Elements links = doc.select("tb[text]");  
		
		System.out.println(links.size());
		
		for (Element link : links) {  
			
			if (link.text().contains("^(?:(?:1[0-9][0-9]\\\\.)|(?:2[0-4][0-9]\\\\.)|(?:25[0-5]\\\\.)|(?:[1-9][0-9]\\\\.)|(?:[0-9]\\\\.)){3}(?:(?:1[0-9][0-9])|(?:2[0-4][0-9])|(?:25[0-5])|(?:[1-9][0-9])|(?:[0-9]))$\\r\\n\" + \r\n" + 
					"					\"")&&(link.attr("href").contains("http://")||link.attr("href").contains("https://"))) {
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
//			   TimeUnit.SECONDS.sleep(1);
				String urltest=link.attr("href");
//				spiderForA(urltest,stringName,ifDepth);
			}
		   
		}
	}

}
