import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionMenu optionMenu=new OptionMenu();
		optionMenu.getLogin();
	}

}
 class OptionMenu extends Account {
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'₹'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	
	
	public void getLogin() {
		int x=1;
		do {
			
			try {
				
				data.put(123456,123);
				data.put(123457,124);
				
				System.out.println("Welcome to ATM project");
				
				System.out.print("Enter your customer Number :");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter your Pin Number :");
				setPinNumber(menuInput.nextInt());
				
			}
			catch(Exception e)
			{
				System.out.println("Invalid character number only");
				x=2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey()== getCustomerNumber() && entry.getValue() == getPinNumber())
					getAccountType();
				
			}System.out.println("Wrong customer name or pin number");
		}
		while(x==1);
			
	}
	
	public void getAccountType()
	{
		System.out.println("Select the account you want to access:");
		System.out.println("	1-Checking account");
		System.out.println("	2-saving account");
		System.out.println("	3-Exit");
		System.out.print("	Choice :");
		
		selection=menuInput.nextInt();
		switch(selection) {
		
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;	
		case 3:
			System.out.println("thank you for using our service");
			break;
			
		default:
			System.out.println("invalid choice ");
			getAccountType();	
		}
	}
public void getChecking() {
	System.out.println("Checking account:");
	System.out.println("1.view balance");
	System.out.println("2.withdraw funds");
	System.out.println("3.deposit funds");
	System.out.println("4.Exit");
	System.out.print("Choice :");
	selection=menuInput.nextInt();
	
	switch(selection) {
	
	case 1:
		System.out.println("Viewing account balance :" + moneyFormat.format(getCheckingBalance()) +" \n");
		getAccountType();
		break;
	case 2:
		getCheckingWithdrawInput();
		getAccountType();
		break;	
	case 3:
		getCheckingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("thank you for using our service");
		break;	
		
	default:
		System.out.println("invalid choice");
		getChecking();
	}
	
}
public void getSaving() {
	System.out.println("Checking account:");
	System.out.println("1.view balance");
	System.out.println("2.withdraw funds");
	System.out.println("3.deposit funds");
	System.out.println("4.Exit");
	System.out.print("Choice :");
	selection=menuInput.nextInt();
	
	switch(selection) {
	
	case 1:
		System.out.println("saving account balance" + moneyFormat.format(getSavingBalance()));
		getAccountType();
		break;
	case 2:
		getSavingWithdrawInput();
		getAccountType();
		break;	
	case 3:
		getSavingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("tq for using");
		break;	
		
	default:
		System.out.println("invalid choice");
		getChecking();
	}
}
int selection;
}
