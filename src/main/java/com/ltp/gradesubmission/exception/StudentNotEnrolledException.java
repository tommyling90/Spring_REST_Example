package com.ltp.gradesubmission.exception;

public class StudentNotEnrolledException extends RuntimeException {
  public StudentNotEnrolledException(Long studentId, Long courseId) {
    super("The student id '" + studentId + "' is not enrolled in course id '" + courseId + "'.");
}
}
