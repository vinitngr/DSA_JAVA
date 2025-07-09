# Char and ASCII Conversion Examples


| Expression                 | Description                          | Result / Explanation                     |
|----------------------------|------------------------------------|-----------------------------------------|
| `'5' - '0'`                | Convert digit char to int           | 5 (53 - 48)                            |
| `'5' - '1'`                | Convert digit char to zero-based index | 4 (53 - 49)                        |
| `'C' - 'A'`                | Uppercase letter to zero-based index | 2 (67 - 65)                          |
| `'c' - 'a'`                | Lowercase letter to zero-based index | 2 (99 - 97)                          |
| `(char)(5 + '0')`          | Convert int to digit char           | '5'                                    |
| `(char)(2 + 'A')`          | Convert zero-based index to uppercase letter | 'C'                          |
| `(char)(2 + 'a')`          | Convert zero-based index to lowercase letter | 'c'                          |
| `'5' - 'A'`                | Char subtraction (negative result)  | -12 (53 - 65)                         |
| `'5' - '1'`                | Char subtraction                   | 4 (53 - 49)                           |
| `'5' + '5'`                | Char addition (sum of ASCII)        | 106 (53 + 53)                        |
| `"5" + '4'`                | String concatenation                | "54"                                  |
| `4 + '4'`                  | Int + char (char to ASCII int)     | 56 (4 + 52)                          |
| `Integer.parseInt("4") - ('2' - '0')` | String to int minus digit char to int | 2 (4 - 2)                         |
| `(int) '1'`                | Char to ASCII int                   | 49                                    |
