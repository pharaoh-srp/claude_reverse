package defpackage;

import com.anthropic.claude.models.organization.configtypes.SttVoiceOption;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class stg implements w28 {
    public static final stg a;
    private static final SerialDescriptor descriptor;

    static {
        stg stgVar = new stg();
        a = stgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.SttVoiceOption", stgVar, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("preview_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar)};
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
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SttVoiceOption(i, strV, strV2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SttVoiceOption sttVoiceOption = (SttVoiceOption) obj;
        encoder.getClass();
        sttVoiceOption.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SttVoiceOption.write$Self$models(sttVoiceOption, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
