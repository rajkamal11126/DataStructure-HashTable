package com.bridgelabz.hashmaptest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.hashmap.MyLinkedHashMap;

public class MyLinkedHashMapTest {
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but"
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer Value = myLinkedHashMap.get(word);
			if (Value == null)
				Value = 1;
			else
				Value = Value + 1;
			myLinkedHashMap.add(word, Value);
		}
		System.out.println(myLinkedHashMap);
		int frequency = myLinkedHashMap.get("paranoid");
		Assert.assertEquals(3, frequency);
	}
}
