# The `Optional` class in Java 8 is like a container that can hold a value or be empty.


### *Key Reasons to use Optional Class*
### 1. **Null Safety:**
- Helps to Prevent Null Pointer Exception at Runtime.
- With `Optional`, you return an `Optional` object instead of `null`
### 2. **Clearer Intent:**
- By using `Optional`, you're explicitly saying that the value **may or may not be present**. This makes your code easier to understand. If a method returns an `Optional`, other developers can see that they need to handle the possibility of absence.
### 3. **Cleaner Code:**
- Instead of writing verbose `if-else` blocks to check for `null`, you can use methods provided by `Optional` (like `orElse()`, `isPresent()`, `orElseThrow()`, etc.) to handle missing values in a more compact, readable manner.

Example:
public static Optional<String> getName(){
Scanner sc = new Scanner(System.in);
	
}


