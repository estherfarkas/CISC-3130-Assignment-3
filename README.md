# CISC-3130-Assignment-3
For the 3rd Assignment,we were required to pull movie titles from a csv file
then we needed to put them in a binary tree, in alphabetical order
I created a class for the movie nodes as well as a class for the actual tree
I read in the csv and then used a string tokenizer and substring methods
to isolate the movie title and release date.
I created a node with those data fields and inserted into a tree
If the title of the movie was "bigger" (aka after it in alphabetical order)
It would go to the right, and to the left if it was smaller
Once I had my tree, I created a recursive method to traverse the tree backwards, so that I could get 
everything in perfect alphabetical order
Then I created a method that would find subSets within the tree when given a 
starting and ending parameter. 
If the start was found, the program would use the traverseTree method to get all of the values that come afterwards
I was unable to see the output of my program but I hope that my understanding of Binary Trees was sound. 
