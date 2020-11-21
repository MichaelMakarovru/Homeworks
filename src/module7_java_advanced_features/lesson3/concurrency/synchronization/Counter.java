package module7_java_advanced_features.lesson3.concurrency.synchronization;

import java.util.concurrent.atomic.AtomicLong;

class Counter {

    private long longCounter = 0;
    private AtomicLong atomicLong = new AtomicLong(0);
    private long longCounter2 = 0;
    private long longCounter3 = 0;
    private volatile long volatileLong = 0;

    public long getLongCounter() {
        return longCounter;
    }

    public AtomicLong getAtomicLong() {
        return atomicLong;
    }

    public long getLongCounter2() {
        return longCounter2;
    }

    public long getLongCounter3() {
        return longCounter3;
    }

    public long getVolatileLong() {
        return volatileLong;
    }

    public void increase() {
        longCounter++;
    }

    public void atomicIncrease() {
        atomicLong.incrementAndGet();
    }

    public void increase2() {

        synchronized (this) {
            longCounter2++;
        }
    }

    public synchronized void increase3() {
        longCounter3++;
    }

    public void increaseVolatile() {
        volatileLong++;
    }
}
