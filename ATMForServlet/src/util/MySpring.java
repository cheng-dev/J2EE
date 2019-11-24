package util;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * @author xiao
 * @date 2019/11/15 下午 8:48
 */
public class MySpring {
    private static HashMap<String, Object> beanMap = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String className) {
        T o = (T) beanMap.get(className);
        if (o == null) {
            try {
                o = (T) Class.forName(className).getDeclaredConstructor().newInstance();
                beanMap.put(className, o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return o;
    }
}
