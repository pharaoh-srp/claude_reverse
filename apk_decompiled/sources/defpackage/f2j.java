package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$FeedbackSubmitted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f2j implements w28 {
    public static final f2j a;
    private static final SerialDescriptor descriptor;

    static {
        f2j f2jVar = new f2j();
        a = f2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_feedback_submitted", f2jVar, 13);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("is_positive", false);
        pluginGeneratedSerialDescriptor.j("session_duration_ms", false);
        pluginGeneratedSerialDescriptor.j("num_turns", false);
        pluginGeneratedSerialDescriptor.j("reason", true);
        pluginGeneratedSerialDescriptor.j("detail", true);
        pluginGeneratedSerialDescriptor.j("input_type", true);
        pluginGeneratedSerialDescriptor.j("output_type", true);
        pluginGeneratedSerialDescriptor.j("activation_mode", true);
        fsh.y(pluginGeneratedSerialDescriptor, "num_focus_losses", true, "focus_transient_loss_total_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$FeedbackSubmitted.$childSerializers;
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, zt1.a, xkaVar, xkaVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[10].getValue()), d4c.S(xkaVar), d4c.S(xkaVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$FeedbackSubmitted.$childSerializers;
        long j = 0;
        long j2 = 0;
        Long l = null;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        String str4 = null;
        String str5 = null;
        Long l2 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        boolean zU = false;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = strV2;
                    z = false;
                    strV2 = str;
                    break;
                case 0:
                    str = strV2;
                    i |= 1;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    strV2 = str;
                    break;
                case 1:
                    str3 = strV;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    strV = str3;
                    break;
                case 2:
                    str3 = strV;
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    strV = str3;
                    break;
                case 3:
                    str3 = strV;
                    zU = ud4VarC.u(serialDescriptor, 3);
                    i |= 8;
                    strV = str3;
                    break;
                case 4:
                    str3 = strV;
                    j = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    strV = str3;
                    break;
                case 5:
                    str3 = strV;
                    j2 = ud4VarC.j(serialDescriptor, 5);
                    i |= 32;
                    strV = str3;
                    break;
                case 6:
                    str2 = strV;
                    str = strV2;
                    str6 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str6);
                    i |= 64;
                    strV = str2;
                    strV2 = str;
                    break;
                case 7:
                    str2 = strV;
                    str = strV2;
                    str7 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strV = str2;
                    strV2 = str;
                    break;
                case 8:
                    str2 = strV;
                    str = strV2;
                    str5 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str5);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strV = str2;
                    strV2 = str;
                    break;
                case 9:
                    str2 = strV;
                    str = strV2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str4);
                    i |= 512;
                    strV = str2;
                    strV2 = str;
                    break;
                case 10:
                    str2 = strV;
                    str = strV2;
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.m(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), voiceEvents$VoiceActivationMode);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strV = str2;
                    strV2 = str;
                    break;
                case 11:
                    str2 = strV;
                    str = strV2;
                    l = (Long) ud4VarC.m(serialDescriptor, 11, xka.a, l);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strV = str2;
                    strV2 = str;
                    break;
                case 12:
                    str2 = strV;
                    str = strV2;
                    l2 = (Long) ud4VarC.m(serialDescriptor, 12, xka.a, l2);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strV = str2;
                    strV2 = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$FeedbackSubmitted(i, strV, strV2, strV3, zU, j, j2, str6, str7, str5, str4, voiceEvents$VoiceActivationMode, l, l2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$FeedbackSubmitted voiceEvents$FeedbackSubmitted = (VoiceEvents$FeedbackSubmitted) obj;
        encoder.getClass();
        voiceEvents$FeedbackSubmitted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$FeedbackSubmitted.write$Self$analytics(voiceEvents$FeedbackSubmitted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
