using System.Threading;
using JetBrains.Application.BuildScript.Application.Zones;
using JetBrains.ReSharper.TestFramework;
using JetBrains.TestFramework;
using JetBrains.TestFramework.Application.Zones;
using NUnit.Framework;
using RiderPluginExample.Tests;

[assembly: Apartment(ApartmentState.STA)]

#pragma warning disable 618
[assembly: TestDataPathBase("../../../data/csharp")]
#pragma warning restore 618

namespace RiderPluginExample.Tests
{
    [ZoneDefinition]
    public interface IRiderPluginExampleTestEnvironmentZone : ITestsEnvZone, IRequire<PsiFeatureTestZone>
    {
    }
}

[SetUpFixture]
public class TestEnvironment : ExtensionTestEnvironmentAssembly<IRiderPluginExampleTestEnvironmentZone>
{
}
