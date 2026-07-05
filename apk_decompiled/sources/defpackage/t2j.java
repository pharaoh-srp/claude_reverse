package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentOptInPromptDismissed;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentDismissTrigger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t2j implements w28 {
    public static final t2j a;
    private static final SerialDescriptor descriptor;

    static {
        t2j t2jVar = new t2j();
        a = t2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.voice.training_consent.opt_in_prompt.dismissed", t2jVar, 3);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        fsh.y(pluginGeneratedSerialDescriptor, "entry_source", false, "dismiss_trigger", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentOptInPromptDismissed.$childSerializers;
        return new KSerializer[]{srg.a, kw9VarArr[1].getValue(), kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentOptInPromptDismissed.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource = null;
        VoiceEvents$VoiceTrainingConsentDismissTrigger voiceEvents$VoiceTrainingConsentDismissTrigger = null;
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
                voiceEvents$VoiceTrainingConsentDismissTrigger = (VoiceEvents$VoiceTrainingConsentDismissTrigger) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), voiceEvents$VoiceTrainingConsentDismissTrigger);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$TrainingConsentOptInPromptDismissed(i, strV, voiceEvents$VoiceEntrySource, voiceEvents$VoiceTrainingConsentDismissTrigger, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$TrainingConsentOptInPromptDismissed voiceEvents$TrainingConsentOptInPromptDismissed = (VoiceEvents$TrainingConsentOptInPromptDismissed) obj;
        encoder.getClass();
        voiceEvents$TrainingConsentOptInPromptDismissed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$TrainingConsentOptInPromptDismissed.write$Self$analytics(voiceEvents$TrainingConsentOptInPromptDismissed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
