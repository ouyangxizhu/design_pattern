package com.ouyangxizhu.design.principle.dependenceinversion;

/**
 *
 */
public class Geely {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyImoocCourse(){
        iCourse.studyCourse();
    }






}
