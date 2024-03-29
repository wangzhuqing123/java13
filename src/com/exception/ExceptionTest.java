package com.exception;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Administrator
 * java.util.regex
 *   匹配邮箱地址
 */
public class ExceptionTest {
	public static void main(String[] args) {
//pattern类 正则表达式的编译表示
		Pattern pattern=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		String[] emails= {"shiyanlou@shiyanlou.com", "shiyanlou"};
        for (String email :emails){
//Matcher 通过解释Pattern对字符序列执行匹配操作的引擎
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + "匹配结果：" + matcher.matches());
        }
    }
}
