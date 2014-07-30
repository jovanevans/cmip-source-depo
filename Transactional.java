interface Transactional {
	boolean deposit(double amount) throws NegativeTransationAmountException;
	boolean withdraw(double amount);
	double balanceInquiry();
}
