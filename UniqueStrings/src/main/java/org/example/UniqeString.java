package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class UniqeString {
    public static int uniqueStringSize(List<String> stringOfList){
        Set<String> noDuplicate=new HashSet<>(stringOfList);
        System.out.println(noDuplicate);
        return (noDuplicate.size());
    }
    public static Set uniqueString(List<String> stringOfList){
        Set<String> noDuplicate=new HashSet<>(stringOfList);
//        System.out.println(noDuplicate);
        return (noDuplicate);
    }
    public static void main(String[] args) {
        List<String> stringOfList= new ArrayList<>();
        stringOfList.add("JAVA");
        stringOfList.add("JAVA");
        stringOfList.add("PYTHON");
        stringOfList.add("SONA");
        uniqueStringSize(stringOfList);
    }
}