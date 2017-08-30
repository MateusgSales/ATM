package unifor

class Account(accountNumber: Int, pin: Int,
              availableBalance: Double, totalBalance: Double) {

    private var accountNumber: Int
    private var pin: Int
    private var availableBalance: Double
    private var totalBalance: Double

    init {
        this.accountNumber = accountNumber
        this.pin = pin
        this.availableBalance = availableBalance
        this.totalBalance = totalBalance
    }

    public fun validatePin():Boolean {
        return true
    }

    public fun getAvailable(): Double {
       return this.availableBalance
    }

    public fun getTotalBalance(): Double {
        return this.totalBalance
    }

    public fun credit() {

    }

    public fun debit() {

    }

}