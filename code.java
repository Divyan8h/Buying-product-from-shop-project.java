package session1;
import java.util.*;

public class seller {
	public static void product(String code)
	{
		Scanner sc = new Scanner(System.in);
		switch(code)
		{
		case "A":
		{
			System.out.println("Ok . The retail price for the same is 22.50 $");
			System.out.println("Your reply: ");
			String as = sc.next();
			System.out.println("How much do you want?");
			int quant = sc.nextInt();
			double cost = (22.50*quant);
			System.out.println("Ok, here's your order. So the cost for the same is: "  + cost + "$");
			System.out.println("Do you want any other product also? yes(1) or No(0)");
			int hg = sc.nextInt();
			if(hg == 1)
			{
				System.out.println("Ok. I am giving you bill of this product first, after that you can buy another product.");
				System.out.println("Your reply: ");
				String poi = sc.next();
				System.out.println("----------------------------------------------------------");
				System.out.println("Product Code     ||     Retail price    ||   quantity     ");
				System.out.println("----------------------------------------------------------");
				System.out.println(code+"            ||     22.50           ||   "+quant+"    ");
				System.out.println("----------------------------------------------------------");
				System.out.println("Total : " + cost + "$");
				System.out.println("Now, enter the code of the product you want?");
				code = sc.next();
				product(code);
			}
			else
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Product Code     ||     Retail price    ||   quantity     ");
				System.out.println("----------------------------------------------------------");
				System.out.println(code+"            ||     22.50           ||   "+quant+"    ");
				System.out.println("----------------------------------------------------------");
				System.out.println("Total : " + cost + "$");
				System.out.println("Thank you for shopping with us");
			}
			break;
		}
		case "B":
		{
			System.out.println("Ok . The retail price for the same is 44.50 $");
			System.out.println("Your reply: ");
			String as = sc.next();
			System.out.println("How much do you want?");
			int quant = sc.nextInt();
			double cost = (44.50*quant);
			System.out.println("Ok, here's your order. So the cost for the same is: "  + cost + "$");
			System.out.println("Do you want any other product also? yes(1) or No(0)");
			int hg = sc.nextInt();
			if(hg == 1)
			{
				System.out.println("Ok. I am giving you bill of this product first, after that you can buy another product.");
				System.out.println("Your reply: ");
				String poi = sc.next();
				System.out.println("----------------------------------------------------------");
				System.out.println("Product Code     ||     Retail price    ||   quantity     ");
				System.out.println("----------------------------------------------------------");
				System.out.println(code+"            ||     44.50           ||   "+quant+"    ");
				System.out.println("----------------------------------------------------------");
				System.out.println("Total : " + cost + "$");
				System.out.println("Now, enter the code of the product you want?");
				code = sc.next();
				product(code);
			}
			else
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Product Code     ||     Retail price    ||   quantity     ");
				System.out.println("----------------------------------------------------------");
				System.out.println(code+"            ||     44.50           ||   "+quant+"    ");
				System.out.println("----------------------------------------------------------");
				System.out.println("Total : " + cost + "$");
				System.out.println("Thank you for shopping with us");
			}
			break;
		}
		case "C":
		{
			System.out.println("Ok . The retail price for the same is 44.50 $");
			System.out.println("Your reply: ");
			String as = sc.next();
			System.out.println("How much do you want?");
			int quant = sc.nextInt();
			double cost = (9.98*quant);
			System.out.println("Ok, here's your order. So the cost for the same is: "  + cost + "$");
			System.out.println("Do you want any other product also? yes(1) or No(0)");
			int hg = sc.nextInt();
			if(hg == 1)
			{
				System.out.println("Ok. I am giving you bill of this product first, after that you can buy another product.");
				System.out.println("Your reply: ");
				String poi = sc.next();
				System.out.println("----------------------------------------------------------");
				System.out.println("Product Code     ||     Retail price    ||   quantity     ");
				System.out.println("----------------------------------------------------------");
				System.out.println(code+"            ||     9.98           ||   "+quant+"    ");
				System.out.println("----------------------------------------------------------");
				System.out.println("Total : " + cost + "$");
				System.out.println("Now, enter the code of the product you want?");
				code = sc.next();
				product(code);
			}
			else
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Product Code     ||     Retail price    ||   quantity     ");
				System.out.println("----------------------------------------------------------");
				System.out.println(code+"            ||     9.98           ||   "+quant+"    ");
				System.out.println("----------------------------------------------------------");
				System.out.println("Total : " + cost + "$");
				System.out.println("Thank you for shopping with us");
			}
			break;
		}

	}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello sir! Welcome to the shop");
	System.out.println("Your reply: ");
	String r = sc.next();
	System.out.println("So sir we sell 3 products whose retail price are as follows: ");
	System.out.println("|--------------------------------------------------------|");
	System.out.println("|Product No.    ||      Product Code      || Retail Price|");
	System.out.println("|--------------------------------------------------------|");
	System.out.println("|1              ||           A            ||   22.50     |");
	System.out.println("|--------------------------------------------------------|");
	System.out.println("|2              ||           B            ||   44.50     |");
	System.out.println("|--------------------------------------------------------|");
	System.out.println("|3              ||           C            ||   9.98      |");
	System.out.println("|--------------------------------------------------------|");
	System.out.println("Your reply: ");
	String rep = sc.next();
	System.out.println("Do you like any of our product? Yes(1) or No(0)");
	int n = sc.nextInt();
	if(n==0)
	{
		System.out.println("Sorry sir! we don't that product which you are looking.");
		System.out.println("Your reply: ");
		String repl = sc.next();
        System.out.println("Just give us some time, we'll arrange the same and we'll inform you.");
        String reply = sc.next();
        System.out.println("Ok sir,thank you for visiting.Have a nice day!");
	}
	else if(n==1)
	{
		System.out.println("Ok sir. Just tell us the code of the product that you want?");
		String code = sc.next();
		product(code);
	}
	else
	{
		System.out.println("Ok if you do not like any of our product then either you should check it again or can visit our shop next time!");
		System.out.println("Good day!.Thank you");
	}
}
}
