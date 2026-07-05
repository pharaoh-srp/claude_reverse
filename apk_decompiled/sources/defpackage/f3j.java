package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentSettingsChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentState;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentSurface;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f3j implements w28 {
    public static final f3j a;
    private static final SerialDescriptor descriptor;

    static {
        f3j f3jVar = new f3j();
        a = f3jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.voice.training_consent.settings.changed", f3jVar, 4);
        pluginGeneratedSerialDescriptor.j("surface", false);
        pluginGeneratedSerialDescriptor.j("from_state", false);
        fsh.y(pluginGeneratedSerialDescriptor, "to_state", false, "voice_session_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentSettingsChanged.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), kw9VarArr[2].getValue(), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentSettingsChanged.$childSerializers;
        boolean z = true;
        int i = 0;
        VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface = null;
        VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState = null;
        VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState2 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                voiceEvents$VoiceTrainingConsentSurface = (VoiceEvents$VoiceTrainingConsentSurface) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), voiceEvents$VoiceTrainingConsentSurface);
                i |= 1;
            } else if (iX == 1) {
                voiceEvents$VoiceTrainingConsentState = (VoiceEvents$VoiceTrainingConsentState) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), voiceEvents$VoiceTrainingConsentState);
                i |= 2;
            } else if (iX == 2) {
                voiceEvents$VoiceTrainingConsentState2 = (VoiceEvents$VoiceTrainingConsentState) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), voiceEvents$VoiceTrainingConsentState2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$TrainingConsentSettingsChanged(i, voiceEvents$VoiceTrainingConsentSurface, voiceEvents$VoiceTrainingConsentState, voiceEvents$VoiceTrainingConsentState2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$TrainingConsentSettingsChanged voiceEvents$TrainingConsentSettingsChanged = (VoiceEvents$TrainingConsentSettingsChanged) obj;
        encoder.getClass();
        voiceEvents$TrainingConsentSettingsChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$TrainingConsentSettingsChanged.write$Self$analytics(voiceEvents$TrainingConsentSettingsChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
