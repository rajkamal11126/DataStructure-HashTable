package com.bridgelabz.hashmaptest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.hashmap.MyHashMap;

public class MyHashMapTest {
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myhashmap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myhashmap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myhashmap.add(word, value);
		}
		int frequency = myhashmap.get("to");
		System.out.println(myhashmap);
		Assert.assertEquals(2, frequency);
	}
}
