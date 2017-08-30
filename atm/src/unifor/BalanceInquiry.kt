package unifor

class BalanceInquiry(accountNumber: Int): Transaction {

    private var accountNumber: Int

    init {
        this.accountNumber = accountNumber
    }

    override val screen: Screen
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val bankDatabase: BankDatabase
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun execute() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}