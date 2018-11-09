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
		System.out.println("Which chatbot would you like to speak with? Chatbot 1? Chatbot 2? Chatbot 3?");
		statement = in.nextLine();
		while (!statement.equals("Bye"))
        {
            if (statement.equals("Chatbot 1")) {

                    chatbot1.chatLoop(statement);
                    statement = in.nextLine();
                    System.out.println(chatbot1.getResponse(statement));
            }
            if (statement.equals("Chatbot 2")) {

                    chatbot2.chatLoop(statement);
                    statement = in.nextLine();
                    System.out.println(chatbot2.getResponse(statement));

            }
            if (statement.equals("Chatbot 3")) {

                    chatbot3.chatLoop(statement);
                    statement = in.nextLine();
                    System.out.println(chatbot3.getResponse(statement));

            }
        }
        }

}
