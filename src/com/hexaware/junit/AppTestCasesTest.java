package com.hexaware.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTestCasesTest {

 @Test
 public void add() {
  assertEquals(5, 3+2);
 }
 
 @Test
 public void subs() {
  assertEquals(1, 3-2);
 }
 
 @Test
 public void mult() {
  assertEquals(6, 3*2);
 }

}