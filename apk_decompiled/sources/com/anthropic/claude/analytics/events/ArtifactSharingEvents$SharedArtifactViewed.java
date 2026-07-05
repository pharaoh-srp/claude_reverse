package com.anthropic.claude.analytics.events;

import defpackage.bt0;
import defpackage.ct0;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.os0;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "viewer_organization_uuid", "artifact_uuid", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "visibility", "", "load_time_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "component4", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactViewed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getViewer_organization_uuid", "getArtifact_uuid", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "getVisibility", "Ljava/lang/Long;", "getLoad_time_ms", "getEventName", "eventName", "Companion", "bt0", "ct0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactSharingEvents$SharedArtifactViewed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String artifact_uuid;
    private final Long load_time_ms;
    private final String viewer_organization_uuid;
    private final ArtifactSharingEvents$ArtifactShareVisibility visibility;
    public static final ct0 Companion = new ct0();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new os0(8)), null};

    public /* synthetic */ ArtifactSharingEvents$SharedArtifactViewed(int i, String str, String str2, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, bt0.a.getDescriptor());
            throw null;
        }
        this.viewer_organization_uuid = str;
        this.artifact_uuid = str2;
        this.visibility = artifactSharingEvents$ArtifactShareVisibility;
        if ((i & 8) == 0) {
            this.load_time_ms = null;
        } else {
            this.load_time_ms = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactSharingEvents$ArtifactShareVisibility.Companion.serializer();
    }

    public static /* synthetic */ ArtifactSharingEvents$SharedArtifactViewed copy$default(ArtifactSharingEvents$SharedArtifactViewed artifactSharingEvents$SharedArtifactViewed, String str, String str2, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingEvents$SharedArtifactViewed.viewer_organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingEvents$SharedArtifactViewed.artifact_uuid;
        }
        if ((i & 4) != 0) {
            artifactSharingEvents$ArtifactShareVisibility = artifactSharingEvents$SharedArtifactViewed.visibility;
        }
        if ((i & 8) != 0) {
            l = artifactSharingEvents$SharedArtifactViewed.load_time_ms;
        }
        return artifactSharingEvents$SharedArtifactViewed.copy(str, str2, artifactSharingEvents$ArtifactShareVisibility, l);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactSharingEvents$SharedArtifactViewed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.viewer_organization_uuid);
        output.q(serialDesc, 1, self.artifact_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.visibility);
        if (!output.E(serialDesc) && self.load_time_ms == null) {
            return;
        }
        output.B(serialDesc, 3, xka.a, self.load_time_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ArtifactSharingEvents$ArtifactShareVisibility getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLoad_time_ms() {
        return this.load_time_ms;
    }

    public final ArtifactSharingEvents$SharedArtifactViewed copy(String viewer_organization_uuid, String artifact_uuid, ArtifactSharingEvents$ArtifactShareVisibility visibility, Long load_time_ms) {
        viewer_organization_uuid.getClass();
        artifact_uuid.getClass();
        visibility.getClass();
        return new ArtifactSharingEvents$SharedArtifactViewed(viewer_organization_uuid, artifact_uuid, visibility, load_time_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactSharingEvents$SharedArtifactViewed)) {
            return false;
        }
        ArtifactSharingEvents$SharedArtifactViewed artifactSharingEvents$SharedArtifactViewed = (ArtifactSharingEvents$SharedArtifactViewed) other;
        return x44.r(this.viewer_organization_uuid, artifactSharingEvents$SharedArtifactViewed.viewer_organization_uuid) && x44.r(this.artifact_uuid, artifactSharingEvents$SharedArtifactViewed.artifact_uuid) && this.visibility == artifactSharingEvents$SharedArtifactViewed.visibility && x44.r(this.load_time_ms, artifactSharingEvents$SharedArtifactViewed.load_time_ms);
    }

    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_shared_artifact_viewed";
    }

    public final Long getLoad_time_ms() {
        return this.load_time_ms;
    }

    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    public final ArtifactSharingEvents$ArtifactShareVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iHashCode = (this.visibility.hashCode() + kgh.l(this.viewer_organization_uuid.hashCode() * 31, 31, this.artifact_uuid)) * 31;
        Long l = this.load_time_ms;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.viewer_organization_uuid;
        String str2 = this.artifact_uuid;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = this.visibility;
        Long l = this.load_time_ms;
        StringBuilder sbR = kgh.r("SharedArtifactViewed(viewer_organization_uuid=", str, ", artifact_uuid=", str2, ", visibility=");
        sbR.append(artifactSharingEvents$ArtifactShareVisibility);
        sbR.append(", load_time_ms=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    public ArtifactSharingEvents$SharedArtifactViewed(String str, String str2, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l) {
        str.getClass();
        str2.getClass();
        artifactSharingEvents$ArtifactShareVisibility.getClass();
        this.viewer_organization_uuid = str;
        this.artifact_uuid = str2;
        this.visibility = artifactSharingEvents$ArtifactShareVisibility;
        this.load_time_ms = l;
    }

    public /* synthetic */ ArtifactSharingEvents$SharedArtifactViewed(String str, String str2, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, Long l, int i, mq5 mq5Var) {
        this(str, str2, artifactSharingEvents$ArtifactShareVisibility, (i & 8) != 0 ? null : l);
    }
}
