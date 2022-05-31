package com.example.demo.dto;

import lombok.Data;

@Data
public class Student<T> {
    T name;
}
