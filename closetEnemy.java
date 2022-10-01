package com.practise;

public class new_closet_enemy {
    public static void main(String[] args) {

        System.out.println(ArrayChallenge(new int[]{0,0,1,0,0,2,0,0}));

    }

    public static int ArrayChallenge(int[] arr) {
        int onePosition = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                onePosition = i;
        }
        if (onePosition == -1)
            return 0;

        int minDifference = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (minDifference == 0 || Math.abs(i - onePosition) < minDifference) {
                    minDifference = Math.abs(i - onePosition);
                }
            }
        }
        return minDifference;
    }
}
