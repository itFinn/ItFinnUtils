package test.codeWars;

import codeWars.Fighter;
import codeWars.Fighter_winner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* Fighter_winner Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 2, 2018</pre> 
* @version 1.0 
*/ 
public class Fighter_winnerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) 
* 
*/ 
@Test
public void testDeclareWinner() throws Exception { 
//TODO: Test goes here...
    assertEquals("Lew", Fighter_winner.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    assertEquals("Harry", Fighter_winner.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
    assertEquals("Harald", Fighter_winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
    assertEquals("Harald", Fighter_winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
    assertEquals("Harald", Fighter_winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
    assertEquals("Harald", Fighter_winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


} 
