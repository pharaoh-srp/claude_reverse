package defpackage;

import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lxjc;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationUuid", "", "growthbookFormat", "", "includeSystemPrompts", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/account/AppStartResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLtp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface xjc {
    @u08("bootstrap/{organizationUuid}/app_start")
    Object a(@ouc("organizationUuid") String str, @tzd("growthbook_format") String str2, @tzd("include_system_prompts") boolean z, tp4<? super ApiResult<AppStartResponse>> tp4Var);
}
