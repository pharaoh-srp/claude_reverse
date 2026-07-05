package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$SettingsChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r2j implements w28 {
    public static final r2j a;
    private static final SerialDescriptor descriptor;

    static {
        r2j r2jVar = new r2j();
        a = r2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_settings_changed", r2jVar, 9);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("activation_mode", false);
        pluginGeneratedSerialDescriptor.j("setting", false);
        pluginGeneratedSerialDescriptor.j("from_value", false);
        pluginGeneratedSerialDescriptor.j("to_value", false);
        fsh.y(pluginGeneratedSerialDescriptor, "input_type", false, "output_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$SettingsChanged.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), srgVar, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$SettingsChanged.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), voiceEvents$VoiceActivationMode);
                    i |= 8;
                    break;
                case 4:
                    voiceEvents$VoiceSettingKind = (VoiceEvents$VoiceSettingKind) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), voiceEvents$VoiceSettingKind);
                    i |= 16;
                    break;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strV5 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strV6 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                case 8:
                    strV7 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$SettingsChanged(i, strV, strV2, strV3, voiceEvents$VoiceActivationMode, voiceEvents$VoiceSettingKind, strV4, strV5, strV6, strV7, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$SettingsChanged voiceEvents$SettingsChanged = (VoiceEvents$SettingsChanged) obj;
        encoder.getClass();
        voiceEvents$SettingsChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$SettingsChanged.write$Self$analytics(voiceEvents$SettingsChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
