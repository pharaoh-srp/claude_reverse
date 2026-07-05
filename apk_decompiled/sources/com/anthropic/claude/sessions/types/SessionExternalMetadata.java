package com.anthropic.claude.sessions.types;

import defpackage.bad;
import defpackage.d4c;
import defpackage.f7a;
import defpackage.isg;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lrf;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qke;
import defpackage.qy1;
import defpackage.srg;
import defpackage.ucf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEBi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,Jr\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\"R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b=\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b>\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010,R\u0013\u0010B\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bA\u0010(¨\u0006F"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "", "Lcom/anthropic/claude/sessions/types/RequiresActionDetails;", "pending_action", "", "", "current_branches", "Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "post_turn_summary", "task_summary", "slack_permalink", "slack_channel_name", "", "slack_channel_is_private", "<init>", "(Lcom/anthropic/claude/sessions/types/RequiresActionDetails;Ljava/util/Map;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/RequiresActionDetails;Ljava/util/Map;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "repo", "currentBranchFor", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "()Lcom/anthropic/claude/sessions/types/RequiresActionDetails;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Lcom/anthropic/claude/sessions/types/RequiresActionDetails;Ljava/util/Map;Lcom/anthropic/claude/sessions/types/PostTurnSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/sessions/types/SessionExternalMetadata;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/RequiresActionDetails;", "getPending_action", "Ljava/util/Map;", "getCurrent_branches", "Lcom/anthropic/claude/sessions/types/PostTurnSummary;", "getPost_turn_summary", "Ljava/lang/String;", "getTask_summary", "getSlack_permalink", "getSlack_channel_name", "Ljava/lang/Boolean;", "getSlack_channel_is_private", "getValidatedSlackUrl", "validatedSlackUrl", "Companion", "krf", "lrf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionExternalMetadata {
    private final Map<String, String> current_branches;
    private final RequiresActionDetails pending_action;
    private final PostTurnSummary post_turn_summary;
    private final Boolean slack_channel_is_private;
    private final String slack_channel_name;
    private final String slack_permalink;
    private final String task_summary;
    public static final lrf Companion = new lrf();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ucf(21)), null, null, null, null, null};

    public /* synthetic */ SessionExternalMetadata(int i, RequiresActionDetails requiresActionDetails, Map map, PostTurnSummary postTurnSummary, String str, String str2, String str3, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.pending_action = null;
        } else {
            this.pending_action = requiresActionDetails;
        }
        if ((i & 2) == 0) {
            this.current_branches = null;
        } else {
            this.current_branches = map;
        }
        if ((i & 4) == 0) {
            this.post_turn_summary = null;
        } else {
            this.post_turn_summary = postTurnSummary;
        }
        if ((i & 8) == 0) {
            this.task_summary = null;
        } else {
            this.task_summary = str;
        }
        if ((i & 16) == 0) {
            this.slack_permalink = null;
        } else {
            this.slack_permalink = str2;
        }
        if ((i & 32) == 0) {
            this.slack_channel_name = null;
        } else {
            this.slack_channel_name = str3;
        }
        if ((i & 64) == 0) {
            this.slack_channel_is_private = null;
        } else {
            this.slack_channel_is_private = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        srg srgVar = srg.a;
        return new f7a(srgVar, d4c.S(srgVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionExternalMetadata copy$default(SessionExternalMetadata sessionExternalMetadata, RequiresActionDetails requiresActionDetails, Map map, PostTurnSummary postTurnSummary, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            requiresActionDetails = sessionExternalMetadata.pending_action;
        }
        if ((i & 2) != 0) {
            map = sessionExternalMetadata.current_branches;
        }
        if ((i & 4) != 0) {
            postTurnSummary = sessionExternalMetadata.post_turn_summary;
        }
        if ((i & 8) != 0) {
            str = sessionExternalMetadata.task_summary;
        }
        if ((i & 16) != 0) {
            str2 = sessionExternalMetadata.slack_permalink;
        }
        if ((i & 32) != 0) {
            str3 = sessionExternalMetadata.slack_channel_name;
        }
        if ((i & 64) != 0) {
            bool = sessionExternalMetadata.slack_channel_is_private;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        String str5 = str2;
        PostTurnSummary postTurnSummary2 = postTurnSummary;
        return sessionExternalMetadata.copy(requiresActionDetails, map, postTurnSummary2, str, str5, str4, bool2);
    }

    public static final /* synthetic */ void write$Self$sessions(SessionExternalMetadata self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.pending_action != null) {
            output.B(serialDesc, 0, qke.a, self.pending_action);
        }
        if (output.E(serialDesc) || self.current_branches != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.current_branches);
        }
        if (output.E(serialDesc) || self.post_turn_summary != null) {
            output.B(serialDesc, 2, bad.a, self.post_turn_summary);
        }
        if (output.E(serialDesc) || self.task_summary != null) {
            output.B(serialDesc, 3, srg.a, self.task_summary);
        }
        if (output.E(serialDesc) || self.slack_permalink != null) {
            output.B(serialDesc, 4, srg.a, self.slack_permalink);
        }
        if (output.E(serialDesc) || self.slack_channel_name != null) {
            output.B(serialDesc, 5, srg.a, self.slack_channel_name);
        }
        if (!output.E(serialDesc) && self.slack_channel_is_private == null) {
            return;
        }
        output.B(serialDesc, 6, zt1.a, self.slack_channel_is_private);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RequiresActionDetails getPending_action() {
        return this.pending_action;
    }

    public final Map<String, String> component2() {
        return this.current_branches;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PostTurnSummary getPost_turn_summary() {
        return this.post_turn_summary;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTask_summary() {
        return this.task_summary;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSlack_permalink() {
        return this.slack_permalink;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSlack_channel_name() {
        return this.slack_channel_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getSlack_channel_is_private() {
        return this.slack_channel_is_private;
    }

    public final SessionExternalMetadata copy(RequiresActionDetails pending_action, Map<String, String> current_branches, PostTurnSummary post_turn_summary, String task_summary, String slack_permalink, String slack_channel_name, Boolean slack_channel_is_private) {
        return new SessionExternalMetadata(pending_action, current_branches, post_turn_summary, task_summary, slack_permalink, slack_channel_name, slack_channel_is_private);
    }

    public final String currentBranchFor(String repo) {
        repo.getClass();
        Map<String, String> map = this.current_branches;
        if (map != null && map.containsKey(repo)) {
            return this.current_branches.get(repo);
        }
        Map<String, String> map2 = this.current_branches;
        if (map2 != null) {
            return map2.get("");
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionExternalMetadata)) {
            return false;
        }
        SessionExternalMetadata sessionExternalMetadata = (SessionExternalMetadata) other;
        return x44.r(this.pending_action, sessionExternalMetadata.pending_action) && x44.r(this.current_branches, sessionExternalMetadata.current_branches) && x44.r(this.post_turn_summary, sessionExternalMetadata.post_turn_summary) && x44.r(this.task_summary, sessionExternalMetadata.task_summary) && x44.r(this.slack_permalink, sessionExternalMetadata.slack_permalink) && x44.r(this.slack_channel_name, sessionExternalMetadata.slack_channel_name) && x44.r(this.slack_channel_is_private, sessionExternalMetadata.slack_channel_is_private);
    }

    public final Map<String, String> getCurrent_branches() {
        return this.current_branches;
    }

    public final RequiresActionDetails getPending_action() {
        return this.pending_action;
    }

    public final PostTurnSummary getPost_turn_summary() {
        return this.post_turn_summary;
    }

    public final Boolean getSlack_channel_is_private() {
        return this.slack_channel_is_private;
    }

    public final String getSlack_channel_name() {
        return this.slack_channel_name;
    }

    public final String getSlack_permalink() {
        return this.slack_permalink;
    }

    public final String getTask_summary() {
        return this.task_summary;
    }

    public final String getValidatedSlackUrl() {
        String str = this.slack_permalink;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                try {
                    URI uri = new URI(str);
                    String host = uri.getHost();
                    if (host != null && x44.r(uri.getScheme(), "https") && uri.getUserInfo() == null && uri.getPort() == -1 && (host.equals("slack.com") || isg.h0(host, ".slack.com", false))) {
                        return str;
                    }
                } catch (URISyntaxException unused) {
                }
            }
        }
        return null;
    }

    public int hashCode() {
        RequiresActionDetails requiresActionDetails = this.pending_action;
        int iHashCode = (requiresActionDetails == null ? 0 : requiresActionDetails.hashCode()) * 31;
        Map<String, String> map = this.current_branches;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        PostTurnSummary postTurnSummary = this.post_turn_summary;
        int iHashCode3 = (iHashCode2 + (postTurnSummary == null ? 0 : postTurnSummary.hashCode())) * 31;
        String str = this.task_summary;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.slack_permalink;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slack_channel_name;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.slack_channel_is_private;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        RequiresActionDetails requiresActionDetails = this.pending_action;
        Map<String, String> map = this.current_branches;
        PostTurnSummary postTurnSummary = this.post_turn_summary;
        String str = this.task_summary;
        String str2 = this.slack_permalink;
        String str3 = this.slack_channel_name;
        Boolean bool = this.slack_channel_is_private;
        StringBuilder sb = new StringBuilder("SessionExternalMetadata(pending_action=");
        sb.append(requiresActionDetails);
        sb.append(", current_branches=");
        sb.append(map);
        sb.append(", post_turn_summary=");
        sb.append(postTurnSummary);
        sb.append(", task_summary=");
        sb.append(str);
        sb.append(", slack_permalink=");
        kgh.u(sb, str2, ", slack_channel_name=", str3, ", slack_channel_is_private=");
        return qy1.h(sb, bool, ")");
    }

    public SessionExternalMetadata() {
        this((RequiresActionDetails) null, (Map) null, (PostTurnSummary) null, (String) null, (String) null, (String) null, (Boolean) null, 127, (mq5) null);
    }

    public SessionExternalMetadata(RequiresActionDetails requiresActionDetails, Map<String, String> map, PostTurnSummary postTurnSummary, String str, String str2, String str3, Boolean bool) {
        this.pending_action = requiresActionDetails;
        this.current_branches = map;
        this.post_turn_summary = postTurnSummary;
        this.task_summary = str;
        this.slack_permalink = str2;
        this.slack_channel_name = str3;
        this.slack_channel_is_private = bool;
    }

    public /* synthetic */ SessionExternalMetadata(RequiresActionDetails requiresActionDetails, Map map, PostTurnSummary postTurnSummary, String str, String str2, String str3, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : requiresActionDetails, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : postTurnSummary, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bool);
    }
}
