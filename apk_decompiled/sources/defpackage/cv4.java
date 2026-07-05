package defpackage;

import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cv4 implements w28 {
    public static final cv4 a;
    private static final SerialDescriptor descriptor;

    static {
        cv4 cv4Var = new cv4();
        a = cv4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ConwayExtensionMeta", cv4Var, 9);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("extension_version", true);
        pluginGeneratedSerialDescriptor.j("tools", true);
        pluginGeneratedSerialDescriptor.j("http_routes", true);
        pluginGeneratedSerialDescriptor.j("app_screens", true);
        pluginGeneratedSerialDescriptor.j("has_hook", true);
        pluginGeneratedSerialDescriptor.j("is_builtin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ConwayExtensionMeta.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[4].getValue(), kw9VarArr[5].getValue(), nr4.a, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ConwayExtensionMeta.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        String strV = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                    list = (List) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) ud4VarC.l(serialDescriptor, 6, nr4.a, list3);
                    i |= 64;
                    break;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                case 8:
                    zU2 = ud4VarC.u(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ConwayExtensionMeta(i, strV, str, str2, str3, list, list2, list3, zU, zU2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwayExtensionMeta conwayExtensionMeta = (ConwayExtensionMeta) obj;
        encoder.getClass();
        conwayExtensionMeta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayExtensionMeta.write$Self$conway(conwayExtensionMeta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
