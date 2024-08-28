package test;

public class TVTest {

	public static void main(String[] args) {
		SaleTV saleTV = new SaleTV ( "SALETV-1", 40, 1, 300000);
		RentalTV rentalTV = new RentalTV ( "RENTALTV-10", 42, 1, 100000);
		
		saleTV.channelUp();
		saleTV.channelUp();
		
		rentalTV.channelDown();
		rentalTV.channelDown();
		rentalTV.channelDown();
		
		TVTest.printAllTV(saleTV);
		TVTest.printAllTV(rentalTV);
		
		TVTest.printRentalTV(rentalTV);

	}
	
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		
		 if(tv instanceof SaleTV sale) {
				sale.play();
				sale.sale();
			}

			if(tv instanceof RentalTV rent)
				rent.play();
		}
	
	static void printRentalTV(Rentable tv) {
		if(tv instanceof RentalTV rent)
			rent.rent();
	}
}
