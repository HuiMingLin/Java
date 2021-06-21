public class BankAccount {
  private String ownerName;
  private int accountNumber;
  private float balance;

  String getOwnerName() {
    return ownerName;
  }
  void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
  int getAccountNumber() {
    return accountNumber;
  }
  void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
  float getBalance() {
    return balance;
  }
  void setBalance(float depo) {
    this.balance = balance;
  }
  void deposit(float depo) {
    this.balance = balance;
  }

  BankAccount() {
    this.ownerName = "nobody";
    this.accountNumber = 0;
    this.balance = 0;
  }
  BankAccount(String ownername, int accountnumber) {
    this.ownerName = ownername;
    this.accountNumber = accountnumber;
  }
  BankAccount(String ownername, int accountnumber, float balance) {
    this.ownerName = ownername;
    this.accountNumber = accountnumber;
    this.balance = balance;
  }
}