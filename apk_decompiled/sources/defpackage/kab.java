package defpackage;

import com.anthropic.claude.api.memory.MemorySettingsRequest;
import com.anthropic.claude.api.memory.MemorySettingsResponse;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lkab;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/memory/MemorySynthesisResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Liei;", "c", "(Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/memory/MemorySettingsRequest;", "request", "Lcom/anthropic/claude/api/memory/MemorySettingsResponse;", "b", "(Ljava/lang/String;Lcom/anthropic/claude/api/memory/MemorySettingsRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface kab {
    @u08("organizations/{organization_uuid}/memory")
    Object a(@ouc("organization_uuid") String str, @tzd("project_uuid") String str2, tp4<? super ApiResult<MemorySynthesisResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/memory/settings")
    Object b(@ouc("organization_uuid") String str, @ft1 MemorySettingsRequest memorySettingsRequest, tp4<? super ApiResult<MemorySettingsResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/memory/reset")
    Object c(@ouc("organization_uuid") String str, tp4<? super ApiResult<iei>> tp4Var);
}
