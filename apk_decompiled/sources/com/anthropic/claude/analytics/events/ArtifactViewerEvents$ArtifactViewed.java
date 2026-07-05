package com.anthropic.claude.analytics.events;

import defpackage.cu0;
import defpackage.du0;
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
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@AB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'JP\u0010(\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b:\u0010$R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u0014\u0010>\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\"¨\u0006B"}, d2 = {"com/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult;", "result", "Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind;", "artifact_kind", "", "artifact_type", "", "content_ready_ms", "render_ready_ms", "duration_ms", "<init>", "(Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult;Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult;Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLvnf;)V", "Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult;", "component2", "()Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Long;", "component5", "component6", "()J", "copy", "(Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult;Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactViewResult;", "getResult", "Lcom/anthropic/claude/analytics/events/ArtifactViewerEvents$ArtifactKind;", "getArtifact_kind", "Ljava/lang/String;", "getArtifact_type", "Ljava/lang/Long;", "getContent_ready_ms", "getRender_ready_ms", "J", "getDuration_ms", "getEventName", "eventName", "Companion", "cu0", "du0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactViewerEvents$ArtifactViewed implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final du0 Companion = new du0();
    private final ArtifactViewerEvents$ArtifactKind artifact_kind;
    private final String artifact_type;
    private final Long content_ready_ms;
    private final long duration_ms;
    private final Long render_ready_ms;
    private final ArtifactViewerEvents$ArtifactViewResult result;

    static {
        os0 os0Var = new os0(24);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, os0Var), yb5.w(w1aVar, new os0(25)), null, null, null, null};
    }

    public /* synthetic */ ArtifactViewerEvents$ArtifactViewed(int i, ArtifactViewerEvents$ArtifactViewResult artifactViewerEvents$ArtifactViewResult, ArtifactViewerEvents$ArtifactKind artifactViewerEvents$ArtifactKind, String str, Long l, Long l2, long j, vnf vnfVar) {
        if (39 != (i & 39)) {
            gvj.f(i, 39, cu0.a.getDescriptor());
            throw null;
        }
        this.result = artifactViewerEvents$ArtifactViewResult;
        this.artifact_kind = artifactViewerEvents$ArtifactKind;
        this.artifact_type = str;
        if ((i & 8) == 0) {
            this.content_ready_ms = null;
        } else {
            this.content_ready_ms = l;
        }
        if ((i & 16) == 0) {
            this.render_ready_ms = null;
        } else {
            this.render_ready_ms = l2;
        }
        this.duration_ms = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ArtifactViewerEvents$ArtifactViewResult.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ArtifactViewerEvents$ArtifactKind.Companion.serializer();
    }

    public static /* synthetic */ ArtifactViewerEvents$ArtifactViewed copy$default(ArtifactViewerEvents$ArtifactViewed artifactViewerEvents$ArtifactViewed, ArtifactViewerEvents$ArtifactViewResult artifactViewerEvents$ArtifactViewResult, ArtifactViewerEvents$ArtifactKind artifactViewerEvents$ArtifactKind, String str, Long l, Long l2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            artifactViewerEvents$ArtifactViewResult = artifactViewerEvents$ArtifactViewed.result;
        }
        if ((i & 2) != 0) {
            artifactViewerEvents$ArtifactKind = artifactViewerEvents$ArtifactViewed.artifact_kind;
        }
        if ((i & 4) != 0) {
            str = artifactViewerEvents$ArtifactViewed.artifact_type;
        }
        if ((i & 8) != 0) {
            l = artifactViewerEvents$ArtifactViewed.content_ready_ms;
        }
        if ((i & 16) != 0) {
            l2 = artifactViewerEvents$ArtifactViewed.render_ready_ms;
        }
        if ((i & 32) != 0) {
            j = artifactViewerEvents$ArtifactViewed.duration_ms;
        }
        long j2 = j;
        Long l3 = l2;
        String str2 = str;
        return artifactViewerEvents$ArtifactViewed.copy(artifactViewerEvents$ArtifactViewResult, artifactViewerEvents$ArtifactKind, str2, l, l3, j2);
    }

    public static final /* synthetic */ void write$Self$analytics(ArtifactViewerEvents$ArtifactViewed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.result);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.artifact_kind);
        output.q(serialDesc, 2, self.artifact_type);
        if (output.E(serialDesc) || self.content_ready_ms != null) {
            output.B(serialDesc, 3, xka.a, self.content_ready_ms);
        }
        if (output.E(serialDesc) || self.render_ready_ms != null) {
            output.B(serialDesc, 4, xka.a, self.render_ready_ms);
        }
        output.D(serialDesc, 5, self.duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ArtifactViewerEvents$ArtifactViewResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ArtifactViewerEvents$ArtifactKind getArtifact_kind() {
        return this.artifact_kind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getContent_ready_ms() {
        return this.content_ready_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getRender_ready_ms() {
        return this.render_ready_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final ArtifactViewerEvents$ArtifactViewed copy(ArtifactViewerEvents$ArtifactViewResult result, ArtifactViewerEvents$ArtifactKind artifact_kind, String artifact_type, Long content_ready_ms, Long render_ready_ms, long duration_ms) {
        result.getClass();
        artifact_kind.getClass();
        artifact_type.getClass();
        return new ArtifactViewerEvents$ArtifactViewed(result, artifact_kind, artifact_type, content_ready_ms, render_ready_ms, duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactViewerEvents$ArtifactViewed)) {
            return false;
        }
        ArtifactViewerEvents$ArtifactViewed artifactViewerEvents$ArtifactViewed = (ArtifactViewerEvents$ArtifactViewed) other;
        return this.result == artifactViewerEvents$ArtifactViewed.result && this.artifact_kind == artifactViewerEvents$ArtifactViewed.artifact_kind && x44.r(this.artifact_type, artifactViewerEvents$ArtifactViewed.artifact_type) && x44.r(this.content_ready_ms, artifactViewerEvents$ArtifactViewed.content_ready_ms) && x44.r(this.render_ready_ms, artifactViewerEvents$ArtifactViewed.render_ready_ms) && this.duration_ms == artifactViewerEvents$ArtifactViewed.duration_ms;
    }

    public final ArtifactViewerEvents$ArtifactKind getArtifact_kind() {
        return this.artifact_kind;
    }

    public final String getArtifact_type() {
        return this.artifact_type;
    }

    public final Long getContent_ready_ms() {
        return this.content_ready_ms;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_artifact_viewed";
    }

    public final Long getRender_ready_ms() {
        return this.render_ready_ms;
    }

    public final ArtifactViewerEvents$ArtifactViewResult getResult() {
        return this.result;
    }

    public int hashCode() {
        int iL = kgh.l((this.artifact_kind.hashCode() + (this.result.hashCode() * 31)) * 31, 31, this.artifact_type);
        Long l = this.content_ready_ms;
        int iHashCode = (iL + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.render_ready_ms;
        return Long.hashCode(this.duration_ms) + ((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ArtifactViewed(result=" + this.result + ", artifact_kind=" + this.artifact_kind + ", artifact_type=" + this.artifact_type + ", content_ready_ms=" + this.content_ready_ms + ", render_ready_ms=" + this.render_ready_ms + ", duration_ms=" + this.duration_ms + ")";
    }

    public ArtifactViewerEvents$ArtifactViewed(ArtifactViewerEvents$ArtifactViewResult artifactViewerEvents$ArtifactViewResult, ArtifactViewerEvents$ArtifactKind artifactViewerEvents$ArtifactKind, String str, Long l, Long l2, long j) {
        artifactViewerEvents$ArtifactViewResult.getClass();
        artifactViewerEvents$ArtifactKind.getClass();
        str.getClass();
        this.result = artifactViewerEvents$ArtifactViewResult;
        this.artifact_kind = artifactViewerEvents$ArtifactKind;
        this.artifact_type = str;
        this.content_ready_ms = l;
        this.render_ready_ms = l2;
        this.duration_ms = j;
    }

    public /* synthetic */ ArtifactViewerEvents$ArtifactViewed(ArtifactViewerEvents$ArtifactViewResult artifactViewerEvents$ArtifactViewResult, ArtifactViewerEvents$ArtifactKind artifactViewerEvents$ArtifactKind, String str, Long l, Long l2, long j, int i, mq5 mq5Var) {
        this(artifactViewerEvents$ArtifactViewResult, artifactViewerEvents$ArtifactKind, str, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, j);
    }
}
