package defpackage;

import com.anthropic.claude.analytics.events.SttEvents$Error;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gtg implements w28 {
    public static final gtg a;
    private static final SerialDescriptor descriptor;

    static {
        gtg gtgVar = new gtg();
        a = gtgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_stt_error", gtgVar, 11);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("listening_duration_seconds", false);
        pluginGeneratedSerialDescriptor.j("transcription_length", false);
        pluginGeneratedSerialDescriptor.j("language", false);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.j("transcriber", false);
        pluginGeneratedSerialDescriptor.j("error_kind", false);
        pluginGeneratedSerialDescriptor.j("surface", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("entry_mode", true);
        pluginGeneratedSerialDescriptor.k(new xmb(15));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, e79Var, e79Var, srgVar, srgVar, srgVar, srgVar, kSerializerS, kSerializerS2, kSerializerS3};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        String str = null;
        String str2 = null;
        boolean z2 = true;
        String str3 = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        int iR = 0;
        int iR2 = 0;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strV5 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strV6 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                case 8:
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str3);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str2);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            z2 = z;
        }
        ud4VarC.b(serialDescriptor);
        return new SttEvents$Error(i, strV, strV2, iR, iR2, strV3, strV4, strV5, strV6, str3, str2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SttEvents$Error sttEvents$Error = (SttEvents$Error) obj;
        encoder.getClass();
        sttEvents$Error.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SttEvents$Error.write$Self$analytics(sttEvents$Error, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
