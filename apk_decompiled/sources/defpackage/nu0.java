package defpackage;

import com.anthropic.claude.api.artifacts.ArtifactSource;
import com.anthropic.claude.api.artifacts.ArtifactVersionsResponse;
import com.anthropic.claude.api.artifacts.PublishArtifactRequest;
import com.anthropic.claude.api.artifacts.PublishedArtifact;
import com.anthropic.claude.api.artifacts.UpdateVisibilityRequest;
import com.anthropic.claude.api.artifacts.UserArtifactsListResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001eH§@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lnu0;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization", "Lcom/anthropic/claude/api/artifacts/PublishArtifactRequest;", "request", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/artifacts/PublishedArtifact;", "a", "(Ljava/lang/String;Lcom/anthropic/claude/api/artifacts/PublishArtifactRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/PublishedArtifactId;", "publishedArtifactId", "Liei;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/ArtifactId;", "artifactId", "Lcom/anthropic/claude/api/artifacts/UpdateVisibilityRequest;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/artifacts/UpdateVisibilityRequest;Ltp4;)Ljava/lang/Object;", "", "offset", "limit", "", "includePublishedUuid", "Lcom/anthropic/claude/api/artifacts/UserArtifactsListResponse;", "e", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/ChatId;", "conversationUuid", "Lcom/anthropic/claude/api/artifacts/ArtifactSource;", "source", "Lcom/anthropic/claude/api/artifacts/ArtifactVersionsResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/artifacts/ArtifactSource;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface nu0 {
    @smc("organizations/{organization}/publish_artifact")
    Object a(@ouc("organization") String str, @ft1 PublishArtifactRequest publishArtifactRequest, tp4<? super ApiResult<PublishedArtifact>> tp4Var);

    @smc("organizations/{organization}/artifact-versions/{artifactId}/visibility")
    Object b(@ouc("organization") String str, @ouc("artifactId") String str2, @ft1 UpdateVisibilityRequest updateVisibilityRequest, tp4<? super ApiResult<iei>> tp4Var);

    @ff5("organizations/{organization}/published_artifacts/{artifactId}")
    Object c(@ouc("organization") String str, @ouc("artifactId") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @u08("organizations/{organization}/artifacts/{conversationUuid}/versions")
    Object d(@ouc("organization") String str, @ouc("conversationUuid") String str2, @tzd("source") ArtifactSource artifactSource, tp4<? super ApiResult<ArtifactVersionsResponse>> tp4Var);

    @u08("organizations/{organization}/user_artifacts")
    Object e(@ouc("organization") String str, @tzd("offset") Integer num, @tzd("limit") Integer num2, @tzd("include_latest_published_artifact_uuid") Boolean bool, tp4<? super ApiResult<UserArtifactsListResponse>> tp4Var);
}
