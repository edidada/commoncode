package cn.edidada.commoncode.utils;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void testAdd() {
        String[] nameArr = StringUtils.tokenizeToStringArray("fdasfas,555555;6788 9999", ",; ");
        for(String name : nameArr){
            System.out.println(name);
        }
    }

}
