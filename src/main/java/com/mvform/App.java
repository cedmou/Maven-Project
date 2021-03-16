package com.mvform;

import org.jsoup.Jsoup;

import com.entities.Greeter;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String htmlText = "<h1>Hello World!</h1>";
        System.out.println(htmlText);
        
        System.out.println(Jsoup.parse(htmlText).text());
        
        String htmlText2 = "<h2>Sous-titre</h2>";
        System.out.println(Jsoup.parse(htmlText2).text());
        
    	LocalTime currentTime = new LocalTime();
    	System.out.println("Il est " + currentTime);
    	
    	Greeter greeter = new Greeter();
    	System.out.println(greeter.sayHello());
    }
}
