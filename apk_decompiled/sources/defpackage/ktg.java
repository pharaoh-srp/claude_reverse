package defpackage;

import com.anthropic.claude.analytics.events.SttEvents$StartRecording;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ktg implements w28 {
    public static final ktg a;
    private static final SerialDescriptor descriptor;

    static {
        ktg ktgVar = new ktg();
        a = ktgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_stt_start_recording", ktgVar, 7);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("language", false);
        pluginGeneratedSerialDescriptor.j("transcriber", false);
        pluginGeneratedSerialDescriptor.j("surface", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("entry_mode", true);
        pluginGeneratedSerialDescriptor.k(new xmb(15));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    strV4 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str3);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SttEvents$StartRecording(i, strV, strV2, strV3, strV4, str, str2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SttEvents$StartRecording sttEvents$StartRecording = (SttEvents$StartRecording) obj;
        encoder.getClass();
        sttEvents$StartRecording.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SttEvents$StartRecording.write$Self$analytics(sttEvents$StartRecording, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
