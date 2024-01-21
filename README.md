# Computer Programming - Java
**Playing Card Utility - Enhanced Cribbage Deck**

This Java program defines utility classes for working with a standard deck of playing cards, focusing on the context of a cribbage deck. The main classes include Card, Rank, and Suit.

1) Card Class:

a) Represents a playing card with a specific rank and suit.
b) Provides methods for obtaining the card's rank, suit, crib count, and string representation.
c) Overrides the equals method to compare card equality based on rank and suit.

2) Rank Enum:

a) Enumerates the possible ranks of cards, including values and string representations.
b) Provides a getCount method to obtain the crib count for each rank.
c) Overrides toString to return the string representation of the rank.
d) Includes toShortString to obtain a shortened version of the rank string.

3) Suit Enum:

a) Enumerates the possible suits of cards, including string representations.
b) Overrides toString to return the string representation of the suit.
c) Includes toShortString to obtain a shortened version of the suit string.
d) The enhanced Card class includes improvements, such as using Rank and Suit enums for type safety, enhanced equals methods, and additional methods for obtaining short representations of ranks and suits.
