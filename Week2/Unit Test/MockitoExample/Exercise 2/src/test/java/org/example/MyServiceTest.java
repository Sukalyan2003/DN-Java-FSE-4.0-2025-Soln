package com.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // 1. Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Create service with mock
        MyService service = new MyService(mockApi);

        // 3. Call method under test
        service.fetchData();

        // 4. Verify interaction
        verify(mockApi).getData();  // ✅ verifies that getData() was called once
    }
}
