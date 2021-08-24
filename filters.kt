fun <T : Comparable<T>> Array<out T>.sorted(): List<T>

fun <T : Comparable<T>> Array<T>.sortedArray(): Array<T>

fun <T> Array<out T>.sortedArrayWith(comparator: Comparator<in T>): Array<out T>
(Grupo1)