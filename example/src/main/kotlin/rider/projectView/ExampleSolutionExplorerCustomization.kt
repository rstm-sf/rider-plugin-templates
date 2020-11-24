package example.plugin.rider.projectView

import com.intellij.ide.projectView.PresentationData
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.ui.SimpleTextAttributes
import com.jetbrains.rd.ide.model.anyPluginModel
import com.jetbrains.rider.model.RdProjectFileDescriptor
import com.jetbrains.rider.projectView.nodes.ProjectModelNode
import com.jetbrains.rider.projectView.solution
import com.jetbrains.rider.projectView.views.solutionExplorer.SolutionExplorerCustomization

class ExampleSolutionExplorerCustomization(project: Project): SolutionExplorerCustomization(project) {

    companion object {
        private val logger = Logger.getInstance(ExampleSolutionExplorerCustomization::class.java)
    }

    private val rdModel = lazy { project.solution.anyPluginModel }

    override fun updateNode(presentation: PresentationData, node: ProjectModelNode) {
        val descriptor = node.descriptor as? RdProjectFileDescriptor ?: return

        val text = rdModel.value.text.valueOrNull
        logger.info(project.name + ": " + descriptor.name + " " + text)

        presentation.addText(text, SimpleTextAttributes.REGULAR_ATTRIBUTES)
    }
}
