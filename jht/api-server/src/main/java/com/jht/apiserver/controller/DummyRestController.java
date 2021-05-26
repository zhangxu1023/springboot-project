package com.jht.apiserver.controller;

import com.jht.common.web.MediaTypes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
@RequestMapping(value = {"${version}/dummy"})
public class DummyRestController {

    @RequestMapping(value = "/get", method = {RequestMethod.POST}, consumes = {MediaTypes.JSON}, produces = MediaTypes.JSON_UTF_8)
    public String get() {
        return "write";
    }
}
