# validate-credit-card

A Clojure library for validating credit card numbers.

## The basics

Credit card numbers follow a pattern that makes it easy to check whether a particular number is valid. This makes it easy to check whether, for example, a customer placing an online order may have entered their credit card details incorrectly. Validating the number on the spot is much easier and less resource intensive than verifying the number with the financial institution.

The algorithm used for credit card numbers is known as the [Luhn algorithm](https://en.wikipedia.org/wiki/Luhn_algorithm "Wikipedia article on the Luhn algorithm"). In the Luhn algorithm, the last digit is what's known as a checksum digit -- it's computed based on all the other digits, and tells you whether the number is valid.

### An example

In the number `4242424242424242` (which is a valid credit card number), the final `2` is the checksum digit. If you were to change or switch around any of the digits before it, the checksum digit would be unlikely to be a `2`.

This library works by computing the checksum digit for all but the last digit of a number, and testing the last digit against the computed checksum.

## Usage

```clojure
[validate-credit-card "1.0.0"]

;; In your ns statement:
(ns my.ns
  (:require [validate-credit-card.core :refer :all]))
```

### Validate a credit card!

```clojure
(valid? "4242424242424242")
```

### Generate a Luhn checksum digit

```clojure
(compute-checksum "424242424242424")
```

## License

Copyright © 2019 Diego Escala

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
