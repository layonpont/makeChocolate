package com.makechocolate;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by Sulton on 6/3/2016.
 */

@RestController
public class MakeChocolateJSONController {

    @RequestMapping(path = "/chocolate.json", method = RequestMethod.GET)
    public ChocolateSolution jsonHome() {
        return new ChocolateSolution();
    }

    @RequestMapping(path = "/makeChocolate.json", method = RequestMethod.POST)
    public ChocolateSolution makeChocolate(HttpSession session, @RequestBody QuestionContainer questionContainer) throws Exception {

       ChocolateSolver chocolateSolver = new ChocolateSolver();
        ChocolateSolution chocolateSolution = chocolateSolver.makeChocolate(questionContainer.getSmallBars(), questionContainer.getBigBars(), questionContainer.getTotalAmount());
        return chocolateSolution;
    }
}
