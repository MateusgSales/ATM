package unifor

class ATM {

    private var userAuthenticated: Boolean = false //
    private var depositSlot: DepositSlot = DepositSlot()
    private var keyPad: KeyPad = KeyPad()
    private var cashDispenser: CashDispenser = CashDispenser()
    private var bankDatabase: BankDatabase

    init {
        this.bankDatabase = BankDatabase()
        this.userAuthenticated = this.bankDatabase.authenticateUser()
    }

}