using JetBrains.TestFramework;
using NUnit.Framework;

namespace RiderPluginExample.Tests
{
    public class AnyClassTests : BaseTest
    {
        [Test]
        public void SomeTest() => Assert.IsFalse(true);
    }
}
