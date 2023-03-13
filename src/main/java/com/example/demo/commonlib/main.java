package com.example.demo.commonlib;

import com.thegreatapi.demolibrary.CalculatePaddle;
import com.thegreatapi.demolibrary.CalculatePaddleImpl;

public class main {

  public static void main(String[] args) {
    CalculatePaddle cal = new CalculatePaddleImpl();
    Long sum = cal.sum(1l, 2l);
    System.out.println(sum);
  }
}
