package com.github.vyacheslavlapin.ijpluginexample.services

import com.intellij.openapi.project.Project
import com.github.vyacheslavlapin.ijpluginexample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
