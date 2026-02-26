# JEP 467: Markdown Documentation Comments

- JDK: 23
- Status: Standard (final)
- Summary: Adds Markdown support in Javadoc documentation comments.
- JEP: https://openjdk.org/jeps/467

## Impact Example (Existing vs. New)

**Before (HTML-heavy Javadoc):**
```java
/**
 * <h1>Title</h1>
 * <ul><li>Item</li></ul>
 */
```

**After (Markdown Javadoc):**
```java
/**
 * # Title
 * - Item
 */
```
