package defpackage;

import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItem;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItemType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nje implements w28 {
    public static final nje a;
    private static final SerialDescriptor descriptor;

    static {
        nje njeVar = new nje();
        a = njeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItem", njeVar, 6);
        pluginGeneratedSerialDescriptor.j("locator_ref", true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("optional", true);
        pluginGeneratedSerialDescriptor.j("placeholder", true);
        pluginGeneratedSerialDescriptor.j("prefill", true);
        pluginGeneratedSerialDescriptor.j("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), srgVar, d4c.S(zt1.a), d4c.S(srgVar), d4c.S(srgVar), qje.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String strV = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        RequestFormInputFromUserInputFieldsItemType requestFormInputFromUserInputFieldsItemType = null;
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
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
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
                    requestFormInputFromUserInputFieldsItemType = (RequestFormInputFromUserInputFieldsItemType) ud4VarC.l(serialDescriptor, 5, qje.d, requestFormInputFromUserInputFieldsItemType);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RequestFormInputFromUserInputFieldsItem(i, str, strV, bool, str2, str3, requestFormInputFromUserInputFieldsItemType, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RequestFormInputFromUserInputFieldsItem requestFormInputFromUserInputFieldsItem = (RequestFormInputFromUserInputFieldsItem) obj;
        encoder.getClass();
        requestFormInputFromUserInputFieldsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RequestFormInputFromUserInputFieldsItem.write$Self$Claude_tool_model(requestFormInputFromUserInputFieldsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
