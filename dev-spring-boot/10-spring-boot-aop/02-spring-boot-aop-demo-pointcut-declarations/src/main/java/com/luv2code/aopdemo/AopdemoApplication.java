package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.service.TrafficFortuneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO, TrafficFortuneService theTrafficFortuneService) {
		return runner -> {

			// demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
			// afterTheAfterReturningAdvice(theAccountDAO);
			// demoTheAfterThrowingAdvice(theAccountDAO);
			// demoTheAfterAdvice(theAccountDAO);
			// demoTheAroundAdvice(theTrafficFortuneService);
			// demoTheAroundAdviceHandleException(theTrafficFortuneService);
			demoTheAroundAdviceRethrowException(theTrafficFortuneService);

		};
	}

	private void demoTheAroundAdviceRethrowException(TrafficFortuneService theTrafficFortuneService) {
		System.out.println("\nMain Program: ... demoTheAroundAdviceRethrowException. ");
		System.out.println("Calling getFortune()");

		String data = theTrafficFortuneService.getFortune();

		boolean tripWire = true;
		String datas = theTrafficFortuneService.getFortune(tripWire);

		System.out.println("\nMy fortune is: " + datas);

		System.out.println("Finished!!!!");
	}

	private void demoTheAroundAdviceHandleException(TrafficFortuneService theTrafficFortuneService) {
		System.out.println("\nMain Program: ... demoTheAroundAdviceHandleException. ");
		System.out.println("Calling getFortune()");

		String data = theTrafficFortuneService.getFortune();

		boolean tripWire = true;
		String datas = theTrafficFortuneService.getFortune(tripWire);

		System.out.println("\nMy fortune is: " + datas);

		System.out.println("Finished!!!!");
	}

	private void demoTheAroundAdvice(TrafficFortuneService theTrafficFortuneService) {
		System.out.println("\nMain Program: ... demoTheAroundAdvice. ");
		System.out.println("Calling getFortune()");

		String data = theTrafficFortuneService.getFortune();

		System.out.println("\nMy fortune is: " + data);

		System.out.println("Finished!!!!");
	}

	private void demoTheAfterAdvice(AccountDAO theAccountDAO) {
		// Call Method to find the Accounts
		List<Account> theAccounts = null;

		try	{
			// Add a boolean flag to simulate exceptions
			boolean tripWare = true;
			theAccounts = theAccountDAO.findAccounts(tripWare);
		} catch	(Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}

		// Display the accounts
		System.out.println("\n\nMain Program: demoTheAfterThrowingAdvice");
		System.out.println("-----");

		System.out.println(theAccounts);

		System.out.println("\n");
	}

	private void demoTheAfterThrowingAdvice(AccountDAO theAccountDAO) {
		// Call Method to find the Accounts
		List<Account> theAccounts = null;

		try	{
			// Add a boolean flag to simulate exceptions
			boolean tripWare = false;
			theAccounts = theAccountDAO.findAccounts(tripWare);
		} catch	(Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}

		// Display the accounts
		System.out.println("\n\nMain Program: demoTheAfterThrowingAdvice");
		System.out.println("-----");

		System.out.println(theAccounts);

		System.out.println("\n");
	}

	private void afterTheAfterReturningAdvice(AccountDAO theAccountDAO) {

		// Call method to find the accounts
		List<Account> theAccounts = theAccountDAO.findAccounts();

		// Display the accoutns
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("-----");

		System.out.println(theAccounts);

		System.out.println("\n");

	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		Account myAccount = new Account();
		myAccount.setName("Maginbu");
		myAccount.setLevel("Platinum");

		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();

		// Call the accountdao getter/setter methods
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();

		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSlepp();
	}

}
