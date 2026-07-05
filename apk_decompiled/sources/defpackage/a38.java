package defpackage;

import com.anthropic.claude.api.chat.tool.GenericSourceMetadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a38 implements w28 {
    public static final a38 a;
    private static final SerialDescriptor descriptor;

    static {
        a38 a38Var = new a38();
        a = a38Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("generic_metadata", a38Var, 3);
        pluginGeneratedSerialDescriptor.j("preview_title", true);
        pluginGeneratedSerialDescriptor.j("icon_url", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.k(new gl0(10));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GenericSourceMetadata(i, str, str2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GenericSourceMetadata genericSourceMetadata = (GenericSourceMetadata) obj;
        encoder.getClass();
        genericSourceMetadata.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GenericSourceMetadata.write$Self$api(genericSourceMetadata, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
