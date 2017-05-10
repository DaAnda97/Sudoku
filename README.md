# Sudoku
Just a little project for training my programming skills

## Goal
The goal is to have a running SodokuSolver, which follows the rules of the [Object Calisthenics]( https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf ).

## Architecture

The 81 fields are represented in the Fields Object, which maintain its FieldValues and its PositionAttributes.

The FieldValues know its number, which is set in this field and also its possible values, which are important, if it's not set yet.

The PositionAttributes manage its number on the board, its column, its row and its 3*3 box:

| | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 
| - | - | - | - | - | - | - | - | - | - |
| **1** | 1 [1] | 2 [1] | 3 [1] | 4 [2] | 5 [2] | 6 [2] | 7 [3] | 8 [3] | 9 [3] |
| **2** | 10 [1] | 11 [1] | 12 [1] | 13 [2] | 14 [2] | 15 [2] | 16 [3] | 17 [3] | 18 [3] |
| **3** | 19 [1] | 20 [1] | 21 [1] | 22 [2] | 23 [2] | 24 [2] | 25 [3] | 26 [3] | 27 [3] |
| **4** | 28 [4] | 29 [4] | 30 [4] | 31 [5] | 32 [5] | 33 [5] | 34 [6] | 35 [6] | 36 [6] |
| **5** | 37 [4] | 38 [4] | 39 [4] | 40 [5] | 41 [5] | 42 [5] | 43 [6] | 44 [6] | 45 [6] |
| **6** | 46 [4] | 47 [4] | 48 [4] | 49 [5] | 50 [5] | 51 [5] | 52 [6] | 53 [6] | 54 [6] |
| **7** | 55 [7] | 56 [7] | 57 [7] | 58 [8] | 59 [8] | 60 [8] | 61 [9] | 62 [9] | 63 [9] |
| **8** | 64 [7] | 65 [7] | 66 [7] | 67 [8] | 68 [8] | 69 [8] | 70 [9] | 71 [9] | 72 [9] |
| **9** | 73 [7] | 74 [7] | 75 [7] | 76 [8] | 77 [8] | 78 [8] | 79 [9] | 80 [9] | 81 [9] |

Legend: FieldNumber [box]
