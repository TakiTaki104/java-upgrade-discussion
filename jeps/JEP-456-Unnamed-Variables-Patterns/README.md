# JEP 456: Unnamed Variables & Patterns

- JDK: 22
- Status: Standard (final)
- Summary: Allows underscore placeholders for unused variables and patterns.
- JEP: https://openjdk.org/jeps/456

## Impact Example (Existing vs. New)

**Before:**
```java
if (obj instanceof Point p) {
    System.out.println(p.y());
}
for (int n : nums) {
    System.out.println("ignored element");
}
```

**After (Unnamed vars/patterns):**
```java
if (obj instanceof Point(var _, var y)) {
    System.out.println(y);
}
for (int _ : nums) {
    System.out.println("ignored element");
}
```
