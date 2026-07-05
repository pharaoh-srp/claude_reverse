package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mti;
import defpackage.onf;
import defpackage.p3j;
import defpackage.q3j;
import defpackage.r3j;
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
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`aB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019B©\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b3\u00102J¬\u0001\u00105\u001a\u0002042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001fJ\u0010\u00108\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00152\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u0002042\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bI\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bJ\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bN\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010'R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bQ\u0010%R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bR\u0010%R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bS\u0010%R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bU\u0010,R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bV\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bW\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u00100R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\b\\\u00102R\u0014\u0010^\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u001f¨\u0006b"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TurnCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "", "turn_index", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger;", "input_trigger", "input_duration_ms", "time_to_first_audio_ms", "playback_duration_ms", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome;", "outcome", "input_type", "output_type", "", "playback_underrun_count", "", "route_changed", "had_focus_loss", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;JLcom/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger;JJJLcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;JLcom/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger;JJJLcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component5", "()J", "component6", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger;", "component7", "component8", "component9", "component10", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome;", "component11", "component12", "component13", "()Ljava/lang/Integer;", "component14", "()Ljava/lang/Boolean;", "component15", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TurnCompleted;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;JLcom/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger;JJJLcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/VoiceEvents$TurnCompleted;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TurnCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "J", "getTurn_index", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceInputTrigger;", "getInput_trigger", "getInput_duration_ms", "getTime_to_first_audio_ms", "getPlayback_duration_ms", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTurnOutcome;", "getOutcome", "getInput_type", "getOutput_type", "Ljava/lang/Integer;", "getPlayback_underrun_count", "Ljava/lang/Boolean;", "getRoute_changed", "getHad_focus_loss", "getEventName", "eventName", "Companion", "q3j", "r3j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TurnCompleted implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final r3j Companion = new r3j();
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final String conversation_uuid;
    private final Boolean had_focus_loss;
    private final long input_duration_ms;
    private final VoiceEvents$VoiceInputTrigger input_trigger;
    private final String input_type;
    private final String organization_uuid;
    private final VoiceEvents$VoiceTurnOutcome outcome;
    private final String output_type;
    private final long playback_duration_ms;
    private final Integer playback_underrun_count;
    private final Boolean route_changed;
    private final long time_to_first_audio_ms;
    private final long turn_index;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(29);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, mtiVar), null, yb5.w(w1aVar, new p3j(0)), null, null, null, yb5.w(w1aVar, new p3j(1)), null, null, null, null, null};
    }

    public /* synthetic */ VoiceEvents$TurnCompleted(int i, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, long j, VoiceEvents$VoiceInputTrigger voiceEvents$VoiceInputTrigger, long j2, long j3, long j4, VoiceEvents$VoiceTurnOutcome voiceEvents$VoiceTurnOutcome, String str4, String str5, Integer num, Boolean bool, Boolean bool2, vnf vnfVar) {
        if (4095 != (i & 4095)) {
            gvj.f(i, 4095, q3j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.turn_index = j;
        this.input_trigger = voiceEvents$VoiceInputTrigger;
        this.input_duration_ms = j2;
        this.time_to_first_audio_ms = j3;
        this.playback_duration_ms = j4;
        this.outcome = voiceEvents$VoiceTurnOutcome;
        this.input_type = str4;
        this.output_type = str5;
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.playback_underrun_count = null;
        } else {
            this.playback_underrun_count = num;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.route_changed = null;
        } else {
            this.route_changed = bool;
        }
        if ((i & 16384) == 0) {
            this.had_focus_loss = null;
        } else {
            this.had_focus_loss = bool2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return VoiceEvents$VoiceInputTrigger.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return VoiceEvents$VoiceTurnOutcome.Companion.serializer();
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TurnCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.activation_mode);
        output.D(serialDesc, 4, self.turn_index);
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.input_trigger);
        output.D(serialDesc, 6, self.input_duration_ms);
        output.D(serialDesc, 7, self.time_to_first_audio_ms);
        output.D(serialDesc, 8, self.playback_duration_ms);
        output.r(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.outcome);
        output.q(serialDesc, 10, self.input_type);
        output.q(serialDesc, 11, self.output_type);
        if (output.E(serialDesc) || self.playback_underrun_count != null) {
            output.B(serialDesc, 12, e79.a, self.playback_underrun_count);
        }
        if (output.E(serialDesc) || self.route_changed != null) {
            output.B(serialDesc, 13, zt1.a, self.route_changed);
        }
        if (!output.E(serialDesc) && self.had_focus_loss == null) {
            return;
        }
        output.B(serialDesc, 14, zt1.a, self.had_focus_loss);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final VoiceEvents$VoiceTurnOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getPlayback_underrun_count() {
        return this.playback_underrun_count;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getRoute_changed() {
        return this.route_changed;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getHad_focus_loss() {
        return this.had_focus_loss;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
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
    public final long getTurn_index() {
        return this.turn_index;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VoiceEvents$VoiceInputTrigger getInput_trigger() {
        return this.input_trigger;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getInput_duration_ms() {
        return this.input_duration_ms;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTime_to_first_audio_ms() {
        return this.time_to_first_audio_ms;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getPlayback_duration_ms() {
        return this.playback_duration_ms;
    }

    public final VoiceEvents$TurnCompleted copy(String organization_uuid, String conversation_uuid, String voice_session_id, VoiceEvents$VoiceActivationMode activation_mode, long turn_index, VoiceEvents$VoiceInputTrigger input_trigger, long input_duration_ms, long time_to_first_audio_ms, long playback_duration_ms, VoiceEvents$VoiceTurnOutcome outcome, String input_type, String output_type, Integer playback_underrun_count, Boolean route_changed, Boolean had_focus_loss) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        activation_mode.getClass();
        input_trigger.getClass();
        outcome.getClass();
        input_type.getClass();
        output_type.getClass();
        return new VoiceEvents$TurnCompleted(organization_uuid, conversation_uuid, voice_session_id, activation_mode, turn_index, input_trigger, input_duration_ms, time_to_first_audio_ms, playback_duration_ms, outcome, input_type, output_type, playback_underrun_count, route_changed, had_focus_loss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TurnCompleted)) {
            return false;
        }
        VoiceEvents$TurnCompleted voiceEvents$TurnCompleted = (VoiceEvents$TurnCompleted) other;
        return x44.r(this.organization_uuid, voiceEvents$TurnCompleted.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$TurnCompleted.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$TurnCompleted.voice_session_id) && this.activation_mode == voiceEvents$TurnCompleted.activation_mode && this.turn_index == voiceEvents$TurnCompleted.turn_index && this.input_trigger == voiceEvents$TurnCompleted.input_trigger && this.input_duration_ms == voiceEvents$TurnCompleted.input_duration_ms && this.time_to_first_audio_ms == voiceEvents$TurnCompleted.time_to_first_audio_ms && this.playback_duration_ms == voiceEvents$TurnCompleted.playback_duration_ms && this.outcome == voiceEvents$TurnCompleted.outcome && x44.r(this.input_type, voiceEvents$TurnCompleted.input_type) && x44.r(this.output_type, voiceEvents$TurnCompleted.output_type) && x44.r(this.playback_underrun_count, voiceEvents$TurnCompleted.playback_underrun_count) && x44.r(this.route_changed, voiceEvents$TurnCompleted.route_changed) && x44.r(this.had_focus_loss, voiceEvents$TurnCompleted.had_focus_loss);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_turn_completed";
    }

    public final Boolean getHad_focus_loss() {
        return this.had_focus_loss;
    }

    public final long getInput_duration_ms() {
        return this.input_duration_ms;
    }

    public final VoiceEvents$VoiceInputTrigger getInput_trigger() {
        return this.input_trigger;
    }

    public final String getInput_type() {
        return this.input_type;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final VoiceEvents$VoiceTurnOutcome getOutcome() {
        return this.outcome;
    }

    public final String getOutput_type() {
        return this.output_type;
    }

    public final long getPlayback_duration_ms() {
        return this.playback_duration_ms;
    }

    public final Integer getPlayback_underrun_count() {
        return this.playback_underrun_count;
    }

    public final Boolean getRoute_changed() {
        return this.route_changed;
    }

    public final long getTime_to_first_audio_ms() {
        return this.time_to_first_audio_ms;
    }

    public final long getTurn_index() {
        return this.turn_index;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l((this.outcome.hashCode() + vb7.e(vb7.e(vb7.e((this.input_trigger.hashCode() + vb7.e((this.activation_mode.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id)) * 31, 31, this.turn_index)) * 31, 31, this.input_duration_ms), 31, this.time_to_first_audio_ms), 31, this.playback_duration_ms)) * 31, 31, this.input_type), 31, this.output_type);
        Integer num = this.playback_underrun_count;
        int iHashCode = (iL + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.route_changed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.had_focus_loss;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        long j = this.turn_index;
        VoiceEvents$VoiceInputTrigger voiceEvents$VoiceInputTrigger = this.input_trigger;
        long j2 = this.input_duration_ms;
        long j3 = this.time_to_first_audio_ms;
        long j4 = this.playback_duration_ms;
        VoiceEvents$VoiceTurnOutcome voiceEvents$VoiceTurnOutcome = this.outcome;
        String str4 = this.input_type;
        String str5 = this.output_type;
        Integer num = this.playback_underrun_count;
        Boolean bool = this.route_changed;
        Boolean bool2 = this.had_focus_loss;
        StringBuilder sbR = kgh.r("TurnCompleted(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", turn_index=");
        sbR.append(j);
        sbR.append(", input_trigger=");
        sbR.append(voiceEvents$VoiceInputTrigger);
        ij0.u(j2, ", input_duration_ms=", ", time_to_first_audio_ms=", sbR);
        sbR.append(j3);
        ij0.u(j4, ", playback_duration_ms=", ", outcome=", sbR);
        sbR.append(voiceEvents$VoiceTurnOutcome);
        sbR.append(", input_type=");
        sbR.append(str4);
        sbR.append(", output_type=");
        sbR.append(str5);
        sbR.append(", playback_underrun_count=");
        sbR.append(num);
        sbR.append(", route_changed=");
        sbR.append(bool);
        sbR.append(", had_focus_loss=");
        sbR.append(bool2);
        sbR.append(")");
        return sbR.toString();
    }

    public VoiceEvents$TurnCompleted(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, long j, VoiceEvents$VoiceInputTrigger voiceEvents$VoiceInputTrigger, long j2, long j3, long j4, VoiceEvents$VoiceTurnOutcome voiceEvents$VoiceTurnOutcome, String str4, String str5, Integer num, Boolean bool, Boolean bool2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        voiceEvents$VoiceActivationMode.getClass();
        voiceEvents$VoiceInputTrigger.getClass();
        voiceEvents$VoiceTurnOutcome.getClass();
        str4.getClass();
        str5.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.turn_index = j;
        this.input_trigger = voiceEvents$VoiceInputTrigger;
        this.input_duration_ms = j2;
        this.time_to_first_audio_ms = j3;
        this.playback_duration_ms = j4;
        this.outcome = voiceEvents$VoiceTurnOutcome;
        this.input_type = str4;
        this.output_type = str5;
        this.playback_underrun_count = num;
        this.route_changed = bool;
        this.had_focus_loss = bool2;
    }

    public /* synthetic */ VoiceEvents$TurnCompleted(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, long j, VoiceEvents$VoiceInputTrigger voiceEvents$VoiceInputTrigger, long j2, long j3, long j4, VoiceEvents$VoiceTurnOutcome voiceEvents$VoiceTurnOutcome, String str4, String str5, Integer num, Boolean bool, Boolean bool2, int i, mq5 mq5Var) {
        this(str, str2, str3, voiceEvents$VoiceActivationMode, j, voiceEvents$VoiceInputTrigger, j2, j3, j4, voiceEvents$VoiceTurnOutcome, str4, str5, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : num, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : bool, (i & 16384) != 0 ? null : bool2);
    }
}
