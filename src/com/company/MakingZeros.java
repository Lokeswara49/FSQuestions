package com.company;

import java.util.Scanner;

public class MakingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(solve(A,B));;
    }
        public static int solve(int A, int B) {
            return cost(A,B);
        }
        static int cost(int A,int B){
            if(A==0 && B==0){
                return 0;
            }
            if((A==1 && B==0) || (A==0 && B==1)){
                return 1;
            }
            if(A==0 || B==0){
                return 2;
            }
            int c1=Integer.MAX_VALUE;
            int v=(int)Math.sqrt(A*B);
            if(v<A && v<B) {
                c1 = cost(v, v) + 2;
            }
            int c2=Integer.MAX_VALUE;
            int c3=Integer.MAX_VALUE;
            if(A!=0){
                c2=cost(A/2,B)+1;
            }
            if(B!=0){
                c3=cost(A,B/2)+1;
            }
            int min=Math.min(c1,Math.min(c2,c3));
            return min;
        }
    }

