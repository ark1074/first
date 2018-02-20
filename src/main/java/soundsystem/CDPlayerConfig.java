package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("soundsystem") //can specify no string it will scan the current package
                                //or can specify package name or the individual class too.
@ComponentScan(basePackages = {"soundsystem"})
public class CDPlayerConfig {
}
