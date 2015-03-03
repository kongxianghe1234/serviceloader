package com.lzy.serviceloader;

import java.util.ServiceLoader;

import com.lzy.service.ContentExtractorAware;

public class ClassLoaderDemo{
    public static void main(String[] args){
    	String content = "";
    	ServiceLoader<ContentExtractorAware> loder=ServiceLoader.load(ContentExtractorAware.class);  
    	System.out.println("list all the implements sub class to invoke abstract method:");
    	for (ContentExtractorAware extractor : loder) { 
    		System.out.println(extractor.getClass());  
    		content=extractor.extract(content);  
    	}
    	System.out.println("\nshow the content:");
    	System.out.println(content);
    }
}
