import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import java.util.NoSuchElementException
import java.util.TreeSet;

internal class KtBinaryTreeTest {

    @Test
    fun headSet() {
        val tree = KtBinaryTree<Int>()
        tree.add(4)
        tree.add(6)
        tree.add(9)
        tree.add(1)
        tree.add(3)
        tree.add(8)
        tree.add(5)

        val set = TreeSet<Int>()
        set.add(4)
        set.add(1)
        set.add(3)
        set.add(5)
        assertEquals(set, tree.headSet(6))
    }

    @Test
    fun next() {
        val tree = KtBinaryTree<Int>()
        tree.add(4)
        tree.add(6)
        tree.add(9)
        tree.add(1)
        tree.add(3)
        tree.add(8)
        tree.add(5)

        val iterator = tree.iterator()
        assertEquals(1, iterator.next())
        assertEquals(3, iterator.next())
        assertEquals(4, iterator.next())
        assertEquals(5, iterator.next())
        assertEquals(6, iterator.next())
        assertEquals(8, iterator.next())
        assertEquals(9, iterator.next())
        assertThrows(NoSuchElementException::class.java, Executable { iterator.next() })
    }
}