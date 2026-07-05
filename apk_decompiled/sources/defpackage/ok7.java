package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.wiggle.PrepareUploadRequest;
import com.anthropic.claude.api.wiggle.PrepareUploadResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lok7;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/types/strings/ChatId;", "conversationId", "Lcom/anthropic/claude/api/wiggle/PrepareUploadRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/wiggle/PrepareUploadResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/wiggle/PrepareUploadRequest;Ltp4;)Ljava/lang/Object;", "Lgub;", "params", "file", "Liei;", "b", "(Ljava/lang/String;Lgub;Lgub;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface ok7 {
    @smc("organizations/{organization_uuid}/conversations/{conversation_uuid}/files/prepare-upload")
    Object a(@ouc("organization_uuid") String str, @ouc("conversation_uuid") String str2, @ft1 PrepareUploadRequest prepareUploadRequest, tp4<? super ApiResult<PrepareUploadResponse>> tp4Var);

    @smc("/v1/filestore/fs/createFile")
    @eub
    Object b(@sg8("x-organization-uuid") String str, @buc gub gubVar, @buc gub gubVar2, tp4<? super ApiResult<iei>> tp4Var);
}
