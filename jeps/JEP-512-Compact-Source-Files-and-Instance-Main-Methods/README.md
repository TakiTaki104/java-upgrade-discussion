# JEP 512: Compact Source Files and Instance Main Methods

- JDK: 25
- Status: Standard (final)
- Summary: Allows compact source files and instance main methods for simpler programs.
- JEP: https://openjdk.org/jeps/512

## Impact Example (Existing vs. New)

**Before (class + static main):**
```java
class Sample {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
```

**After (compact source):**
```java
void main() {
    System.out.println("hello");
}
```
