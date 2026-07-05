package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$FeedbackPrompted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d2j implements w28 {
    public static final d2j a;
    private static final SerialDescriptor descriptor;

    static {
        d2j d2jVar = new d2j();
        a = d2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_feedback_prompted", d2jVar, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("session_duration_ms", false);
        pluginGeneratedSerialDescriptor.j("num_turns", false);
        pluginGeneratedSerialDescriptor.j("input_type", false);
        pluginGeneratedSerialDescriptor.j("output_type", false);
        pluginGeneratedSerialDescriptor.j("activation_mode", false);
        fsh.y(pluginGeneratedSerialDescriptor, "num_focus_losses", true, "focus_transient_loss_total_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$FeedbackPrompted.$childSerializers;
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, xkaVar, xkaVar, srgVar, srgVar, kw9VarArr[7].getValue(), d4c.S(xkaVar), d4c.S(xkaVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$FeedbackPrompted.$childSerializers;
        long j = 0;
        long j2 = 0;
        Long l = null;
        boolean z = true;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        Long l2 = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
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
                    j = ud4VarC.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j2 = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV5 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), voiceEvents$VoiceActivationMode);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    l2 = (Long) ud4VarC.m(serialDescriptor, 8, xka.a, l2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    l = (Long) ud4VarC.m(serialDescriptor, 9, xka.a, l);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$FeedbackPrompted(i, strV, strV2, strV3, j, j2, strV4, strV5, voiceEvents$VoiceActivationMode, l2, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$FeedbackPrompted voiceEvents$FeedbackPrompted = (VoiceEvents$FeedbackPrompted) obj;
        encoder.getClass();
        voiceEvents$FeedbackPrompted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$FeedbackPrompted.write$Self$analytics(voiceEvents$FeedbackPrompted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
