package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b5;
import defpackage.e79;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms0;
import defpackage.ns0;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J|\u0010%\u001a\u00020$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020$2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b@\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bA\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010#R\u0014\u0010G\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0017¨\u0006K"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "artifact_uuid", "artifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "visibility", "cause", "error_message", "error_type", "", "error_http_code", "", "time_to_failure_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "()Ljava/lang/Long;", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareFailed;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getArtifact_uuid", "getArtifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "getVisibility", "getCause", "getError_message", "getError_type", "Ljava/lang/Integer;", "getError_http_code", "Ljava/lang/Long;", "getTime_to_failure_ms", "getEventName", "eventName", "Companion", "ms0", "ns0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactSharingEvents$ArtifactShareFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String artifact_type;
    private final String artifact_uuid;
    private final String cause;
    private final String conversation_uuid;
    private final Integer error_http_code;
    private final String error_message;
    private final String error_type;
    private final String organization_uuid;
    private final Long time_to_failure_ms;
    private final ArtifactSharingEvents$ArtifactShareVisibility visibility;
    public static final ns0 Companion = new ns0();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new b5(29)), null, null, null, null, null};

    public /* synthetic */ ArtifactSharingEvents$ArtifactShareFailed(int i, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, String str5, String str6, String str7, Integer num, Long l, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, ms0.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.visibility = artifactSharingEvents$ArtifactShareVisibility;
        this.cause = str5;
        if ((i & 64) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str7;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.error_http_code = null;
        } else {
            this.error_http_code = num;
        }
        if ((i & 512) == 0) {
            this.time_to_failure_ms = null;
        } else {
            this.time_to_failure_ms = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactSharingEvents$ArtifactShareVisibility.Companion.serializer();
    }

    public static /* synthetic */ ArtifactSharingEvents$ArtifactShareFailed copy$default(ArtifactSharingEvents$ArtifactShareFailed artifactSharingEvents$ArtifactShareFailed, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, String str5, String str6, String str7, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingEvents$ArtifactShareFailed.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingEvents$ArtifactShareFailed.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = artifactSharingEvents$ArtifactShareFailed.artifact_uuid;
        }
        if ((i & 8) != 0) {
            str4 = artifactSharingEvents$ArtifactShareFailed.artifact_type;
        }
        if ((i & 16) != 0) {
            artifactSharingEvents$ArtifactShareVisibility = artifactSharingEvents$ArtifactShareFailed.visibility;
        }
        if ((i & 32) != 0) {
            str5 = artifactSharingEvents$ArtifactShareFailed.cause;
        }
        if ((i & 64) != 0) {
            str6 = artifactSharingEvents$ArtifactShareFailed.error_message;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str7 = artifactSharingEvents$ArtifactShareFailed.error_type;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            num = artifactSharingEvents$ArtifactShareFailed.error_http_code;
        }
        if ((i & 512) != 0) {
            l = artifactSharingEvents$ArtifactShareFailed.time_to_failure_ms;
        }
        Integer num2 = num;
        Long l2 = l;
        String str8 = str6;
        String str9 = str7;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2 = artifactSharingEvents$ArtifactShareVisibility;
        String str10 = str5;
        return artifactSharingEvents$ArtifactShareFailed.copy(str, str2, str3, str4, artifactSharingEvents$ArtifactShareVisibility2, str10, str8, str9, num2, l2);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactSharingEvents$ArtifactShareFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.artifact_uuid);
        output.q(serialDesc, 3, self.artifact_type);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.visibility);
        output.q(serialDesc, 5, self.cause);
        if (output.E(serialDesc) || self.error_message != null) {
            output.B(serialDesc, 6, srg.a, self.error_message);
        }
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 7, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_http_code != null) {
            output.B(serialDesc, 8, e79.a, self.error_http_code);
        }
        if (!output.E(serialDesc) && self.time_to_failure_ms == null) {
            return;
        }
        output.B(serialDesc, 9, xka.a, self.time_to_failure_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getTime_to_failure_ms() {
        return this.time_to_failure_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ArtifactSharingEvents$ArtifactShareVisibility getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getError_message() {
        return this.error_message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getError_http_code() {
        return this.error_http_code;
    }

    public final ArtifactSharingEvents$ArtifactShareFailed copy(String organization_uuid, String conversation_uuid, String artifact_uuid, String artifact_type, ArtifactSharingEvents$ArtifactShareVisibility visibility, String cause, String error_message, String error_type, Integer error_http_code, Long time_to_failure_ms) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        artifact_uuid.getClass();
        artifact_type.getClass();
        visibility.getClass();
        cause.getClass();
        return new ArtifactSharingEvents$ArtifactShareFailed(organization_uuid, conversation_uuid, artifact_uuid, artifact_type, visibility, cause, error_message, error_type, error_http_code, time_to_failure_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactSharingEvents$ArtifactShareFailed)) {
            return false;
        }
        ArtifactSharingEvents$ArtifactShareFailed artifactSharingEvents$ArtifactShareFailed = (ArtifactSharingEvents$ArtifactShareFailed) other;
        return x44.r(this.organization_uuid, artifactSharingEvents$ArtifactShareFailed.organization_uuid) && x44.r(this.conversation_uuid, artifactSharingEvents$ArtifactShareFailed.conversation_uuid) && x44.r(this.artifact_uuid, artifactSharingEvents$ArtifactShareFailed.artifact_uuid) && x44.r(this.artifact_type, artifactSharingEvents$ArtifactShareFailed.artifact_type) && this.visibility == artifactSharingEvents$ArtifactShareFailed.visibility && x44.r(this.cause, artifactSharingEvents$ArtifactShareFailed.cause) && x44.r(this.error_message, artifactSharingEvents$ArtifactShareFailed.error_message) && x44.r(this.error_type, artifactSharingEvents$ArtifactShareFailed.error_type) && x44.r(this.error_http_code, artifactSharingEvents$ArtifactShareFailed.error_http_code) && x44.r(this.time_to_failure_ms, artifactSharingEvents$ArtifactShareFailed.time_to_failure_ms);
    }

    public final String getArtifact_type() {
        return this.artifact_type;
    }

    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    public final String getCause() {
        return this.cause;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
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
        return "mobile_artifact_share_failed";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final Long getTime_to_failure_ms() {
        return this.time_to_failure_ms;
    }

    public final ArtifactSharingEvents$ArtifactShareVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iL = kgh.l((this.visibility.hashCode() + kgh.l(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.artifact_uuid), 31, this.artifact_type)) * 31, 31, this.cause);
        String str = this.error_message;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.error_http_code;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.time_to_failure_ms;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.artifact_uuid;
        String str4 = this.artifact_type;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = this.visibility;
        String str5 = this.cause;
        String str6 = this.error_message;
        String str7 = this.error_type;
        Integer num = this.error_http_code;
        Long l = this.time_to_failure_ms;
        StringBuilder sbR = kgh.r("ArtifactShareFailed(organization_uuid=", str, ", conversation_uuid=", str2, ", artifact_uuid=");
        kgh.u(sbR, str3, ", artifact_type=", str4, ", visibility=");
        sbR.append(artifactSharingEvents$ArtifactShareVisibility);
        sbR.append(", cause=");
        sbR.append(str5);
        sbR.append(", error_message=");
        kgh.u(sbR, str6, ", error_type=", str7, ", error_http_code=");
        sbR.append(num);
        sbR.append(", time_to_failure_ms=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    public ArtifactSharingEvents$ArtifactShareFailed(String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, String str5, String str6, String str7, Integer num, Long l) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        artifactSharingEvents$ArtifactShareVisibility.getClass();
        str5.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.visibility = artifactSharingEvents$ArtifactShareVisibility;
        this.cause = str5;
        this.error_message = str6;
        this.error_type = str7;
        this.error_http_code = num;
        this.time_to_failure_ms = l;
    }

    public /* synthetic */ ArtifactSharingEvents$ArtifactShareFailed(String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, String str5, String str6, String str7, Integer num, Long l, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, artifactSharingEvents$ArtifactShareVisibility, str5, (i & 64) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str7, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : num, (i & 512) != 0 ? null : l);
    }
}
