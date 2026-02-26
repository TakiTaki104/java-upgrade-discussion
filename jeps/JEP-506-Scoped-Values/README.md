# JEP 506: Scoped Values

- JDK: 25
- Status: Standard (final)
- Summary: Introduces scoped values for safely sharing context without ThreadLocal.
- JEP: https://openjdk.org/jeps/506

## Impact Example (Existing vs. New)

**Before (ThreadLocal):**
```java
private static final ThreadLocal<String> USER = new ThreadLocal<>();
USER.set("alice");
```

**After (ScopedValue):**
```java
private static final ScopedValue<String> USER = ScopedValue.newInstance();
ScopedValue.where(USER, "alice").run(() -> {
    System.out.println(USER.get());
});
```
