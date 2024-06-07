package genericUtility;

import java.time.LocalDateTime;

public class javaUtility {
public String getSystemtime() {
	return LocalDateTime.now().toString().replace(":", "-");
}
}
