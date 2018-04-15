package se.ithuset;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class HelloWorldLogEventTest {
    @Mock
    private SNSEvent input;

    @Mock
    private SNSEvent.SNSRecord record;

    @Mock
    private List<SNSEvent.SNSRecord> listRecords;

    @Mock
    private SNSEvent.SNS sns;

    @Before
    public void setUp() {
        input = mock(SNSEvent.class);
        listRecords = mock(ArrayList.class);
        record = mock(SNSEvent.SNSRecord.class);
        sns = mock(SNSEvent.SNS.class);
        when(input.getRecords()).thenReturn(listRecords);
        when(listRecords.get(0)).thenReturn(record);
        when(record.getSNS()).thenReturn(sns);
        when(sns.getMessage()).thenReturn("I'm a message");
    }


    @Test
    public void testLambdaFunctionHandler() {
        HelloWorldHandler handler = new HelloWorldHandler();
        Context ctx = createContext();
        Object output = handler.handleRequest(input, ctx);
        if (output != null) {
            System.out.println(output.toString());
        }
        Assert.assertEquals("helloworldLambda", output);
    }


    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("LambdaForm");

        return ctx;
    }
}

