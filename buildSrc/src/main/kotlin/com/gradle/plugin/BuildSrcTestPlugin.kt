package com.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildSrcTestPlugin : Plugin<Project> {

    override fun apply(p0: Project) {
        println("使用buildSrc方式创建的插件")
    }
}