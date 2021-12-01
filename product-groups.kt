package registro-globe

/*Tabela de classificação de produtos vegetais
a serem rastreados de acordo com a Normativa Conjunta nº 02/2018 */

sealed class Grupos(name: String)


//frutas [Grupo1]

class Grupo1 {

    val frutas."180(dias)" = Citros, Maça, Uva
    val frutas."360(dias)" = Melao, Morango, Coco, Goiaba, Caqui, Mamao, Banana, Manga
    val frutas."720(dias)" = Abacate, Abacaxi, Anonaceas, Cacau, Cupuacu, Kiwi, Maracuja, Melancia, Roma, Açaa, Acerola, Amora, Ameixa, Caju, Carambola, Figo, Framboesa, Marmelo, Nectarina, Nespera, Pessego, Pitanga, Pêra e Mirtilo
}


//raízes, tubérculos e bulbos [Grupo2]

class Grupo2 {
    val tipo2.180(dias) = Batata
    val tipo2.360(dias) = Cenoura, Batata-Doce, Beterraba, Cebola, Alho
    val tipo2.720(dias) = Cara, Gengibre, Inhame, Mandioca, Mandioquinha-Salsa, Nabo, Rabanete, Batata-Yacon

} 

//hortaliças folhosas e ervas aromáticas frescas [Grupo3]
class Grupo3 {
    val tipo3.180(dias) = Alface, Repolho
    val tipo3.360(dias) = Couve, Agriao, Almeirão, Brocolis, Chicorea, Couve-Flor
    val tipo3.720(dias) = Couve-Chinesa, Couve-De-Bruxelas, Espinafre, Rucula, Alho-Poro, Cebolinha, Coentro, Manjericao, Salsa, Erva-Doce, Alecrim, Estragao, Manjerona, Salvia, Hortela, Oregano, Mostarda, Acelga, Aipo; Aspargos
}


//hortaliças não folhosas [Grupo4]
class Grupo4 {
    val tipo4.180(dias) = Tomate, Pepino
    val tipo4.360(dias) = Pimentão, Abobora, Abobrinha
    val tipo4.720(dias) = Berinjela, Chuchu, Jila, Maxixe, Pimenta, Quiabo
}

fun greetGrupos(Grupo1: frutas): String {
    when (Grupos) {
        is Grupo1 -> return "Selecione"
    }
}
 




