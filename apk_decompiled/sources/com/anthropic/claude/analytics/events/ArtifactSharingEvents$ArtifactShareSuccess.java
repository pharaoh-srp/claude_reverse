package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.os0;
import defpackage.rs0;
import defpackage.ss0;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001d¨\u0006="}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "artifact_uuid", "artifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "visibility", "", "share_duration_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareSuccess;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "component6", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareSuccess;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getArtifact_uuid", "getArtifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "getVisibility", "Ljava/lang/Long;", "getShare_duration_ms", "getEventName", "eventName", "Companion", "rs0", "ss0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactSharingEvents$ArtifactShareSuccess implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String artifact_type;
    private final String artifact_uuid;
    private final String conversation_uuid;
    private final String organization_uuid;
    private final Long share_duration_ms;
    private final ArtifactSharingEvents$ArtifactShareVisibility visibility;
    public static final ss0 Companion = new ss0();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new os0(2)), null};

    public /* synthetic */ ArtifactSharingEvents$ArtifactShareSuccess(int i, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, rs0.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.visibility = artifactSharingEvents$ArtifactShareVisibility;
        if ((i & 32) == 0) {
            this.share_duration_ms = null;
        } else {
            this.share_duration_ms = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactSharingEvents$ArtifactShareVisibility.Companion.serializer();
    }

    public static /* synthetic */ ArtifactSharingEvents$ArtifactShareSuccess copy$default(ArtifactSharingEvents$ArtifactShareSuccess artifactSharingEvents$ArtifactShareSuccess, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingEvents$ArtifactShareSuccess.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingEvents$ArtifactShareSuccess.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = artifactSharingEvents$ArtifactShareSuccess.artifact_uuid;
        }
        if ((i & 8) != 0) {
            str4 = artifactSharingEvents$ArtifactShareSuccess.artifact_type;
        }
        if ((i & 16) != 0) {
            artifactSharingEvents$ArtifactShareVisibility = artifactSharingEvents$ArtifactShareSuccess.visibility;
        }
        if ((i & 32) != 0) {
            l = artifactSharingEvents$ArtifactShareSuccess.share_duration_ms;
        }
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2 = artifactSharingEvents$ArtifactShareVisibility;
        Long l2 = l;
        return artifactSharingEvents$ArtifactShareSuccess.copy(str, str2, str3, str4, artifactSharingEvents$ArtifactShareVisibility2, l2);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactSharingEvents$ArtifactShareSuccess self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.artifact_uuid);
        output.q(serialDesc, 3, self.artifact_type);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.visibility);
        if (!output.E(serialDesc) && self.share_duration_ms == null) {
            return;
        }
        output.B(serialDesc, 5, xka.a, self.share_duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
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
    public final Long getShare_duration_ms() {
        return this.share_duration_ms;
    }

    public final ArtifactSharingEvents$ArtifactShareSuccess copy(String organization_uuid, String conversation_uuid, String artifact_uuid, String artifact_type, ArtifactSharingEvents$ArtifactShareVisibility visibility, Long share_duration_ms) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        artifact_uuid.getClass();
        artifact_type.getClass();
        visibility.getClass();
        return new ArtifactSharingEvents$ArtifactShareSuccess(organization_uuid, conversation_uuid, artifact_uuid, artifact_type, visibility, share_duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactSharingEvents$ArtifactShareSuccess)) {
            return false;
        }
        ArtifactSharingEvents$ArtifactShareSuccess artifactSharingEvents$ArtifactShareSuccess = (ArtifactSharingEvents$ArtifactShareSuccess) other;
        return x44.r(this.organization_uuid, artifactSharingEvents$ArtifactShareSuccess.organization_uuid) && x44.r(this.conversation_uuid, artifactSharingEvents$ArtifactShareSuccess.conversation_uuid) && x44.r(this.artifact_uuid, artifactSharingEvents$ArtifactShareSuccess.artifact_uuid) && x44.r(this.artifact_type, artifactSharingEvents$ArtifactShareSuccess.artifact_type) && this.visibility == artifactSharingEvents$ArtifactShareSuccess.visibility && x44.r(this.share_duration_ms, artifactSharingEvents$ArtifactShareSuccess.share_duration_ms);
    }

    public final String getArtifact_type() {
        return this.artifact_type;
    }

    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_artifact_share_success";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final Long getShare_duration_ms() {
        return this.share_duration_ms;
    }

    public final ArtifactSharingEvents$ArtifactShareVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iHashCode = (this.visibility.hashCode() + kgh.l(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.artifact_uuid), 31, this.artifact_type)) * 31;
        Long l = this.share_duration_ms;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.artifact_uuid;
        String str4 = this.artifact_type;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = this.visibility;
        Long l = this.share_duration_ms;
        StringBuilder sbR = kgh.r("ArtifactShareSuccess(organization_uuid=", str, ", conversation_uuid=", str2, ", artifact_uuid=");
        kgh.u(sbR, str3, ", artifact_type=", str4, ", visibility=");
        sbR.append(artifactSharingEvents$ArtifactShareVisibility);
        sbR.append(", share_duration_ms=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    public ArtifactSharingEvents$ArtifactShareSuccess(String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        artifactSharingEvents$ArtifactShareVisibility.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.visibility = artifactSharingEvents$ArtifactShareVisibility;
        this.share_duration_ms = l;
    }

    public /* synthetic */ ArtifactSharingEvents$ArtifactShareSuccess(String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, artifactSharingEvents$ArtifactShareVisibility, (i & 32) != 0 ? null : l);
    }
}
