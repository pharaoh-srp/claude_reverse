package defpackage;

import com.anthropic.claude.sessions.types.SdkWorkflowAgent;
import com.anthropic.claude.sessions.types.SdkWorkflowPhase;
import com.anthropic.claude.sessions.types.SdkWorkflowProgress;
import com.anthropic.claude.sessions.types.SdkWorkflowProgressUnknown;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class kdf extends sg9 {
    public static final kdf c = new kdf(jce.a.b(SdkWorkflowProgress.class));

    @Override // defpackage.sg9
    public final s06 a(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "type");
        String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
        return x44.r(content, "workflow_agent") ? SdkWorkflowAgent.Companion.serializer() : x44.r(content, "workflow_phase") ? SdkWorkflowPhase.Companion.serializer() : SdkWorkflowProgressUnknown.Companion.serializer();
    }
}
