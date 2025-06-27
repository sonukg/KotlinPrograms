package array

class EncodeAndDecodeString {
    private val delimiter = '#'
    fun encodeString(string: List<String>): String {
        var stringBuilder = StringBuilder()
        for (str in string) {
            for (char in str) {
                stringBuilder.append(char.toInt())
                stringBuilder.append(CHAR_DELIMITER)
            }
            stringBuilder.append(STRING_DELIMITER)
        }
        return stringBuilder.toString()
    }

    fun encode(strs: List<String>): String =
        strs.joinToString("") { "${it.length}$delimiter$it" }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            // Find delimiter
            val delimiterIndex = str.indexOf(delimiter, i)

            // Parse length
            val length = str.substring(i, delimiterIndex).toInt()

            // Extract string
            val substring = str.substring(delimiterIndex + 1,
                delimiterIndex + 1 + length)
            result.add(substring)

            // Move pointer
            i = delimiterIndex + 1 + length
        }

        return result
    }

   /* fun decodeString(string: String): List<String> {
        var stringBuilder=StringBuilder()
        var resultList= mutableListOf<String>()
        var i=0
        while (i in string.indices){

            while (string[i] != STRING_DELIMITER){
                var charIntegerValue=""
                while (string[i] != CHAR_DELIMITER) {
                    charIntegerValue += string[i]
                    i++
                }
                stringBuilder.append(charIntegerValue.toInt().toChar())
                i++
            }
            resultList.kotlin_fund_prog.add(stringBuilder.toString())
            stringBuilder.clear()
            i++
        }
        resultList
    }*/



    companion object{
        private const val CHAR_DELIMITER="|"
        private const val STRING_DELIMITER="/"
    }

}
fun main(){
    val codec = EncodeAndDecodeString()
    val input = listOf("Hello", "World", "!")

    val encoded = codec.encode(input)
    val decoded = codec.decode(encoded)

    println("Original: $input")
    println("Encoded: $encoded")
    println("Decoded: $decoded")
}

