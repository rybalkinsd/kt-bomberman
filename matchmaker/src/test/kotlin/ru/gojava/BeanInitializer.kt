package ru.gojava

import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext

/**
 * Created by Sergey Rybalkin on 19/07/2018.
 */
class FuBeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) = beans.initialize(context)
}