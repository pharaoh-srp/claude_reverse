package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.os0;
import defpackage.ps0;
import defpackage.qs0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001d¨\u0006="}, d2 = {"com/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareScreenOpened", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "artifact_uuid", "artifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "current_visibility", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "screen_source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Lcom/anthropic/claude/analytics/events/ScreenSource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Lcom/anthropic/claude/analytics/events/ScreenSource;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareScreenOpened;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareScreenOpened;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "component6", "()Lcom/anthropic/claude/analytics/events/ScreenSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;Lcom/anthropic/claude/analytics/events/ScreenSource;)Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareScreenOpened;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getArtifact_uuid", "getArtifact_type", "Lcom/anthropic/claude/analytics/events/ArtifactSharingEvents$ArtifactShareVisibility;", "getCurrent_visibility", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "getScreen_source", "getEventName", "eventName", "Companion", "ps0", "qs0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactSharingEvents$ArtifactShareScreenOpened implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final qs0 Companion = new qs0();
    private final String artifact_type;
    private final String artifact_uuid;
    private final String conversation_uuid;
    private final ArtifactSharingEvents$ArtifactShareVisibility current_visibility;
    private final String organization_uuid;
    private final ScreenSource screen_source;

    static {
        os0 os0Var = new os0(0);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, os0Var), yb5.w(w1aVar, new os0(1))};
    }

    public /* synthetic */ ArtifactSharingEvents$ArtifactShareScreenOpened(int i, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, ScreenSource screenSource, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, ps0.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.current_visibility = artifactSharingEvents$ArtifactShareVisibility;
        if ((i & 32) == 0) {
            this.screen_source = null;
        } else {
            this.screen_source = screenSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactSharingEvents$ArtifactShareVisibility.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ScreenSource.Companion.serializer();
    }

    public static /* synthetic */ ArtifactSharingEvents$ArtifactShareScreenOpened copy$default(ArtifactSharingEvents$ArtifactShareScreenOpened artifactSharingEvents$ArtifactShareScreenOpened, String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, ScreenSource screenSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingEvents$ArtifactShareScreenOpened.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingEvents$ArtifactShareScreenOpened.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = artifactSharingEvents$ArtifactShareScreenOpened.artifact_uuid;
        }
        if ((i & 8) != 0) {
            str4 = artifactSharingEvents$ArtifactShareScreenOpened.artifact_type;
        }
        if ((i & 16) != 0) {
            artifactSharingEvents$ArtifactShareVisibility = artifactSharingEvents$ArtifactShareScreenOpened.current_visibility;
        }
        if ((i & 32) != 0) {
            screenSource = artifactSharingEvents$ArtifactShareScreenOpened.screen_source;
        }
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2 = artifactSharingEvents$ArtifactShareVisibility;
        ScreenSource screenSource2 = screenSource;
        return artifactSharingEvents$ArtifactShareScreenOpened.copy(str, str2, str3, str4, artifactSharingEvents$ArtifactShareVisibility2, screenSource2);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactSharingEvents$ArtifactShareScreenOpened self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.artifact_uuid);
        output.q(serialDesc, 3, self.artifact_type);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.current_visibility);
        if (!output.E(serialDesc) && self.screen_source == null) {
            return;
        }
        output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.screen_source);
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
    public final ArtifactSharingEvents$ArtifactShareVisibility getCurrent_visibility() {
        return this.current_visibility;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    public final ArtifactSharingEvents$ArtifactShareScreenOpened copy(String organization_uuid, String conversation_uuid, String artifact_uuid, String artifact_type, ArtifactSharingEvents$ArtifactShareVisibility current_visibility, ScreenSource screen_source) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        artifact_uuid.getClass();
        artifact_type.getClass();
        current_visibility.getClass();
        return new ArtifactSharingEvents$ArtifactShareScreenOpened(organization_uuid, conversation_uuid, artifact_uuid, artifact_type, current_visibility, screen_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactSharingEvents$ArtifactShareScreenOpened)) {
            return false;
        }
        ArtifactSharingEvents$ArtifactShareScreenOpened artifactSharingEvents$ArtifactShareScreenOpened = (ArtifactSharingEvents$ArtifactShareScreenOpened) other;
        return x44.r(this.organization_uuid, artifactSharingEvents$ArtifactShareScreenOpened.organization_uuid) && x44.r(this.conversation_uuid, artifactSharingEvents$ArtifactShareScreenOpened.conversation_uuid) && x44.r(this.artifact_uuid, artifactSharingEvents$ArtifactShareScreenOpened.artifact_uuid) && x44.r(this.artifact_type, artifactSharingEvents$ArtifactShareScreenOpened.artifact_type) && this.current_visibility == artifactSharingEvents$ArtifactShareScreenOpened.current_visibility && this.screen_source == artifactSharingEvents$ArtifactShareScreenOpened.screen_source;
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

    public final ArtifactSharingEvents$ArtifactShareVisibility getCurrent_visibility() {
        return this.current_visibility;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_artifact_share_screen_opened";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    public int hashCode() {
        int iHashCode = (this.current_visibility.hashCode() + kgh.l(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.artifact_uuid), 31, this.artifact_type)) * 31;
        ScreenSource screenSource = this.screen_source;
        return iHashCode + (screenSource == null ? 0 : screenSource.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.artifact_uuid;
        String str4 = this.artifact_type;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = this.current_visibility;
        ScreenSource screenSource = this.screen_source;
        StringBuilder sbR = kgh.r("ArtifactShareScreenOpened(organization_uuid=", str, ", conversation_uuid=", str2, ", artifact_uuid=");
        kgh.u(sbR, str3, ", artifact_type=", str4, ", current_visibility=");
        sbR.append(artifactSharingEvents$ArtifactShareVisibility);
        sbR.append(", screen_source=");
        sbR.append(screenSource);
        sbR.append(")");
        return sbR.toString();
    }

    public ArtifactSharingEvents$ArtifactShareScreenOpened(String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, ScreenSource screenSource) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        artifactSharingEvents$ArtifactShareVisibility.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.artifact_uuid = str3;
        this.artifact_type = str4;
        this.current_visibility = artifactSharingEvents$ArtifactShareVisibility;
        this.screen_source = screenSource;
    }

    public /* synthetic */ ArtifactSharingEvents$ArtifactShareScreenOpened(String str, String str2, String str3, String str4, ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility, ScreenSource screenSource, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, artifactSharingEvents$ArtifactShareVisibility, (i & 32) != 0 ? null : screenSource);
    }
}
