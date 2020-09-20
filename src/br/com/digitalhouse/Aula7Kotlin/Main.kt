package br.com.digitalhouse.Aula7Kotlin

fun main() {

    var notebook = Notebook("Macbook",8000)
    var notebookRuim = Notebook("Positivo",5000)
    var notebookBom = Notebook("Macbook",8000)

    println(notebook)
    println(notebook.equals(notebookRuim))
    println(notebook.equals(notebookBom))

    var copiaNotebook = notebookBom.copy(preco = 7000)
    println(copiaNotebook)


}