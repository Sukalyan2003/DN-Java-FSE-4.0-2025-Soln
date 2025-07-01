package org.example;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // 1. Create mock of ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stub the getData method
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject mock into MyService
        MyService service = new MyService(mockApi);

        // 4. Call method and assert
        String result = service.fetchData();
        assertEquals("Mock Data", result);

        // 5. Optionally verify interaction
        verify(mockApi).getData();
    }
}
