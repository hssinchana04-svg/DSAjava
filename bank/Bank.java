package bank;

class Account{
  public String name;
  protected String email;
  private String passwordp

  public String getPassword(){
    setPassword(randomPass);
    return this.password;
  }
  public String setPassword(String pass){
    this.password = pass;
  }
}

public class Bank {
  public static void main(String[] args) {
    Account account1 = new Account();
    account1.name = "Apna College";
    account1.email = "apnacollege.com";
    account1.setPassword("abcd");
    System.out.println(account1.getPassword());
  }
}
