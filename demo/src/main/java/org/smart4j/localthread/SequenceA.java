package org.smart4j.localthread;

/**
 * @ClassName: SequenceA
 * @Description:
 * @Author: zsk
 * @Date: 2021/3/14 21:42
 * @Version: v1.0
 */
public class SequenceA implements Sequence{
    private static int number = 0;
    public int getNumber() {
        number += 1;
        return number;
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceA();

        ClientThread thread1 = new ClientThread(sequence);
        ClientThread thread2 = new ClientThread(sequence);
        ClientThread thread3 = new ClientThread(sequence);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
