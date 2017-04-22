package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-22.
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:

 'A' : Absent.
 'L' : Late.
 'P' : Present.
 A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

 You need to return whether the student could be rewarded according to his attendance record.
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        int i=0;
        for(;i<s.length()-1;i++){
            if(s.charAt(i)=='A')
                countA++;
            if(countA==2)
                return false;
            if(s.charAt(i)=='L'){
                countL++;
                if(s.charAt(i+1)=='L'){
                    countL++;
                    if(countL>2)
                        return false;
                }else{
                    countL=0;
                }
            }
        }
        if(s.charAt(s.length()-1)=='A')
            countA++;
        return countA<2;
    }

    public static void main(String[] args){
        StudentAttendanceRecordI obj=new StudentAttendanceRecordI();
        System.out.println(obj.checkRecord("PPAPLLLLL"));
    }
}
