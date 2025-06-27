package strings

fun main() {
    val str="Android is open source"

    val words=str.split(" ")
    val result = StringBuilder()


    for( word in words){
        var reverse = ""
        for(j in word.length - 1 downTo 0){
            reverse += (word[j])
        }
        result.append(reverse).append(" ")
    }

    println(result.toString())
}

//without using split function
/*
fun kotlin_fund_prog.main() {
    var a="Sonu Kumar"
    var reverse=""
    var b=""
    var c=""

    for(i in a.indices){
        var char=a[i]
        if(char !=' '){
            c=char + c
        }else{
            b+="$c "
            c=""
        }


    }
    b+=c
    println(b)
}*/

// make a function to reverse words in a string
fun reverseWordsInString(input: String): String {
    val words = input.split(" ")
    val result = StringBuilder()

    for (word in words) {
        var reverse = ""
        for (j in word.length - 1 downTo 0) {
            reverse += word[j]
        }
        result.append(reverse).append(" ")
    }

    return result.toString().trim()
}

//make a function to reverse words in a string without using split function
fun reverseWordsInStringWithoutSplit(input: String): String {
    val result = StringBuilder()
    var word = StringBuilder()

    for (char in input) {
        if (char != ' ') {
            word.append(char)
        } else {
            result.append(word.reversed()).append(" ")
            word.clear()
        }
    }
    // Append the last word
    if (word.isNotEmpty()) {
        result.append(word.reversed())
    }

    return result.toString()
}

// without using split and reverse function
// make
fun reverseWordsInStringWithoutSplitAndReverse(input: String): String {
    val result = StringBuilder()
    var word = ""
    var wordCount = 0
    var inWord = false
    for (char in input) {
        if (char != ' ') {
            word = char + word
            inWord = true
        } else {
            if (inWord) {
                if (wordCount > 0) result.append(" ")
                result.append(word)
                word = ""
                wordCount++
                inWord = false
            }
        }
    }
    if (inWord) {
        if (wordCount > 0) result.append(" ")
        result.append(word)
    }

    return result.toString()
}

fun reverseWordsOrder(s: String): String {
    val n = s.length
    val words = mutableListOf<String>()
    var i = 0
    while (i < n) {
        // Skip spaces
        while (i < n && s[i] == ' ') i++
        if (i >= n) break
        val start = i
        while (i < n && s[i] != ' ') i++
        val end = i
        words.add(s.substring(start, end))
    }
    return words.asReversed().joinToString(" ")
}
