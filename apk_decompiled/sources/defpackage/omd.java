package defpackage;

import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.project.ProjectDoc;
import com.anthropic.claude.api.project.ProjectDocsCreateParams;
import com.anthropic.claude.api.project.ProjectFileDeleteManyParams;
import com.anthropic.claude.api.project.ProjectKnowledgeStats;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0017\u0010\nJ4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b \u0010\nJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\"\u0010\n¨\u0006#À\u0006\u0003"}, d2 = {"Lomd;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "Lcom/anthropic/claude/api/result/ApiResult;", "", "Lcom/anthropic/claude/api/project/ProjectDoc;", "h", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "organizationUuid", "Lcom/anthropic/claude/api/project/ProjectDocsCreateParams;", "params", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/project/ProjectDocsCreateParams;Ltp4;)Ljava/lang/Object;", "Lgub;", "file", "Lcom/anthropic/claude/api/chat/MessageFile;", "g", "(Ljava/lang/String;Ljava/lang/String;Lgub;Ltp4;)Ljava/lang/Object;", "orgUuid", "projectUuid", "a", "Lcom/anthropic/claude/types/strings/ProjectDocId;", "docId", "Liei;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/project/ProjectFileDeleteManyParams;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/project/ProjectFileDeleteManyParams;Ltp4;)Ljava/lang/Object;", "c", "Lcom/anthropic/claude/api/project/ProjectKnowledgeStats;", "e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface omd {
    @u08("/api/organizations/{organization_uuid}/projects/{project_uuid}/files")
    Object a(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, tp4<? super ApiResult<? extends List<? extends MessageFile>>> tp4Var);

    @smc("organizations/{organization_uuid}/projects/{project_uuid}/docs")
    Object b(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, @ft1 ProjectDocsCreateParams projectDocsCreateParams, tp4<? super ApiResult<ProjectDoc>> tp4Var);

    @smc("organizations/{organization_uuid}/projects/{project_uuid}/kb/resync")
    Object c(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @smc("organizations/{organization_uuid}/projects/{project_uuid}/files/delete_many")
    Object d(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, @ft1 ProjectFileDeleteManyParams projectFileDeleteManyParams, tp4<? super ApiResult<iei>> tp4Var);

    @u08("organizations/{organization_uuid}/projects/{project_uuid}/kb/stats")
    Object e(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, tp4<? super ApiResult<ProjectKnowledgeStats>> tp4Var);

    @ff5("organizations/{organization_uuid}/projects/{project_uuid}/docs/{doc_uuid}")
    Object f(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, @ouc("doc_uuid") String str3, tp4<? super ApiResult<iei>> tp4Var);

    @smc("organizations/{organization_uuid}/projects/{project_uuid}/upload")
    @eub
    Object g(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, @buc gub gubVar, tp4<? super ApiResult<? extends MessageFile>> tp4Var);

    @u08("organizations/{organization_uuid}/projects/{project_uuid}/docs")
    Object h(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, tp4<? super ApiResult<? extends List<ProjectDoc>>> tp4Var);
}
