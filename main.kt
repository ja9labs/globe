/* principais funções */
package registro.globe



fun main() {
    println("Hello, " + "$name")
    
}
  
fun register-product {
    println("Enter your product")
}


enum class State {
    RUNNING, FINISHED                           // 1
}

 fun main() {
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.RUNNING -> "Em andamento..."
        State.FINISHED -> "Concluído!"
    }
    println(message)
}