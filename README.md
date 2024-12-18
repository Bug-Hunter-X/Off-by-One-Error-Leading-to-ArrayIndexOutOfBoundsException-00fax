# Off-by-One Error in Java
This repository demonstrates a common off-by-one error in Java that results in an `ArrayIndexOutOfBoundsException`.  The error arises from an incorrect loop condition that attempts to access an element beyond the valid array indices.  The solution shows how to correct the loop condition to prevent this error.

## Bug Description
The provided Java code iterates through an array using a loop. However, the loop condition `i <= arr.length` causes an `ArrayIndexOutOfBoundsException` because arrays are zero-indexed and the last valid index is `arr.length - 1`.

## Solution
The solution modifies the loop condition to `i < arr.length`, ensuring that the loop terminates before attempting to access an invalid array index. 