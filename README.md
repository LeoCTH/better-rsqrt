# Better `rsqrt`
**N.B.:** The accuracy benefits of this is negligible at best, so don't expect anything big to happen. This is created
purely because I want to, and I can. 

Replaces the constant Minecraft uses in their [fast reciprocal square root](https://en.wikipedia.org/wiki/Fast_inverse_square_root)
(also known as `InvSqrt` or `rsqrt`) functions, to yield better accuracy:

| Function | Original Value | More Accurate™ Value |
|----------|----------------|---------------------|
|`fastInverseSqrt(float)`| `0x5f3759df` | `0x5f375a86`|
|`fastInverseSqrt(double)`| `0x5fe6eb50c7b537aa` | `0x5fe6eb50c7b537a9`|

Since Minecraft only use these functions in rendering, this "fix" should not affect world generation or other functions
that rely on the vanilla result to yield expected results.

### References
Both accessed on June 13th, 2021:
- [Lomont, C. (2003). Fast Inverse Square Root](https://lomont.org/papers/2003/InvSqrt.pdf)
- [Robertson, M. (2012). A Brief History of InvSqrt](https://cs.uwaterloo.ca/~m32rober/rsqrt.pdf)