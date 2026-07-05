package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.project.PaginatedProjectsResponse;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectCreateParams;
import com.anthropic.claude.api.project.ProjectUpdateParams;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJh\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u001e\u0010\u0019J0\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b!\u0010\u0019¨\u0006\"À\u0006\u0003"}, d2 = {"Lmkd;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/api/project/ProjectCreateParams;", "params", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/project/Project;", "c", "(Ljava/lang/String;Lcom/anthropic/claude/api/project/ProjectCreateParams;Ltp4;)Ljava/lang/Object;", "", "filter", "", "limit", "offset", "searchQuery", "", "starred", "isArchived", "Lcom/anthropic/claude/api/project/PaginatedProjectsResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "b", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/project/ProjectUpdateParams;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/project/ProjectUpdateParams;Ltp4;)Ljava/lang/Object;", "Liei;", "g", "", "Lcom/anthropic/claude/api/chat/ChatConversation;", "d", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface mkd {
    static /* synthetic */ Object f(mkd mkdVar, String str, String str2, Integer num, Integer num2, String str3, Boolean bool, vp4 vp4Var, int i) {
        vp4 vp4Var2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4 = Boolean.TRUE;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            vp4Var2 = vp4Var;
            bool2 = bool;
            bool3 = null;
        } else {
            vp4Var2 = vp4Var;
            bool2 = bool;
            bool3 = bool4;
        }
        return mkdVar.a(str, str2, num, num2, str3, bool3, bool2, vp4Var2);
    }

    @u08("organizations/{organization_uuid}/projects_v2")
    Object a(@ouc("organization_uuid") String str, @tzd("filter") String str2, @tzd("limit") Integer num, @tzd("offset") Integer num2, @tzd("searchQuery") String str3, @tzd("starred") Boolean bool, @tzd("is_archived") Boolean bool2, tp4<? super ApiResult<PaginatedProjectsResponse>> tp4Var);

    @u08("organizations/{organization_uuid}/projects/{project_uuid}")
    Object b(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, tp4<? super ApiResult<Project>> tp4Var);

    @smc("organizations/{organization_uuid}/projects")
    Object c(@ouc("organization_uuid") String str, @ft1 ProjectCreateParams projectCreateParams, tp4<? super ApiResult<Project>> tp4Var);

    @u08("organizations/{organization_uuid}/projects/{project_uuid}/conversations")
    Object d(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, tp4<? super ApiResult<? extends List<ChatConversation>>> tp4Var);

    @vmc("organizations/{organization_uuid}/projects/{project_uuid}")
    Object e(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, @ft1 ProjectUpdateParams projectUpdateParams, tp4<? super ApiResult<Project>> tp4Var);

    @ff5("organizations/{organization_uuid}/projects/{project_uuid}")
    Object g(@ouc("organization_uuid") String str, @ouc("project_uuid") String str2, tp4<? super ApiResult<iei>> tp4Var);
}
