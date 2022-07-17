// 5 TB of data -> More than a day
// I can take a flight and give him this data

// 10 TB of data -> 2 days
// I can take a flight and give him this data

// constraints

// I have a deck of cards (k)

// a) Select any card randomly from the deck - O(1)
// b) Select Ten of Spades - O(N)
// c) Select a card, and then find remaining same numbers from other suites - O(N^2)

// from 1 to N: // O(N)
        // select a card // O(1)
          // from 1 to N:
            // select relevant cards and draw  // O(N)

// d) // O(logN) (base 2)
       // Suite1 Cards - 1,2,3,4,.........11,12,13
      // Suite2 Cards - 1,2,3,4,.........11,12,13
     // Suite3 Cards - 1,2,3,4,.........11,12,13
    // Suite4 Cards- 1,2,3,4,.........11,12,13

// Main outer loop
// card = 6 of hearts
// for(int j=0;j<52*k;j++){ // O(N)
    // if(arr[j] == 6 of Spades || arr[j] == 6 of Clubs || arr[j] == 6 of Diamonds) // O(1)
            // draw that card // O(1)
//}


// Examples:

// a) 2.O(N^2) + O(2N) + 7.O(1) = O(N^2)
// b) O(N/2) + O(N/4).O(1) = O(N)
// c) 40273 = O(1)

