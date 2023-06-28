package com.bootcoding.collection.hashmap.mark;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubjectApp {
    public static void main(String[] args) {
        StudentMarkService sms = new StudentMarkService();
        List<SubjectMark> subjectMarks = sms.generateSubjectMarks(20);
        print(subjectMarks);
        sms.processResult(subjectMarks);
        print(subjectMarks);
//      java 8
        //Traverse  // Iteration
        List<SubjectMark> distinctionMarks = subjectMarks.stream()
                .filter(m -> m.getObtainedMarks() >= 80)
                .collect(Collectors.toList());

        Map<String, Integer> subjectCount = sms.getSubjectCount(distinctionMarks);

        System.out.println("Distinction Students Count: " + distinctionMarks.size());
        System.out.println(subjectCount);
//        print(subjectMarks);
    }

    private static void print(List<SubjectMark> data){
        for(SubjectMark sm : data){
            System.out.println("Subject : " + sm.getSubjectName());
            System.out.println("Total Marks: " + sm.getTotalMarks());
            System.out.println("Obtained Marks: " + sm.getObtainedMarks());
            System.out.println(sm.isPassed() ? "PASSED" : "FAILED");
        }
    }
}
