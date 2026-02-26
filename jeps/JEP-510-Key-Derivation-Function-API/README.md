# JEP 510: Key Derivation Function API

- JDK: 25
- Status: Standard (final)
- Summary: Provides a standard API for key derivation functions.
- JEP: https://openjdk.org/jeps/510

## Impact Example (Existing vs. New)

**Before (ad-hoc key derivation):**
```java
// Derive keys manually or via provider-specific APIs
```

**After (KDF API):**
```java
SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
SecretKey key = factory.generateSecret(spec);
```
