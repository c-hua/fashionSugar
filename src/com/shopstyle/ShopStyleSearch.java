package com.shopstyle;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ShopStyleSearch {
	
	private String appKey = "";
	private String lastResponse = "";
	private String lastError = "";
	
	public ShopStyleSearch(String appKey) {
		this.appKey = appKey;
	} 
	
	public PopSugarProducts search(String queryString) throws MalformedURLException, IOException {
		HttpURLConnection conn = null;
		try {
			String url = "http://api.shopstyle.com/api/v2/products?pid=" + appKey + "&offset=0&limit=10&fts=" + java.net.URLEncoder.encode(queryString);
			conn = getRestConnection(url);
			int status = conn.getResponseCode(); // triggers the request
			if( status != 200 )	// 200 = OK
			{
				String errorText = getErrorDetails(conn);
				System.err.print("Error calling webservice, status is: " + status);
				System.err.print("Error calling webservice, error message is: " + errorText );
				return null;
			}

			String json = extractAndSaveOutput(conn);
			ObjectMapper mapper = new ObjectMapper();
			PopSugarProducts info = mapper.readValue( json, PopSugarProducts.class );
			return info;
		}
		finally {
			if( conn != null ) 
				conn.disconnect();
		}
	}
	
	private String getErrorDetails(HttpURLConnection conn) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( conn.getErrorStream()));
		StringBuilder responseText = new StringBuilder();
		String line = null;
		while ( (line = br.readLine()) != null)
			responseText.append(line);
		lastError = responseText.toString();
		return lastError;
	}
	
	private String extractAndSaveOutput(HttpURLConnection conn) throws IOException {
		BufferedInputStream bufferStream = new BufferedInputStream(conn.getInputStream());
		BufferedReader br = new BufferedReader( new InputStreamReader( bufferStream ) );
		String line = null;
		StringBuilder responseText = new StringBuilder();
		while ( (line = br.readLine()) != null)
			responseText.append(line);

		lastResponse = responseText.toString();
		return lastResponse;
	}
	
	public HttpURLConnection getRestConnection(String url) throws IOException,
		MalformedURLException {
		HttpURLConnection conn;
		conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestProperty("Accept", "application/json");
		conn.setDoOutput(true);
		return conn;
		}
	}
