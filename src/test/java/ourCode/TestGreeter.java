package ourCode;

import thirdparty.StaticMethods;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyString;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Greeter.class, StaticMethods.class})
public class TestGreeter {
    @Test
    public void greetShouldCallStaticMethod() {
	mockStatic(StaticMethods.class);
	when(StaticMethods.greet(anyString())).thenReturn("return value does not matter");
	(new Greeter()).greet("Friend");
	verifyStatic();
	StaticMethods.greet("Friend");
    }
}
