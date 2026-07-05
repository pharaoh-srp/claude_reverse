package defpackage;

import com.anthropic.claude.api.memory.MelangeDeleteRequest;
import com.anthropic.claude.api.memory.MelangeDeleteResponse;
import com.anthropic.claude.api.memory.MelangeDoc;
import com.anthropic.claude.api.memory.MelangeListRequest;
import com.anthropic.claude.api.memory.MelangeListResponse;
import com.anthropic.claude.api.memory.MelangeReadRequest;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lt8b;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/api/memory/MelangeListRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/memory/MelangeListResponse;", "b", "(Ljava/lang/String;Lcom/anthropic/claude/api/memory/MelangeListRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/memory/MelangeReadRequest;", "Lcom/anthropic/claude/api/memory/MelangeDoc;", "c", "(Ljava/lang/String;Lcom/anthropic/claude/api/memory/MelangeReadRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/memory/MelangeDeleteRequest;", "Lcom/anthropic/claude/api/memory/MelangeDeleteResponse;", "a", "(Ljava/lang/String;Lcom/anthropic/claude/api/memory/MelangeDeleteRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface t8b {
    @smc("organizations/{organization_uuid}/melange/delete")
    Object a(@ouc("organization_uuid") String str, @ft1 MelangeDeleteRequest melangeDeleteRequest, tp4<? super ApiResult<MelangeDeleteResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/melange/list")
    Object b(@ouc("organization_uuid") String str, @ft1 MelangeListRequest melangeListRequest, tp4<? super ApiResult<MelangeListResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/melange/read")
    Object c(@ouc("organization_uuid") String str, @ft1 MelangeReadRequest melangeReadRequest, tp4<? super ApiResult<MelangeDoc>> tp4Var);
}
