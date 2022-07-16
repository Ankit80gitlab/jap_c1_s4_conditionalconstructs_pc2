package com.jap.aquariumphlevelanalyser;

import java.util.Scanner;

public class PhLevelAnalyser {
  /**
   * The participants are expected to run the main method and provide input through the
   * scanner. Avoid making any changes to the main method
   */

  public static void main(String[] args) {
    PhLevelAnalyser phLevelAnalyser = new PhLevelAnalyser();
    // Declare a scanner here
    // Get the phLevel value as integer from the console and store in variable 'phLevel'
   
    int phLevel = -1;
    String statusOfAquarium = phLevelAnalyser.findHealthStatusOfAquarium(phLevel);


  }
  /**
   * Function accepts pHLevel as input parameter and outputs health status of
   *  aquarium
   */
  public String findHealthStatusOfAquarium(int phLevel) {
	  String health=null;

     if (phLevel<7)
	 {
		health="pH value is low, partial water change required";
	 }
	 else if (phLevel>=7 && phLevel<8)
	 {
		health="pH value is fine";
	 }
     else// if (phLevel<8 && phLevel>=14)
	 {
		health="pH value is high, partial water change required";
	 }
      return health;
  }
}
