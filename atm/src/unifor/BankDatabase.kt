package unifor

class BankDatabase {

    private val account: Account

    init {
        this.account = Account( 1112, 12334, 1.223, 4.000 )
    }

    public fun authenticateUser():Boolean {
        return true
    }

    public fun getAvailable(): Double {
        return this.account.getAvailable()
    }

    public fun getTotalBalance(): Double {
        return this.getTotalBalance()
    }

    public fun credit() {}

    public fun debit() {}

}