package com.anthropic.claude.analytics.events;

import com.anthropic.claude.api.login.VerifyResponse;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mti;
import defpackage.n2j;
import defpackage.o2j;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vb7;
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
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GHBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017Jl\u0010$\u001a\u00020#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020#2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bB\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bC\u0010\u0017R\u0014\u0010E\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0017¨\u0006I"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$SessionError", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceErrorKind;", VerifyResponse.AuthenticationState.DISCRIMINATOR, "code", "", "num_completed_turns", "input_type", "output_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceErrorKind;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceErrorKind;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component5", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceErrorKind;", "component6", "component7", "()J", "component8", "component9", "Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionError;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceErrorKind;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionError;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceErrorKind;", "getKind", "getCode", "J", "getNum_completed_turns", "getInput_type", "getOutput_type", "getEventName", "eventName", "Companion", "n2j", "o2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$SessionError implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final o2j Companion = new o2j();
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final String code;
    private final String conversation_uuid;
    private final String input_type;
    private final VoiceEvents$VoiceErrorKind kind;
    private final long num_completed_turns;
    private final String organization_uuid;
    private final String output_type;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(11);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, mtiVar), yb5.w(w1aVar, new mti(12)), null, null, null, null};
    }

    public /* synthetic */ VoiceEvents$SessionError(int i, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind, String str4, long j, String str5, String str6, vnf vnfVar) {
        if (479 != (i & 479)) {
            gvj.f(i, 479, n2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.kind = voiceEvents$VoiceErrorKind;
        if ((i & 32) == 0) {
            this.code = null;
        } else {
            this.code = str4;
        }
        this.num_completed_turns = j;
        this.input_type = str5;
        this.output_type = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return VoiceEvents$VoiceErrorKind.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$SessionError copy$default(VoiceEvents$SessionError voiceEvents$SessionError, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind, String str4, long j, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$SessionError.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$SessionError.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = voiceEvents$SessionError.voice_session_id;
        }
        if ((i & 8) != 0) {
            voiceEvents$VoiceActivationMode = voiceEvents$SessionError.activation_mode;
        }
        if ((i & 16) != 0) {
            voiceEvents$VoiceErrorKind = voiceEvents$SessionError.kind;
        }
        if ((i & 32) != 0) {
            str4 = voiceEvents$SessionError.code;
        }
        if ((i & 64) != 0) {
            j = voiceEvents$SessionError.num_completed_turns;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str5 = voiceEvents$SessionError.input_type;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str6 = voiceEvents$SessionError.output_type;
        }
        long j2 = j;
        VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind2 = voiceEvents$VoiceErrorKind;
        String str7 = str4;
        String str8 = str3;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode2 = voiceEvents$VoiceActivationMode;
        return voiceEvents$SessionError.copy(str, str2, str8, voiceEvents$VoiceActivationMode2, voiceEvents$VoiceErrorKind2, str7, j2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$SessionError self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.activation_mode);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.kind);
        if (output.E(serialDesc) || self.code != null) {
            output.B(serialDesc, 5, srg.a, self.code);
        }
        output.D(serialDesc, 6, self.num_completed_turns);
        output.q(serialDesc, 7, self.input_type);
        output.q(serialDesc, 8, self.output_type);
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
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VoiceEvents$VoiceErrorKind getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getNum_completed_turns() {
        return this.num_completed_turns;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
    }

    public final VoiceEvents$SessionError copy(String organization_uuid, String conversation_uuid, String voice_session_id, VoiceEvents$VoiceActivationMode activation_mode, VoiceEvents$VoiceErrorKind kind, String code, long num_completed_turns, String input_type, String output_type) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        activation_mode.getClass();
        kind.getClass();
        input_type.getClass();
        output_type.getClass();
        return new VoiceEvents$SessionError(organization_uuid, conversation_uuid, voice_session_id, activation_mode, kind, code, num_completed_turns, input_type, output_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$SessionError)) {
            return false;
        }
        VoiceEvents$SessionError voiceEvents$SessionError = (VoiceEvents$SessionError) other;
        return x44.r(this.organization_uuid, voiceEvents$SessionError.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$SessionError.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$SessionError.voice_session_id) && this.activation_mode == voiceEvents$SessionError.activation_mode && this.kind == voiceEvents$SessionError.kind && x44.r(this.code, voiceEvents$SessionError.code) && this.num_completed_turns == voiceEvents$SessionError.num_completed_turns && x44.r(this.input_type, voiceEvents$SessionError.input_type) && x44.r(this.output_type, voiceEvents$SessionError.output_type);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_session_error";
    }

    public final String getInput_type() {
        return this.input_type;
    }

    public final VoiceEvents$VoiceErrorKind getKind() {
        return this.kind;
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

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iHashCode = (this.kind.hashCode() + ((this.activation_mode.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id)) * 31)) * 31;
        String str = this.code;
        return this.output_type.hashCode() + kgh.l(vb7.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.num_completed_turns), 31, this.input_type);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind = this.kind;
        String str4 = this.code;
        long j = this.num_completed_turns;
        String str5 = this.input_type;
        String str6 = this.output_type;
        StringBuilder sbR = kgh.r("SessionError(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", kind=");
        sbR.append(voiceEvents$VoiceErrorKind);
        sbR.append(", code=");
        sbR.append(str4);
        sbR.append(", num_completed_turns=");
        qy1.m(j, ", input_type=", str5, sbR);
        return kgh.q(sbR, ", output_type=", str6, ")");
    }

    public VoiceEvents$SessionError(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind, String str4, long j, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        voiceEvents$VoiceActivationMode.getClass();
        voiceEvents$VoiceErrorKind.getClass();
        str5.getClass();
        str6.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.kind = voiceEvents$VoiceErrorKind;
        this.code = str4;
        this.num_completed_turns = j;
        this.input_type = str5;
        this.output_type = str6;
    }

    public /* synthetic */ VoiceEvents$SessionError(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind, String str4, long j, String str5, String str6, int i, mq5 mq5Var) {
        this(str, str2, str3, voiceEvents$VoiceActivationMode, voiceEvents$VoiceErrorKind, (i & 32) != 0 ? null : str4, j, str5, str6);
    }
}
