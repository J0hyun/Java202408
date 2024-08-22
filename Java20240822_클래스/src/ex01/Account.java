package ex01;

class Account {
	int balance; // 잔액
	
	
	void desposit (int amount) {
		balance += amount;  //입금
	}
	
	void withdraw (int amount) {
		if(balance > amount) {
			balance -= amount; //출금
		} else {
			System.out.println("잔액부족");
		}
		 
	}
	int getBalance() {
		return balance;
	}
	
}
