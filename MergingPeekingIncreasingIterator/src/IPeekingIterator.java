import java.util.Iterator;

/**
 * Created by Nechaev Mikhail
 * Since 18/10/16.
 */
public interface IPeekingIterator<E> extends Iterator<E> {

    public E peek();
}