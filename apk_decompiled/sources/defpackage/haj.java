package defpackage;

import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactRequest;
import com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse;
import com.anthropic.claude.api.wiggle.WiggleDeleteFileRequest;
import com.anthropic.claude.api.wiggle.WiggleDeleteFileResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0015J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lhaj;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/types/strings/ChatId;", "conversationId", "Lgub;", "file", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/chat/MessageFile;", "c", "(Ljava/lang/String;Ljava/lang/String;Lgub;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactRequest;", "request", "Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileRequest;", "Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileRequest;Ltp4;)Ljava/lang/Object;", "lyk", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface haj {
    @smc("organizations/{organization_uuid}/conversations/{conversation_uuid}/wiggle/delete-file")
    Object a(@ouc("organization_uuid") String str, @ouc("conversation_uuid") String str2, @ft1 WiggleDeleteFileRequest wiggleDeleteFileRequest, tp4<? super ApiResult<WiggleDeleteFileResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/conversations/{conversation_uuid}/wiggle/convert-file-to-artifact")
    Object b(@ouc("organization_uuid") String str, @ouc("conversation_uuid") String str2, @ft1 ConvertWiggleToArtifactRequest convertWiggleToArtifactRequest, tp4<? super ApiResult<ConvertWiggleToArtifactResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/conversations/{conversation_uuid}/wiggle/upload-file")
    @eub
    Object c(@ouc("organization_uuid") String str, @ouc("conversation_uuid") String str2, @buc gub gubVar, tp4<? super ApiResult<? extends MessageFile>> tp4Var);
}
