package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d2j;
import defpackage.e2j;
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
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"Jx\u0010%\u001a\u00020$2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u0010\u0010(\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020$2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b>\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b@\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bE\u0010\"R\u0014\u0010G\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0017¨\u0006K"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$FeedbackPrompted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "", "session_duration_ms", "num_turns", "input_type", "output_type", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "num_focus_losses", "focus_transient_loss_total_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "component6", "component7", "component8", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component9", "()Ljava/lang/Long;", "component10", "Lcom/anthropic/claude/analytics/events/VoiceEvents$FeedbackPrompted;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/VoiceEvents$FeedbackPrompted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$FeedbackPrompted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "J", "getSession_duration_ms", "getNum_turns", "getInput_type", "getOutput_type", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "Ljava/lang/Long;", "getNum_focus_losses", "getFocus_transient_loss_total_ms", "getEventName", "eventName", "Companion", "d2j", "e2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$FeedbackPrompted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final String conversation_uuid;
    private final Long focus_transient_loss_total_ms;
    private final String input_type;
    private final Long num_focus_losses;
    private final long num_turns;
    private final String organization_uuid;
    private final String output_type;
    private final long session_duration_ms;
    private final String voice_session_id;
    public static final e2j Companion = new e2j();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, yb5.w(w1a.F, new mti(4)), null, null};

    public /* synthetic */ VoiceEvents$FeedbackPrompted(int i, String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, d2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.session_duration_ms = j;
        this.num_turns = j2;
        this.input_type = str4;
        this.output_type = str5;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.num_focus_losses = null;
        } else {
            this.num_focus_losses = l;
        }
        if ((i & 512) == 0) {
            this.focus_transient_loss_total_ms = null;
        } else {
            this.focus_transient_loss_total_ms = l2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$FeedbackPrompted copy$default(VoiceEvents$FeedbackPrompted voiceEvents$FeedbackPrompted, String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$FeedbackPrompted.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$FeedbackPrompted.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = voiceEvents$FeedbackPrompted.voice_session_id;
        }
        if ((i & 8) != 0) {
            j = voiceEvents$FeedbackPrompted.session_duration_ms;
        }
        if ((i & 16) != 0) {
            j2 = voiceEvents$FeedbackPrompted.num_turns;
        }
        if ((i & 32) != 0) {
            str4 = voiceEvents$FeedbackPrompted.input_type;
        }
        if ((i & 64) != 0) {
            str5 = voiceEvents$FeedbackPrompted.output_type;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            voiceEvents$VoiceActivationMode = voiceEvents$FeedbackPrompted.activation_mode;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            l = voiceEvents$FeedbackPrompted.num_focus_losses;
        }
        if ((i & 512) != 0) {
            l2 = voiceEvents$FeedbackPrompted.focus_transient_loss_total_ms;
        }
        Long l3 = l2;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode2 = voiceEvents$VoiceActivationMode;
        String str6 = str4;
        long j3 = j2;
        long j4 = j;
        String str7 = str3;
        return voiceEvents$FeedbackPrompted.copy(str, str2, str7, j4, j3, str6, str5, voiceEvents$VoiceActivationMode2, l, l3);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$FeedbackPrompted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.D(serialDesc, 3, self.session_duration_ms);
        output.D(serialDesc, 4, self.num_turns);
        output.q(serialDesc, 5, self.input_type);
        output.q(serialDesc, 6, self.output_type);
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.activation_mode);
        if (output.E(serialDesc) || self.num_focus_losses != null) {
            output.B(serialDesc, 8, xka.a, self.num_focus_losses);
        }
        if (!output.E(serialDesc) && self.focus_transient_loss_total_ms == null) {
            return;
        }
        output.B(serialDesc, 9, xka.a, self.focus_transient_loss_total_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getFocus_transient_loss_total_ms() {
        return this.focus_transient_loss_total_ms;
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
    public final long getSession_duration_ms() {
        return this.session_duration_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getNum_turns() {
        return this.num_turns;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getNum_focus_losses() {
        return this.num_focus_losses;
    }

    public final VoiceEvents$FeedbackPrompted copy(String organization_uuid, String conversation_uuid, String voice_session_id, long session_duration_ms, long num_turns, String input_type, String output_type, VoiceEvents$VoiceActivationMode activation_mode, Long num_focus_losses, Long focus_transient_loss_total_ms) {
        y6a.s(organization_uuid, conversation_uuid, voice_session_id, input_type, output_type);
        activation_mode.getClass();
        return new VoiceEvents$FeedbackPrompted(organization_uuid, conversation_uuid, voice_session_id, session_duration_ms, num_turns, input_type, output_type, activation_mode, num_focus_losses, focus_transient_loss_total_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$FeedbackPrompted)) {
            return false;
        }
        VoiceEvents$FeedbackPrompted voiceEvents$FeedbackPrompted = (VoiceEvents$FeedbackPrompted) other;
        return x44.r(this.organization_uuid, voiceEvents$FeedbackPrompted.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$FeedbackPrompted.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$FeedbackPrompted.voice_session_id) && this.session_duration_ms == voiceEvents$FeedbackPrompted.session_duration_ms && this.num_turns == voiceEvents$FeedbackPrompted.num_turns && x44.r(this.input_type, voiceEvents$FeedbackPrompted.input_type) && x44.r(this.output_type, voiceEvents$FeedbackPrompted.output_type) && this.activation_mode == voiceEvents$FeedbackPrompted.activation_mode && x44.r(this.num_focus_losses, voiceEvents$FeedbackPrompted.num_focus_losses) && x44.r(this.focus_transient_loss_total_ms, voiceEvents$FeedbackPrompted.focus_transient_loss_total_ms);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_feedback_prompted";
    }

    public final Long getFocus_transient_loss_total_ms() {
        return this.focus_transient_loss_total_ms;
    }

    public final String getInput_type() {
        return this.input_type;
    }

    public final Long getNum_focus_losses() {
        return this.num_focus_losses;
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

    public final long getSession_duration_ms() {
        return this.session_duration_ms;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iHashCode = (this.activation_mode.hashCode() + kgh.l(kgh.l(vb7.e(vb7.e(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id), 31, this.session_duration_ms), 31, this.num_turns), 31, this.input_type), 31, this.output_type)) * 31;
        Long l = this.num_focus_losses;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.focus_transient_loss_total_ms;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        long j = this.session_duration_ms;
        long j2 = this.num_turns;
        String str4 = this.input_type;
        String str5 = this.output_type;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        Long l = this.num_focus_losses;
        Long l2 = this.focus_transient_loss_total_ms;
        StringBuilder sbR = kgh.r("FeedbackPrompted(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", session_duration_ms=");
        sbR.append(j);
        ij0.u(j2, ", num_turns=", ", input_type=", sbR);
        kgh.u(sbR, str4, ", output_type=", str5, ", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", num_focus_losses=");
        sbR.append(l);
        sbR.append(", focus_transient_loss_total_ms=");
        sbR.append(l2);
        sbR.append(")");
        return sbR.toString();
    }

    public VoiceEvents$FeedbackPrompted(String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2) {
        y6a.s(str, str2, str3, str4, str5);
        voiceEvents$VoiceActivationMode.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.session_duration_ms = j;
        this.num_turns = j2;
        this.input_type = str4;
        this.output_type = str5;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.num_focus_losses = l;
        this.focus_transient_loss_total_ms = l2;
    }

    public /* synthetic */ VoiceEvents$FeedbackPrompted(String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, int i, mq5 mq5Var) {
        this(str, str2, str3, j, j2, str4, str5, voiceEvents$VoiceActivationMode, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : l, (i & 512) != 0 ? null : l2);
    }
}
