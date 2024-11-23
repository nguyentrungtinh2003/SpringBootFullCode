package com.TrungTinhFullStack.SpringBootFullCode.Error;

public class DepartmentNotFoundException extends RuntimeException{
    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
