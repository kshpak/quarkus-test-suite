package io.quarkus.ts.many.extensions;

import org.junit.jupiter.api.Tag;

import io.quarkus.test.scenarios.OpenShiftDeploymentStrategy;
import io.quarkus.test.scenarios.OpenShiftScenario;

@Tag("use-quarkus-openshift-extension")
@Tag("serverless")
@OpenShiftScenario(deployment = OpenShiftDeploymentStrategy.UsingOpenShiftExtensionAndDockerBuildStrategy)
public class ServerlessExtensionDockerBuildStrategyOpenShiftManyExtensionsIT extends ManyExtensionsIT {

}