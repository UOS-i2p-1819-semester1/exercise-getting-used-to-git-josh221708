package uk.ac.uos.i2p.Median;

import java.util.Scanner;

public class Median{
	   public static void main(String[] args){
	      double numbers[] ={17, 89, 27, 11, 91, 42, 73, 90, 5, 56};
	      System.out.println(median(numbers));
	   }
	   public static double median(double[]x){
	      double sum = 0;
	      for(int i=0;i<x.length;i++){
	         sum += x[i];
	      }
	      return sum/x.length;
	   }
	}

