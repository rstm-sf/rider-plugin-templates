package model

import com.jetbrains.rd.generator.nova.Ext
import com.jetbrains.rd.generator.nova.PredefinedType
import com.jetbrains.rd.generator.nova.property
import com.jetbrains.rider.model.nova.ide.SolutionModel

@Suppress("unused")
object AnyPluginModel : Ext(SolutionModel.Solution) {

    init {
        property("text", PredefinedType.string)
    }
}
