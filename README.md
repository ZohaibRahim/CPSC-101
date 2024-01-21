# CPSC101
**Playing Card Utility - Enhanced Cribbage Deck**

This Java program defines utility classes for working with a standard deck of playing cards, focusing on the context of a cribbage deck. The main classes include Card, Rank, and Suit.

Card Class:

Represents a playing card with a specific rank and suit.
Provides methods for obtaining the card's rank, suit, crib count, and string representation.
Overrides the equals method to compare card equality based on rank and suit.
Rank Enum:

Enumerates the possible ranks of cards, including values and string representations.
Provides a getCount method to obtain the crib count for each rank.
Overrides toString to return the string representation of the rank.
Includes toShortString to obtain a shortened version of the rank string.
Suit Enum:

Enumerates the possible suits of cards, including string representations.
Overrides toString to return the string representation of the suit.
Includes toShortString to obtain a shortened version of the suit string.
The enhanced Card class includes improvements, such as using Rank and Suit enums for type safety, enhanced equals methods, and additional methods for obtaining short representations of ranks and suits.
