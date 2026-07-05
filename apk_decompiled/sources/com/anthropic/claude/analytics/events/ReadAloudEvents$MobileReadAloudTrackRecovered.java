package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w2e;
import defpackage.x2e;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudTrackRecovered", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "message_id", "", "attempt", "write_error", "skipped_frames", "<init>", "(Ljava/lang/String;III)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IIILvnf;)V", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudTrackRecovered;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudTrackRecovered;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "copy", "(Ljava/lang/String;III)Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudTrackRecovered;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_id", "I", "getAttempt", "getWrite_error", "getSkipped_frames", "getEventName", "eventName", "Companion", "w2e", "x2e", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReadAloudEvents$MobileReadAloudTrackRecovered implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final x2e Companion = new x2e();
    private final int attempt;
    private final String message_id;
    private final int skipped_frames;
    private final int write_error;

    public /* synthetic */ ReadAloudEvents$MobileReadAloudTrackRecovered(int i, String str, int i2, int i3, int i4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, w2e.a.getDescriptor());
            throw null;
        }
        this.message_id = str;
        this.attempt = i2;
        this.write_error = i3;
        this.skipped_frames = i4;
    }

    public static /* synthetic */ ReadAloudEvents$MobileReadAloudTrackRecovered copy$default(ReadAloudEvents$MobileReadAloudTrackRecovered readAloudEvents$MobileReadAloudTrackRecovered, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = readAloudEvents$MobileReadAloudTrackRecovered.message_id;
        }
        if ((i4 & 2) != 0) {
            i = readAloudEvents$MobileReadAloudTrackRecovered.attempt;
        }
        if ((i4 & 4) != 0) {
            i2 = readAloudEvents$MobileReadAloudTrackRecovered.write_error;
        }
        if ((i4 & 8) != 0) {
            i3 = readAloudEvents$MobileReadAloudTrackRecovered.skipped_frames;
        }
        return readAloudEvents$MobileReadAloudTrackRecovered.copy(str, i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$analytics(ReadAloudEvents$MobileReadAloudTrackRecovered self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.message_id);
        output.l(1, self.attempt, serialDesc);
        output.l(2, self.write_error, serialDesc);
        output.l(3, self.skipped_frames, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAttempt() {
        return this.attempt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWrite_error() {
        return this.write_error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSkipped_frames() {
        return this.skipped_frames;
    }

    public final ReadAloudEvents$MobileReadAloudTrackRecovered copy(String message_id, int attempt, int write_error, int skipped_frames) {
        message_id.getClass();
        return new ReadAloudEvents$MobileReadAloudTrackRecovered(message_id, attempt, write_error, skipped_frames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadAloudEvents$MobileReadAloudTrackRecovered)) {
            return false;
        }
        ReadAloudEvents$MobileReadAloudTrackRecovered readAloudEvents$MobileReadAloudTrackRecovered = (ReadAloudEvents$MobileReadAloudTrackRecovered) other;
        return x44.r(this.message_id, readAloudEvents$MobileReadAloudTrackRecovered.message_id) && this.attempt == readAloudEvents$MobileReadAloudTrackRecovered.attempt && this.write_error == readAloudEvents$MobileReadAloudTrackRecovered.write_error && this.skipped_frames == readAloudEvents$MobileReadAloudTrackRecovered.skipped_frames;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_read_aloud_track_recovered";
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final int getSkipped_frames() {
        return this.skipped_frames;
    }

    public final int getWrite_error() {
        return this.write_error;
    }

    public int hashCode() {
        return Integer.hashCode(this.skipped_frames) + vb7.c(this.write_error, vb7.c(this.attempt, this.message_id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.message_id;
        int i = this.attempt;
        int i2 = this.write_error;
        int i3 = this.skipped_frames;
        StringBuilder sbP = ij0.p("MobileReadAloudTrackRecovered(message_id=", str, i, ", attempt=", ", write_error=");
        sbP.append(i2);
        sbP.append(", skipped_frames=");
        sbP.append(i3);
        sbP.append(")");
        return sbP.toString();
    }

    public ReadAloudEvents$MobileReadAloudTrackRecovered(String str, int i, int i2, int i3) {
        str.getClass();
        this.message_id = str;
        this.attempt = i;
        this.write_error = i2;
        this.skipped_frames = i3;
    }
}
