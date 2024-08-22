package ex01;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.desposit(10000);
		System.out.println("계좌에 10000원 입금");
		account.withdraw(9000);
		System.out.println("계좌에서 9000원 출금");
		
		System.out.println("계좌에서 2000원 출금");
		account.withdraw(2000);
		
		
		System.out.println("잔고를 출력해라. 잔고: 1000");
		System.out.printf("잔액 : %d\n", account.getBalance());
		
	}

}
