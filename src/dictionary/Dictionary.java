/*
 CSE 1310 Introduction to Computers and Programming 
Exam 2 Q4 Started 2/12/22
Finished 
 */

package dictionary;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author git-jared
 */
public class Dictionary {
    
    public static void printWords(ArrayList<ArrayList<String>> dictionary){
        
        
    }
    
    public static ArrayList searchWords(ArrayList<ArrayList<String>> dictionary){
        return dictionary;
    }
    
    public static ArrayList editWords(ArrayList<ArrayList<String>> dictionary){
    
        return dictionary;
    }
    
    public static ArrayList removeWords(ArrayList<ArrayList<String>> dictionary){
    
        return dictionary;
    }
    
    public static ArrayList addWords(ArrayList<ArrayList<String>> dictionary){
    
    return dictionary;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. Write a program that creates a dictionary. Using a 2d
        //arraylist allow the user to perform the options below. Print
        //a menu that lists each option which represents a method that
        //performs the associated actions. Include an option for the 
        //user to exit the program.
        
        //main loop where our app will run.
        Scanner in = new Scanner(System.in);
        int choice = 1;
        while(choice != 0){
            System.out.println("1. Add words and defintions to dicitonary.");
            System.out.println("2. Remove words and defintions to dicitonary.");
            System.out.println("3. Edit words and/or defintions in dicitonary.");
            System.out.println("4. Search for words in dicitonary and print the word and definition.");
            System.out.println("5. Print all words and defintions from dicitonary.");
            System.out.println("0. Exit the program.\n");
            
            choice = in.nextInt();
            ArrayList<ArrayList<String>> dictionary = new ArrayList<>();
            switch(choice){
                case 1:
                    addWords(dictionary);
                    break;      
                case 2:
                    removeWords(dictionary);
                    break;
                case 3:
                    editWords(dictionary);
                    break;
                case 4:
                    searchWords(dictionary);
                    break;
                case 5:
                    printWords(dictionary);
                    break;
            }
            
            
                
        }
    }
    
}
