package defpackage;

import com.anthropic.claude.models.organization.configtypes.SpeechInputConfig;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bhg implements w28 {
    public static final bhg a;
    private static final SerialDescriptor descriptor;

    static {
        bhg bhgVar = new bhg();
        a = bhgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.SpeechInputConfig", bhgVar, 4);
        pluginGeneratedSerialDescriptor.j("maximum_request_duration_seconds", true);
        pluginGeneratedSerialDescriptor.j("default_language_code", true);
        pluginGeneratedSerialDescriptor.j("supported_languages", true);
        pluginGeneratedSerialDescriptor.j("is_voice_multilingual_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a), d4c.S(srg.a), d4c.S((KSerializer) SpeechInputConfig.$childSerializers[2].getValue()), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SpeechInputConfig.$childSerializers;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        List list = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                list = (List) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SpeechInputConfig(i, num, str, list, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SpeechInputConfig speechInputConfig = (SpeechInputConfig) obj;
        encoder.getClass();
        speechInputConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SpeechInputConfig.write$Self$models(speechInputConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
