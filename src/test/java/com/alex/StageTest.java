package com.alex;

import org.junit.Test;

/**
 * Created by Alex Liang on 2018/10/25.
 */
public class StageTest {

    @Test
    public void testStageOne(){
        Stage s = new Stage();
        s.stageOne();
    }

    @Test
    public void testStageTwo(){
        Stage s = new Stage();
        //int num = 1;
        //int num = 3;
        int num = 15;
        s.stageTwo(num);
    }
}
