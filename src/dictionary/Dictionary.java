/*
 CSE 1310 Introduction to Computers and Programming 
Exam 2 Q4 Started 2/12/22
Finished 2/22/22  
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
        ///Print our words and definitions.
        for (int i = 0; i < dictionary.size(); i++)
            for (int j = 0; j < dictionary.get(i).size()-1;j+=2)
             System.out.println(dictionary.get(i).get(j)+" - "+dictionary.get(i).get(j+1)+"\n");
        
    }
    
    public static void searchWords(ArrayList<ArrayList<String>> dictionary, Scanner input){
        /* Search for words in the dictionary and print the word and definition.*/
        
        String word;
        int index = -1;
        
        //Clear the scanner buffer.
        input.nextLine();
        
        while (true){
            System.out.println("Enter the word you're looking for. "
                    + "To exit enter 'exit'.");
            word = input.nextLine();
            if (word.equals("exit"))
                break;
            for (int i = 0; i < dictionary.size(); i++){
                index = dictionary.get(i).indexOf(word);
                if (index!= -1){
                    System.out.println(dictionary.get(i).get(index)+" - "+
                            dictionary.get(i).get(index+1)+"\n");
                    break;  
                }
            }
           if (index == -1){
               System.out.println("Your word was not found.\n");
           }
        }
        
    }
    
    public static ArrayList editWords(ArrayList<ArrayList<String>> dictionary, Scanner input){
        /* Edit words and/or definitions in the dictionary. */
        
        //String that holds the edits of the defintion or word in the dictionary.
        String edit;
        //word edit
        String wedit;
        //definition edit
        String dedit;
        //Default starting page is zero...its the first page.
        int page = 0;
        int index = 0;
        int choice = 0;
        
        //Clear the buffer.
        input.nextLine();
        
        while(true){
            System.out.println("\nEnter the word you want to edit in the dictionary."
                + "\nTo exit enter 'exit'.");
             System.out.println("To skip to the next page hit > "
                    + "\nto go to the previous page hit <.");
             
            if (page < dictionary.size() && page > - 1)
                System.out.println(dictionary.get(page));
            else
                System.out.println("Your page is out of bounds.");
            
            edit = input.nextLine();
            if (edit.equals("exit"))
                    break;
            else if (edit.matches(">"))
                page++;
            else if (edit.matches("<"))
                page--;
            else{
                //Check if the user wants to edit the word or the dictionary.
                System.out.println("To edit the word enter 1 to edit the "
                        + "definition enter 2 to edit both press any "
                        + "other number.");
                choice = input.nextInt();
                //clear buffer.
                input.nextLine();
                switch (choice) {
                    case 1:
                        index = dictionary.get(page).indexOf(edit);
                        System.out.println("Make your edit for the word "+edit+".");
                        wedit = input.nextLine();
                        dictionary.get(page).set(index, wedit);
                        break;
                    case 2:
                        index = dictionary.get(page).indexOf(edit)+1;
                        System.out.println("Make your edit for the difinition "
                                + ""+dictionary.get(page).get(index)+".");
                        dedit = input.nextLine();
                        dictionary.get(page).set(index, dedit);
                        break;
                    default:
                        index = dictionary.get(page).indexOf(edit);
                        System.out.println("Make your edit for the word.");
                        wedit = input.nextLine();
                        dictionary.get(page).set(index, wedit);
                        System.out.println("Make your edit for the definition.");
                        dedit = input.nextLine();
                        dictionary.get(page).set(index+1, dedit);
                        break;
                }
            }
        }
        
        return dictionary;
    }
    
    public static ArrayList removeWords(ArrayList<ArrayList<String>> dictionary, Scanner input){
        //Remove words and definitions from the dictionary.
        String remove;
        //Default starting page is zero... its the first page.
        int page = 0;
        int index = 0;
     
        //Clear the buffer.
        input.nextLine();
        
        while(true){
            System.out.println("\nEnter the word you want removed from the dictionary."
                + "\nTo exit enter 'exit'.");
             System.out.println("To skip to the next page hit > "
                    + "\nto go to the previous page hit <.");
             
            if (page < dictionary.size() && page > - 1)
                System.out.println(dictionary.get(page));
            else
                System.out.println("Your page is out of bounds.");
            
            remove = input.nextLine();
            if (remove.equals("exit"))
                    break;
            else if (remove.matches(">"))
                page++;
            else if (remove.matches("<"))
                page--;
            else{
                //Get the index of the definition to be removed.
                index = dictionary.get(page).indexOf(remove);
                //Remove the word and definition.
                dictionary.get(page).remove(new String(remove));
                dictionary.get(page).remove(index);
            }
        }
        
        return dictionary;
    }
    
    public static ArrayList addWords(ArrayList<ArrayList<String>> dictionary, Scanner input){
        //Add words and definitions to the dictionary arrayList.
        
        ArrayList<String> words = new ArrayList();
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
            words.add(definition);
           
        }
        
        //Add list to dictionary list.
        dictionary.add(words);
        
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
        //Represents which page of the dictionary you are on.
        
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
                    dictionary = removeWords(dictionary, in);
                    break;
                case 3:
                    dictionary = editWords(dictionary, in);
                    break;
                case 4:
                    searchWords(dictionary, in);
                    break;
                case 5:
                    printWords(dictionary);
                    break;
            }
            
        } while(choice != 0);
        in.close();
    }
    
}
