object datos {
  var tuplaNumeros = (1, 2);
  var listado: List[Any] = List()
  for ( a <- 1 to 50){
    listado= listado  ::: List(s"$a")
  }

  listado = listado::: List(100, 200 , 3000)

  var pokemon: Map[String, String] = Map()
  pokemon += ("nombre" -> "Charizard")
  pokemon += ("type" -> "Fuego")
  pokemon += ("entrenador" -> "Ash")
  pokemon += ("lucha" -> "SI")

  def main(args: Array[String]) {
    println("Listado")
    listado.foreach({
      println
    })

    println("TuplaNumeros")
    println(tuplaNumeros)

    println("Mapa")
    println(pokemon.values)

  }
}