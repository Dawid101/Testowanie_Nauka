package pl.coderslab.week4.argument;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }
}
