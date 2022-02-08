package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите размер квадратной матрицы:");
                int n = Integer.parseInt(r.readLine());
                int[][] a = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = n*i + j;
                    }
                }

                System.out.println("Начальная матрица");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%4d", a[i][j]);
                    }
                    System.out.println();
                }

                for (int i = 0; i < n; i++) {
                    for (int j = i+1; j < n; j++) {
                        int temp = a[i][j];
                        a[i][j] = a[j][i];
                        a[j][i] = temp;
                    }
                }

                System.out.println("Транспонированная матрица");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%3d", a[i][j]);
                    }
                    System.out.println();
                }

            }
        }


