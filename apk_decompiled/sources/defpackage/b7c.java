package defpackage;

import com.anthropic.claude.api.notification.NotificationChannelSchema;
import com.anthropic.claude.api.notification.NotificationChannelUpdateParams;
import com.anthropic.claude.api.notification.NotificationPreferencesSchema;
import com.anthropic.claude.api.notification.NotificationPreferencesUpdateParams;
import com.anthropic.claude.api.notification.TestPushRequest;
import com.anthropic.claude.api.notification.TestPushResponse;
import com.anthropic.claude.api.notification.TrackPushOpenRequest;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0010\u0010\nJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00112\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lb7c;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationUuid", "", "workspaceId", "Lcom/anthropic/claude/api/result/ApiResult;", "", "Lcom/anthropic/claude/api/notification/NotificationChannelSchema;", "e", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/notification/NotificationChannelUpdateParams;", "params", "c", "(Ljava/lang/String;Lcom/anthropic/claude/api/notification/NotificationChannelUpdateParams;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/notification/NotificationPreferencesSchema;", "a", "Lcom/anthropic/claude/api/notification/NotificationPreferencesUpdateParams;", "b", "(Ljava/lang/String;Lcom/anthropic/claude/api/notification/NotificationPreferencesUpdateParams;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/notification/TrackPushOpenRequest;", "request", "Liei;", "f", "(Ljava/lang/String;Lcom/anthropic/claude/api/notification/TrackPushOpenRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/notification/TestPushRequest;", "Lcom/anthropic/claude/api/notification/TestPushResponse;", "d", "(Ljava/lang/String;Lcom/anthropic/claude/api/notification/TestPushRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface b7c {
    @u08("organizations/{organization_uuid}/notification/preferences")
    Object a(@ouc("organization_uuid") String str, @tzd("workspace_id") String str2, tp4<? super ApiResult<NotificationPreferencesSchema>> tp4Var);

    @rmc("organizations/{organization_uuid}/notification/preferences")
    Object b(@ouc("organization_uuid") String str, @ft1 NotificationPreferencesUpdateParams notificationPreferencesUpdateParams, @tzd("workspace_id") String str2, tp4<? super ApiResult<NotificationPreferencesSchema>> tp4Var);

    @smc("organizations/{organization_uuid}/notification/channels")
    Object c(@ouc("organization_uuid") String str, @ft1 NotificationChannelUpdateParams notificationChannelUpdateParams, @tzd("workspace_id") String str2, tp4<? super ApiResult<NotificationChannelSchema>> tp4Var);

    @smc("organizations/{organization_uuid}/notification/debug/test_push")
    Object d(@ouc("organization_uuid") String str, @ft1 TestPushRequest testPushRequest, tp4<? super ApiResult<TestPushResponse>> tp4Var);

    @u08("organizations/{organization_uuid}/notification/channels")
    Object e(@ouc("organization_uuid") String str, @tzd("workspace_id") String str2, tp4<? super ApiResult<? extends List<NotificationChannelSchema>>> tp4Var);

    @smc("organizations/{organization_uuid}/notification/push/track_open")
    Object f(@ouc("organization_uuid") String str, @ft1 TrackPushOpenRequest trackPushOpenRequest, tp4<? super ApiResult<iei>> tp4Var);
}
