using JetBrains.ProjectModel;
using JetBrains.Rd.Base;
using JetBrains.ReSharper.Host.Features;
using JetBrains.Rider.Model;
using JetBrains.Util;

namespace RiderPluginExample
{
    [SolutionComponent]
    public class AnyClass
    {
        public AnyClass(ISolution solution, ILogger logger)
        {
            var rdModel = solution.GetProtocolSolution().GetAnyPluginModel();

            logger.Info(solution.Name + ": " + rdModel.Text.Maybe.ValueOrDefault);

            rdModel.Text.Set(" ☜(ﾟヮﾟ☜)");
        }
    }
}
