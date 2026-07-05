package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l2j;
import defpackage.m2j;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mti;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 m2\u00020\u0001:\u0002noBÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dB×\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u0010+J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u0010+J\u0012\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00106J\u0012\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b8\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0012\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b<\u00102Jæ\u0001\u0010>\u001a\u00020=2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010#J\u0010\u0010A\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020\u00182\b\u0010D\u001a\u0004\u0018\u00010CHÖ\u0003¢\u0006\u0004\bE\u0010FJ'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020=2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010P\u001a\u0004\bR\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bS\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\bW\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\bY\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010X\u001a\u0004\bZ\u0010+R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\b[\u0010+R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\b\\\u0010+R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\b]\u0010+R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\b^\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u00102R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\ba\u0010#R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bb\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bd\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\be\u00106R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010_\u001a\u0004\bf\u00102R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010g\u001a\u0004\bh\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010g\u001a\u0004\bi\u0010:R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010_\u001a\u0004\bj\u00102R\u0014\u0010l\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010#¨\u0006p"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$SessionEnded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason;", "end_reason", "", "duration_ms", "num_turns", "num_speak_interrupts", "num_mode_switches", "num_mute_toggles", "num_reconnects", "", "buffer_underrun_count", "input_type", "output_type", "num_focus_losses", "focus_transient_loss_total_ms", "num_empty_input_turns", "", "sent_mic_audio", "server_acked_input_end", "peak_input_rms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason;JJJJJJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason;JJJJJJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component5", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason;", "component6", "()J", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Integer;", "component13", "component14", "component15", "()Ljava/lang/Long;", "component16", "component17", "component18", "()Ljava/lang/Boolean;", "component19", "component20", "Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionEnded;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason;JJJJJJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionEnded;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionEnded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEndReason;", "getEnd_reason", "J", "getDuration_ms", "getNum_turns", "getNum_speak_interrupts", "getNum_mode_switches", "getNum_mute_toggles", "getNum_reconnects", "Ljava/lang/Integer;", "getBuffer_underrun_count", "getInput_type", "getOutput_type", "Ljava/lang/Long;", "getNum_focus_losses", "getFocus_transient_loss_total_ms", "getNum_empty_input_turns", "Ljava/lang/Boolean;", "getSent_mic_audio", "getServer_acked_input_end", "getPeak_input_rms", "getEventName", "eventName", "Companion", "l2j", "m2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$SessionEnded implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final m2j Companion = new m2j();
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final Integer buffer_underrun_count;
    private final String conversation_uuid;
    private final long duration_ms;
    private final VoiceEvents$VoiceEndReason end_reason;
    private final Long focus_transient_loss_total_ms;
    private final String input_type;
    private final Integer num_empty_input_turns;
    private final Long num_focus_losses;
    private final long num_mode_switches;
    private final long num_mute_toggles;
    private final long num_reconnects;
    private final long num_speak_interrupts;
    private final long num_turns;
    private final String organization_uuid;
    private final String output_type;
    private final Integer peak_input_rms;
    private final Boolean sent_mic_audio;
    private final Boolean server_acked_input_end;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(9);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, mtiVar), yb5.w(w1aVar, new mti(10)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ VoiceEvents$SessionEnded(int i, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEndReason voiceEvents$VoiceEndReason, long j, long j2, long j3, long j4, long j5, long j6, Integer num, String str4, String str5, Long l, Long l2, Integer num2, Boolean bool, Boolean bool2, Integer num3, vnf vnfVar) {
        if (14335 != (i & 14335)) {
            gvj.f(i, 14335, l2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.end_reason = voiceEvents$VoiceEndReason;
        this.duration_ms = j;
        this.num_turns = j2;
        this.num_speak_interrupts = j3;
        this.num_mode_switches = j4;
        this.num_mute_toggles = j5;
        this.num_reconnects = j6;
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.buffer_underrun_count = null;
        } else {
            this.buffer_underrun_count = num;
        }
        this.input_type = str4;
        this.output_type = str5;
        if ((i & 16384) == 0) {
            this.num_focus_losses = null;
        } else {
            this.num_focus_losses = l;
        }
        if ((32768 & i) == 0) {
            this.focus_transient_loss_total_ms = null;
        } else {
            this.focus_transient_loss_total_ms = l2;
        }
        if ((65536 & i) == 0) {
            this.num_empty_input_turns = null;
        } else {
            this.num_empty_input_turns = num2;
        }
        if ((131072 & i) == 0) {
            this.sent_mic_audio = null;
        } else {
            this.sent_mic_audio = bool;
        }
        if ((262144 & i) == 0) {
            this.server_acked_input_end = null;
        } else {
            this.server_acked_input_end = bool2;
        }
        if ((i & 524288) == 0) {
            this.peak_input_rms = null;
        } else {
            this.peak_input_rms = num3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return VoiceEvents$VoiceEndReason.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$SessionEnded copy$default(VoiceEvents$SessionEnded voiceEvents$SessionEnded, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEndReason voiceEvents$VoiceEndReason, long j, long j2, long j3, long j4, long j5, long j6, Integer num, String str4, String str5, Long l, Long l2, Integer num2, Boolean bool, Boolean bool2, Integer num3, int i, Object obj) {
        Integer num4;
        Boolean bool3;
        String str6 = (i & 1) != 0 ? voiceEvents$SessionEnded.organization_uuid : str;
        String str7 = (i & 2) != 0 ? voiceEvents$SessionEnded.conversation_uuid : str2;
        String str8 = (i & 4) != 0 ? voiceEvents$SessionEnded.voice_session_id : str3;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode2 = (i & 8) != 0 ? voiceEvents$SessionEnded.activation_mode : voiceEvents$VoiceActivationMode;
        VoiceEvents$VoiceEndReason voiceEvents$VoiceEndReason2 = (i & 16) != 0 ? voiceEvents$SessionEnded.end_reason : voiceEvents$VoiceEndReason;
        long j7 = (i & 32) != 0 ? voiceEvents$SessionEnded.duration_ms : j;
        long j8 = (i & 64) != 0 ? voiceEvents$SessionEnded.num_turns : j2;
        long j9 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? voiceEvents$SessionEnded.num_speak_interrupts : j3;
        long j10 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? voiceEvents$SessionEnded.num_mode_switches : j4;
        String str9 = str6;
        String str10 = str7;
        long j11 = (i & 512) != 0 ? voiceEvents$SessionEnded.num_mute_toggles : j5;
        long j12 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? voiceEvents$SessionEnded.num_reconnects : j6;
        Integer num5 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? voiceEvents$SessionEnded.buffer_underrun_count : num;
        long j13 = j12;
        String str11 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? voiceEvents$SessionEnded.input_type : str4;
        String str12 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? voiceEvents$SessionEnded.output_type : str5;
        String str13 = str11;
        Long l3 = (i & 16384) != 0 ? voiceEvents$SessionEnded.num_focus_losses : l;
        Long l4 = (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? voiceEvents$SessionEnded.focus_transient_loss_total_ms : l2;
        Integer num6 = (i & 65536) != 0 ? voiceEvents$SessionEnded.num_empty_input_turns : num2;
        Boolean bool4 = (i & 131072) != 0 ? voiceEvents$SessionEnded.sent_mic_audio : bool;
        Boolean bool5 = (i & 262144) != 0 ? voiceEvents$SessionEnded.server_acked_input_end : bool2;
        if ((i & 524288) != 0) {
            bool3 = bool5;
            num4 = voiceEvents$SessionEnded.peak_input_rms;
        } else {
            num4 = num3;
            bool3 = bool5;
        }
        return voiceEvents$SessionEnded.copy(str9, str10, str8, voiceEvents$VoiceActivationMode2, voiceEvents$VoiceEndReason2, j7, j8, j9, j10, j11, j13, num5, str13, str12, l3, l4, num6, bool4, bool3, num4);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$SessionEnded self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.activation_mode);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.end_reason);
        output.D(serialDesc, 5, self.duration_ms);
        output.D(serialDesc, 6, self.num_turns);
        output.D(serialDesc, 7, self.num_speak_interrupts);
        output.D(serialDesc, 8, self.num_mode_switches);
        output.D(serialDesc, 9, self.num_mute_toggles);
        output.D(serialDesc, 10, self.num_reconnects);
        if (output.E(serialDesc) || self.buffer_underrun_count != null) {
            output.B(serialDesc, 11, e79.a, self.buffer_underrun_count);
        }
        output.q(serialDesc, 12, self.input_type);
        output.q(serialDesc, 13, self.output_type);
        if (output.E(serialDesc) || self.num_focus_losses != null) {
            output.B(serialDesc, 14, xka.a, self.num_focus_losses);
        }
        if (output.E(serialDesc) || self.focus_transient_loss_total_ms != null) {
            output.B(serialDesc, 15, xka.a, self.focus_transient_loss_total_ms);
        }
        if (output.E(serialDesc) || self.num_empty_input_turns != null) {
            output.B(serialDesc, 16, e79.a, self.num_empty_input_turns);
        }
        if (output.E(serialDesc) || self.sent_mic_audio != null) {
            output.B(serialDesc, 17, zt1.a, self.sent_mic_audio);
        }
        if (output.E(serialDesc) || self.server_acked_input_end != null) {
            output.B(serialDesc, 18, zt1.a, self.server_acked_input_end);
        }
        if (!output.E(serialDesc) && self.peak_input_rms == null) {
            return;
        }
        output.B(serialDesc, 19, e79.a, self.peak_input_rms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getNum_mute_toggles() {
        return this.num_mute_toggles;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getNum_reconnects() {
        return this.num_reconnects;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getBuffer_underrun_count() {
        return this.buffer_underrun_count;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getNum_focus_losses() {
        return this.num_focus_losses;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getFocus_transient_loss_total_ms() {
        return this.focus_transient_loss_total_ms;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getNum_empty_input_turns() {
        return this.num_empty_input_turns;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getSent_mic_audio() {
        return this.sent_mic_audio;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getServer_acked_input_end() {
        return this.server_acked_input_end;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getPeak_input_rms() {
        return this.peak_input_rms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VoiceEvents$VoiceEndReason getEnd_reason() {
        return this.end_reason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getNum_turns() {
        return this.num_turns;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getNum_speak_interrupts() {
        return this.num_speak_interrupts;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getNum_mode_switches() {
        return this.num_mode_switches;
    }

    public final VoiceEvents$SessionEnded copy(String organization_uuid, String conversation_uuid, String voice_session_id, VoiceEvents$VoiceActivationMode activation_mode, VoiceEvents$VoiceEndReason end_reason, long duration_ms, long num_turns, long num_speak_interrupts, long num_mode_switches, long num_mute_toggles, long num_reconnects, Integer buffer_underrun_count, String input_type, String output_type, Long num_focus_losses, Long focus_transient_loss_total_ms, Integer num_empty_input_turns, Boolean sent_mic_audio, Boolean server_acked_input_end, Integer peak_input_rms) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        activation_mode.getClass();
        end_reason.getClass();
        input_type.getClass();
        output_type.getClass();
        return new VoiceEvents$SessionEnded(organization_uuid, conversation_uuid, voice_session_id, activation_mode, end_reason, duration_ms, num_turns, num_speak_interrupts, num_mode_switches, num_mute_toggles, num_reconnects, buffer_underrun_count, input_type, output_type, num_focus_losses, focus_transient_loss_total_ms, num_empty_input_turns, sent_mic_audio, server_acked_input_end, peak_input_rms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$SessionEnded)) {
            return false;
        }
        VoiceEvents$SessionEnded voiceEvents$SessionEnded = (VoiceEvents$SessionEnded) other;
        return x44.r(this.organization_uuid, voiceEvents$SessionEnded.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$SessionEnded.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$SessionEnded.voice_session_id) && this.activation_mode == voiceEvents$SessionEnded.activation_mode && this.end_reason == voiceEvents$SessionEnded.end_reason && this.duration_ms == voiceEvents$SessionEnded.duration_ms && this.num_turns == voiceEvents$SessionEnded.num_turns && this.num_speak_interrupts == voiceEvents$SessionEnded.num_speak_interrupts && this.num_mode_switches == voiceEvents$SessionEnded.num_mode_switches && this.num_mute_toggles == voiceEvents$SessionEnded.num_mute_toggles && this.num_reconnects == voiceEvents$SessionEnded.num_reconnects && x44.r(this.buffer_underrun_count, voiceEvents$SessionEnded.buffer_underrun_count) && x44.r(this.input_type, voiceEvents$SessionEnded.input_type) && x44.r(this.output_type, voiceEvents$SessionEnded.output_type) && x44.r(this.num_focus_losses, voiceEvents$SessionEnded.num_focus_losses) && x44.r(this.focus_transient_loss_total_ms, voiceEvents$SessionEnded.focus_transient_loss_total_ms) && x44.r(this.num_empty_input_turns, voiceEvents$SessionEnded.num_empty_input_turns) && x44.r(this.sent_mic_audio, voiceEvents$SessionEnded.sent_mic_audio) && x44.r(this.server_acked_input_end, voiceEvents$SessionEnded.server_acked_input_end) && x44.r(this.peak_input_rms, voiceEvents$SessionEnded.peak_input_rms);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final Integer getBuffer_underrun_count() {
        return this.buffer_underrun_count;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final VoiceEvents$VoiceEndReason getEnd_reason() {
        return this.end_reason;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_session_ended";
    }

    public final Long getFocus_transient_loss_total_ms() {
        return this.focus_transient_loss_total_ms;
    }

    public final String getInput_type() {
        return this.input_type;
    }

    public final Integer getNum_empty_input_turns() {
        return this.num_empty_input_turns;
    }

    public final Long getNum_focus_losses() {
        return this.num_focus_losses;
    }

    public final long getNum_mode_switches() {
        return this.num_mode_switches;
    }

    public final long getNum_mute_toggles() {
        return this.num_mute_toggles;
    }

    public final long getNum_reconnects() {
        return this.num_reconnects;
    }

    public final long getNum_speak_interrupts() {
        return this.num_speak_interrupts;
    }

    public final long getNum_turns() {
        return this.num_turns;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getOutput_type() {
        return this.output_type;
    }

    public final Integer getPeak_input_rms() {
        return this.peak_input_rms;
    }

    public final Boolean getSent_mic_audio() {
        return this.sent_mic_audio;
    }

    public final Boolean getServer_acked_input_end() {
        return this.server_acked_input_end;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iE = vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e((this.end_reason.hashCode() + ((this.activation_mode.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id)) * 31)) * 31, 31, this.duration_ms), 31, this.num_turns), 31, this.num_speak_interrupts), 31, this.num_mode_switches), 31, this.num_mute_toggles), 31, this.num_reconnects);
        Integer num = this.buffer_underrun_count;
        int iL = kgh.l(kgh.l((iE + (num == null ? 0 : num.hashCode())) * 31, 31, this.input_type), 31, this.output_type);
        Long l = this.num_focus_losses;
        int iHashCode = (iL + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.focus_transient_loss_total_ms;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.num_empty_input_turns;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.sent_mic_audio;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.server_acked_input_end;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.peak_input_rms;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        VoiceEvents$VoiceEndReason voiceEvents$VoiceEndReason = this.end_reason;
        long j = this.duration_ms;
        long j2 = this.num_turns;
        long j3 = this.num_speak_interrupts;
        long j4 = this.num_mode_switches;
        long j5 = this.num_mute_toggles;
        long j6 = this.num_reconnects;
        Integer num = this.buffer_underrun_count;
        String str4 = this.input_type;
        String str5 = this.output_type;
        Long l = this.num_focus_losses;
        Long l2 = this.focus_transient_loss_total_ms;
        Integer num2 = this.num_empty_input_turns;
        Boolean bool = this.sent_mic_audio;
        Boolean bool2 = this.server_acked_input_end;
        Integer num3 = this.peak_input_rms;
        StringBuilder sbR = kgh.r("SessionEnded(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", end_reason=");
        sbR.append(voiceEvents$VoiceEndReason);
        sbR.append(", duration_ms=");
        sbR.append(j);
        ij0.u(j2, ", num_turns=", ", num_speak_interrupts=", sbR);
        sbR.append(j3);
        ij0.u(j4, ", num_mode_switches=", ", num_mute_toggles=", sbR);
        sbR.append(j5);
        ij0.u(j6, ", num_reconnects=", ", buffer_underrun_count=", sbR);
        sbR.append(num);
        sbR.append(", input_type=");
        sbR.append(str4);
        sbR.append(", output_type=");
        sbR.append(str5);
        sbR.append(", num_focus_losses=");
        sbR.append(l);
        sbR.append(", focus_transient_loss_total_ms=");
        sbR.append(l2);
        sbR.append(", num_empty_input_turns=");
        sbR.append(num2);
        sbR.append(", sent_mic_audio=");
        ebh.C(sbR, bool, ", server_acked_input_end=", bool2, ", peak_input_rms=");
        sbR.append(num3);
        sbR.append(")");
        return sbR.toString();
    }

    public VoiceEvents$SessionEnded(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEndReason voiceEvents$VoiceEndReason, long j, long j2, long j3, long j4, long j5, long j6, Integer num, String str4, String str5, Long l, Long l2, Integer num2, Boolean bool, Boolean bool2, Integer num3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        voiceEvents$VoiceActivationMode.getClass();
        voiceEvents$VoiceEndReason.getClass();
        str4.getClass();
        str5.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.end_reason = voiceEvents$VoiceEndReason;
        this.duration_ms = j;
        this.num_turns = j2;
        this.num_speak_interrupts = j3;
        this.num_mode_switches = j4;
        this.num_mute_toggles = j5;
        this.num_reconnects = j6;
        this.buffer_underrun_count = num;
        this.input_type = str4;
        this.output_type = str5;
        this.num_focus_losses = l;
        this.focus_transient_loss_total_ms = l2;
        this.num_empty_input_turns = num2;
        this.sent_mic_audio = bool;
        this.server_acked_input_end = bool2;
        this.peak_input_rms = num3;
    }

    public /* synthetic */ VoiceEvents$SessionEnded(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEndReason voiceEvents$VoiceEndReason, long j, long j2, long j3, long j4, long j5, long j6, Integer num, String str4, String str5, Long l, Long l2, Integer num2, Boolean bool, Boolean bool2, Integer num3, int i, mq5 mq5Var) {
        this(str, str2, str3, voiceEvents$VoiceActivationMode, voiceEvents$VoiceEndReason, j, j2, j3, j4, j5, j6, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : num, str4, str5, (i & 16384) != 0 ? null : l, (32768 & i) != 0 ? null : l2, (65536 & i) != 0 ? null : num2, (131072 & i) != 0 ? null : bool, (262144 & i) != 0 ? null : bool2, (i & 524288) != 0 ? null : num3);
    }
}
