# Strings

## Definition
A **String** is a sequence of characters, treated as an object in Java. Strings are immutable, meaning their values cannot be changed after they are created.

## String Declaration
There are two ways to declare a string in Java:  
1. **Using String Literal**: `String str = "Hello";`  
2. **Using `new` Keyword**: `String str = new String("Hello");`

## String Methods

### 1. `length()`
Returns the length of the string.  
**Example**: `String str = "Hello"; int length = str.length();`

### 2. `charAt(int index)`
Returns the character at the specified index.  
**Example**: `char ch = str.charAt(1); // 'e'`

### 3. `substring(int beginIndex)`
Returns a new string that is a substring of the original string starting from the specified index.  
**Example**: `String substr = str.substring(2); // "llo"`

### 4. `substring(int beginIndex, int endIndex)`
Returns a new string that is a substring of the original string from `beginIndex` to `endIndex - 1`.  
**Example**: `String substr = str.substring(1, 4); // "ell"`

### 5. `contains(CharSequence s)`
Checks if the string contains the specified sequence of characters.  
**Example**: `boolean contains = str.contains("ll"); // true`

### 6. `equals(Object anObject)`
Compares the string to the specified object for equality.  
**Example**: `boolean isEqual = str.equals("Hello"); // true`

### 7. `equalsIgnoreCase(String anotherString)`
Compares the string to another string, ignoring case considerations.  
**Example**: `boolean isEqual = str.equalsIgnoreCase("hello"); // true`

### 8. `toUpperCase()`
Converts all characters of the string to uppercase.  
**Example**: `String upper = str.toUpperCase(); // "HELLO"`

### 9. `toLowerCase()`
Converts all characters of the string to lowercase.  
**Example**: `String lower = str.toLowerCase(); // "hello"`

### 10. `trim()`
Removes leading and trailing whitespace from the string.  
**Example**: `String trimmed = str.trim();`

### 11. `replace(char oldChar, char newChar)`
Replaces all occurrences of a specified character with another character.  
**Example**: `String replaced = str.replace('l', 'p'); // "Heppo"`

### 12. `replace(CharSequence target, CharSequence replacement)`
Replaces each substring of the string that matches the literal target sequence with the specified replacement sequence.  
**Example**: `String replaced = str.replace("ll", "yy"); // "Heyyo"`

### 13. `split(String regex)`
Splits the string around matches of the given regular expression.  
**Example**: `String[] parts = str.split("l"); // {"He", "", "o"}`

### 14. `concat(String str)`
Concatenates the specified string to the end of the current string.  
**Example**: `String concated = str.concat(" World"); // "Hello World"`

### 15. `startsWith(String prefix)`
Checks if the string starts with the specified prefix.  
**Example**: `boolean starts = str.startsWith("He"); // true`

### 16. `endsWith(String suffix)`
Checks if the string ends with the specified suffix.  
**Example**: `boolean ends = str.endsWith("lo"); // true`

### 17. `indexOf(char ch)`
Returns the index of the first occurrence of the specified character.  
**Example**: `int index = str.indexOf('l'); // 2`

### 18. `lastIndexOf(char ch)`
Returns the index of the last occurrence of the specified character.  
**Example**: `int index = str.lastIndexOf('l'); // 3`

### 19. `isEmpty()`
Checks if the string is empty.  
**Example**: `boolean empty = str.isEmpty(); // false`

### 20. `valueOf()`
Converts different types of values (int, float, char, etc.) into strings.  
**Example**: `String strValue = String.valueOf(100); // "100"`

---

## Summary
- Strings are immutable and can be declared using literals or the `new` keyword.
- Strings have several methods for manipulating and analyzing their contents, such as finding length, getting substrings, replacing characters, and more.
