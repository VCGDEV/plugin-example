package com.vcgdev.pluginexample;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingTest {

    @Test
    public void testMatching(){
        String reges = "private\\p{Space}[a-zA-Z]*\\p{Space}*.*;";
            Pattern pattern = Pattern.compile(reges);
        List<String> valid = new ArrayList<>();
        valid.add("private    String value = \"value\";");
        valid.add("private Long id;");
        valid.add("private Date value = new Date();");
        valid.forEach(v ->{
            v = v.trim().replaceAll("\\s{2,}", " ");
            System.out.println(v);
            Matcher matcher = pattern.matcher(v);
            Assert.assertTrue(matcher.matches());
        });

        List<String> invalid = new ArrayList<>();
        invalid.add("pakcage some.other;");
        invalid.add("@Id");
        invalid.forEach(v ->{
            v = v.replaceAll(" +","");
            Matcher matcher = pattern.matcher(v);
            Assert.assertFalse(matcher.matches());
        });
    }
}
