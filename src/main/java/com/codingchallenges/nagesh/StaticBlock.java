package com.codingchallenges.nagesh;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StaticBlock {

    static {
        log.info("This text is invoked by declaring static keyword");
    }

    static {
        log.info("This text is again invoked by declaring static keyword");
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.staticcheck();

    }

    public void staticcheck() {
        log.info("This text is invoked without static keyword");
    }
}
