package kotlin_fund_prog

sealed interface NetworkState

object Connected : NetworkState
object Disconnected : NetworkState
object Connecting : NetworkState
fun handleNetworkState(state: NetworkState) {
    when (state) {
        is Connected -> println("Device is connected to the network")
        is Disconnected -> println("Device is disconnected from the network")
        is Connecting -> println("Device is connecting to the network")
    }
}
fun main() {
    handleNetworkState(Connected) // Outputs: Device is connected to the network
    handleNetworkState(Connecting) // Outputs: Device is connecting to the network
    handleNetworkState(Disconnected) // Outputs: Device is disconnected from the network
}