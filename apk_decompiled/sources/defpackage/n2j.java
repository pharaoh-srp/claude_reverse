package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$SessionError;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceErrorKind;
import com.anthropic.claude.api.login.VerifyResponse;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n2j implements w28 {
    public static final n2j a;
    private static final SerialDescriptor descriptor;

    static {
        n2j n2jVar = new n2j();
        a = n2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_session_error", n2jVar, 9);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("activation_mode", false);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("code", true);
        pluginGeneratedSerialDescriptor.j("num_completed_turns", false);
        fsh.y(pluginGeneratedSerialDescriptor, "input_type", false, "output_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$SessionError.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), d4c.S(srgVar), xka.a, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$SessionError.$childSerializers;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind = null;
        String str = null;
        String strV4 = null;
        String strV5 = null;
        long j = 0;
        boolean z = true;
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
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), voiceEvents$VoiceActivationMode);
                    i |= 8;
                    break;
                case 4:
                    voiceEvents$VoiceErrorKind = (VoiceEvents$VoiceErrorKind) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), voiceEvents$VoiceErrorKind);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                case 6:
                    j = ud4VarC.j(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strV4 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    strV5 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$SessionError(i, strV, strV2, strV3, voiceEvents$VoiceActivationMode, voiceEvents$VoiceErrorKind, str, j, strV4, strV5, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$SessionError voiceEvents$SessionError = (VoiceEvents$SessionError) obj;
        encoder.getClass();
        voiceEvents$SessionError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$SessionError.write$Self$analytics(voiceEvents$SessionError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
