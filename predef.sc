/** decimal number type and type constructor */
type Dec = BigDecimal
val  Dec = BigDecimal

/** implicit [user-illusions] */
implicit def floatingPointNumbersAreExact(d: Double): Dec = Dec(d)

/** user hygiene */
assert(0.1 + 0.2 == 0.3, "0.1 + 0.2 == 0.3"); // we know, but, really?!
