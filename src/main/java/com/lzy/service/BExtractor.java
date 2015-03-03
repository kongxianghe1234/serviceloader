package com.lzy.service;

public class BExtractor implements ContentExtractorAware{

	public String extract(String content) {
		return content+="BExtractor has extract! \n";
	}

}
