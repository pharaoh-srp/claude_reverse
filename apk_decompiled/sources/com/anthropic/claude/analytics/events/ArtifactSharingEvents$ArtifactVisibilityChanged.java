package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.os0;
import defpackage.us0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs0;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!JL\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b4\u0010!R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactVisibilityChanged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "artifact_uuid", "artifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "from_visibility", "to_visibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactVisibilityChanged;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactVisibilityChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;)Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactVisibilityChanged;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getArtifact_uuid", "getArtifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "getFrom_visibility", "getTo_visibility", "getEventName", "eventName", "Companion", "us0", "vs0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactSharingEvents$ArtifactVisibilityChanged implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final vs0 Companion = new vs0();
    private final String artifact_type;
    private final String artifact_uuid;
    private final String conversation_uuid;
    private final ArtifactSharingEvents$ArtifactShareVisibility from_visibility;
    private final String organization_uuid;
    private final ArtifactSharingEvents$ArtifactShareVisibility to_visibility;

    static {
        os0 os0Var = new os0(4);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, os0Var), yb5.w(w1aVar, new os0(5))};
    }

    public ArtifactSharingEvents$ArtifactVisibilityChanged(String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        artifactSharingEvents$ArtifactShareVisibility.getClass();
        artifactSharingEvents$ArtifactShareVisibility2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.from_visibility = artifactSharingEvents$ArtifactShareVisibility;
        this.to_visibility = artifactSharingEvents$ArtifactShareVisibility2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactSharingEvents$ArtifactShareVisibility.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ArtifactSharingEvents$ArtifactShareVisibility.Companion.serializer();
    }

    public static /* synthetic */ ArtifactSharingEvents$ArtifactVisibilityChanged copy$default(ArtifactSharingEvents$ArtifactVisibilityChanged artifactSharingEvents$ArtifactVisibilityChanged, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingEvents$ArtifactVisibilityChanged.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingEvents$ArtifactVisibilityChanged.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = artifactSharingEvents$ArtifactVisibilityChanged.artifact_uuid;
        }
        if ((i & 8) != 0) {
            str4 = artifactSharingEvents$ArtifactVisibilityChanged.artifact_type;
        }
        if ((i & 16) != 0) {
            artifactSharingEvents$ArtifactShareVisibility = artifactSharingEvents$ArtifactVisibilityChanged.from_visibility;
        }
        if ((i & 32) != 0) {
            artifactSharingEvents$ArtifactShareVisibility2 = artifactSharingEvents$ArtifactVisibilityChanged.to_visibility;
        }
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility3 = artifactSharingEvents$ArtifactShareVisibility;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility4 = artifactSharingEvents$ArtifactShareVisibility2;
        return artifactSharingEvents$ArtifactVisibilityChanged.copy(str, str2, str3, str4, artifactSharingEvents$ArtifactShareVisibility3, artifactSharingEvents$ArtifactShareVisibility4);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactSharingEvents$ArtifactVisibilityChanged self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.artifact_uuid);
        output.q(serialDesc, 3, self.artifact_type);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.from_visibility);
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.to_visibility);
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
    public final ArtifactSharingEvents$ArtifactShareVisibility getFrom_visibility() {
        return this.from_visibility;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ArtifactSharingEvents$ArtifactShareVisibility getTo_visibility() {
        return this.to_visibility;
    }

    public final ArtifactSharingEvents$ArtifactVisibilityChanged copy(String organization_uuid, String conversation_uuid, String artifact_uuid, String artifact_type, ArtifactSharingEvents$ArtifactShareVisibility from_visibility, ArtifactSharingEvents$ArtifactShareVisibility to_visibility) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        artifact_uuid.getClass();
        artifact_type.getClass();
        from_visibility.getClass();
        to_visibility.getClass();
        return new ArtifactSharingEvents$ArtifactVisibilityChanged(organization_uuid, conversation_uuid, artifact_uuid, artifact_type, from_visibility, to_visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactSharingEvents$ArtifactVisibilityChanged)) {
            return false;
        }
        ArtifactSharingEvents$ArtifactVisibilityChanged artifactSharingEvents$ArtifactVisibilityChanged = (ArtifactSharingEvents$ArtifactVisibilityChanged) other;
        return x44.r(this.organization_uuid, artifactSharingEvents$ArtifactVisibilityChanged.organization_uuid) && x44.r(this.conversation_uuid, artifactSharingEvents$ArtifactVisibilityChanged.conversation_uuid) && x44.r(this.artifact_uuid, artifactSharingEvents$ArtifactVisibilityChanged.artifact_uuid) && x44.r(this.artifact_type, artifactSharingEvents$ArtifactVisibilityChanged.artifact_type) && this.from_visibility == artifactSharingEvents$ArtifactVisibilityChanged.from_visibility && this.to_visibility == artifactSharingEvents$ArtifactVisibilityChanged.to_visibility;
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
        return "mobile_artifact_visibility_changed";
    }

    public final ArtifactSharingEvents$ArtifactShareVisibility getFrom_visibility() {
        return this.from_visibility;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ArtifactSharingEvents$ArtifactShareVisibility getTo_visibility() {
        return this.to_visibility;
    }

    public int hashCode() {
        return this.to_visibility.hashCode() + ((this.from_visibility.hashCode() + kgh.l(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.artifact_uuid), 31, this.artifact_type)) * 31);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.artifact_uuid;
        String str4 = this.artifact_type;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = this.from_visibility;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2 = this.to_visibility;
        StringBuilder sbR = kgh.r("ArtifactVisibilityChanged(organization_uuid=", str, ", conversation_uuid=", str2, ", artifact_uuid=");
        kgh.u(sbR, str3, ", artifact_type=", str4, ", from_visibility=");
        sbR.append(artifactSharingEvents$ArtifactShareVisibility);
        sbR.append(", to_visibility=");
        sbR.append(artifactSharingEvents$ArtifactShareVisibility2);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ArtifactSharingEvents$ArtifactVisibilityChanged(int i, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, us0.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.from_visibility = artifactSharingEvents$ArtifactShareVisibility;
        this.to_visibility = artifactSharingEvents$ArtifactShareVisibility2;
    }
}
