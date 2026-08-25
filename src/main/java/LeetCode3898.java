void main() {

    int[][] matriz;
    matriz = new int[][]{{0, 1, 1}, {1, 0, 1}, {1, 1, 0}};
    int[] ans;
    ans = findDegree(matriz);
    IO.println(Arrays.toString(ans));
}

private static int[] findDegree(int[][] matrix) {
    int[] degree;
    degree = new int[matrix.length];
    int soma = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            soma = soma + matrix[i][j];
        }
        degree[i] = soma;
        //System.out.println(degree[i] + " ");
        soma = 0;
    }


    return degree;
}


