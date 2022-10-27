/*
Bitwise Manipulation:
Computer understands binary language, which is a combination of 0s and 1s.

Number Systems:
1) Binary System (base 2) -> Ex - 1100 = 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 0 * 2^0 = 12
2) Decimal System (base 10) -> Ex - 278 = 2*10^2 + 7*10^1 + 8*10^0 = 200 + 70 + 8 = 278

-> Decimal to Binary Conversion
        12 -> 1100

-> Binary Representation of commonly used numbers:

0 -> 0000
1 -> 0001
2 -> 0010
3 -> 0011
4 -> 0100
5 -> 0101
6 -> 0110
7 -> 0111
8 -> 1000
9 -> 1001
10-> 1010
11-> 1011
12-> 1100
13-> 1101
14-> 1110
15-> 1111

16 -> 10000

Key Terms:
1) LSB -> Least Significant Bit (Rightmost Bit -> 0th Bit)
2) MSB -> Most Significant Bit (Leftmost Bit)
3) Set Bit -> The bit having value as 1
4) Unset Bit -> The bit having value as 0

Bitwise Operators : and(&), or(|), xor(^), not(~), left shift(<<), right shift(>>)

    A      B     and    or    xor
    0      0     0      0      0
    0      1     0      1      1
    1      0     0      1      1
    1      1     1      1      0

not operator (unary not operator)
    A   not
    0    1
    1    0
Ex-> num = 10101
    (~num) = 01010

Left Shift Operator (Multiplication by 2 Operator)
Ex-> 4<<1 = 8
     4->  0100
      -> 01000 => 8

Ex-> 6<<2 = 24
    6->   0110
     -> 011000 => 24

Right Shift Operator (Division by 2 Operator)
Ex-> 4>>1 = 2
    4-> 0100
     -> 0010 = 2
Ex-> 15>>2 = 3
     15-> 1111
       -> 0011 = 3

Total possible numbers using N bits = 2^N
Largest number possible using N bits = 2^N-1
Memory consumed by int = 4 bytes = 32 bits
Total possible numbers using 32 bits = 2^32
Largest number possible using 32 bits = 2^32 - 1

Properties of XOR operator:
1) num^num = 0
2) num^0 = num

Total Number of Bits in a given Number -> log(num)+1     (base 2 log)
num = 12 -> 1100
num = 8 -> 1000
num = 5 -> 101

Total number of digits in a given decimal number -> log(num) + 1   (base 10 log)
num = 12 -> 2
num = 2789 -> 4

Brian Kernighan's Algorithm
num & (num-1) = if 0 => num is a power of 2
              = else it is not a power of 2

 */

//  num -> 16
//  1 0 0 0 0
//  0 1 1 1 1

// num -> 10
// 1 0 1 0
// 1 0 0 1

