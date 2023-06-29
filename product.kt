package registro-globe

/* Deve atender aos requisitos da Normativa Conjunta nº 02/2018 [RF005] */

data class Product {
  var productname: String = "product-name1"
  var variedade: String = "Variedade"
  var peso: String = "0,000" + "kg"
  var loteid: Int = "000000"
  var receivedata: Int = "00/00/0000"

/*
[Normativa Conjunta nº 02/2018: O rastreio de culturas deve seguir as definições da norma. [RF005]]

DADOS DA COMPRA
1. - Informações sobre o Produto Vegetal:

1.1 - Nome do produto vegetal:
1.2 - Variedade ou cultivar:
1.3 - Quantidade do produto recebido:
1.4 - Identificação do lote:
1.5 - Data de recebimento do produto vegetal:

2 - Informações do Fornecedor:


2.1 - Nome ou Razão social:
2.2 - CPF, IE ou CNPJ ou CGC/MAPA:
2.3 - Endereço Completo, ou quando localizado em zona rural, coordenada geográfica ou CCIR:

______________________________________________________________________________

DADOS DA VENDA
1. - Informações sobre o Produto Vegetal:


1.1 - Nome do produto:
1.2 - Variedade ou cultivar:
1.3 - Quantidade do produto expedido:
1.4 - Identificação do lote:
1.5 - Data de expedição do produto vegetal:


2 - Informações do Comprador:

2.1 - Nome ou Razão social:
2.2 - CPF, IE ou CNPJ ou CGC/MAPA:
2.3 - Endereço Completo, ou quando localizado em zona rural, coordenada geográfica ou CCIR:


*/

    inner class comprador {
     var compradorname: String = "12345-000"
     var CPFCNPJ: String = "Rua do Banco"
     
      /* e/ou (quando em localidade rural) 
      
      coordenada: latitude e longitude */
    
     var coordenada: String = "coordenada"

        inner class comprador-adress {
         var cep: String = "12345-000"
         var street: String = "Rua do Banco"
         var adressnumber: String = "1"      
         var location: String = "Bairro"
         var city: String = "Cidade"
         var state: String = "Estado"
         var country: String = "País"
         /* e/ou (quando em localidade rural) */
         var coordenada: String = "coordenada"
        }
    }

    inner class fornecedor {
      var fornecedorname: String = "12345-000"
      var CPFCNPJ: String = "Rua do Banco"
      /* e/ou (quando em localidade rural) */
      var coordenada: String = "coordenada"
 
         inner class fornecedor-adress {
          var cep: String = "12345-000"
          var street: String = "Rua do Banco"
          var adress-number: String = "1"      
          var location: String = "Bairro"
          var city: String = "Cidade"
          var state: String = "Estado"
          var country: String = "País"
          /* e/ou (quando em localidade rural) */
          var coordenada: String = "coordenada"
         }
     }

    


  constructor()

  fun product-Info() = "$product-name e $peso"
}



fun main()  {
  val productname1 = product-()
  println(product-name1.product-Info())

}
