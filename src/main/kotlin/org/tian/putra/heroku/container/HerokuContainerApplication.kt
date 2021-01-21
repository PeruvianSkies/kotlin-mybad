package org.tian.putra.heroku.container

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.hateoas.config.EnableHypermediaSupport

@SpringBootApplication
@EnableHypermediaSupport(type = [EnableHypermediaSupport.HypermediaType.HAL])
class HerokuContainerApplication

fun main(args: Array<String>) {
    SpringApplication.run(HerokuContainerApplication::class.java, *args)
}