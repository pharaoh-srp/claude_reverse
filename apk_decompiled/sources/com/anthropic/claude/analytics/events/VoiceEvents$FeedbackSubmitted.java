package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.f2j;
import defpackage.fsh;
import defpackage.g2j;
import defpackage.gid;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mti;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002STB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010*J \u0001\u0010-\u001a\u00020,2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001bJ\u0010\u00100\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020,2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\bA\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bB\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\b\u0007\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bF\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bG\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bH\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bI\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bJ\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bO\u0010*R\u0014\u0010Q\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u001b¨\u0006U"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$FeedbackSubmitted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "", "is_positive", "", "session_duration_ms", "num_turns", "reason", "detail", "input_type", "output_type", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "num_focus_losses", "focus_transient_loss_total_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()J", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component12", "()Ljava/lang/Long;", "component13", "Lcom/anthropic/claude/analytics/events/VoiceEvents$FeedbackSubmitted;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/VoiceEvents$FeedbackSubmitted;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$FeedbackSubmitted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Z", "J", "getSession_duration_ms", "getNum_turns", "getReason", "getDetail", "getInput_type", "getOutput_type", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "Ljava/lang/Long;", "getNum_focus_losses", "getFocus_transient_loss_total_ms", "getEventName", "eventName", "Companion", "f2j", "g2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$FeedbackSubmitted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final String conversation_uuid;
    private final String detail;
    private final Long focus_transient_loss_total_ms;
    private final String input_type;
    private final boolean is_positive;
    private final Long num_focus_losses;
    private final long num_turns;
    private final String organization_uuid;
    private final String output_type;
    private final String reason;
    private final long session_duration_ms;
    private final String voice_session_id;
    public static final g2j Companion = new g2j();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, yb5.w(w1a.F, new mti(5)), null, null};

    public /* synthetic */ VoiceEvents$FeedbackSubmitted(int i, String str, String str2, String str3, boolean z, long j, long j2, String str4, String str5, String str6, String str7, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, f2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.is_positive = z;
        this.session_duration_ms = j;
        this.num_turns = j2;
        if ((i & 64) == 0) {
            this.reason = null;
        } else {
            this.reason = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.detail = null;
        } else {
            this.detail = str5;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.input_type = null;
        } else {
            this.input_type = str6;
        }
        if ((i & 512) == 0) {
            this.output_type = null;
        } else {
            this.output_type = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.activation_mode = null;
        } else {
            this.activation_mode = voiceEvents$VoiceActivationMode;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.num_focus_losses = null;
        } else {
            this.num_focus_losses = l;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.focus_transient_loss_total_ms = null;
        } else {
            this.focus_transient_loss_total_ms = l2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$FeedbackSubmitted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.p(serialDesc, 3, self.is_positive);
        output.D(serialDesc, 4, self.session_duration_ms);
        output.D(serialDesc, 5, self.num_turns);
        if (output.E(serialDesc) || self.reason != null) {
            output.B(serialDesc, 6, srg.a, self.reason);
        }
        if (output.E(serialDesc) || self.detail != null) {
            output.B(serialDesc, 7, srg.a, self.detail);
        }
        if (output.E(serialDesc) || self.input_type != null) {
            output.B(serialDesc, 8, srg.a, self.input_type);
        }
        if (output.E(serialDesc) || self.output_type != null) {
            output.B(serialDesc, 9, srg.a, self.output_type);
        }
        if (output.E(serialDesc) || self.activation_mode != null) {
            output.B(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.activation_mode);
        }
        if (output.E(serialDesc) || self.num_focus_losses != null) {
            output.B(serialDesc, 11, xka.a, self.num_focus_losses);
        }
        if (!output.E(serialDesc) && self.focus_transient_loss_total_ms == null) {
            return;
        }
        output.B(serialDesc, 12, xka.a, self.focus_transient_loss_total_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getNum_focus_losses() {
        return this.num_focus_losses;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
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
    public final boolean getIs_positive() {
        return this.is_positive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSession_duration_ms() {
        return this.session_duration_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getNum_turns() {
        return this.num_turns;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    public final VoiceEvents$FeedbackSubmitted copy(String organization_uuid, String conversation_uuid, String voice_session_id, boolean is_positive, long session_duration_ms, long num_turns, String reason, String detail, String input_type, String output_type, VoiceEvents$VoiceActivationMode activation_mode, Long num_focus_losses, Long focus_transient_loss_total_ms) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        return new VoiceEvents$FeedbackSubmitted(organization_uuid, conversation_uuid, voice_session_id, is_positive, session_duration_ms, num_turns, reason, detail, input_type, output_type, activation_mode, num_focus_losses, focus_transient_loss_total_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$FeedbackSubmitted)) {
            return false;
        }
        VoiceEvents$FeedbackSubmitted voiceEvents$FeedbackSubmitted = (VoiceEvents$FeedbackSubmitted) other;
        return x44.r(this.organization_uuid, voiceEvents$FeedbackSubmitted.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$FeedbackSubmitted.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$FeedbackSubmitted.voice_session_id) && this.is_positive == voiceEvents$FeedbackSubmitted.is_positive && this.session_duration_ms == voiceEvents$FeedbackSubmitted.session_duration_ms && this.num_turns == voiceEvents$FeedbackSubmitted.num_turns && x44.r(this.reason, voiceEvents$FeedbackSubmitted.reason) && x44.r(this.detail, voiceEvents$FeedbackSubmitted.detail) && x44.r(this.input_type, voiceEvents$FeedbackSubmitted.input_type) && x44.r(this.output_type, voiceEvents$FeedbackSubmitted.output_type) && this.activation_mode == voiceEvents$FeedbackSubmitted.activation_mode && x44.r(this.num_focus_losses, voiceEvents$FeedbackSubmitted.num_focus_losses) && x44.r(this.focus_transient_loss_total_ms, voiceEvents$FeedbackSubmitted.focus_transient_loss_total_ms);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getDetail() {
        return this.detail;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_feedback_submitted";
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

    public final String getReason() {
        return this.reason;
    }

    public final long getSession_duration_ms() {
        return this.session_duration_ms;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iE = vb7.e(vb7.e(fsh.p(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id), 31, this.is_positive), 31, this.session_duration_ms), 31, this.num_turns);
        String str = this.reason;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.detail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.input_type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.output_type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        int iHashCode5 = (iHashCode4 + (voiceEvents$VoiceActivationMode == null ? 0 : voiceEvents$VoiceActivationMode.hashCode())) * 31;
        Long l = this.num_focus_losses;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.focus_transient_loss_total_ms;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean is_positive() {
        return this.is_positive;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        boolean z = this.is_positive;
        long j = this.session_duration_ms;
        long j2 = this.num_turns;
        String str4 = this.reason;
        String str5 = this.detail;
        String str6 = this.input_type;
        String str7 = this.output_type;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        Long l = this.num_focus_losses;
        Long l2 = this.focus_transient_loss_total_ms;
        StringBuilder sbR = kgh.r("FeedbackSubmitted(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        gid.t(sbR, str3, ", is_positive=", z, ", session_duration_ms=");
        sbR.append(j);
        ij0.u(j2, ", num_turns=", ", reason=", sbR);
        kgh.u(sbR, str4, ", detail=", str5, ", input_type=");
        kgh.u(sbR, str6, ", output_type=", str7, ", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", num_focus_losses=");
        sbR.append(l);
        sbR.append(", focus_transient_loss_total_ms=");
        sbR.append(l2);
        sbR.append(")");
        return sbR.toString();
    }

    public VoiceEvents$FeedbackSubmitted(String str, String str2, String str3, boolean z, long j, long j2, String str4, String str5, String str6, String str7, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.is_positive = z;
        this.session_duration_ms = j;
        this.num_turns = j2;
        this.reason = str4;
        this.detail = str5;
        this.input_type = str6;
        this.output_type = str7;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.num_focus_losses = l;
        this.focus_transient_loss_total_ms = l2;
    }

    public /* synthetic */ VoiceEvents$FeedbackSubmitted(String str, String str2, String str3, boolean z, long j, long j2, String str4, String str5, String str6, String str7, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, int i, mq5 mq5Var) {
        this(str, str2, str3, z, j, j2, (i & 64) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str5, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : voiceEvents$VoiceActivationMode, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : l, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : l2);
    }
}
