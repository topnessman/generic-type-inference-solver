import dataflow.qual.DataFlow;

public class TestUpperBound2 {
    public @DataFlow(typeNames={"java.lang.String"}) Object upperBoundTesting2(int c) {
        return "I am a String!";
    }
}