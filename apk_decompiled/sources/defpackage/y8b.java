package defpackage;

import com.anthropic.claude.api.memory.MelangeDoc;
import com.anthropic.claude.api.memory.MelangeParsedContent;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y8b implements w28 {
    public static final y8b a;
    private static final SerialDescriptor descriptor;

    static {
        y8b y8bVar = new y8b();
        a = y8bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.memory.MelangeDoc", y8bVar, 6);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("size_bytes", false);
        pluginGeneratedSerialDescriptor.j("updated_at", true);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("parsed", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, xka.a, d4c.S(bc9.a), srgVar, d4c.S(q9b.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        Date date = null;
        String strV2 = null;
        MelangeParsedContent melangeParsedContent = null;
        String str = null;
        long j = 0;
        boolean z = true;
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
                    j = ud4VarC.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    date = (Date) ud4VarC.m(serialDescriptor, 2, bc9.a, date);
                    i |= 4;
                    break;
                case 3:
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    melangeParsedContent = (MelangeParsedContent) ud4VarC.m(serialDescriptor, 4, q9b.a, melangeParsedContent);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MelangeDoc(i, strV, j, date, strV2, melangeParsedContent, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MelangeDoc melangeDoc = (MelangeDoc) obj;
        encoder.getClass();
        melangeDoc.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MelangeDoc.write$Self$api(melangeDoc, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
