// Original sorting algorithm implementation
// Carlos J Degollado

package CarlosDegollado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenericSorting <T extends Comparable<T>> {
    protected T[][] m_grid;

    public GenericSorting(T[][] newGrid) {
        m_grid = newGrid;
    }

    public GenericSorting(String newFile) {
        m_grid = readFile(newFile);
    }

    public T[][] readFile(String newFile) {
        File f1 = new File(newFile);

        int iRow = 0;
        int iCol = 0;
        int iMax = 0;

        try {
            Scanner scanF = new Scanner(f1);

            while (scanF.hasNext()) {
                String strLine = scanF.nextLine();
                String[] strArr = strLine.split(" ");

                if (strArr.length > iMax) {
                    iCol = strArr.length;
                    iMax = iCol;
                }
                iRow++;
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        }

        T[][] arr = (T[][]) new Comparable[iRow][iMax];

        try {
            Scanner scanF = new Scanner(f1);
            int row = 0;
            int col = 0;

            while (scanF.hasNext()) {
                String strLine = scanF.nextLine();
                String[] strArr = strLine.split(" ");

                for (int i = 0; i < strArr.length; i++) {
                    T num = (T) strArr[i];

                    arr[row][col] = num;
                    col++;
                }
                col = 0;
                row++;
            }
        } catch (FileNotFoundException fnfe) {
        }

        return arr;
    }

    public T[][] getGrid() {
        return m_grid;
    }

    public void setGrid(T[][] newGrid) {
        m_grid = newGrid;
    }

    public void sortAsc() {
        //variable declarations
        T temp;
        T lowest = m_grid[0][0];
        boolean isOrdered = false;
        int lowRow = 0;
        int lowCol = 0;
        int firstRow = 0;
        int firstCol = 0;
        int limit = 0;
        int currEle = 0;
        int row;
        int col;
        double pointNum;
        double loNum = 0;

        do {
            for (row = 0; row < m_grid.length; row++) {
                for (col = 0; col < m_grid[row].length; col++) {
                    pointNum = Double.parseDouble(m_grid[row][col].toString());
                    currEle++;  //next item

                    if (currEle == limit + 1) {
                        lowest = m_grid[row][col];
                        loNum = Double.parseDouble(m_grid[row][col].toString());
                        lowRow = row;
                        lowCol = col;
                    } else if (pointNum < loNum && currEle > limit) {
                        lowest = m_grid[row][col];
                        loNum = Double.parseDouble(m_grid[row][col].toString());
                        lowRow = row;
                        lowCol = col;
                    }
                }
            }
            limit++;
            currEle = 0;

            //switch elements
            temp = m_grid[firstRow][firstCol];
            m_grid[firstRow][firstCol] = lowest;
            m_grid[lowRow][lowCol] = temp;

            //increase sort divider by 1
            firstCol++;
            if (firstCol == m_grid[row-1].length) {   //end of columns
                firstCol = 0;
                firstRow++; //next row
                if (firstRow == m_grid.length) {  //reached end, reset list divider to beginning
                    firstRow = 0;
                    firstCol = 0;
                }
            }

            //escape loop when divider resets to beginning
            if(firstRow == 0 && firstCol == 0) {
                isOrdered = true;
            }
        } while (!isOrdered);
    }

    public void sortDes() {
        //variable declarations
        T temp;
        T highest = m_grid[0][0];
        boolean isOrdered = false;
        int hiRow = 0;
        int hiCol = 0;
        int firstRow = 0;
        int firstCol = 0;
        int limit = 0;
        int currEle = 0;
        int row;
        int col;
        double pointNum;
        double hiNum = 0;

        do {
            for (row = 0; row < m_grid.length; row++) {
                for (col = 0; col < m_grid[row].length; col++) {
                    pointNum = Double.parseDouble(m_grid[row][col].toString());
                    currEle++;

                    if (currEle == limit + 1) {
                        highest = m_grid[row][col];
                        hiNum = Double.parseDouble(m_grid[row][col].toString());
                        hiRow = row;
                        hiCol = col;
                    } else if (hiNum < pointNum && currEle > limit) {
                        highest = m_grid[row][col];
                        hiNum = Double.parseDouble(m_grid[row][col].toString());
                        hiRow = row;
                        hiCol = col;
                    }
                }
            }
            limit++;
            currEle = 0;

            //switch elements
            temp = m_grid[firstRow][firstCol];
            m_grid[firstRow][firstCol] = highest;
            m_grid[hiRow][hiCol] = temp;

            //increase sort divider by 1
            firstCol++;
            if (firstCol == m_grid[row-1].length) {   //end of columns
                firstCol = 0;
                firstRow++;
                if (firstRow == m_grid.length) {  //end reached, reset list divider to beginning
                    firstRow = 0;
                    firstCol = 0;
                }
            }

            //escape loop when divider resets to beginning
            if(firstRow == 0 && firstCol == 0) {
                isOrdered = true;
            }
        } while (!isOrdered);
    }

    public void print2DArray() {
        String result = "";

        for (int r = 0; r < m_grid.length; r++) {
            for (int c = 0; c < m_grid[0].length; c++) {
                if (m_grid[r][c] == null) {
                    m_grid[r][c] =(T) "";
                } else {
                    result += m_grid[r][c] + " ";
                }
            }
            result += "\n";
        }

        System.out.print(result);
    }
}


//buggy version
//public class GenericSorting <T extends Comparable<T>> {
//    protected T[][] grid;
//
//    public GenericSorting(T[][] arr) {
//        this.grid = arr;
//    }
//
//    public T[][] getGrid() {
//        return this.grid;
//    }
//
//    public void setGrid(T[][] arr) {
//        this.grid = arr;
//    }
//
//    public void sortAsc() {
//        int order = 0;
//        int currEle = 0;
//        T temp;
//
//        T lowest = grid[0][0];
//        int lowRow = 0;
//        int lowCol = 0;
//
//
//        T first;
//        int firstRow = 0;
//        int firstCol = 0;
//
//        T pointer;
//        int row;
//        int col;
//        int limit = 0;
//        int loop = 1;
//        do {
//            first = grid[firstRow][firstCol];
//
//            //System.out.println("Loop " + loop);
//            for (row = 0; row < this.grid.length; row++) {
//                for (col = 0; col < this.grid[row].length; col++) {
//                    pointer = grid[row][col];
//                    currEle++;
//
//                    if (currEle == limit + 1) {
//                        lowest = grid[row][col];
//                        lowRow = row;
//                        lowCol = col;
//                    } else if (grid[row][col].compareTo(grid[lowRow][lowCol]) == -1
//                            && currEle > limit) {
//                        lowest = grid[row][col];
//                        lowRow = row;
//                        lowCol = col;
//                    }
//                }
//            }
//            limit++;
//            currEle = 0;
//
//            //switch elements
//            temp = grid[firstRow][firstCol];
//            grid[firstRow][firstCol] = lowest;
//            grid[lowRow][lowCol] = temp;
//
//            //increase sort divider by 1
//            firstCol++;
//            if (firstCol == grid[row-1].length) {
//                firstCol = 0;
//                firstRow++;
//                if (firstRow == grid.length) {
//                    firstRow = 0;
//                    firstCol = 0;
//                }
//            }
//
//            //escape loop when divider resets to beginning
//            if(firstRow == 0 && firstCol == 0) {
//                order++;
//            }
//
//            //loop counter inc
//            loop++;
//        } while (order == 0);
//    }
//
//    public void sortDes() {
//        int order = 0;
//        int currEle = 0;
//        T temp;
//
//        T highest = grid[0][0];
//        int hiRow = 0;
//        int hiCol = 0;
//
//
//        T first;
//        int firstRow = 0;
//        int firstCol = 0;
//
//        T pointer;
//        int row;
//        int col;
//        int limit = 0;
//        int loop = 1;
//        do {
//            first = grid[firstRow][firstCol];
//
//            //System.out.println("Loop " + loop);
//            for (row = 0; row < this.grid.length; row++) {
//                for (col = 0; col < this.grid[row].length; col++) {
//                    pointer = grid[row][col];
//                    currEle++;
//
//                    if (currEle == limit + 1) {
//                        highest = grid[row][col];
//                        hiRow = row;
//                        hiCol = col;
//                    } else if (grid[row][col].compareTo(grid[hiRow][hiCol]) == 1
//                            && currEle > limit) {
//                        highest = grid[row][col];
//                        hiRow = row;
//                        hiCol = col;
//                    }
//                }
//            }
//            limit++;
//            currEle = 0;
//
//            //switch elements
//            temp = grid[firstRow][firstCol];
//            grid[firstRow][firstCol] = highest;
//            grid[hiRow][hiCol] = temp;
//
//            //increase sort divider by 1
//            firstCol++;
//            if (firstCol == grid[row-1].length) {
//                firstCol = 0;
//                firstRow++;
//                if (firstRow == grid.length) {
//                    firstRow = 0;
//                    firstCol = 0;
//                }
//            }
//
//            //escape loop when divider resets to beginning
//            if(firstRow == 0 && firstCol == 0) {
//                order++;
//            }
//
//            //loop counter inc
//            loop++;
//        } while (order == 0);
//
//    }
//
//    public void print2DArray() {
//        String result = "";
//
//        for (int row = 0; row < this.grid.length; row++) {
//            for (int col = 0; col < this.grid[0].length; col++) {
//                result += this.grid[row][col] + " ";
//            }
//            result += "\n";
//        }
//
//        System.out.print(result);
//    }
//}

