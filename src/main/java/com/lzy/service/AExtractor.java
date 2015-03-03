package com.lzy.service;

public class AExtractor implements ContentExtractorAware{

	public String extract(String content) {
		return content+="AExtractor has extract! \n";
	}

}
