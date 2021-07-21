package com.turnitin.sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise {

	public static Map<String, List<String>> PHRASES = new HashMap<>();

	static {
		PHRASES.put("1", Arrays.asList("afterward", "whenever", "however", "until", "as soon as", "as long as", "while", "again", "also", "besides"));
		PHRASES.put("2", Arrays.asList("therefore", "thus", "consequently", "as a result", "for this reason", "so", "so that", "accordingly", "because"));
		PHRASES.put("3", Arrays.asList("in addition to", "so", "moreover"));
		PHRASES.put("4", Arrays.asList("in general", "for the most part", "as a general rule", "on the whole", "usually", "typically", "in summary"));
	}

	public static String INPUT_TEXT = "Afterwards, soon yellow bird landed on the tall tree in addition to a lazy tortoise.  " +
			"However, he had a read beak. In addition to white the patches on the wings, he was completely yellow. " +
			"In summary, it was yellow bird. In summary, it did not sing.";

	/*
	Description:  Please code the two problems as described below using Java 11 preferably ( or older versions if necessary).  Feel free to create classes,
	structures, interfaces, or any other construct needed to solve this.  Note: the keys (1,2,3,4) in PHRASES have no particular significance to this.
	*/
	public static void main(String[] args) {
        /*
        Problem 1) Get the frequencies of each phrase from PHRASES above, ie how many times the phrase appears in the text as described in inputText,
        but it should be able to work with any text.

        For example, if you have the following:
        phrases = [ "1", ["until, "so", "usually"]]
        text = "So, I have not seen this. So, usually, I don't follow all trends."

        It will create the following output:
        frequencies:  "until":0, "so": 2, "usually":1
        */


        /*
        Problem 2) Based on the phrases in PHRASES, create a unique list of phrases (vocabulary) , then generate a vector/list that
        represents the frequency of each phrase for the given text.

        For example, if we have the following:
        phrases = ["1", ["until, "so", "usually", "so"]]
        text = "So, I have not seen this. So, usually, I don't follow all trends."

        It will have the following output:
        vocabulary = ["so", "until", "usually"]
        vector = [2, 0, 1]
        */
	}
}
