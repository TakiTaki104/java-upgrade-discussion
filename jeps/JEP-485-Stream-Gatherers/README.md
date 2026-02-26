# JEP 485: Stream Gatherers

- JDK: 24
- Status: Standard (final)
- Summary: Adds stream gatherers to support custom intermediate stream operations.
- JEP: https://openjdk.org/jeps/485

## Impact Example (Existing vs. New)

**Before (custom collector or manual state):**
```java
int last = -1;
for (int n : list) last = n;
```

**After (Stream Gatherer):**
```java
int last = list.stream().gather(lastGatherer).findFirst().orElse(-1);
```
