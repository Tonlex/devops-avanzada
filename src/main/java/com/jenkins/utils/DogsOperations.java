package com.jenkins.utils;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DogsOperations {
	
	/**
	 * Returns a random dog image url
	 * Using the endpoint https://dog.ceo/api/breeds/image/random
	 * 
	 * Return: URL String similar to 'https://dog.ceo/api/img/maltese/n02085936_8350.jpg'
	 * as a result of parsing the message field of the dog
	 */
	public String getRandomDogImage() {
		// Get JSON Object form REST API (Use JSONObject from org.json already imported on POM file)
		
		// Get image field
		
		// Return image field
	}
	
	/**
	 * Returns an ArrayList of available breeds
	 * Using the endpoint https://dog.ceo/api/breeds/list
	 * 
	 */
	public ArrayList<String> getBreedList() {
		// Get JSON Object form REST API (Use JSONObject from org.json already imported on POM file)
		
		// Get breeds field (get and transform JSONArray into ArrayList<String>)

		// Return list of breeds

	}
}
