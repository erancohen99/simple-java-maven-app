package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private String message = "Jenkins pipe test";
	private String message2 = "Run tests with stage";
	private String message3 = "code change_1";
	private String message4 = "code change_2";
	  
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
		//message = message + " " + message2;
        return message;
    }

}
