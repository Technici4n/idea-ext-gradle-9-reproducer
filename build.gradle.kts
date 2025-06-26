import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.gradle.ext.ProjectSettings
import org.jetbrains.gradle.ext.runConfigurations

plugins {
    id("org.jetbrains.gradle.plugin.idea-ext") version "1.1.10"
}

val ideaModel = project.extensions.findByName("idea") as IdeaModel
val projectSettings = (ideaModel.project as ExtensionAware).extensions.findByName("settings") as ProjectSettings

val appRun = org.jetbrains.gradle.ext.Application("Run!", project)
projectSettings.runConfigurations.add(appRun)
