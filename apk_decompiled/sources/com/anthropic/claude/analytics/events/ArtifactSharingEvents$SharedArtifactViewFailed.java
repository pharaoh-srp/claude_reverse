package com.anthropic.claude.analytics.events;

import defpackage.at0;
import defpackage.e79;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import defpackage.zs0;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%Jb\u0010&\u001a\u00020\u00122\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%R\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001d¨\u0006?"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "artifact_uuid", "viewer_organization_uuid", "cause", "error_message", "error_type", "", "error_http_code", "", "time_to_failure_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArtifact_uuid", "getViewer_organization_uuid", "getCause", "getError_message", "getError_type", "Ljava/lang/Integer;", "getError_http_code", "Ljava/lang/Long;", "getTime_to_failure_ms", "getEventName", "eventName", "Companion", "zs0", "at0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactSharingEvents$SharedArtifactViewFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final at0 Companion = new at0();
    private final String artifact_uuid;
    private final String cause;
    private final Integer error_http_code;
    private final String error_message;
    private final String error_type;
    private final Long time_to_failure_ms;
    private final String viewer_organization_uuid;

    public /* synthetic */ ArtifactSharingEvents$SharedArtifactViewFailed(int i, String str, String str2, String str3, String str4, String str5, Integer num, Long l, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, zs0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.artifact_uuid = null;
        } else {
            this.artifact_uuid = str;
        }
        if ((i & 2) == 0) {
            this.viewer_organization_uuid = null;
        } else {
            this.viewer_organization_uuid = str2;
        }
        this.cause = str3;
        if ((i & 8) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str4;
        }
        if ((i & 16) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str5;
        }
        if ((i & 32) == 0) {
            this.error_http_code = null;
        } else {
            this.error_http_code = num;
        }
        if ((i & 64) == 0) {
            this.time_to_failure_ms = null;
        } else {
            this.time_to_failure_ms = l;
        }
    }

    public static /* synthetic */ ArtifactSharingEvents$SharedArtifactViewFailed copy$default(ArtifactSharingEvents$SharedArtifactViewFailed artifactSharingEvents$SharedArtifactViewFailed, String str, String str2, String str3, String str4, String str5, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingEvents$SharedArtifactViewFailed.artifact_uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingEvents$SharedArtifactViewFailed.viewer_organization_uuid;
        }
        if ((i & 4) != 0) {
            str3 = artifactSharingEvents$SharedArtifactViewFailed.cause;
        }
        if ((i & 8) != 0) {
            str4 = artifactSharingEvents$SharedArtifactViewFailed.error_message;
        }
        if ((i & 16) != 0) {
            str5 = artifactSharingEvents$SharedArtifactViewFailed.error_type;
        }
        if ((i & 32) != 0) {
            num = artifactSharingEvents$SharedArtifactViewFailed.error_http_code;
        }
        if ((i & 64) != 0) {
            l = artifactSharingEvents$SharedArtifactViewFailed.time_to_failure_ms;
        }
        Integer num2 = num;
        Long l2 = l;
        String str6 = str5;
        String str7 = str3;
        return artifactSharingEvents$SharedArtifactViewFailed.copy(str, str2, str7, str4, str6, num2, l2);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactSharingEvents$SharedArtifactViewFailed self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.artifact_uuid != null) {
            output.B(serialDesc, 0, srg.a, self.artifact_uuid);
        }
        if (output.E(serialDesc) || self.viewer_organization_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.viewer_organization_uuid);
        }
        output.q(serialDesc, 2, self.cause);
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 3, srg.a, self.error_message);
        }
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 4, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_http_code != null) {
            output.B(serialDesc, 5, e79.a, self.error_http_code);
        }
        if (!output.E(serialDesc) && self.time_to_failure_ms == null) {
            return;
        }
        output.B(serialDesc, 6, xka.a, self.time_to_failure_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getError_http_code() {
        return this.error_http_code;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getTime_to_failure_ms() {
        return this.time_to_failure_ms;
    }

    public final ArtifactSharingEvents$SharedArtifactViewFailed copy(String artifact_uuid, String viewer_organization_uuid, String cause, String error_message, String error_type, Integer error_http_code, Long time_to_failure_ms) {
        cause.getClass();
        return new ArtifactSharingEvents$SharedArtifactViewFailed(artifact_uuid, viewer_organization_uuid, cause, error_message, error_type, error_http_code, time_to_failure_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactSharingEvents$SharedArtifactViewFailed)) {
            return false;
        }
        ArtifactSharingEvents$SharedArtifactViewFailed artifactSharingEvents$SharedArtifactViewFailed = (ArtifactSharingEvents$SharedArtifactViewFailed) other;
        return x44.r(this.artifact_uuid, artifactSharingEvents$SharedArtifactViewFailed.artifact_uuid) && x44.r(this.viewer_organization_uuid, artifactSharingEvents$SharedArtifactViewFailed.viewer_organization_uuid) && x44.r(this.cause, artifactSharingEvents$SharedArtifactViewFailed.cause) && x44.r(this.error_message, artifactSharingEvents$SharedArtifactViewFailed.error_message) && x44.r(this.error_type, artifactSharingEvents$SharedArtifactViewFailed.error_type) && x44.r(this.error_http_code, artifactSharingEvents$SharedArtifactViewFailed.error_http_code) && x44.r(this.time_to_failure_ms, artifactSharingEvents$SharedArtifactViewFailed.time_to_failure_ms);
    }

    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    public final String getCause() {
        return this.cause;
    }

    public final Integer getError_http_code() {
        return this.error_http_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_type() {
        return this.error_type;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_shared_artifact_view_failed";
    }

    public final Long getTime_to_failure_ms() {
        return this.time_to_failure_ms;
    }

    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    public int hashCode() {
        String str = this.artifact_uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.viewer_organization_uuid;
        int iL = kgh.l((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.cause);
        String str3 = this.error_message;
        int iHashCode2 = (iL + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error_type;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.error_http_code;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.time_to_failure_ms;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.artifact_uuid;
        String str2 = this.viewer_organization_uuid;
        String str3 = this.cause;
        String str4 = this.error_message;
        String str5 = this.error_type;
        Integer num = this.error_http_code;
        Long l = this.time_to_failure_ms;
        StringBuilder sbR = kgh.r("SharedArtifactViewFailed(artifact_uuid=", str, ", viewer_organization_uuid=", str2, ", cause=");
        kgh.u(sbR, str3, ", error_message=", str4, ", error_type=");
        sbR.append(str5);
        sbR.append(", error_http_code=");
        sbR.append(num);
        sbR.append(", time_to_failure_ms=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    public ArtifactSharingEvents$SharedArtifactViewFailed(String str, String str2, String str3, String str4, String str5, Integer num, Long l) {
        str3.getClass();
        this.artifact_uuid = str;
        this.viewer_organization_uuid = str2;
        this.cause = str3;
        this.error_message = str4;
        this.error_type = str5;
        this.error_http_code = num;
        this.time_to_failure_ms = l;
    }

    public /* synthetic */ ArtifactSharingEvents$SharedArtifactViewFailed(String str, String str2, String str3, String str4, String str5, Integer num, Long l, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : l);
    }
}
