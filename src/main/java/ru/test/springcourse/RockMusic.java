package ru.test.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Beatls";
    }

    // код для доступа к рок музыки
}
