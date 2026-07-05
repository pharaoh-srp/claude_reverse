package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b2j;
import defpackage.c2j;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011By\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018Jv\u0010'\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020&2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010 R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bC\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bF\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bG\u0010\u0018R\u0014\u0010I\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018¨\u0006M"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$ConnectionDropped", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "", "num_completed_turns", "", "recovered", "retry_attempts", "recovery_duration_ms", "input_type", "output_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;JZJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;JZJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component5", "()J", "component6", "()Z", "component7", "component8", "()Ljava/lang/Long;", "component9", "component10", "Lcom/anthropic/claude/analytics/events/VoiceEvents$ConnectionDropped;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;JZJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/VoiceEvents$ConnectionDropped;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$ConnectionDropped;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "J", "getNum_completed_turns", "Z", "getRecovered", "getRetry_attempts", "Ljava/lang/Long;", "getRecovery_duration_ms", "getInput_type", "getOutput_type", "getEventName", "eventName", "Companion", "b2j", "c2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$ConnectionDropped implements AnalyticsEvent {
    public static final int $stable = 0;
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final String conversation_uuid;
    private final String input_type;
    private final long num_completed_turns;
    private final String organization_uuid;
    private final String output_type;
    private final boolean recovered;
    private final Long recovery_duration_ms;
    private final long retry_attempts;
    private final String voice_session_id;
    public static final c2j Companion = new c2j();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new mti(3)), null, null, null, null, null, null};

    public /* synthetic */ VoiceEvents$ConnectionDropped(int i, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, long j, boolean z, long j2, Long l, String str4, String str5, vnf vnfVar) {
        if (895 != (i & 895)) {
            gvj.f(i, 895, b2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.num_completed_turns = j;
        this.recovered = z;
        this.retry_attempts = j2;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.recovery_duration_ms = null;
        } else {
            this.recovery_duration_ms = l;
        }
        this.input_type = str4;
        this.output_type = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$ConnectionDropped copy$default(VoiceEvents$ConnectionDropped voiceEvents$ConnectionDropped, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, long j, boolean z, long j2, Long l, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$ConnectionDropped.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$ConnectionDropped.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = voiceEvents$ConnectionDropped.voice_session_id;
        }
        if ((i & 8) != 0) {
            voiceEvents$VoiceActivationMode = voiceEvents$ConnectionDropped.activation_mode;
        }
        if ((i & 16) != 0) {
            j = voiceEvents$ConnectionDropped.num_completed_turns;
        }
        if ((i & 32) != 0) {
            z = voiceEvents$ConnectionDropped.recovered;
        }
        if ((i & 64) != 0) {
            j2 = voiceEvents$ConnectionDropped.retry_attempts;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            l = voiceEvents$ConnectionDropped.recovery_duration_ms;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str4 = voiceEvents$ConnectionDropped.input_type;
        }
        if ((i & 512) != 0) {
            str5 = voiceEvents$ConnectionDropped.output_type;
        }
        String str6 = str5;
        Long l2 = l;
        boolean z2 = z;
        long j3 = j;
        String str7 = str3;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode2 = voiceEvents$VoiceActivationMode;
        return voiceEvents$ConnectionDropped.copy(str, str2, str7, voiceEvents$VoiceActivationMode2, j3, z2, j2, l2, str4, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$ConnectionDropped self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.activation_mode);
        output.D(serialDesc, 4, self.num_completed_turns);
        output.p(serialDesc, 5, self.recovered);
        output.D(serialDesc, 6, self.retry_attempts);
        if (output.E(serialDesc) || self.recovery_duration_ms != null) {
            output.B(serialDesc, 7, xka.a, self.recovery_duration_ms);
        }
        output.q(serialDesc, 8, self.input_type);
        output.q(serialDesc, 9, self.output_type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
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
    public final long getNum_completed_turns() {
        return this.num_completed_turns;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRecovered() {
        return this.recovered;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRetry_attempts() {
        return this.retry_attempts;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getRecovery_duration_ms() {
        return this.recovery_duration_ms;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    public final VoiceEvents$ConnectionDropped copy(String organization_uuid, String conversation_uuid, String voice_session_id, VoiceEvents$VoiceActivationMode activation_mode, long num_completed_turns, boolean recovered, long retry_attempts, Long recovery_duration_ms, String input_type, String output_type) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        activation_mode.getClass();
        input_type.getClass();
        output_type.getClass();
        return new VoiceEvents$ConnectionDropped(organization_uuid, conversation_uuid, voice_session_id, activation_mode, num_completed_turns, recovered, retry_attempts, recovery_duration_ms, input_type, output_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$ConnectionDropped)) {
            return false;
        }
        VoiceEvents$ConnectionDropped voiceEvents$ConnectionDropped = (VoiceEvents$ConnectionDropped) other;
        return x44.r(this.organization_uuid, voiceEvents$ConnectionDropped.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$ConnectionDropped.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$ConnectionDropped.voice_session_id) && this.activation_mode == voiceEvents$ConnectionDropped.activation_mode && this.num_completed_turns == voiceEvents$ConnectionDropped.num_completed_turns && this.recovered == voiceEvents$ConnectionDropped.recovered && this.retry_attempts == voiceEvents$ConnectionDropped.retry_attempts && x44.r(this.recovery_duration_ms, voiceEvents$ConnectionDropped.recovery_duration_ms) && x44.r(this.input_type, voiceEvents$ConnectionDropped.input_type) && x44.r(this.output_type, voiceEvents$ConnectionDropped.output_type);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_connection_dropped";
    }

    public final String getInput_type() {
        return this.input_type;
    }

    public final long getNum_completed_turns() {
        return this.num_completed_turns;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getOutput_type() {
        return this.output_type;
    }

    public final boolean getRecovered() {
        return this.recovered;
    }

    public final Long getRecovery_duration_ms() {
        return this.recovery_duration_ms;
    }

    public final long getRetry_attempts() {
        return this.retry_attempts;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iE = vb7.e(fsh.p(vb7.e((this.activation_mode.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id)) * 31, 31, this.num_completed_turns), 31, this.recovered), 31, this.retry_attempts);
        Long l = this.recovery_duration_ms;
        return this.output_type.hashCode() + kgh.l((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.input_type);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        long j = this.num_completed_turns;
        boolean z = this.recovered;
        long j2 = this.retry_attempts;
        Long l = this.recovery_duration_ms;
        String str4 = this.input_type;
        String str5 = this.output_type;
        StringBuilder sbR = kgh.r("ConnectionDropped(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", num_completed_turns=");
        sbR.append(j);
        sbR.append(", recovered=");
        sbR.append(z);
        ij0.u(j2, ", retry_attempts=", ", recovery_duration_ms=", sbR);
        sbR.append(l);
        sbR.append(", input_type=");
        sbR.append(str4);
        sbR.append(", output_type=");
        return ij0.m(sbR, str5, ")");
    }

    public VoiceEvents$ConnectionDropped(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, long j, boolean z, long j2, Long l, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        voiceEvents$VoiceActivationMode.getClass();
        str4.getClass();
        str5.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.num_completed_turns = j;
        this.recovered = z;
        this.retry_attempts = j2;
        this.recovery_duration_ms = l;
        this.input_type = str4;
        this.output_type = str5;
    }

    public /* synthetic */ VoiceEvents$ConnectionDropped(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, long j, boolean z, long j2, Long l, String str4, String str5, int i, mq5 mq5Var) {
        this(str, str2, str3, voiceEvents$VoiceActivationMode, j, z, j2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : l, str4, str5);
    }
}
