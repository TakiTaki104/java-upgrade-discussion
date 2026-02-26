# JEP 511: Module Import Declarations

- JDK: 25
- Status: Standard (final)
- Summary: Adds module import declarations to simplify module usage.
- JEP: https://openjdk.org/jeps/511

## Impact Example (Existing vs. New)

**Before (module-info only):**
```java
// module-info.java: requires java.sql;
```

**After (module import in source):**
```java
import module java.sql;
```
