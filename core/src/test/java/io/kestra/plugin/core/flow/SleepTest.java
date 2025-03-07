package io.kestra.plugin.core.flow;

import io.kestra.core.models.executions.Execution;
import io.kestra.core.models.flows.State;
import io.kestra.core.queues.QueueException;
import io.kestra.core.runners.AbstractMemoryRunnerTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeoutException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SleepTest extends AbstractMemoryRunnerTest {
    @Test
    void sleepTaskTest() throws TimeoutException, QueueException {
        Execution execution = runnerUtils.runOne(null, "io.kestra.tests", "sleep-task-flow");

        assertThat(execution.getState().getCurrent(), is(State.Type.SUCCESS));
    }


}
