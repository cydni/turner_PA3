//Cydni Turner
//COP 3330
//Programming Assignment 3: Problem 1

package turner_p1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    public static Scanner scnr = new Scanner(System.in);
    public static SecureRandom rand = new SecureRandom();

    public static int operationType(){ //application to get operation type selection

        int operationType;

        System.out.println("Pick an arithmetic problem to study (1-5):");
        System.out.println("1 -- Addition");
        System.out.println("2 -- Multiplication");
        System.out.println("3 -- Subtraction");
        System.out.println("4 -- Division");
        System.out.println("5 -- All");

        operationType = scnr.nextInt();
        return operationType;

    }

    public static void generateCorrectResponse(){

        int congratulation = rand.nextInt(4) + 1; //To modify the congratulations message for a correct answer

        switch(congratulation){

            case 1:
                System.out.println("Very Good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
            default:
                System.out.println("ERROR in generateCorrectResponse()");
        }

    }

    public static void generateIncorrectResponse(){

        int incorrect = rand.nextInt(4) + 1; //To modify the incorrect answer message

        switch(incorrect){
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
            default:
                System.out.println("ERROR in generateIncorrectResponse()");
        }

    }

    public static int difficultyLevel(){ //Define separate method the gets difficulty level

        int difficultyLevel;
        System.out.println("Enter a difficulty level (1-4): "); //Get difficulty level before asking question
        difficultyLevel = scnr.nextInt();

        System.out.println();

        return difficultyLevel;
    }

    public static int generateMultiplicationQuestion(int difficultyLevel){ //Define separate method that generate user's question

        double answer;
        int num1 = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int numCorrectAnswersGiven = 0;


        switch(difficultyLevel) { //change the range of random numbers generated

            case 1:
                num1 = rand.nextInt(9)+1;
                num2 = rand.nextInt(9)+1;
                break;
            case 2:
                num1 = rand.nextInt(99)+1;
                num2 = rand.nextInt(99)+1;
                break;
            case 3:
                num1 = rand.nextInt(999)+1;
                num2 = rand.nextInt(999)+1;
                break;
            case 4:
                num1 = rand.nextInt(9999)+1;
                num2 = rand.nextInt(9999)+1;
                break;
            default:
                System.out.println("ERROR in generateMultiplicationQuestion()");

        }

        System.out.println("What is " + num1 + " times " + num2 + "?"); //Prompt user w/ question
        answer = scnr.nextDouble(); //Get user answer

        if(answer != (num1 * num2)) {

            generateIncorrectResponse();
        }
        else {

            numCorrectAnswersGiven++;
            generateCorrectResponse();
        }

        return numCorrectAnswersGiven;
    }

    public static int generateAdditionQuestion(int difficultyLevel){ //Define separate method that generate user's question

        double answer;
        int num1 = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int numCorrectAnswersGiven = 0;


        switch(difficultyLevel) { //change the range of random numbers generated

            case 1:
                num1 = rand.nextInt(9)+1;
                num2 = rand.nextInt(9)+1;
                break;
            case 2:
                num1 = rand.nextInt(99+1);
                num2 = rand.nextInt(99)+1;
                break;
            case 3:
                num1 = rand.nextInt(999)+1;
                num2 = rand.nextInt(999)+1;
                break;
            case 4:
                num1 = rand.nextInt(9999)+1;
                num2 = rand.nextInt(9999)+1;
                break;
            default:
                System.out.println("ERROR in generateAdditionQuestion()");

        }

        System.out.println("What is " + num1 + " plus " + num2 + "?"); //Prompt user w/ question
        answer = scnr.nextDouble(); //Get user answer

        if(answer != (num1 + num2)) {

            generateIncorrectResponse();
        }

        else {
            numCorrectAnswersGiven++; //add one for correct answer
            generateCorrectResponse();
        }

        return numCorrectAnswersGiven;
    }

    public static int generateSubtractionQuestion(int difficultyLevel){ //Define separate method that generate user's question

        double answer;
        int num1 = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int numCorrectAnswersGiven = 0;


        switch(difficultyLevel) { //change the range of random numbers generated

            case 1:
                num1 = rand.nextInt(9)+1;
                num2 = rand.nextInt(9)+1;
                break;
            case 2:
                num1 = rand.nextInt(99)+1;
                num2 = rand.nextInt(99)+1;
                break;
            case 3:
                num1 = rand.nextInt(999)+1;
                num2 = rand.nextInt(999)+1;
                break;
            case 4:
                num1 = rand.nextInt(9999)+1;
                num2 = rand.nextInt(9999)+1;
                break;
            default:
                System.out.println("ERROR in generateSubtractionQuestion()");

        }

        System.out.println("What is " + num1 + " minus " + num2 + "?"); //Prompt user w/ question
        answer = scnr.nextDouble(); //Get user answer

        if(answer != (num1 - num2)) {

            generateIncorrectResponse();
        }
        else {
            numCorrectAnswersGiven++; //add one for correct answer
            generateCorrectResponse();
        }

        return numCorrectAnswersGiven;
    }

    public static int generateDivisionQuestion(int difficultyLevel){ //Define separate method that generate user's question

        double answer;
        int num1 = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int numCorrectAnswersGiven = 0;


        switch(difficultyLevel) { //change the range of random numbers generated

            case 1:
                num1 = rand.nextInt(9)+1;
                num2 = rand.nextInt(9)+1;
                break;
            case 2:
                num1 = rand.nextInt(99)+1;
                num2 = rand.nextInt(99)+1;
                break;
            case 3:
                num1 = rand.nextInt(999)+1;
                num2 = rand.nextInt(999)+1;
                break;
            case 4:
                num1 = rand.nextInt(9999)+1;
                num2 = rand.nextInt(9999)+1;
                break;
            default:
                System.out.println("ERROR in generateDivisionQuestion()");

        }

        System.out.println("What is " + num1 + " divided by " + num2 + "?"); //Prompt user w/ question
        answer = scnr.nextDouble(); //Get user answer

        if(Math.abs(answer - ((double)num1 / (double)num2)) > 0.0001) { //FIX ME

            generateIncorrectResponse();
        }
        else {

            numCorrectAnswersGiven++; //add one for correct answer
            generateCorrectResponse();
        }

        return numCorrectAnswersGiven;
    }

    public static int generateAnyQuestion(int difficultyLevel){ //Define separate method that generate user's question


        int numCorrectAnswersGiven = 0;
        int question = rand.nextInt(4)+1;


        switch(question) { //change the range of random numbers generated

            case 1:
                numCorrectAnswersGiven = numCorrectAnswersGiven + generateAdditionQuestion(difficultyLevel);
                break;
            case 2:
                numCorrectAnswersGiven = numCorrectAnswersGiven + generateMultiplicationQuestion(difficultyLevel);
                break;
            case 3:
                numCorrectAnswersGiven = numCorrectAnswersGiven + generateSubtractionQuestion(difficultyLevel);
                break;
            case 4:
                numCorrectAnswersGiven = numCorrectAnswersGiven + generateDivisionQuestion(difficultyLevel);
                break;
            default:
                System.out.println("ERROR in generateDivisionQuestion()");

        }

        return numCorrectAnswersGiven;
    }

    public static void main(String[] args) {

        char again = 'Y'; //variable to terminate the program
        int numQuestions = 0; //variable to reset program when user gets to 10
        int numCorrectAnswersGiven = 0; //counts total number of responses given
        int difficulty;
        int operationType;

        do {

            difficulty = difficultyLevel(); //Get difficulty level from user
            operationType = operationType(); //Get operation type from user
            System.out.println();

            while(numQuestions < 10) {
                numQuestions++;
                System.out.println("* * Question " + numQuestions + " * *");


                switch(operationType){

                    case 1:
                        numCorrectAnswersGiven = numCorrectAnswersGiven + generateAdditionQuestion(difficulty);
                        break;
                    case 2:
                        numCorrectAnswersGiven = numCorrectAnswersGiven + generateMultiplicationQuestion(difficulty);
                        break;
                    case 3:
                        numCorrectAnswersGiven = numCorrectAnswersGiven + generateSubtractionQuestion(difficulty);
                        break;
                    case 4:
                        numCorrectAnswersGiven = numCorrectAnswersGiven + generateDivisionQuestion(difficulty);
                        break;
                    case 5:
                        numCorrectAnswersGiven = numCorrectAnswersGiven + generateAnyQuestion(difficulty);
                        break;
                    default:
                        System.out.println("ERROR in main switch statement");

                }

                System.out.println();
            }

            //Tell user how they did


            if(((double)numCorrectAnswersGiven/10.0) *100 < 75.0) { //FIX ME: when even one answer is wrong it prints this message. is it the expression?
                System.out.println("~ Please ask your teacher for extra help.");
                System.out.println("Correct Responses: " + numCorrectAnswersGiven + "\nIncorrect Responses: " + (10 - numCorrectAnswersGiven));
                System.out.println("Score: " + (((double)numCorrectAnswersGiven/10.0) *100 + "%"));
            }
            else {
                System.out.println("~ Congratulations you are ready to go to the next level!");
                System.out.println("Correct Responses: " + numCorrectAnswersGiven + "\nIncorrect Responses: " + (10 - numCorrectAnswersGiven));
                System.out.println("Score: " + (((double)numCorrectAnswersGiven/10.0) * 100) + "%");
            }

            numQuestions = 0; //resets the program question count for the next student
            numCorrectAnswersGiven = 0;

            System.out.println();

            System.out.println("Would you like to go again? (Y or N): ");
            again = scnr.next().charAt(0);

            System.out.println("\n-------------------------------------------");

        }while(again == 'Y');

        System.out.println("Okay, thank you for playing!");

    }

}
