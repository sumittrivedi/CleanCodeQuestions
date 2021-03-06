/*
 There are two methods weekday1() and weekday2(). Both of them have same functionalities. 
Can you explain which of these two is simpler for you and why? Which principle of clean code this question is related with?
*/
package com.epam.kiss;

public class App {
		
public String weekday1(int day) throws Exception{
    switch (day) {
        case 1: return "Monday";
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        case 6: return "Saturday";
        case 7: return "Sunday";
        default: throw new InvalidOperationException("day must be in range 1 to 7");
    }
}


public String weekday2(int day) throws Exception {
	
    if((day < 1) || (day > 7)) {
    	throw new InvalidOperationException("day must be in range 1 to 7");
    }
    
    String[] days = {
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    };
    return days[day - 1];
}
}
