package anthropic.claude.usercontent.sandbox;

import anthropic.claude.usercontent.sandbox.wire_format.Request;
import com.squareup.wire.AnyMessage;
import defpackage.knk;
import defpackage.mdj;
import google.protobuf.Empty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0018\u0010\u0007\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lanthropic/claude/usercontent/sandbox/ArtifactHostToSandboxService;", "", "<init>", "()V", "SetContent", "", "ReportPublicArtifact", "RenderPublicArtifact", "RenderSharedArtifact", "Lanthropic/claude/usercontent/sandbox/wire_format/Request;", "payload", "Lanthropic/claude/usercontent/sandbox/SandboxContent;", "requestId", "Lanthropic/claude/usercontent/sandbox/RenderPublicArtifactRequest;", "Lanthropic/claude/usercontent/sandbox/RenderSharedArtifactRequest;", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ArtifactHostToSandboxService {
    public static final ArtifactHostToSandboxService INSTANCE = new ArtifactHostToSandboxService();
    public static final String RenderPublicArtifact = "anthropic.claude.usercontent.sandbox.RenderPublicArtifact";
    public static final String RenderSharedArtifact = "anthropic.claude.usercontent.sandbox.RenderSharedArtifact";
    public static final String ReportPublicArtifact = "anthropic.claude.usercontent.sandbox.ReportPublicArtifact";
    public static final String SetContent = "anthropic.claude.usercontent.sandbox.SetContent";

    private ArtifactHostToSandboxService() {
    }

    public static /* synthetic */ Request RenderPublicArtifact$default(ArtifactHostToSandboxService artifactHostToSandboxService, RenderPublicArtifactRequest renderPublicArtifactRequest, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = knk.F().toString();
        }
        return artifactHostToSandboxService.RenderPublicArtifact(renderPublicArtifactRequest, str);
    }

    public static /* synthetic */ Request RenderSharedArtifact$default(ArtifactHostToSandboxService artifactHostToSandboxService, RenderSharedArtifactRequest renderSharedArtifactRequest, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = knk.F().toString();
        }
        return artifactHostToSandboxService.RenderSharedArtifact(renderSharedArtifactRequest, str);
    }

    public static /* synthetic */ Request ReportPublicArtifact$default(ArtifactHostToSandboxService artifactHostToSandboxService, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = knk.F().toString();
        }
        return artifactHostToSandboxService.ReportPublicArtifact(str);
    }

    public static /* synthetic */ Request SetContent$default(ArtifactHostToSandboxService artifactHostToSandboxService, SandboxContent sandboxContent, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = knk.F().toString();
        }
        return artifactHostToSandboxService.SetContent(sandboxContent, str);
    }

    public final Request RenderPublicArtifact(RenderPublicArtifactRequest payload, String requestId) {
        payload.getClass();
        requestId.getClass();
        return new Request("request", requestId, RenderPublicArtifact, AnyMessage.INSTANCE.pack(payload), null, 16, null);
    }

    public final Request RenderSharedArtifact(RenderSharedArtifactRequest payload, String requestId) {
        payload.getClass();
        requestId.getClass();
        return new Request("request", requestId, RenderSharedArtifact, AnyMessage.INSTANCE.pack(payload), null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request ReportPublicArtifact(String requestId) {
        requestId.getClass();
        return new Request("request", requestId, ReportPublicArtifact, AnyMessage.INSTANCE.pack(new Empty(null, 1, 0 == true ? 1 : 0)), null, 16, null);
    }

    public final Request SetContent(SandboxContent payload, String requestId) {
        payload.getClass();
        requestId.getClass();
        return new Request("request", requestId, SetContent, AnyMessage.INSTANCE.pack(payload), null, 16, null);
    }
}
