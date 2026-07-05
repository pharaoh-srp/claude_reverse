package defpackage;

import com.anthropic.claude.conway.protocol.y1;
import java.util.Set;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class aqg {
    public static final /* synthetic */ aqg a = new aqg();
    public static final Set b = mp0.Z0(new String[]{"log", "context", "sampling_started", "sampling_ended", "tool", "tool_result_info", "tool_result", "tools_changed", "server_tool_call", "restart", "input_json_delta", "content_block_start", "quickstart.progress"});

    public final KSerializer serializer() {
        return y1.c;
    }
}
