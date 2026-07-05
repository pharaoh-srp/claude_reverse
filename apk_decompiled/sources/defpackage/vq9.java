package defpackage;

import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.SourceImage;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq9 implements w28 {
    public static final vq9 a;
    private static final SerialDescriptor descriptor;

    static {
        vq9 vq9Var = new vq9();
        a = vq9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.KnowledgeSource", vq9Var, 9);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("sourceImage", false);
        pluginGeneratedSerialDescriptor.j("sourceName", false);
        pluginGeneratedSerialDescriptor.j("resourceType", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        pluginGeneratedSerialDescriptor.j("isTrusted", false);
        pluginGeneratedSerialDescriptor.j("key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = KnowledgeSource.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[3].getValue(), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), zt1.a, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = KnowledgeSource.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        SourceImage sourceImage = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    break;
                case 3:
                    sourceImage = (SourceImage) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), sourceImage);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str6);
                    i |= 64;
                    break;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                case 8:
                    strV = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new KnowledgeSource(i, str, str2, str3, sourceImage, str4, str5, str6, zU, strV, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
        encoder.getClass();
        knowledgeSource.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        KnowledgeSource.write$Self$Claude_tool_model(knowledgeSource, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
