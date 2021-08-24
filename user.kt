package registro-globe

/* Deve atender aos requisitos [RF001][RF002][RF004][RF008] */

data class user {
  val name: String = "name"
  val username: String = "@" + "username1"
  val cpf: String = "000.000.000-00"
  private set

  inner class useradress {
      val cep: String = "12345-000"
      val street: String = "Rua do Banco"
      val adress-number: String = "1"      
      val location: String = "Bairro"
      val city: String = "Cidade"
      val state: String = "Estado"
      val country: String = "País"
  }

  //constructor()
  
  fun getname() = "$name"
  fun getusername() = "$username"
  fun getcpf() = "$cpf"
  
  fun getcep() = "$cep"
  fun getstreet() = "$street"
  fun getadress-number() = "$adress-number"
  fun getlocation() = "$location"
  fun getcity() = "$city"
  fun getstate() = "$state"
  fun getcountry() = "$country"

  fun userInfo() = "$name e $username"
}

fun main()  {
  val username1 = user()
  println(username.userInfo())

}