package com.home.random;
public class Proptiger {

    public static boolean findLoop(Node head) {
        boolean isLoopPresent = false;
        Node firstNode = head;
        Node secondNode = head.getNext();
        if (secondNode != null) {
            secondNode = secondNode.getNext();
        }

        while ((firstNode != null || secondNode != null) && (firstNode != secondNode)) {
            firstNode = firstNode.getNext();
            secondNode = secondNode.getNext();
            if (secondNode.getNext() != null) {
                secondNode = secondNode.getNext();
            }
        }

        if (firstNode != null || secondNode != null) {
            isLoopPresent = true;
        } else {
            isLoopPresent = false;
        }
        return isLoopPresent;
    }

    public boolean deleteCurrentNodeData(Node currNode) {
        if (currNode == null || currNode.getNext() == null) {
            return false;
        }
        while (currNode.getNext().getNext() != null) {
            currNode.setData(currNode.getNext().getData());
            currNode = currNode.getNext();
        }
        currNode.setData(currNode.getNext().getData());
        currNode.setNext(null);
        return true;
    }

    public void arrangePositiveNegativeAlternate(int[] arr) {
        int outOfPlace = -1;
        for (int index = 0; index < arr.length; index++) {
            if (outOfPlace >= 0) {
                if ((arr[index] >= 0 && arr[outOfPlace] < 0) || (arr[index] < 0 && arr[outOfPlace] >= 0)) {

                    int temp = arr[index];
                    for (int i = index; i > outOfPlace; i--)
                        arr[i] = arr[i - 1];
                    arr[outOfPlace] = temp;

                    if (index - outOfPlace > 2)
                        outOfPlace = outOfPlace + 2;
                    else
                        outOfPlace = -1;
                }
            }
            if (outOfPlace == -1) {
                if ((arr[index] >= 0 && ((index & 1) == 1)) || (arr[index] < 0 && ((index & 1) == 0))) {
                    outOfPlace = index;
                }
            }
        }
        printArray(arr);
    }

    private void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
          System.out.print(""+arr[i]+"\t");
        System.out.println();
    }

    public static void main(String[] args) {
        new Proptiger().arrangePositiveNegativeAlternate(new int[] { 1, 2, 3, -4, -1, 4 });
        new Proptiger().arrangePositiveNegativeAlternate(new int[] {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8});
    }

}
