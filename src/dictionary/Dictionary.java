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
//        System.out.println(dictionary);
        for (int i = 0; i < dictionary.size()-1;i+=2)
            System.out.println(dictionary.get(i)+"-"+dictionary.get(i+1)+"\n");
        
        
        
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
    
    public static ArrayList addWords(ArrayList<ArrayList<String>> dictionary, Scanner input){
    
        
        ArrayList<String> words = new ArrayList();
        ArrayList<String> definitions = new ArrayList();
        String word;
        String definition;
        //Stops the scanner from skipping the first word.
        input.nextLine();
        while(true){
            System.out.println("Please enter your word followed by its "
                    + "definition. To exit enter 'exit' when prompted "
                    + "for the word.\n");
            System.out.println("Enter your word:");
            word = input.nextLine();
            if (word.matches("exit"))
                break;
            words.add(word);
            
            System.out.println("Enter its definition.");
            definition = input.nextLine();
            definitions.add(definition);
           
        }
        
        
       
        //Add lists to dictionary list.
        dictionary.add(words);
        dictionary.add(definitions);
        
        
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
        
        
        
        
        int choice;
        ArrayList<ArrayList<String>> dictionary = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //Main loop where our app runs.
        do
        {
            
            
            System.out.println("1. Add words and defintions to dicitonary.");
            System.out.println("2. Remove words and defintions to dicitonary.");
            System.out.println("3. Edit words and/or defintions in dicitonary.");
            System.out.println("4. Search for words in dicitonary and print the word and definition.");
            System.out.println("5. Print all words and defintions from dicitonary.");
            System.out.println("0. Exit the program.\n");
            
            choice = in.nextInt();
           
            switch(choice){
                case 1:
                    dictionary = addWords(dictionary, in);
                    break;      
                case 2:
                    dictionary = removeWords(dictionary);
                    break;
                case 3:
                    dictionary = editWords(dictionary);
                    break;
                case 4:
                    dictionary = searchWords(dictionary);
                    break;
                case 5:
                    printWords(dictionary);
                    break;
            }
            
            
        } while(choice != 0);
        in.close();
    }
    
}
