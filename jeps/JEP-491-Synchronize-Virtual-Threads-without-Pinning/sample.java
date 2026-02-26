class Sample {
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws Exception {
        Thread.startVirtualThread(() -> {
            synchronized (LOCK) {
                System.out.println("vthread in synchronized");
            }
        }).join();
    }
}
