EquilibriumIndex

An equilibrium index of a sequence is an index into the sequence such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

For example take the array:

[9,4,3,1,2,3]

The equilibrium index would be the array index in which the sum of the values to the left of the index are equal to the sum of values to right of the index. In the above example index 1 (0 based array index) would be an equilibrium index as:

9 == 3 + 1 + 2 + 3

(the value of the current index is not included in either sum)

Task:

Write a function that, given a sequence, returns its equilibrium indices (if any).

Assume that the sequence may be very long.