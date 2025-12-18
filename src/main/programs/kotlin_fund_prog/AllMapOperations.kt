package kotlin_fund_prog

// mapValues: Transforms the values in the map.
fun mapValuesExample() {
    val map: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
    val doubledValues: Map<String, Int> = map.mapValues { it.value * 2 }
    println(doubledValues)  // Output: {a=2, b=4, c=6}
}

// mapKeys: Transforms the keys in the map.
fun mapKeysExample() {
    val map: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
    val upperKeys: Map<String, Int> = map.mapKeys { it.key.toUpperCase() }
    println(upperKeys)  // Output: {A=1, B=2, C=3}
}

// filterKeys: Filters the keys in the map.
fun filterKeysExample() {
    val map: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
    val filteredKeys: Map<String, Int> = map.filterKeys { it > "a" }
    println(filteredKeys)  // Output: {b=2, c=3}
}

// filterValues: Filters the values in the map.
fun filterValuesExample() {
    val map: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
    val filteredValues: Map<String, Int> = map.filterValues { it > 1 }
    println(filteredValues)  // Output: {b=2, c=3}
}

// toList: Converts the map to a list of pairs.
fun toListExample() {
    val map: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
    val list: List<Pair<String, Int>> = map.toList()
    println(list)  // Output: [(a, 1), (b, 2), (c, 3)]
}

// merge: Merges another map into this map, applying the given function to the values of matching keys.
fun mergeExample() {
    val map1: MutableMap<String, Int> = mutableMapOf("a" to 1, "b" to 2)
    val map2: Map<String, Int> = mapOf("b" to 3, "c" to 4)
    map2.forEach { key, value -> map1.merge(key, value, Int::plus) }
    println(map1)  // Output: {a=1, b=5, c=4}
}


fun main() {
    println("MapValues example: ")
    mapValuesExample()
    println("MapKeys example: ")
    mapKeysExample()
    println("FilterKeys example: ")
    filterKeysExample()
    println("FilterValues example: ")
    filterValuesExample()
    println("toList example: ")
    toListExample()
    println("Merge example: ")
    mergeExample()
}