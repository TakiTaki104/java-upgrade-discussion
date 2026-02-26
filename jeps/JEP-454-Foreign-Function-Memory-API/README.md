# JEP 454: Foreign Function & Memory API

- JDK: 22
- Status: Standard (final)
- Summary: Provides a standard API for interacting with native code and memory.
- JEP: https://openjdk.org/jeps/454

## Impact Example (Existing vs. New)

**Before (JNI or Unsafe):**
```java
// Native calls via JNI or Unsafe memory access
// (Requires native code / riskier memory handling)
```

**After (FFM API):**
```java
try (Arena arena = Arena.ofConfined()) {
    MemorySegment seg = arena.allocate(ValueLayout.JAVA_INT);
    seg.set(ValueLayout.JAVA_INT, 0, 42);
}
```
