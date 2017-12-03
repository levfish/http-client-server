package com.lev;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String p = "<p>paragraph</p>";
        System.out.println(org.apache.commons.text.StringEscapeUtils.escapeHtml4(p));
    }
}
