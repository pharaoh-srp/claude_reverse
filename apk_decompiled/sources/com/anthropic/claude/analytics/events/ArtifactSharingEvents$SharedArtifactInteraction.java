package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.os0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.ws0;
import defpackage.x44;
import defpackage.xs0;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteraction", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "viewer_organization_uuid", "artifact_uuid", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType;", "interaction_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteraction;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteraction;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType;)Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteraction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getViewer_organization_uuid", "getArtifact_uuid", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$SharedArtifactInteractionType;", "getInteraction_type", "getEventName", "eventName", "Companion", "ws0", "xs0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactSharingEvents$SharedArtifactInteraction implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String artifact_uuid;
    private final ArtifactSharingEvents$SharedArtifactInteractionType interaction_type;
    private final String viewer_organization_uuid;
    public static final xs0 Companion = new xs0();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new os0(6))};

    public /* synthetic */ ArtifactSharingEvents$SharedArtifactInteraction(int i, String str, String str2, ArtifactSharingEvents$SharedArtifactInteractionType artifactSharingEvents$SharedArtifactInteractionType, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ws0.a.getDescriptor());
            throw null;
        }
        this.viewer_organization_uuid = str;
        this.artifact_uuid = str2;
        this.interaction_type = artifactSharingEvents$SharedArtifactInteractionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactSharingEvents$SharedArtifactInteractionType.Companion.serializer();
    }

    public static /* synthetic */ ArtifactSharingEvents$SharedArtifactInteraction copy$default(ArtifactSharingEvents$SharedArtifactInteraction artifactSharingEvents$SharedArtifactInteraction, String str, String str2, ArtifactSharingEvents$SharedArtifactInteractionType artifactSharingEvents$SharedArtifactInteractionType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingEvents$SharedArtifactInteraction.viewer_organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingEvents$SharedArtifactInteraction.artifact_uuid;
        }
        if ((i & 4) != 0) {
            artifactSharingEvents$SharedArtifactInteractionType = artifactSharingEvents$SharedArtifactInteraction.interaction_type;
        }
        return artifactSharingEvents$SharedArtifactInteraction.copy(str, str2, artifactSharingEvents$SharedArtifactInteractionType);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactSharingEvents$SharedArtifactInteraction self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.viewer_organization_uuid);
        output.q(serialDesc, 1, self.artifact_uuid);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.interaction_type);
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
    public final ArtifactSharingEvents$SharedArtifactInteractionType getInteraction_type() {
        return this.interaction_type;
    }

    public final ArtifactSharingEvents$SharedArtifactInteraction copy(String viewer_organization_uuid, String artifact_uuid, ArtifactSharingEvents$SharedArtifactInteractionType interaction_type) {
        viewer_organization_uuid.getClass();
        artifact_uuid.getClass();
        interaction_type.getClass();
        return new ArtifactSharingEvents$SharedArtifactInteraction(viewer_organization_uuid, artifact_uuid, interaction_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactSharingEvents$SharedArtifactInteraction)) {
            return false;
        }
        ArtifactSharingEvents$SharedArtifactInteraction artifactSharingEvents$SharedArtifactInteraction = (ArtifactSharingEvents$SharedArtifactInteraction) other;
        return x44.r(this.viewer_organization_uuid, artifactSharingEvents$SharedArtifactInteraction.viewer_organization_uuid) && x44.r(this.artifact_uuid, artifactSharingEvents$SharedArtifactInteraction.artifact_uuid) && this.interaction_type == artifactSharingEvents$SharedArtifactInteraction.interaction_type;
    }

    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_shared_artifact_interaction";
    }

    public final ArtifactSharingEvents$SharedArtifactInteractionType getInteraction_type() {
        return this.interaction_type;
    }

    public final String getViewer_organization_uuid() {
        return this.viewer_organization_uuid;
    }

    public int hashCode() {
        return this.interaction_type.hashCode() + kgh.l(this.viewer_organization_uuid.hashCode() * 31, 31, this.artifact_uuid);
    }

    public String toString() {
        String str = this.viewer_organization_uuid;
        String str2 = this.artifact_uuid;
        ArtifactSharingEvents$SharedArtifactInteractionType artifactSharingEvents$SharedArtifactInteractionType = this.interaction_type;
        StringBuilder sbR = kgh.r("SharedArtifactInteraction(viewer_organization_uuid=", str, ", artifact_uuid=", str2, ", interaction_type=");
        sbR.append(artifactSharingEvents$SharedArtifactInteractionType);
        sbR.append(")");
        return sbR.toString();
    }

    public ArtifactSharingEvents$SharedArtifactInteraction(String str, String str2, ArtifactSharingEvents$SharedArtifactInteractionType artifactSharingEvents$SharedArtifactInteractionType) {
        str.getClass();
        str2.getClass();
        artifactSharingEvents$SharedArtifactInteractionType.getClass();
        this.viewer_organization_uuid = str;
        this.artifact_uuid = str2;
        this.interaction_type = artifactSharingEvents$SharedArtifactInteractionType;
    }
}
