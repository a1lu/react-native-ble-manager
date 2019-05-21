package it.innove;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.facebook.react.bridge.ReadableMap;

public class BleQueue {
    private static final BleQueue ourInstance = new BleQueue();

    public static BleQueue getInstance() {
        return ourInstance;
    }
    private BlockingQueue<ReadableMap> queue;
    private BleQueue() {
        queue = new LinkedBlockingQueue<>();
    }

    public int size()
    {
        return queue.size();
    }

    public boolean offer(ReadableMap map)
    {
        return queue.offer(map);
    }

    public ReadableMap take() throws InterruptedException
    {
        return queue.take();
    }
}
