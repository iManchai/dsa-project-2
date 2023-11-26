/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author manch
 */
public class MinBinaryHeap {
    /**
     * Atributos del cola de prioridad
     * @field Document[] : Arreglo de la cola
     * @field capacity : Capacidad de la cola
     * @field size : Tamaño de la cola
     */
    private Document[] heapArray;
    private int capacity;
    private int size;
    
    /**
     * Constructor del cola de prioridad
     */
    public MinBinaryHeap(int size) {
        this.capacity = size;
        this.heapArray = new Document[size];
        this.size = 0;
    }
    
    /**
     * Getter del arreglo
     * @return arreglo de la cola
     */
    public Document[] getHeapArray() {
        return heapArray;
    }
    
    /**
     * Getter de la capacidad de la cola
     * @return Integer de la capacidad de la cola
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * Getter de la tamaño de la cola
     * @return Integer del tamaño de la cola
     */
    public int getCurrentHeapSize() {
        return size;
    }
    
    
    /**
     * Getter del hijo izquierdo del índice
     * @return Integer del índice en el arreglo del hijo izquierdo
     */
    private int getLeftChildIndex(int parentIndex) { 
        return (2 * parentIndex + 1);
    }
    
    /**
     * Getter del hijo derecho del índice
     * @return Integer del índice en el arreglo del hijo derecho
     */
    private int getRightChildIndex(int parentIndex) {
        return (2 * parentIndex + 2); 
    }
    
    /**
     * Getter de la raíz del índice
     * @return Integer del índice en el arreglo del padre
     */
    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }
    
    /**
     * Método chequear hijo izquierdo
     * @param index número entero del índice donde quieres obtener la información 
     * @return true si existe el índice del hijo izquierdo
     */
    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }
    
    /**
     * Método chequear hijo derecho
     * @param index número entero del índice donde quieres obtener la información 
     * @return true si existe el índice del hijo derecho
     */
    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }
    
    /**
     * Método chequear el padre
     * @param index número entero del índice donde quieres obtener la información 
     * @return true si existe el índice del padre
     */
    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }
    
    /**
     * Método cambiar posicion entre los elementos con los índices
     * @param index1 índice arreglo actual
     * @param index2 índice a cambiar del arreglo
     */
    private void swap(int index1, int index2) {
        Document temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }
    
    /**
     * Método para reorganizar el arreglo dependiendo de los valores de los índices
     * @param key valor de la raíz
     */
    public void MinHeapify(int key) {
        int l = getLeftChildIndex(key);
        int r = getRightChildIndex(key);
 
        int smallest = key;
        if (l < size && heapArray[l].getTimeSendToPriorityQueue() < heapArray[smallest].getTimeSendToPriorityQueue()) {
            smallest = l;
        }
        if (r < size && heapArray[r].getTimeSendToPriorityQueue() < heapArray[smallest].getTimeSendToPriorityQueue()) {
            smallest = r;
        }
 
        if (smallest != key) {
            swap(key, smallest);
            MinHeapify(smallest);
        }
    }
    
    /**
     * Método insertar según el nuevo valor del arreglo
     * @param newValue documento a insertar
     */
    public void insert(Document newValue) {
    if(this.size == this.capacity) 
        return;

    this.heapArray[size] = newValue;
    int current = size;
    this.size++;

    while (current != 0 && this.heapArray[getParentIndex(current)].getTimeSendToPriorityQueue() > heapArray[current].getTimeSendToPriorityQueue()) {
      Document temp = this.heapArray[getParentIndex(current)];
      this.heapArray[getParentIndex(current)] = heapArray[current];
      this.heapArray[current] = temp;
      current = getParentIndex(current);
    }

    }
    
    /**
     * Método para extraer el valor más pequeño
     * @return el valor más pequeño del arreglo
     */
    public Document extractMin() {
    if (size <= 0)
      return null;
    if (size == 1) {
      size--;
      return heapArray[0];
    }
    Document mini = heapArray[0];
    heapArray[0] = heapArray[size - 1];
    heapArray[size - 1] = null;
    size--;
    MinHeapify(0);
    return mini;
  }
    
    
    
}
