package com.pratik.springboot.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {
    private String[] stringArr = {"arr1", "arr2", "arr3"};
    private int count;
    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        System.out.println("Inside Reader ");
        if (count < stringArr.length) {
            return stringArr[count++];
        } else {
            count = 0;  // To start reading again
        }
        return null;
    }
}

