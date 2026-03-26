class Solution {
    public java.util.List<Integer> getRow(int rowIndex) {

        java.util.List<Integer> row = new java.util.ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);

            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}