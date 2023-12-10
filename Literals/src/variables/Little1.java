package variables;
/*samer has 2500 and deposited 2500 and withdraw 200 and did transaction 
around 5000 and again added 2600 what is the final amount that samer has*/
public class Little1 
{
	public static void main(String[] args) {
	int samer_has=2500;
	int samer_deposited=2500;
	int samer_withdraw=200;
	int samer_transaction=5000;
	int samer_added=2600;
	
	int amount1=samer_has+samer_deposited;
	System.out.println(amount1); 
	int amount2=amount1-samer_withdraw;
	System.out.println(amount2);
	int after_transaction=amount2-samer_transaction;
	System.out.println(after_transaction);
	int final_amount=after_transaction+samer_added;
	System.out.println(final_amount);
	}
}
