package org.smart4j.localthread;

/**
 * @ClassName: ClientThread
 * @Description:
 * @Author: zsk
 * @Date: 2021/3/14 21:39
 * @Version: v1.0
 */
public class ClientThread extends Thread{
    private Sequence sequence;

    public ClientThread(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " => " + sequence.getNumber());
        }
    }

}
