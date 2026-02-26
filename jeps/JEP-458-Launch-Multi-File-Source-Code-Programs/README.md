# JEP 458: Launch Multi-File Source-Code Programs

- JDK: 22
- Status: Standard (final)
- Summary: Enables launching multiple source files directly with the Java launcher.
- JEP: https://openjdk.org/jeps/458

## Impact Example (Existing vs. New)

**Before (compile each file):**
```bash
javac Sample.java Util.java
java Sample
```

**After (run multiple source files directly):**
```bash
java Sample.java Util.java
```
