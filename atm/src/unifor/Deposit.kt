package unifor

class Deposit(accountNumber: Int, amount: Double,
              keyPad: KeyPad, depositSlot: DepositSlot): Transaction {


    private var accountNumber: Int
    private var amount: Double
    private var keypad: KeyPad
    private var depositSlot: DepositSlot

    init {
        this.accountNumber = accountNumber
        this.amount = amount
        this.keypad = keyPad
        this.depositSlot = depositSlot
    }

    override fun execute() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val screen: Screen
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val bankDatabase: BankDatabase
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}