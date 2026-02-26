# JEP 491: Synchronize Virtual Threads without Pinning

- JDK: 24
- Status: Standard (final)
- Summary: Allows synchronization without pinning virtual threads.
- JEP: https://openjdk.org/jeps/491

## Impact Example (Existing vs. New)

**Before (virtual thread could pin on monitor):**
```java
synchronized (lock) {
    // may pin vthread in older releases
}
```

**After (no pinning for synchronized):**
```java
synchronized (lock) {
    // vthread unpinned with JEP 491
}
```
