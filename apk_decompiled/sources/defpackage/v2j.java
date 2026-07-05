package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentOptInPromptSubmitted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentState;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v2j implements w28 {
    public static final v2j a;
    private static final SerialDescriptor descriptor;

    static {
        v2j v2jVar = new v2j();
        a = v2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.voice.training_consent.opt_in_prompt.submitted", v2jVar, 3);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        fsh.y(pluginGeneratedSerialDescriptor, "entry_source", false, "consent_state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentOptInPromptSubmitted.$childSerializers;
        return new KSerializer[]{srg.a, kw9VarArr[1].getValue(), kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentOptInPromptSubmitted.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource = null;
        VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                voiceEvents$VoiceEntrySource = (VoiceEvents$VoiceEntrySource) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), voiceEvents$VoiceEntrySource);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                voiceEvents$VoiceTrainingConsentState = (VoiceEvents$VoiceTrainingConsentState) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), voiceEvents$VoiceTrainingConsentState);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$TrainingConsentOptInPromptSubmitted(i, strV, voiceEvents$VoiceEntrySource, voiceEvents$VoiceTrainingConsentState, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$TrainingConsentOptInPromptSubmitted voiceEvents$TrainingConsentOptInPromptSubmitted = (VoiceEvents$TrainingConsentOptInPromptSubmitted) obj;
        encoder.getClass();
        voiceEvents$TrainingConsentOptInPromptSubmitted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$TrainingConsentOptInPromptSubmitted.write$Self$analytics(voiceEvents$TrainingConsentOptInPromptSubmitted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
