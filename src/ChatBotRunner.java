import java.util.Scanner;

/**
 * A simple class to run our chatbot teams.
 * @author Brooklyn Tech CS Department
 * @version September 2018
 */
public class ChatBotRunner
{

	/**
	 * Create instances of each chatbot, give it user input, and print its replies. Switch chatbot responses based on which chatbot the user is speaking too.
	 */
	public static void main(String[] args)
	{
		ChatBot1 chatbot1 = new ChatBot1();
		ChatBot2 chatbot2 = new ChatBot2();
		ChatBot3 chatbot3 = new ChatBot3();
		

		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to the chatbot, nice to meet you.");
		String statement = in.nextLine();
		System.out.println("Which chatbot would you like to speak with? HappyBot 1? NotHappyBot 2? DontLookHereTopSecretSHHHHH 3?");
		statement = in.nextLine();
		if (statement.equals("Chatbot 1"))
        {
            while(!statement.equals("Bye"))
            {
                chatbot1.chatLoop(statement);
                statement = in.nextLine();
            }
        }
        if (statement.equals("Chatbot 2"))
        {
            while(!statement.equals("Bye"))
            {
                chatbot2.chatLoop(statement);
                statement = in.nextLine();
            }
        }
        if (statement.equals("Chatbot 3"))
        {
            while(!statement.equals("Bye"))
            {
                chatbot3.chatLoop(statement);
                statement = in.nextLine();
            }
        }
	}

}
