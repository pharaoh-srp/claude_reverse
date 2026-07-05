package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$ConnectionDropped;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b2j implements w28 {
    public static final b2j a;
    private static final SerialDescriptor descriptor;

    static {
        b2j b2jVar = new b2j();
        a = b2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_connection_dropped", b2jVar, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("activation_mode", false);
        pluginGeneratedSerialDescriptor.j("num_completed_turns", false);
        pluginGeneratedSerialDescriptor.j("recovered", false);
        pluginGeneratedSerialDescriptor.j("retry_attempts", false);
        pluginGeneratedSerialDescriptor.j("recovery_duration_ms", true);
        fsh.y(pluginGeneratedSerialDescriptor, "input_type", false, "output_type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$ConnectionDropped.$childSerializers;
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), xkaVar, zt1.a, xkaVar, d4c.S(xkaVar), srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$ConnectionDropped.$childSerializers;
        Object obj = null;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        String strV4 = null;
        String strV5 = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        Long l = null;
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
                    j = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = ud4VarC.j(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) ud4VarC.m(serialDescriptor, 7, xka.a, l);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    strV4 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                case 9:
                    strV5 = ud4VarC.v(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$ConnectionDropped(i, strV, strV2, strV3, voiceEvents$VoiceActivationMode, j, zU, j2, l, strV4, strV5, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$ConnectionDropped voiceEvents$ConnectionDropped = (VoiceEvents$ConnectionDropped) obj;
        encoder.getClass();
        voiceEvents$ConnectionDropped.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$ConnectionDropped.write$Self$analytics(voiceEvents$ConnectionDropped, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
