# Computer Programming - Java
**Playing Card Utility - Enhanced Cribbage Deck**

This Java program defines utility classes for working with a standard deck of playing cards, focusing on the context of a cribbage deck. The main classes include Card, Rank, and Suit.

Card Class:

1) Represents a playing card with a specific rank and suit.
2) Provides methods for obtaining the card's rank, suit, crib count, and string representation.
3) Overrides the equals method to compare card equality based on rank and suit.

Rank Enum:

1) Enumerates the possible ranks of cards, including values and string representations.
2) Provides a getCount method to obtain the crib count for each rank.
3) Overrides toString to return the string representation of the rank.
4) Includes toShortString to obtain a shortened version of the rank string.

   Suit Enum:

1) Enumerates the possible suits of cards, including string representations.
2) Overrides toString to return the string representation of the suit.
3) Includes toShortString to obtain a shortened version of the suit string.
4) The enhanced Card class includes improvements, such as using Rank and Suit enums for type safety, enhanced equals methods, and additional methods for obtaining short representations of ranks and suits.
