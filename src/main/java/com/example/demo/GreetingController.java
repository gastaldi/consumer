package com.example.demo;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
@RestController
public class GreetingController {

    private static final Logger logger = Logger.getLogger(GreetingController.class.getName());

    @RequestMapping(method = RequestMethod.POST, value = "/consume")
    public void consume(@RequestBody String body) {
        logger.info(body);
    }
}
