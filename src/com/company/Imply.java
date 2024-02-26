//package com.company;
//
//import javafx.scene.transform.Scale;
//
//import java.util.Scanner;
//
//import java.util.*;
//public class Imply {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s= sc.next();
//        System.out.println(solve(s));
//    }
//    public static int solve(String A) {
//        for(int i=0;i<A.length();i++){
//            String t="";
//            for(int j=i;j<A.length();j++){
//                t+=A.charAt(j);
//                if(t.length()>=3 && isGolden(t)){
//                    return 1;
//                }
//            }
//        }
//        return 0;
//    }
//    static boolean isGolden(String t){
//        System.out.println(t);
//        Map<Character,Integer> m=new HashMap<>();
//        for(int i=0;i<t.length();i++){
//            if(m.containsKey(t.charAt(i))){
//                System.out.println(t.charAt(i));
//                m.put(t.charAt(i),m.get(t.charAt(i))+1);
//            }
//            else{
//                m.put(t.charAt(i),1);
//            }
//        }
//        if(m.size()==2){
//            Iterator<Character> it=m.keySet().iterator();
//            while(it.hasNext()){
//                char c = it.next();
//                int v=m.get(c);
//                if(v>(t.length()/3)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
package com.company;

import javafx.scene.transform.Scale;

import java.util.*;
public class Imply {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        System.out.println(solve(s));
    }
    public static int solve(String A) {
        for(int i=0;i<A.length();i++){
            String t="";
            for(int j=i;j<A.length();j++){
                t+=A.charAt(j);
                if(t.length()>=3 && isGolden(t)){
                    return 1;
                }
            }
        }
        return 0;
    }
    static boolean isGolden(String t){
         System.out.println(t);
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(m.containsKey(t.charAt(i))){
                 System.out.println(t.charAt(i));
                m.replace(t.charAt(i),m.get(t.charAt(i))+1);
            }
            else{
                m.put(t.charAt(i),1);
            }
        }
        if(m.size()==2){
            Iterator<Character> it=m.keySet().iterator();
            while(it.hasNext()){
                char c = it.next();
                System.out.println(c);
                int v=m.get(c);
                if(v>(t.length()/3)){
                    return true;
                }
            }
        }
        return false;
    }
}
