package defpackage;

import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j05 implements w28 {
    public static final j05 a;
    private static final SerialDescriptor descriptor;

    static {
        j05 j05Var = new j05();
        a = j05Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem", j05Var, 8);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("directoryUuid", false);
        pluginGeneratedSerialDescriptor.j("iconUrl", true);
        pluginGeneratedSerialDescriptor.j("installState", true);
        pluginGeneratedSerialDescriptor.j("installedServerId", true);
        pluginGeneratedSerialDescriptor.j("isAuthless", true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1.a), srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String strV3 = null;
        String str4 = null;
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
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool);
                    i |= 32;
                    break;
                case 6:
                    strV3 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str4);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ConwaySuggestConnectorsOutputConnectorsItem(i, strV, strV2, str, str2, str3, bool, strV3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem = (ConwaySuggestConnectorsOutputConnectorsItem) obj;
        encoder.getClass();
        conwaySuggestConnectorsOutputConnectorsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwaySuggestConnectorsOutputConnectorsItem.write$Self$Claude_tool_model(conwaySuggestConnectorsOutputConnectorsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
