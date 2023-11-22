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
    private Document[] heapArray;
    private int capacity;
    private int size;
    
    public MinBinaryHeap(int size) {
        this.capacity = size;
        this.heapArray = new Document[size];
        this.size = 0;
    }

    public Document[] getHeapArray() {
        return heapArray;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentHeapSize() {
        return size;
    }
    
    
    
    private int getLeftChildIndex(int parentIndex) { 
        return (2 * parentIndex + 1);
    }

    private int getRightChildIndex(int parentIndex) {
        return (2 * parentIndex + 2); 
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }
    
    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }
    
    
    private void swap(int index1, int index2) {
        Document temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }
    
    
    private void MinHeapify(int key) {
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
