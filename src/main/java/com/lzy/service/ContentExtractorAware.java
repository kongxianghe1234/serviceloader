package com.lzy.service;

public interface ContentExtractorAware {
	
	/**
	 * method to extract content from given String
	 * @param content given string
	 * @return
	 */
	public abstract String extract(String content);

}
