package kotlin_fund_prog

// map: Transforms each element in the list.
fun mapExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val doubled: List<Int> = numbers.map { it * 2 }
    println(doubled)  // Output: [2, 4, 6, 8, 10]
}

// filter: Filters elements based on a condition.
fun filterExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val evenNumbers: List<Int> = numbers.filter { it % 2 == 0 }
    println(evenNumbers)  // Output: [2, 4]
}

// reduce: Combines all elements into a single result by applying
// a function that takes two parameters:
// the accumulator and the current element.
fun reduceExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val sum: Int = numbers.reduce { acc, num -> acc + num }
    println(sum) // Output: 15
}

// fold: Similar to reduce, but starts with an initial value
fun foldExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val sumWithInitial: Int = numbers.fold(10) { acc, num -> acc + num }
    println(sumWithInitial)  // Output: 25
}

// groupBy: Groups elements by a specified key.
fun groupByExample() {
    val names: List<String> = listOf("Anitaa", "Divya", "Raj", "Alan", "Sara")
    val groupedByFirstLetter: Map<Char, List<String>> = names.groupBy { it.first() }
    println(groupedByFirstLetter)  // Output: {A=[Anitaa, Alan], D=[Divya], R=[Raj], S=[Sara]}
}

// flatten: Flattens a list of lists into a single list.
fun flattenExample() {
    val nestedList: List<List<Int>> = listOf(listOf(1, 2, 3), listOf(4, 5), listOf(6, 7, 8))
    val flattenedList: List<Int> = nestedList.flatten()
    println(flattenedList)  // Output: [1, 2, 3, 4, 5, 6, 7, 8]
}

// chunked: Splits a list into smaller lists of a given size.
fun chunkedExample() {
    val numbers: List<Int> = (1..10).toList()
    val chunked: List<List<Int>> = numbers.chunked(3)
    println(chunked)  // Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]
}

// associate: Transforms a collection into a map by applying a function to each element.
fun associateExample() {
    val names: List<String> = listOf("Anitaa", "Barbara", "Cindy")
    val nameLengthMap: Map<String, Int> = names.associate { it to it.length }
    println(nameLengthMap)  // Output: {Anitaa=6, Barbara=7, Cindy=5}
}

// distinct: Returns a list containing only distinct elements.
fun distinctExample() {
    val numbers: List<Int> = listOf(1, 2, 2, 3, 4, 4, 5)
    val distinctNumbers: List<Int> = numbers.distinct()
    println(distinctNumbers)  // Output: [1, 2, 3, 4, 5]
}

// sorted: Returns a list with elements sorted in natural order.
fun sortedExample() {
    val numbers: List<Int> = listOf(5, 3, 8, 1, 2)
    val sortedNumbers: List<Int> = numbers.sorted()
    println(sortedNumbers)  // Output: [1, 2, 3, 5, 8]
}

// any: Checks if any elements match a given condition.
fun anyExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val hasEven: Boolean = numbers.any { it % 2 == 0 }
    println(hasEven)  // Output: true
}

// all: Checks if all elements match a given condition.
fun allExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val allEven: Boolean = numbers.all { it % 2 == 0 }
    println(allEven)  // Output: false
}

// none: Checks if no elements match a given condition.
fun noneExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val noneEven: Boolean = numbers.none { it % 2 == 0 }
    println(noneEven)  // Output: false
}

// find: Finds the first element that matches a condition.
fun findExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val firstEven: Int? = numbers.find { it % 2 == 0 }
    println(firstEven)  // Output: 2
}

// sum: Returns the sum of all elements.
fun sumExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val totalSum: Int = numbers.sum()
    println(totalSum)  // Output: 15
}

// count: returns the number of elements that match a condition.
fun countExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val evenCount: Int = numbers.count { it % 2 == 0 }
    println(evenCount)  // Output: 2
}

// zip: Merges two lists into a list of pairs.
fun zipExample() {
    val numbers1: List<Int> = listOf(1, 2, 3)
    val numbers2: List<Int> = listOf(4, 5, 6)
    val zipped: List<Pair<Int, Int>> = numbers1.zip(numbers2)
    println(zipped)  // Output: [(1, 4), (2, 5), (3, 6)]
}

// partition: Splits the list into two lists based on a predicate.
// The first list contains elements that match the predicate,
// and the second list contains elements that don’t.
fun partitionExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val (evens, odds) = numbers.partition { it % 2 == 0 }
    println(evens)  // Output: [2, 4] println(odds)   // Output: [1, 3, 5]
}

// drop: Returns a list containing all elements except the first n elements.
fun dropExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val dropped: List<Int> = numbers.drop(2)
    println(dropped)  // Output: [3, 4, 5]
}

// dropLast: Returns a list containing all elements except the last n elements.
fun dropLastExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val droppedLast: List<Int> = numbers.dropLast(2)
    println(droppedLast)  // Output: [1, 2, 3]
}

// take: Returns a list containing the first n elements.
fun takeExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val taken: List<Int> = numbers.take(3)
    println(taken)  // Output: [1, 2, 3]
}

// takeLast: Returns a list containing the last n elements.
fun takeLastExample() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val takenLast: List<Int> = numbers.takeLast(3)
    println(takenLast)  // Output: [3, 4, 5]
}


fun main() {
    println("Map example: ")
    mapExample()
    println("Filter example: ")
    filterExample()
    println("Reduce example: ")
    reduceExample()
    println("Fold example: ")
    foldExample()
    println("GroupBy example: ")
    groupByExample()
    println("Flatten example: ")
    flattenExample()
    println("Chunked example: ")
    chunkedExample()
    println("Associate example: ")
    associateExample()
    println("Distinct example: ")
    distinctExample()
    println("Sorted example: ")
    sortedExample()
    println("Any example: ")
    anyExample()
    println("All example: ")
    allExample()
    println("None example: ")
    noneExample()
    println("Find example: ")
    findExample()
    println("Sum example: ")
    sumExample()
    println("Count example: ")
    countExample()
    println("Zip example: ")
    zipExample()
    println("Partition example: ")
    partitionExample()
    println("Drop example: ")
    dropExample()
    println("DropLast example: ")
    dropLastExample()
    println("Take example: ")
    takeExample()
    println("TakeLast example: ")
    takeLastExample()
}

