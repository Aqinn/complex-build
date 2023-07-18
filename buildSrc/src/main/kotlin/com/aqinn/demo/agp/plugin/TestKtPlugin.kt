package com.aqinn.demo.agp.plugin

//import com.android.build.gradle.AppPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
//import org.gradle.api.plugins.ApplicationPlugin
//import org.gradle.kotlin.dsl.create
//import org.gradle.kotlin.dsl.withType

/**
 * Created by AllanZhong on 2023/6/1.
 */
abstract class TestKtPlugin : Plugin<Project> {

    override fun apply(target: Project) {
//        val extension = target.extensions.create<TestKtExtension>("testKt")
//
//        target.afterEvaluate {
//            println("[TestKtPlugin] Module {${target.name}} testKt extensions: ${extension.toString()}")
//        }
//
//        target.plugins.withType<AppPlugin> {
//            println("[TestKtPlugin] Module {${target.name}} apply android application plugin")
//        }
    }

}