# Challenge 02

## Part i

In the below 2D array, find all of the 2x2 boxes that add up to 17.

Return an array with the indexes of the top left point in the square.

```
 0 6 3 5 2 9

 4 2 1 3 8 3

 5 4 2 1 3 8

 1 2 3 4 5 6
╔═══╗
║7 6║5 4 3 2
║   ║
║3 1║4 2 5 3
╚═══╝
```

E.g. 7 + 6 + 3 + 1 = 17
Index = [[0, 4]]

## Part ii

Given a string of values, an integer for the target, and an integer for grid width make your solution work from part i.

All digits are between 0-9, empty spaces on the end of a row default to zeros

E.g.
values = “1232893709132890”
width = 4
target = 13

```
1 2 3 2

8 9 3 7
   ╔═══╗
0 9║1 3║
   ║   ║
2 8║9 0║
   ╚═══╝
```

E.g. 1 + 3 + 9 + 0 = 13

## Part iii

Part iii: Given a string of values, an integer for the squareWidth, and an integer for grid width. Calculate all super squares that add up to a square number.

E.g.
values = “52498041378904132789053189074”
squareWidth = 3
gridWidth = 6

```
5 2 4 9 8 0

4 1 3 7 8 9
   ╔═════╗
0 4║1 3 2║7
   ║     ║
8 9║0 5 3║1
   ║     ║
8 9║0 7 4║3
   ╚═════╝
```

E.g. 1 + 3 + 2 + 0 + 5 + 3 + 0 + 7 + 4 = 25
Square root of 25 = 5


## Part iv

Create a visual output of your results from part iii, either using the console or JavaFX.

More examples coming soon...
