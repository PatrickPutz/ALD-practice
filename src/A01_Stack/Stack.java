package A01_Stack;


public class Stack<T>
{
    private Node<T> first;
    private int counter = 0;
    /**
     * Oberstes Element entfernen und zurückliefern.
     * Existiert kein Element, wird eine Exception ausgelöst.
     * @throws StackEmptyException
     */
    public T pop() throws StackEmptyException {
        if(first == null)
            throw new StackEmptyException();

        Node<T> popped = first;
        first = popped.getNext();
        popped.setNext(null);
        counter--;

        return popped.getData();
    }

    /**
     * Übergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {
        Node<T> pushed = new Node(i);

        pushed.setNext(first);
        first = pushed;
        counter++;
    }

    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
        return counter;
    }
}
