package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentSharePreferencePromptSubmitted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentState;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l3j implements w28 {
    public static final l3j a;
    private static final SerialDescriptor descriptor;

    static {
        l3j l3jVar = new l3j();
        a = l3jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.voice.training_consent.share_preference_prompt.submitted", l3jVar, 2);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("consent_state", false);
        pluginGeneratedSerialDescriptor.k(new xmb(20));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, VoiceEvents$TrainingConsentSharePreferencePromptSubmitted.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentSharePreferencePromptSubmitted.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                voiceEvents$VoiceTrainingConsentState = (VoiceEvents$VoiceTrainingConsentState) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), voiceEvents$VoiceTrainingConsentState);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$TrainingConsentSharePreferencePromptSubmitted(i, strV, voiceEvents$VoiceTrainingConsentState, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$TrainingConsentSharePreferencePromptSubmitted voiceEvents$TrainingConsentSharePreferencePromptSubmitted = (VoiceEvents$TrainingConsentSharePreferencePromptSubmitted) obj;
        encoder.getClass();
        voiceEvents$TrainingConsentSharePreferencePromptSubmitted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$TrainingConsentSharePreferencePromptSubmitted.write$Self$analytics(voiceEvents$TrainingConsentSharePreferencePromptSubmitted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
