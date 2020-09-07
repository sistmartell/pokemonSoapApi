package com.martell.pokemonapi.web;

public class test {
	public static void main(String[] args) {
		System.out.println("Result = " + pow(4,2) );
	}
	
	 public static int pow(int a,int n){
	        int res = 1;
	        for(int i=0;i<n;i++){
	        	res = multiplicacion(res,a);
	        }
	        return res;
	    }
	
	    public static int multiplicacion(int a, int b){
	        int res=0; 
	        for(int i=0;i<a;i++){
	        	res = res + b;
	        }
	        return res;
	    }
}
