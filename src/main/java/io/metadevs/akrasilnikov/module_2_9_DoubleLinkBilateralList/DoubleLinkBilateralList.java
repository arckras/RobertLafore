package io.metadevs.akrasilnikov.module_2_9_DoubleLinkBilateralList;

public class DoubleLinkBilateralList<T> implements DoubleLinkInterface<T> {
    private DoubleLink<T> first;
    private DoubleLink<T> last;

    public DoubleLinkBilateralList() {
        this.first = null;
        this.last = null;
    }

    //region Getters/Setters
    public DoubleLink<T> getFirst() {
        return first;
    }

    public void setFirst(DoubleLink<T> first) {
        this.first = first;
    }

    public DoubleLink<T> getLast() {
        return last;
    }

    public void setLast(DoubleLink<T> last) {
        this.last = last;
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }
    //endregion

    //region MyCode
    @Override
    public DoubleLink deleteKey(T key) {
        DoubleLink current = first;
        if (isEmpty()) {
            return null;
        }
        while (!current.data.equals(key)) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    @Override
    public boolean insertAfter(T key, T data) {
        DoubleLink current = first;
        while (!current.data.equals(key)) {
            current = current.next;
            if (current == null)
                return false;
        }
        DoubleLink newLink = new DoubleLink(data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    @Override
    public DoubleLink deleteLast() {
        DoubleLink temp = last;
        if (isEmpty()) {
            return null;
        }
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    @Override
    public DoubleLink deleteFirst() {
            DoubleLink temp = first;
        if (isEmpty()) {
            return null;
        }
            if (first.next == null) {
                last = null;
            } else {
                first.next.previous = null;
            }
            first = first.next;
            return temp;
    }

    @Override
    public void insertLast(T data) {
        DoubleLink newLink = new DoubleLink(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    @Override
    public void insertFirst(T data) {
        DoubleLink newLink = new DoubleLink(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
            newLink.next = first;
        }
        first = newLink;
    }

    public void displayBackward() {
        System.out.println("\nList (last-->first):");
        DoubleLink current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println("\n");
    }

    public void displayForward() {
        System.out.println("\nList (first-->last):");
        DoubleLink current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
            System.out.println("first: "+ first+"\nlast: "+last);
        }
        System.out.println("\n");
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
    //endregion
}
