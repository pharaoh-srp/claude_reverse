package defpackage;

import com.anthropic.claude.api.chat.tool.ArtifactToolInput;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qt0 implements w28 {
    public static final qt0 a;
    private static final SerialDescriptor descriptor;

    static {
        qt0 qt0Var = new qt0();
        a = qt0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.tool.ArtifactToolInput", qt0Var, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("language", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("command", false);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("md_citations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArtifactToolInput.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[7].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArtifactToolInput.$childSerializers;
        Object obj = null;
        boolean z = true;
        List list = null;
        String strV = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strV2 = null;
        String str5 = null;
        int i = 0;
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
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    strV2 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str5);
                    i |= 64;
                    break;
                case 7:
                    list = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactToolInput(i, strV, str, str2, str3, str4, strV2, str5, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactToolInput artifactToolInput = (ArtifactToolInput) obj;
        encoder.getClass();
        artifactToolInput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactToolInput.write$Self$api(artifactToolInput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
