package com.ecommerce.authentication;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserTest {
 @Test
 public void testLoginSuccess() {
	 User auth = new User();
 assertTrue(auth.login("admin", "password"));
 }
 @Test
 public void testLoginFailure() {
	 User auth = new User();
 assertFalse(auth.login("admin", "wrongpassword"));
 }
}
