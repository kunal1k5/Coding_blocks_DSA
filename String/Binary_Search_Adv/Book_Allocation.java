//Q.. Book Allocation Problem---

// You are given number of pages in n different books and m students. The books are arranged in
// ascending order of number of pages. Every student is assigned to read some consecutive books.
// The task is to assign books in such a way that the maximum number of pages assigned to a
// student is minimum.
// Input format
// First line contains integer t as number of test cases.
// Next t lines contains two lines.
// For each test case, 1st line contains two integers n and m which represents the number of
// books and students and 2nd line contains n space separated integers which represents the
// number of pages of n books in ascending order.\

// Output format
// Print the maximum number of pages that can be assigned to students.

// Example 1
// Input
// 1
// 42
// 12 34 67 90
// Output
// 113



package Binary_Search_Adv;

public class Book_Allocation {

    public static void main(String[] args) {
     
        int[] page = {10,20,30,40};
        int nos = 2;

        System.out.print(MinPage(page, nos));
    }
    public static int MinPage(int[] page, int nos){
        int low = 0;
        int high = 0;

        for(int i=0; i<page.length; i++){
            high+=page[i];
        }
        int ans =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isitPossible(page,nos,mid)==true){
                ans = mid;
                high= mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean isitPossible(int[] page, int nos, int mid) {
        int readPage =0;
        int student = 1;

        for(int i=0; i<page.length; i++){
            if(readPage + page[i] <= mid){
                readPage += page[i];
            }
            else{
                student++;
                readPage = page[i];
            }
            if(student > nos){
                return false;
            }
        }

        return true;
    }
    
}

