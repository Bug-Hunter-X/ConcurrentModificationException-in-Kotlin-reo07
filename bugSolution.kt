fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iter = list.iterator()
    while (iter.hasNext()) {
        val i = iter.next()
        if (i > 2) {
            iter.remove()
        }
    }
    println(list) // Output: [1, 2]

    //Another Solution using removeIf
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeIf { it > 2 }
    println(list2)// Output: [1, 2]

    //Another Solution using list copy
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val newList = mutableListOf<Int>()
    for(element in list3){
        if (element <=2){
            newList.add(element)
        }
    }
    println(newList) // Output: [1, 2]
}