class Counter {
    static int count;

    Counter() {
        count++;
        System.out.println("Object Created. Current Count: " + count);
    }
}

class main1 {
    public static void main(String[] args) {
        Counter c1Counter = new Counter();
        Counter c2Counter = new Counter();
        Counter c3Counter = new Counter();
        System.out.println("Final Count: " + Counter.count);
    }
}
