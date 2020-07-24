package com.gavegaInterview.libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyValue {
	public String readPropertyValue(String propertyValue) throws IOException {
		String propertyFilePath = "..\\goavega\\libraries\\data.properties";
		FileInputStream propertyFile = new FileInputStream(propertyFilePath);
		Properties property = new Properties();
		property.load(propertyFile);

		return property.getProperty(propertyValue);

	}
}
