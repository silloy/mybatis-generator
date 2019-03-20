package me.silloy;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;


//import static com.sun.org.apache.bcel.internal.util.SecuritySupport.getResourceAsStream;

/**
 * Created with IntelliJ IDEA.
 * User: SuShaohua
 * Date: 2018/6/15
 * Time: 17:48
 * Description: MAIN
 * https://github.com/gelosie/jsl/edit/master/src/com/sun/org/apache/bcel/internal/util/SecuritySupport.java
 */
public class Executor {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config =
                cp.parseConfiguration(SecuritySupport.getResourceAsStream("generatorTkConfig.xml"));
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
