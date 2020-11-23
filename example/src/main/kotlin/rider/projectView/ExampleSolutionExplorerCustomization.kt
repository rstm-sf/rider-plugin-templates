package example.plugin.rider.projectView

import com.intellij.ide.projectView.PresentationData
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.ui.SimpleTextAttributes
import com.jetbrains.rider.model.RdProjectFileDescriptor
import com.jetbrains.rider.projectView.nodes.ProjectModelNode
import com.jetbrains.rider.projectView.views.solutionExplorer.SolutionExplorerCustomization

class ExampleSolutionExplorerCustomization(project: Project): SolutionExplorerCustomization(project) {

    companion object {
        private val logger = Logger.getInstance(ExampleSolutionExplorerCustomization::class.java)
    }

    override fun updateNode(presentation: PresentationData, node: ProjectModelNode) {
        val descriptor = node.descriptor as? RdProjectFileDescriptor ?: return

        logger.info(project.name + ": " + descriptor.name)

        presentation.addText(" ☜(ﾟヮﾟ☜)", SimpleTextAttributes.REGULAR_ATTRIBUTES)
    }
}
