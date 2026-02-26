# JEP 513: Flexible Constructor Bodies

- JDK: 25
- Status: Standard (final)
- Summary: Allows statements before super(...) in constructors.
- JEP: https://openjdk.org/jeps/513

## Impact Example (Existing vs. New)

**Before (super() first):**
```java
Sample() {
    super();
    this.value = "ok";
}
```

**After (statements before super()):**
```java
Sample() {
    this.value = "ok";
    super();
}
```
