package defpackage;

import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eg3 implements w28 {
    public static final eg3 a;
    private static final SerialDescriptor descriptor;

    static {
        eg3 eg3Var = new eg3();
        a = eg3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.citation.Citation", eg3Var, 9);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("sources", true);
        pluginGeneratedSerialDescriptor.j("is_trusted", true);
        pluginGeneratedSerialDescriptor.j("start_index", true);
        pluginGeneratedSerialDescriptor.j("end_index", true);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("subtitles", true);
        pluginGeneratedSerialDescriptor.j("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = Citation.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S((KSerializer) kw9VarArr[2].getValue());
        KSerializer kSerializerS4 = d4c.S(zt1.a);
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, d4c.S(e79Var), d4c.S(e79Var), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S((KSerializer) kw9VarArr[8].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = Citation.$childSerializers;
        SourceMetadata sourceMetadata = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        String str2 = null;
        List list2 = null;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) ud4VarC.m(serialDescriptor, 4, e79.a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str3);
                    i |= 64;
                    break;
                case 7:
                    list = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    sourceMetadata = (SourceMetadata) ud4VarC.m(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), sourceMetadata);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Citation(i, str, str2, list2, bool, num, num2, str3, list, sourceMetadata, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Citation citation = (Citation) obj;
        encoder.getClass();
        citation.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Citation.write$Self$api(citation, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
