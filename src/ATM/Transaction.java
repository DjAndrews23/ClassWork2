package ATM;

import java.util.Date;

public class Transaction {

    public double amount;

    public Date timestamp;

    public String memo;

    public Account inAccount;

    public Transaction(double amount, Account inAccount){

        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }
    public Transaction(double amount, String memo, Account inAccount){
        this(amount, inAccount);
        this.memo = memo;
    }

    public double getAmount(){
        return this.amount;
    }

    public String getSummaryLine(){

        if(this.amount >= 0){
            return String.format("%s : $%.02f : %s", this.timestamp.toString(),this.amount, this.memo);
        } else {
            return String.format("%s : $(%.02f) : %s", this.timestamp.toString(),-this.amount, this.memo);
        }
    }






}
