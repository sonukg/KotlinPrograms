//package kotlin

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.useLines
import kotlin.io.path.writeText


fun writeCSVFile(filePath:String){
        try {
        File(filePath).printWriter().use { printWriter->
        printWriter.println("Name,Age,Occupation")
            printWriter.println("Sonu Kumar,35,Software Engineer")
            printWriter.println("Ram Kumar,36,Software Engineer")
        }
            println("CSV File Created Successfully")
        }catch (e:Exception){
            println("Error while writing CSV file ${e.message}")
        }

       /* try {
            Path(filePath).writeText("""
            Name,Age,Occupation
            John Doe,30,Engineer
            Jane Smith,25,Doctor
        """.trimIndent())
            println("CSV file created successfully!")
        } catch (e: Exception) {
            System.err.println("Error writing CSV: ${e.message}")
        }*/
    }

fun readCsv1(filePath: String) {
    try {
        File(filePath).forEachLine { line ->
            val values = line.split(",")
            println(values)
        }
    } catch (e: Exception) {
        System.err.println("Error reading CSV: ${e.message}")
    }
}

fun readCsv(path: String) {
    try {
        Path(path).useLines { lines ->
            lines.forEach { line ->
                val values = line.splitToSequence(',')
                    .map { it.trim() }
                    .toList()
                println(values)
            }
        }
    } catch (e: Exception) {
        System.err.println("Error reading CSV: ${e.message}")
    }
}

    fun main(){
        val filePath="data.csv"
        writeCSVFile(filePath)
        println("\nReading CSV:")
        readCsv1(filePath)
    }
