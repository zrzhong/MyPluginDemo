package com.zzr.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class StandGradlePlugin : Plugin<Project> {

    override fun apply(p0: Project) {
        println("使用独立项目方式创建的插件")
    }
}