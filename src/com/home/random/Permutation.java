package com.home.random;
import java.util.LinkedHashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {
        Set<String> uniqueList = new LinkedHashSet<String>();
        subStrings("BHARAT",uniqueList);
        System.out.println(uniqueList.size());
    }

    static void subStrings(String s,Set<String> uniqueSet) {
        if (s.length() > 0) {
            uniqueSet.add(s);
            subStrings(s.substring(1),uniqueSet);
            subStrings(s.substring(0,s.length()-1),uniqueSet);
        }
    }

}
