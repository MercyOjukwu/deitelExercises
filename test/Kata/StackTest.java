package Kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

        Stack stack;
        @BeforeEach
        public void beginEveryMethodWith(){
            stack = new Stack();
        }
        @Test
        public void stackCanBeCreated(){
            assertNotNull(stack);
        }


        @Test
        public void stackIsEmpty(){
            assertTrue(stack.isEmpty());
        }

        @Test
        public void pushOneElement_stackIsNotEmpty(){
            stack.push(13);
            assertFalse(stack.isEmpty());
        }

        @Test
        public void push_then_Pop_ShouldBeEmptyTest(){
            stack.push(10);
            stack.pop();
            assertTrue(stack.isEmpty());
        }

        @Test
        public void pushTwice_popOnce_ShouldNotBeEmpty(){
            stack.push(5);
            stack.push(5);
            stack.pop();
            assertFalse(stack.isEmpty());
        }

        @Test
        public void pushX_popX_elementShouldBeXTest(){
            stack.push(34);
            int element = stack.pop();
            assertEquals(34, element);
        }


        @Test
        public void pushXandY_popYandX_elementIsYThenXTest(){
            stack.push(50);
            stack.push(40);
            int element = stack.pop();
            assertEquals(40,element);

            element = stack.pop();
            assertEquals(50,element);
        }

        @Test
        public void pushXandY_peekReturnsYTest(){
            stack.push(20);
            stack.push(10);
            int element = stack.peek();
            assertEquals(10, element);

            element = stack.pop();
            assertEquals(10, element);

            element = stack.peek();
            assertEquals(20, element);
        }


}
