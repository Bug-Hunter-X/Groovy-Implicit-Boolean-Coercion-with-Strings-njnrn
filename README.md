# Groovy Implicit Boolean Coercion with Strings

This example demonstrates a potential pitfall in Groovy related to implicit boolean coercion when handling strings.  The unexpected behavior arises when using `!str` to check for null or empty strings.

## Problem

In Groovy, an empty string evaluates to `false` in a boolean context. However, the expression `!str` will evaluate to `true` for both `null` and empty strings, leading to unexpected behavior if you're not careful.

## Solution

Always perform explicit checks for `null` and empty strings to avoid ambiguity. Using methods like `str == null` or `str.isEmpty()` provides clearer and more predictable results.
