package com.driver;

public class Main
{
  public static void  main(String[] args)
  {
    RWOnly rwOnly=new  RWOnly();
   // rwOnly.name="rakesh";
   // System.out.println(rwOnly.name);
    rwOnly.setName("rakesh");
    System.out.println(rwOnly.getName());
  }
}