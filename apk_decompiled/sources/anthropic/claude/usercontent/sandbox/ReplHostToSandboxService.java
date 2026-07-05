package anthropic.claude.usercontent.sandbox;

import anthropic.claude.usercontent.sandbox.wire_format.Request;
import com.squareup.wire.AnyMessage;
import defpackage.knk;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lanthropic/claude/usercontent/sandbox/ReplHostToSandboxService;", "", "<init>", "()V", "RunCode", "", "Lanthropic/claude/usercontent/sandbox/wire_format/Request;", "payload", "Lanthropic/claude/usercontent/sandbox/RunCodeRequest;", "requestId", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ReplHostToSandboxService {
    public static final ReplHostToSandboxService INSTANCE = new ReplHostToSandboxService();
    public static final String RunCode = "anthropic.claude.usercontent.sandbox.RunCode";

    private ReplHostToSandboxService() {
    }

    public static /* synthetic */ Request RunCode$default(ReplHostToSandboxService replHostToSandboxService, RunCodeRequest runCodeRequest, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = knk.F().toString();
        }
        return replHostToSandboxService.RunCode(runCodeRequest, str);
    }

    public final Request RunCode(RunCodeRequest payload, String requestId) {
        payload.getClass();
        requestId.getClass();
        return new Request("request", requestId, RunCode, AnyMessage.INSTANCE.pack(payload), null, 16, null);
    }
}
