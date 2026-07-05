package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentSharePreferencePromptDismissed;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentDismissTrigger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j3j implements w28 {
    public static final j3j a;
    private static final SerialDescriptor descriptor;

    static {
        j3j j3jVar = new j3j();
        a = j3jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.voice.training_consent.share_preference_prompt.dismissed", j3jVar, 2);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("dismiss_trigger", false);
        pluginGeneratedSerialDescriptor.k(new xmb(20));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, VoiceEvents$TrainingConsentSharePreferencePromptDismissed.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentSharePreferencePromptDismissed.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        VoiceEvents$VoiceTrainingConsentDismissTrigger voiceEvents$VoiceTrainingConsentDismissTrigger = null;
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
                voiceEvents$VoiceTrainingConsentDismissTrigger = (VoiceEvents$VoiceTrainingConsentDismissTrigger) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), voiceEvents$VoiceTrainingConsentDismissTrigger);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$TrainingConsentSharePreferencePromptDismissed(i, strV, voiceEvents$VoiceTrainingConsentDismissTrigger, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$TrainingConsentSharePreferencePromptDismissed voiceEvents$TrainingConsentSharePreferencePromptDismissed = (VoiceEvents$TrainingConsentSharePreferencePromptDismissed) obj;
        encoder.getClass();
        voiceEvents$TrainingConsentSharePreferencePromptDismissed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$TrainingConsentSharePreferencePromptDismissed.write$Self$analytics(voiceEvents$TrainingConsentSharePreferencePromptDismissed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
