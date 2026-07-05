package defpackage;

import com.anthropic.claude.api.experience.ExperienceActionRequest;
import com.anthropic.claude.api.experience.ExperienceActionResponse;
import com.anthropic.claude.api.experience.ExperienceTrackRequest;
import com.anthropic.claude.api.experience.ExperiencesResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lp87;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/experience/ExperiencesResponse;", "b", "(Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/experience/ExperienceTrackRequest;", "request", "Liei;", "c", "(Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceTrackRequest;Ltp4;)Ljava/lang/Object;", "organizationId", "Lcom/anthropic/claude/api/experience/ExperienceActionRequest;", "Lcom/anthropic/claude/api/experience/ExperienceActionResponse;", "a", "(Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceActionRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface p87 {
    @smc("organizations/{organization}/experiences/action")
    Object a(@ouc("organization") String str, @ft1 ExperienceActionRequest experienceActionRequest, tp4<? super ApiResult<ExperienceActionResponse>> tp4Var);

    @u08("organizations/{organization}/experiences")
    Object b(@ouc("organization") String str, tp4<? super ApiResult<ExperiencesResponse>> tp4Var);

    @smc("organizations/{organization}/experiences/track")
    Object c(@ouc("organization") String str, @ft1 ExperienceTrackRequest experienceTrackRequest, tp4<? super ApiResult<iei>> tp4Var);
}
