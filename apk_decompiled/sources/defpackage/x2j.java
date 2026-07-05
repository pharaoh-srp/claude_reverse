package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentOptInPromptViewed;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x2j implements w28 {
    public static final x2j a;
    private static final SerialDescriptor descriptor;

    static {
        x2j x2jVar = new x2j();
        a = x2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.voice.training_consent.opt_in_prompt.viewed", x2jVar, 2);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("entry_source", false);
        pluginGeneratedSerialDescriptor.k(new xmb(20));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, VoiceEvents$TrainingConsentOptInPromptViewed.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$TrainingConsentOptInPromptViewed.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource = null;
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
                voiceEvents$VoiceEntrySource = (VoiceEvents$VoiceEntrySource) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), voiceEvents$VoiceEntrySource);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$TrainingConsentOptInPromptViewed(i, strV, voiceEvents$VoiceEntrySource, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$TrainingConsentOptInPromptViewed voiceEvents$TrainingConsentOptInPromptViewed = (VoiceEvents$TrainingConsentOptInPromptViewed) obj;
        encoder.getClass();
        voiceEvents$TrainingConsentOptInPromptViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$TrainingConsentOptInPromptViewed.write$Self$analytics(voiceEvents$TrainingConsentOptInPromptViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
