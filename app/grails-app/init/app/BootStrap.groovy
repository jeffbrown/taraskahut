package app

import helper.MyExampleBean

class BootStrap {

    MyExampleBean exampleBean

    def init = { servletContext ->
        log.debug "someProperty is ${exampleBean.someProperty}"
    }
    def destroy = {
    }
}
