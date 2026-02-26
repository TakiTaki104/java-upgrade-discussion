# JEP 484: Class-File API

- JDK: 24
- Status: Standard (final)
- Summary: Introduces a standard API for parsing, generating, and transforming class files.
- JEP: https://openjdk.org/jeps/484

## Impact Example (Existing vs. New)

**Before (ASM or custom parsers):**
```java
// Use ASM or custom bytecode parsing
```

**After (Class-File API):**
```java
ClassModel model = ClassFile.of().parse(bytes);
System.out.println(model.thisClass().asInternalName());
```
