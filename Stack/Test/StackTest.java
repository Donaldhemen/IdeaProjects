import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack myStack;

    @BeforeEach
    public void setUp() {
        myStack = new Stack();
    }

    @Test
    public void showThatStack_isEmpty(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void showThatI_pushAndStack_isNotEmpty() {
        assertTrue(myStack.isEmpty());
        myStack.push("Donald");
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void showThatI_canPush_andPop_andStackIsEmpty() {
        assertTrue(myStack.isEmpty());
        myStack.push("Donald");
        assertFalse(myStack.isEmpty());
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void showThatStack_throwsException_whenIPopEmptyStack() {
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class, () -> myStack.pop());
    }
    @Test
    public void showThatStack_willPopTheLast_elementPushed() {
        assertTrue(myStack.isEmpty());
        myStack.push("Donald");
        myStack.push("Trump");
        assertFalse(myStack.isEmpty());

        assertEquals("Trump", myStack.pop());
        assertEquals("Donald", myStack.pop());
    }
    @Test
    public void showThatIPush_threeElements_andISee_theLastOneAdded_whenIPeek() {
        assertTrue(myStack.isEmpty());
        myStack.push("Donald");
        myStack.push("Trump");
        myStack.push("Hemen");

        assertEquals("Hemen", myStack.peek());
    }
    @Test
    public void showThatI_pushThreeElements_popOne_andPeekToCheck_theLastOne() {
        assertTrue(myStack.isEmpty());
        myStack.push("Donald");
        myStack.push("Trump");
        myStack.push("Hemen");
        myStack.pop();
        assertEquals("Trump", myStack.peek());
    }
    @Test
    public void throwExceptionWhenI_peekAnEmptyStack() {
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class, () -> myStack.peek());
    }
    @Test
    public void showThat_searchForElementReturns_thePositionInStack() {
        assertTrue(myStack.isEmpty());
        myStack.push("Donald");
        myStack.push("Trump");
        myStack.push("Hemen");

        assertEquals(1, myStack.search("Trump"));
    }
    @Test
    public void showThat_searchForAnElement_returnsMinusOne_ifTheElementIsNotInStack() {
        assertTrue(myStack.isEmpty());
        myStack.push("Donald");
        myStack.push("Trump");

        assertEquals(-1, myStack.search("Hemen"));
    }
}