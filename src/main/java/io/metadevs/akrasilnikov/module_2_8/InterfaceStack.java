package io.metadevs.akrasilnikov.module_2_8;

public interface InterfaceStack<T> {

    /**
     * Метод добавляет элемент в стэк
     * @param o добавляемый элемент
     */
    void push(Object o);

    /**
     * Метод удаляет последний элемент в Стэке
     * @return удалённый элемент
     */
    T pop();

    /**
     * Метод возвращает последний элемент Стека не удаляя его
     * @return
     */
    T peek();

    /**
     * Метод печатает все элементы в Стэке
     */
    void display();

    /**
     * Метод ищет элемент по индексу
     * @param index индекс, по которому ищется элемент
     * @return искомый элемент
     */
    T elementByIndex(int index);
}
