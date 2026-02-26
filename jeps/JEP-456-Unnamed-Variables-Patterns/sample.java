class Sample {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        Object obj = new Point(1, 2);
        if (obj instanceof Point(var _, var y)) {
            System.out.println(y);
        }

        int[] nums = {1, 2, 3};
        for (int _ : nums) {
            System.out.println("ignored element");
        }
    }
}
