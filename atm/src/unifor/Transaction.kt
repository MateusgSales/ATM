package unifor

interface Transaction {

    val screen: Screen
    val bankDatabase: BankDatabase

    fun execute()

}