# belladati-extensions-api
Provides Java API interfaces for building BellaDati Extension endpoints.

## Maven Artifact
```
<dependency>
  <groupId>com.belladati</groupId>
  <artifactId>extensions-api</artifactId>
  <version>1.0</version>
</dependency>
```

## Usage
Extensions API interfaces are implemented by BaseExtensionEndpoint.class, which is superclass for all extension endpoints. You can pass the reference the the BaseExtensionEndpoint to your custom code:

```java
import com.belladati.extensions.UserService;
import com.belladati.extensions.User;

public class MyClass {

	public Object doSomething(com.belladati.extensions.UserService userService) {
		 User user = userService.loadUserByUsername("test_user");
		 return user.getLastLogin();
	}

}
```

In extension implementation, you can then write:

```java

package com.belladati;

import com.belladati.extension.BaseExtensionEndpoint;
import org.apache.tapestry5.StreamResponse;

public class MyEndpoint extends BaseExtensionEndpoint {

    @Override
    public StreamResponse doGet() {
        String text = String.valueOf(new MyClass().doSomething(this));
        return createStreamResponse(text, "text/plain", 200)
    }   
    
}

```


Refer to [BellaDati Extensions](http://support.belladati.com/techdoc/Extensions) for details on how to use or build the BellaDati Extensions.