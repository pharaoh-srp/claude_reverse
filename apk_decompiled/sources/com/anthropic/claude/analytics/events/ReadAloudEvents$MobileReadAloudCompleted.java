package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.m2e;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n2e;
import defpackage.na6;
import defpackage.onf;
import defpackage.rod;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002WXB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0098\u0001\u0010/\u001a\u00020.2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001cJ\u0010\u00102\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020.2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bG\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bJ\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bQ\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bR\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bS\u0010*R\u0014\u0010U\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u001c¨\u0006Y"}, d2 = {"com/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "message_id", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome;", "outcome", "", "audio_bytes_received", "duration_ms", "", "audio_seconds_played", "expected_audio_seconds", "", "stream_ended_cleanly", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason;", "interrupt_reason", "", "track_recoveries", "ws_reconnects", "buffer_underruns", "min_buffer_ms", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome;JJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome;JJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome;", "component3", "()J", "component4", "component5", "()Ljava/lang/Double;", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "()Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason;", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudCompleted;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome;JJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudCompleted;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ReadAloudEvents$MobileReadAloudCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getMessage_id", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudOutcome;", "getOutcome", "J", "getAudio_bytes_received", "getDuration_ms", "Ljava/lang/Double;", "getAudio_seconds_played", "getExpected_audio_seconds", "Ljava/lang/Boolean;", "getStream_ended_cleanly", "Lcom/anthropic/claude/analytics/events/ReadAloudEvents$ReadAloudInterruptReason;", "getInterrupt_reason", "Ljava/lang/Integer;", "getTrack_recoveries", "getWs_reconnects", "getBuffer_underruns", "getMin_buffer_ms", "getEventName", "eventName", "Companion", "m2e", "n2e", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReadAloudEvents$MobileReadAloudCompleted implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final n2e Companion = new n2e();
    private final long audio_bytes_received;
    private final Double audio_seconds_played;
    private final Integer buffer_underruns;
    private final long duration_ms;
    private final Double expected_audio_seconds;
    private final ReadAloudEvents$ReadAloudInterruptReason interrupt_reason;
    private final String message_id;
    private final Integer min_buffer_ms;
    private final ReadAloudEvents$ReadAloudOutcome outcome;
    private final Boolean stream_ended_cleanly;
    private final Integer track_recoveries;
    private final Integer ws_reconnects;

    static {
        rod rodVar = new rod(17);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, rodVar), null, null, null, null, null, yb5.w(w1aVar, new rod(18)), null, null, null, null};
    }

    public /* synthetic */ ReadAloudEvents$MobileReadAloudCompleted(int i, String str, ReadAloudEvents$ReadAloudOutcome readAloudEvents$ReadAloudOutcome, long j, long j2, Double d, Double d2, Boolean bool, ReadAloudEvents$ReadAloudInterruptReason readAloudEvents$ReadAloudInterruptReason, Integer num, Integer num2, Integer num3, Integer num4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, m2e.a.getDescriptor());
            throw null;
        }
        this.message_id = str;
        this.outcome = readAloudEvents$ReadAloudOutcome;
        this.audio_bytes_received = j;
        this.duration_ms = j2;
        if ((i & 16) == 0) {
            this.audio_seconds_played = null;
        } else {
            this.audio_seconds_played = d;
        }
        if ((i & 32) == 0) {
            this.expected_audio_seconds = null;
        } else {
            this.expected_audio_seconds = d2;
        }
        if ((i & 64) == 0) {
            this.stream_ended_cleanly = null;
        } else {
            this.stream_ended_cleanly = bool;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.interrupt_reason = null;
        } else {
            this.interrupt_reason = readAloudEvents$ReadAloudInterruptReason;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.track_recoveries = null;
        } else {
            this.track_recoveries = num;
        }
        if ((i & 512) == 0) {
            this.ws_reconnects = null;
        } else {
            this.ws_reconnects = num2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.buffer_underruns = null;
        } else {
            this.buffer_underruns = num3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.min_buffer_ms = null;
        } else {
            this.min_buffer_ms = num4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ReadAloudEvents$ReadAloudOutcome.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ReadAloudEvents$ReadAloudInterruptReason.Companion.serializer();
    }

    public static final /* synthetic */ void write$Self$analytics(ReadAloudEvents$MobileReadAloudCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.message_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.outcome);
        output.D(serialDesc, 2, self.audio_bytes_received);
        output.D(serialDesc, 3, self.duration_ms);
        if (output.E(serialDesc) || self.audio_seconds_played != null) {
            output.B(serialDesc, 4, na6.a, self.audio_seconds_played);
        }
        if (output.E(serialDesc) || self.expected_audio_seconds != null) {
            output.B(serialDesc, 5, na6.a, self.expected_audio_seconds);
        }
        if (output.E(serialDesc) || self.stream_ended_cleanly != null) {
            output.B(serialDesc, 6, zt1.a, self.stream_ended_cleanly);
        }
        if (output.E(serialDesc) || self.interrupt_reason != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.interrupt_reason);
        }
        if (output.E(serialDesc) || self.track_recoveries != null) {
            output.B(serialDesc, 8, e79.a, self.track_recoveries);
        }
        if (output.E(serialDesc) || self.ws_reconnects != null) {
            output.B(serialDesc, 9, e79.a, self.ws_reconnects);
        }
        if (output.E(serialDesc) || self.buffer_underruns != null) {
            output.B(serialDesc, 10, e79.a, self.buffer_underruns);
        }
        if (!output.E(serialDesc) && self.min_buffer_ms == null) {
            return;
        }
        output.B(serialDesc, 11, e79.a, self.min_buffer_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getWs_reconnects() {
        return this.ws_reconnects;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getBuffer_underruns() {
        return this.buffer_underruns;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getMin_buffer_ms() {
        return this.min_buffer_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReadAloudEvents$ReadAloudOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAudio_bytes_received() {
        return this.audio_bytes_received;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getAudio_seconds_played() {
        return this.audio_seconds_played;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getExpected_audio_seconds() {
        return this.expected_audio_seconds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getStream_ended_cleanly() {
        return this.stream_ended_cleanly;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ReadAloudEvents$ReadAloudInterruptReason getInterrupt_reason() {
        return this.interrupt_reason;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getTrack_recoveries() {
        return this.track_recoveries;
    }

    public final ReadAloudEvents$MobileReadAloudCompleted copy(String message_id, ReadAloudEvents$ReadAloudOutcome outcome, long audio_bytes_received, long duration_ms, Double audio_seconds_played, Double expected_audio_seconds, Boolean stream_ended_cleanly, ReadAloudEvents$ReadAloudInterruptReason interrupt_reason, Integer track_recoveries, Integer ws_reconnects, Integer buffer_underruns, Integer min_buffer_ms) {
        message_id.getClass();
        outcome.getClass();
        return new ReadAloudEvents$MobileReadAloudCompleted(message_id, outcome, audio_bytes_received, duration_ms, audio_seconds_played, expected_audio_seconds, stream_ended_cleanly, interrupt_reason, track_recoveries, ws_reconnects, buffer_underruns, min_buffer_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadAloudEvents$MobileReadAloudCompleted)) {
            return false;
        }
        ReadAloudEvents$MobileReadAloudCompleted readAloudEvents$MobileReadAloudCompleted = (ReadAloudEvents$MobileReadAloudCompleted) other;
        return x44.r(this.message_id, readAloudEvents$MobileReadAloudCompleted.message_id) && this.outcome == readAloudEvents$MobileReadAloudCompleted.outcome && this.audio_bytes_received == readAloudEvents$MobileReadAloudCompleted.audio_bytes_received && this.duration_ms == readAloudEvents$MobileReadAloudCompleted.duration_ms && x44.r(this.audio_seconds_played, readAloudEvents$MobileReadAloudCompleted.audio_seconds_played) && x44.r(this.expected_audio_seconds, readAloudEvents$MobileReadAloudCompleted.expected_audio_seconds) && x44.r(this.stream_ended_cleanly, readAloudEvents$MobileReadAloudCompleted.stream_ended_cleanly) && this.interrupt_reason == readAloudEvents$MobileReadAloudCompleted.interrupt_reason && x44.r(this.track_recoveries, readAloudEvents$MobileReadAloudCompleted.track_recoveries) && x44.r(this.ws_reconnects, readAloudEvents$MobileReadAloudCompleted.ws_reconnects) && x44.r(this.buffer_underruns, readAloudEvents$MobileReadAloudCompleted.buffer_underruns) && x44.r(this.min_buffer_ms, readAloudEvents$MobileReadAloudCompleted.min_buffer_ms);
    }

    public final long getAudio_bytes_received() {
        return this.audio_bytes_received;
    }

    public final Double getAudio_seconds_played() {
        return this.audio_seconds_played;
    }

    public final Integer getBuffer_underruns() {
        return this.buffer_underruns;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_read_aloud_completed";
    }

    public final Double getExpected_audio_seconds() {
        return this.expected_audio_seconds;
    }

    public final ReadAloudEvents$ReadAloudInterruptReason getInterrupt_reason() {
        return this.interrupt_reason;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final Integer getMin_buffer_ms() {
        return this.min_buffer_ms;
    }

    public final ReadAloudEvents$ReadAloudOutcome getOutcome() {
        return this.outcome;
    }

    public final Boolean getStream_ended_cleanly() {
        return this.stream_ended_cleanly;
    }

    public final Integer getTrack_recoveries() {
        return this.track_recoveries;
    }

    public final Integer getWs_reconnects() {
        return this.ws_reconnects;
    }

    public int hashCode() {
        int iE = vb7.e(vb7.e((this.outcome.hashCode() + (this.message_id.hashCode() * 31)) * 31, 31, this.audio_bytes_received), 31, this.duration_ms);
        Double d = this.audio_seconds_played;
        int iHashCode = (iE + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.expected_audio_seconds;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.stream_ended_cleanly;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ReadAloudEvents$ReadAloudInterruptReason readAloudEvents$ReadAloudInterruptReason = this.interrupt_reason;
        int iHashCode4 = (iHashCode3 + (readAloudEvents$ReadAloudInterruptReason == null ? 0 : readAloudEvents$ReadAloudInterruptReason.hashCode())) * 31;
        Integer num = this.track_recoveries;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ws_reconnects;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buffer_underruns;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.min_buffer_ms;
        return iHashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        String str = this.message_id;
        ReadAloudEvents$ReadAloudOutcome readAloudEvents$ReadAloudOutcome = this.outcome;
        long j = this.audio_bytes_received;
        long j2 = this.duration_ms;
        Double d = this.audio_seconds_played;
        Double d2 = this.expected_audio_seconds;
        Boolean bool = this.stream_ended_cleanly;
        ReadAloudEvents$ReadAloudInterruptReason readAloudEvents$ReadAloudInterruptReason = this.interrupt_reason;
        Integer num = this.track_recoveries;
        Integer num2 = this.ws_reconnects;
        Integer num3 = this.buffer_underruns;
        Integer num4 = this.min_buffer_ms;
        StringBuilder sb = new StringBuilder("MobileReadAloudCompleted(message_id=");
        sb.append(str);
        sb.append(", outcome=");
        sb.append(readAloudEvents$ReadAloudOutcome);
        sb.append(", audio_bytes_received=");
        sb.append(j);
        ij0.u(j2, ", duration_ms=", ", audio_seconds_played=", sb);
        sb.append(d);
        sb.append(", expected_audio_seconds=");
        sb.append(d2);
        sb.append(", stream_ended_cleanly=");
        sb.append(bool);
        sb.append(", interrupt_reason=");
        sb.append(readAloudEvents$ReadAloudInterruptReason);
        sb.append(", track_recoveries=");
        sb.append(num);
        sb.append(", ws_reconnects=");
        sb.append(num2);
        sb.append(", buffer_underruns=");
        sb.append(num3);
        sb.append(", min_buffer_ms=");
        sb.append(num4);
        sb.append(")");
        return sb.toString();
    }

    public ReadAloudEvents$MobileReadAloudCompleted(String str, ReadAloudEvents$ReadAloudOutcome readAloudEvents$ReadAloudOutcome, long j, long j2, Double d, Double d2, Boolean bool, ReadAloudEvents$ReadAloudInterruptReason readAloudEvents$ReadAloudInterruptReason, Integer num, Integer num2, Integer num3, Integer num4) {
        str.getClass();
        readAloudEvents$ReadAloudOutcome.getClass();
        this.message_id = str;
        this.outcome = readAloudEvents$ReadAloudOutcome;
        this.audio_bytes_received = j;
        this.duration_ms = j2;
        this.audio_seconds_played = d;
        this.expected_audio_seconds = d2;
        this.stream_ended_cleanly = bool;
        this.interrupt_reason = readAloudEvents$ReadAloudInterruptReason;
        this.track_recoveries = num;
        this.ws_reconnects = num2;
        this.buffer_underruns = num3;
        this.min_buffer_ms = num4;
    }

    public /* synthetic */ ReadAloudEvents$MobileReadAloudCompleted(String str, ReadAloudEvents$ReadAloudOutcome readAloudEvents$ReadAloudOutcome, long j, long j2, Double d, Double d2, Boolean bool, ReadAloudEvents$ReadAloudInterruptReason readAloudEvents$ReadAloudInterruptReason, Integer num, Integer num2, Integer num3, Integer num4, int i, mq5 mq5Var) {
        this(str, readAloudEvents$ReadAloudOutcome, j, j2, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : d2, (i & 64) != 0 ? null : bool, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : readAloudEvents$ReadAloudInterruptReason, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : num, (i & 512) != 0 ? null : num2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : num3, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : num4);
    }
}
