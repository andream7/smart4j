package org.smart4j.localthread;

/**
 * @ClassName: SequenceB
 * @Description:
 * @Author: zsk
 * @Date: 2021/3/14 21:42
 * @Version: v1.0
 */
public class SequenceB implements Sequence{

    private static ThreadLocal<Integer> numberContainer = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceB();

        ClientThread thread1 = new ClientThread(sequence);
        ClientThread thread2 = new ClientThread(sequence);
        ClientThread thread3 = new ClientThread(sequence);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
