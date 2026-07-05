package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mti;
import defpackage.onf;
import defpackage.r2j;
import defpackage.s2j;
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
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016Jj\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010%\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020!2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b>\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0016R\u0014\u0010B\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0016¨\u0006F"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$SettingsChanged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind;", "setting", "from_value", "to_value", "input_type", "output_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component5", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind;", "component6", "component7", "component8", "component9", "Lcom/anthropic/claude/analytics/events/VoiceEvents$SettingsChanged;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/VoiceEvents$SettingsChanged;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$SettingsChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceSettingKind;", "getSetting", "getFrom_value", "getTo_value", "getInput_type", "getOutput_type", "getEventName", "eventName", "Companion", "r2j", "s2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$SettingsChanged implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final s2j Companion = new s2j();
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final String conversation_uuid;
    private final String from_value;
    private final String input_type;
    private final String organization_uuid;
    private final String output_type;
    private final VoiceEvents$VoiceSettingKind setting;
    private final String to_value;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(15);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, mtiVar), yb5.w(w1aVar, new mti(16)), null, null, null, null};
    }

    public VoiceEvents$SettingsChanged(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        voiceEvents$VoiceActivationMode.getClass();
        voiceEvents$VoiceSettingKind.getClass();
        ij0.z(str4, str5, str6, str7);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.setting = voiceEvents$VoiceSettingKind;
        this.from_value = str4;
        this.to_value = str5;
        this.input_type = str6;
        this.output_type = str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return VoiceEvents$VoiceSettingKind.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$SettingsChanged copy$default(VoiceEvents$SettingsChanged voiceEvents$SettingsChanged, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$SettingsChanged.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$SettingsChanged.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = voiceEvents$SettingsChanged.voice_session_id;
        }
        if ((i & 8) != 0) {
            voiceEvents$VoiceActivationMode = voiceEvents$SettingsChanged.activation_mode;
        }
        if ((i & 16) != 0) {
            voiceEvents$VoiceSettingKind = voiceEvents$SettingsChanged.setting;
        }
        if ((i & 32) != 0) {
            str4 = voiceEvents$SettingsChanged.from_value;
        }
        if ((i & 64) != 0) {
            str5 = voiceEvents$SettingsChanged.to_value;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str6 = voiceEvents$SettingsChanged.input_type;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str7 = voiceEvents$SettingsChanged.output_type;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind2 = voiceEvents$VoiceSettingKind;
        String str12 = str3;
        return voiceEvents$SettingsChanged.copy(str, str2, str12, voiceEvents$VoiceActivationMode, voiceEvents$VoiceSettingKind2, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$SettingsChanged self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.activation_mode);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.setting);
        output.q(serialDesc, 5, self.from_value);
        output.q(serialDesc, 6, self.to_value);
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
    public final VoiceEvents$VoiceSettingKind getSetting() {
        return this.setting;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFrom_value() {
        return this.from_value;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTo_value() {
        return this.to_value;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
    }

    public final VoiceEvents$SettingsChanged copy(String organization_uuid, String conversation_uuid, String voice_session_id, VoiceEvents$VoiceActivationMode activation_mode, VoiceEvents$VoiceSettingKind setting, String from_value, String to_value, String input_type, String output_type) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        activation_mode.getClass();
        setting.getClass();
        from_value.getClass();
        to_value.getClass();
        input_type.getClass();
        output_type.getClass();
        return new VoiceEvents$SettingsChanged(organization_uuid, conversation_uuid, voice_session_id, activation_mode, setting, from_value, to_value, input_type, output_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$SettingsChanged)) {
            return false;
        }
        VoiceEvents$SettingsChanged voiceEvents$SettingsChanged = (VoiceEvents$SettingsChanged) other;
        return x44.r(this.organization_uuid, voiceEvents$SettingsChanged.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$SettingsChanged.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$SettingsChanged.voice_session_id) && this.activation_mode == voiceEvents$SettingsChanged.activation_mode && this.setting == voiceEvents$SettingsChanged.setting && x44.r(this.from_value, voiceEvents$SettingsChanged.from_value) && x44.r(this.to_value, voiceEvents$SettingsChanged.to_value) && x44.r(this.input_type, voiceEvents$SettingsChanged.input_type) && x44.r(this.output_type, voiceEvents$SettingsChanged.output_type);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_settings_changed";
    }

    public final String getFrom_value() {
        return this.from_value;
    }

    public final String getInput_type() {
        return this.input_type;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getOutput_type() {
        return this.output_type;
    }

    public final VoiceEvents$VoiceSettingKind getSetting() {
        return this.setting;
    }

    public final String getTo_value() {
        return this.to_value;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return this.output_type.hashCode() + kgh.l(kgh.l(kgh.l((this.setting.hashCode() + ((this.activation_mode.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id)) * 31)) * 31, 31, this.from_value), 31, this.to_value), 31, this.input_type);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind = this.setting;
        String str4 = this.from_value;
        String str5 = this.to_value;
        String str6 = this.input_type;
        String str7 = this.output_type;
        StringBuilder sbR = kgh.r("SettingsChanged(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", setting=");
        sbR.append(voiceEvents$VoiceSettingKind);
        sbR.append(", from_value=");
        sbR.append(str4);
        sbR.append(", to_value=");
        kgh.u(sbR, str5, ", input_type=", str6, ", output_type=");
        return ij0.m(sbR, str7, ")");
    }

    public /* synthetic */ VoiceEvents$SettingsChanged(int i, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (511 != (i & 511)) {
            gvj.f(i, 511, r2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.setting = voiceEvents$VoiceSettingKind;
        this.from_value = str4;
        this.to_value = str5;
        this.input_type = str6;
        this.output_type = str7;
    }
}
