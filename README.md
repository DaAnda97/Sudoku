# Sudoku
Just a little project for training my programming skills

## Goal
The goal is to have a running SodokuSolver, which correspendent with the [Object Calisthenics]( https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf ).

## Architecture

The 81 fields are represented in the Fields Object, which maintain its FieldValues and its PositionAttributes.

The FieldValues know its number, which is set in this field and also its possible values, which are important, if it's not set yet.

The PositionAttributes manage its number on the board, its column, its row and its 3*3 box:

| HEADER | HEADER | HEADER | HEADER | HEADER | HEADER | HEADER | HEADER | HEADER | <br/>
| ---------- | ---------- | ---------- | ---------- | ---------- | ---------- | ---------- | ---------- | ---------- | <br/>
|  1(1,1)[1] |  2(2,1)[1] |  3(3,1)[1] |  4(4,1)[2] |  5(5,1)[2] |  6(6,1)[2] |  7(7,1)[3] |  8(8,1)[3] |  9(9,1)[3] | <br/>
| 10(1,2)[1] | 11(2,2)[1] | 12(3,2)[1] | 13(4,2)[2] | 14(5,2)[2] | 15(6,2)[2] | 16(7,2)[3] | 17(8,2)[3] | 18(9,2)[3] | <br/>
| 19(1,3)[1] | 20(2,3)[1] | 21(3,3)[1] | 22(4,3)[2] | 23(5,3)[2] | 24(6,3)[2] | 25(7,3)[3] | 26(8,3)[3] | 27(9,3)[3] | <br/>
| 28(1,4)[4] | 29(2,4)[4] | 30(3,4)[4] | 31(4,4)[5] | 32(5,4)[5] | 33(6,4)[5] | 34(7,4)[6] | 35(8,4)[6] | 36(9,4)[6] | <br/>
| 37(1,5)[4] | 38(2,5)[4] | 39(3,5)[4] | 40(4,5)[5] | 41(5,5)[5] | 42(6,5)[5] | 43(7,5)[6] | 44(8,5)[6] | 45(9,5)[6] | <br/>
| 46(1,6)[4] | 47(2,6)[4] | 48(3,6)[4] | 49(4,6)[5] | 50(5,6)[5] | 51(6,6)[5] | 52(7,6)[6] | 53(8,6)[6] | 54(9,6)[6] | <br/>
| 55(1,7)[7] | 56(2,7)[7] | 57(3,7)[7] | 58(4,7)[8] | 59(5,7)[8] | 60(6,7)[8] | 61(7,7)[9] | 62(8,7)[9] | 63(9,7)[9] | <br/>
| 64(1,8)[7] | 65(2,8)[7] | 66(3,8)[7] | 67(4,8)[8] | 68(5,8)[8] | 69(6,8)[8] | 70(7,8)[9] | 71(8,8)[9] | 72(9,8)[9] | <br/>
| 73(1,9)[7] | 74(2,9)[7] | 75(3,9)[7] | 76(4,9)[8] | 77(5,9)[8] | 78(6,9)[8] | 79(7,9)[9] | 80(8,9)[9] | 81(9,9)[9] | <br/>

Legend: number (row, column)[box]
