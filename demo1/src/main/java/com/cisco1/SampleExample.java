package com.cisco1;

import java.util.List;
//added commits to check fetch(pull) option
import java.util.ArrayList;

public class SampleExample {
	
   private List<Integer> integers = null;
   public SampleExample() {
      integers = new ArrayList<Integer> ();
   }
   public void addInteger(int num) {
      integers.add(num);

   }
   public int getSize() {

      return integers.size();

   }

}


