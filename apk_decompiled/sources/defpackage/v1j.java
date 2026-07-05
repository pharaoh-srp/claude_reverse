package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$AudioEffectsCapability;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v1j implements w28 {
    public static final v1j a;
    private static final SerialDescriptor descriptor;

    static {
        v1j v1jVar = new v1j();
        a = v1jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_audio_effects_capability", v1jVar, 7);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("aec_available", false);
        pluginGeneratedSerialDescriptor.j("aec_enabled", false);
        fsh.y(pluginGeneratedSerialDescriptor, "ns_available", false, "ns_enabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, zt1Var, zt1Var, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        boolean zU4 = false;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
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
                    zU = ud4VarC.u(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zU2 = ud4VarC.u(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zU3 = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zU4 = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$AudioEffectsCapability(i, strV, strV2, strV3, zU, zU2, zU3, zU4, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$AudioEffectsCapability voiceEvents$AudioEffectsCapability = (VoiceEvents$AudioEffectsCapability) obj;
        encoder.getClass();
        voiceEvents$AudioEffectsCapability.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$AudioEffectsCapability.write$Self$analytics(voiceEvents$AudioEffectsCapability, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
