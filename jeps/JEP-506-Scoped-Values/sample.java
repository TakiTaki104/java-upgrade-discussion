import java.lang.ScopedValue;

class Sample {
    private static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USER, "alice").run(() -> {
            System.out.println("user=" + USER.get());
        });
    }
}
