package unifor

class Withdrawal(accountNumber: Int, amount: Double,
                 cashDispenser: CashDispenser,
                 keyPad: KeyPad): Transaction {

    private var  accountNumber: Int
    private var amount: Double
    private var cashDispenser: CashDispenser
    private var keypad: KeyPad

    init {
        this.accountNumber = accountNumber
        this.amount = amount
        this.cashDispenser = cashDispenser
        this.keypad = keyPad
    }

    override fun execute() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val screen: Screen
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val bankDatabase: BankDatabase
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}