package defpackage;

import com.anthropic.claude.api.tasks.AgentContentBlock;
import com.anthropic.claude.api.tasks.AgentToolResultEvent;
import com.anthropic.claude.api.tasks.AgentToolUseEvent;
import com.anthropic.claude.api.tasks.AssistantTextEvent;
import com.anthropic.claude.api.tasks.CustomToolUseEvent;
import com.anthropic.claude.api.tasks.McpToolUseEvent;
import com.anthropic.claude.api.tasks.StepStatusEvent;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class r7h {
    public static final /* synthetic */ r7h a = new r7h();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(TaskSessionEvent.class));
        w3cVar.e(kceVar.b(CustomToolUseEvent.class), CustomToolUseEvent.Companion.serializer());
        w3cVar.e(kceVar.b(AgentToolUseEvent.class), AgentToolUseEvent.Companion.serializer());
        w3cVar.e(kceVar.b(AgentToolResultEvent.class), AgentToolResultEvent.Companion.serializer());
        w3cVar.e(kceVar.b(McpToolUseEvent.class), McpToolUseEvent.Companion.serializer());
        w3cVar.e(kceVar.b(AssistantTextEvent.class), AssistantTextEvent.Companion.serializer());
        w3cVar.e(kceVar.b(StepStatusEvent.class), StepStatusEvent.Companion.serializer());
        w3cVar.b(new yeg(9));
        w3cVar.a(aVar);
        w3c w3cVar2 = new w3c(kceVar.b(AgentContentBlock.class));
        w3cVar2.b(new yeg(10));
        w3cVar2.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.tasks.TaskSessionEvent", kceVar.b(TaskSessionEvent.class), new pl9[]{kceVar.b(AgentToolResultEvent.class), kceVar.b(AgentToolUseEvent.class), kceVar.b(AssistantTextEvent.class), kceVar.b(CustomToolUseEvent.class), kceVar.b(McpToolUseEvent.class), kceVar.b(StepStatusEvent.class)}, new KSerializer[]{er.a, gr.a, py0.a, je5.a, x4b.a, ing.a}, new Annotation[]{new gl0(12)});
    }
}
