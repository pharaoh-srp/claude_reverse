package defpackage;

import com.anthropic.claude.analytics.events.SttEvents$CancelRecording;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class atg implements w28 {
    public static final atg a;
    private static final SerialDescriptor descriptor;

    static {
        atg atgVar = new atg();
        a = atgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_stt_cancel_recording", atgVar, 9);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("listening_duration_seconds", false);
        pluginGeneratedSerialDescriptor.j("transcription_length", false);
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
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, e79Var, e79Var, srgVar, srgVar, kSerializerS, kSerializerS2, kSerializerS3};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        String str = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
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
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str2);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    str = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SttEvents$CancelRecording(i, strV, strV2, iR, iR2, strV3, strV4, str2, str3, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SttEvents$CancelRecording sttEvents$CancelRecording = (SttEvents$CancelRecording) obj;
        encoder.getClass();
        sttEvents$CancelRecording.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SttEvents$CancelRecording.write$Self$analytics(sttEvents$CancelRecording, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
