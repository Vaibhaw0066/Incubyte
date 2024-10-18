# Incubyte TDD Assessment

## Overview
This TDD assessment evaluates software craftsmanship, emphasizing readable, testable code through Test-Driven Development (TDD).
  
### Steps:
1. Create a method signature:
    ```java
    int add(string numbers)
    ```
    Input: A string of comma-separated numbers.  
    Output: An integer sum.

2. Handle edge cases:
   - Allow any number of inputs.
   - Support newlines (`\n`) between numbers (e.g., `"1\n2,3"` → 6).
   - Custom delimiters: `"//[delimiter]\n[numbers]"` (e.g., `"//;\n1;2"` → 3).
   - Throw exceptions for negative numbers with a message listing all negatives.

#### Examples:
  - `""` → 0
  - `"1"` → 1
  - `"1,5"` → 6
3. Allow the add method to handle new lines between numbers (instead of commas). ("1\n2,3" should return 6)

4. Support different delimiters:

5. To change the delimiter, the beginning of the string will contain a separate line that looks like this:
   - "//[delimiter]\n[numbers…]". For example, "//;\n1;2" where the delimiter is ";" should return 3.
   - Calling add with a negative number will throw an exception: "negative numbers not allowed <negative_number>".

##### NOTE:
  - If there are multiple negative numbers, show all of them in the exception message, separated by commas.

For more details, visit the [full post](https://blog.incubyte.co/blog/tdd-assessment/).
