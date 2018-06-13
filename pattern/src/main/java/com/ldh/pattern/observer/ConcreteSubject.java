package com.ldh.pattern.observer;

import lombok.Data;


@Data
public class ConcreteSubject extends Subject {
    private String subjectState;
}
