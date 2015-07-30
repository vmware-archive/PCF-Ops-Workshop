package demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.FortunePowerBall;


@RestController
public class PowerballController {

	@RequestMapping("/powerball")
    public FortunePowerBall randomFortune() {
        return new FortunePowerBall();
    }
}
