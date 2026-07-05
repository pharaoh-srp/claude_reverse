package defpackage;

import com.anthropic.claude.api.model.ModelCapabilities;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cob implements w28 {
    public static final cob a;
    private static final SerialDescriptor descriptor;

    static {
        cob cobVar = new cob();
        a = cobVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ModelOption", cobVar, 12);
        pluginGeneratedSerialDescriptor.j("model", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("description_i18n_key", true);
        pluginGeneratedSerialDescriptor.j("overflow", true);
        pluginGeneratedSerialDescriptor.j("inactive", true);
        pluginGeneratedSerialDescriptor.j("thinking_modes", true);
        pluginGeneratedSerialDescriptor.j("capabilities", true);
        pluginGeneratedSerialDescriptor.j("notice_text", true);
        pluginGeneratedSerialDescriptor.j("notice_text_i18n_key", true);
        pluginGeneratedSerialDescriptor.j("knowledgeCutoff", true);
        pluginGeneratedSerialDescriptor.j("slow_kb_warning_threshold", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ModelOption.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S((KSerializer) kw9VarArr[2].getValue());
        KSerializer kSerializerS2 = d4c.S(srgVar);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{vnb.a, srgVar, kSerializerS, kSerializerS2, d4c.S(zt1Var), d4c.S(zt1Var), d4c.S((KSerializer) kw9VarArr[6].getValue()), d4c.S(nnb.a), d4c.S((KSerializer) kw9VarArr[8].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        kw9[] kw9VarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr3 = ModelOption.$childSerializers;
        Integer num = null;
        String str = null;
        String str2 = null;
        boolean z2 = true;
        ModelCapabilities modelCapabilities = null;
        int i = 0;
        String strM1064unboximpl = null;
        _ServerLocalizedString _serverlocalizedstring = null;
        _ServerLocalizedString _serverlocalizedstring2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        String strV = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr2 = kw9VarArr3;
                    z2 = false;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    ModelId modelId = (ModelId) ud4VarC.l(serialDescriptor, 0, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                    strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                    i |= 1;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 1:
                    kw9VarArr2 = kw9VarArr3;
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    _serverlocalizedstring2 = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), _serverlocalizedstring2);
                    i |= 4;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                    i |= 16;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool2);
                    i |= 32;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    list = (List) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list);
                    i |= 64;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    modelCapabilities = (ModelCapabilities) ud4VarC.m(serialDescriptor, 7, nnb.a, modelCapabilities);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), _serverlocalizedstring);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str2);
                    i |= 512;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 10:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 11:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 11, e79.a, num);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelOption(i, strM1064unboximpl, strV, _serverlocalizedstring2, str3, bool, bool2, list, modelCapabilities, _serverlocalizedstring, str2, str, num, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelOption modelOption = (ModelOption) obj;
        encoder.getClass();
        modelOption.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelOption.write$Self$api(modelOption, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
