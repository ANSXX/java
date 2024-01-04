#include <stdio.h>

void inputMatrix(int rows, int cols, int mat[rows][cols]) {
    printf("Enter elements of the matrix:\n");
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            printf("Enter element at position (%d, %d): ", i + 1, j + 1);
            scanf("%f", &mat[i][j]);
        }
    }
}

void transposeMatrix(int rows, int cols, int mat[rows][cols]) {
    for (int i = 0; i < rows; ++i) {
        for (int j = i + 1; j < cols; ++j) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}

void printMatrix(int rows, int cols, int matrix[rows][cols]) {
    printf("Matrix: \n");
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            printf("%.2f\t", matrix[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int rows, cols;

    printf("Enter the number of rows for the matrix: ");
    scanf("%d", &rows);

    printf("Enter the number of columns for the matrix: ");
    scanf("%d", &cols);

    int matrix[rows][cols];

    printf("Enter elements for the matrix:\n");
    inputMatrix(rows, cols, matrix);

    transposeMatrix(rows, cols, matrix);

    printf("\nOriginal Matrix:\n");
    printMatrix(rows, cols, matrix);

    return 0;
}