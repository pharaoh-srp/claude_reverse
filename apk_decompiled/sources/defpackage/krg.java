package defpackage;

import com.anthropic.claude.api.chat.tool.StringProperty;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class krg implements w28 {
    public static final krg a;
    private static final SerialDescriptor descriptor;

    static {
        krg krgVar = new krg();
        a = krgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("string", krgVar, 5);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("enum", true);
        pluginGeneratedSerialDescriptor.j("pattern", true);
        pluginGeneratedSerialDescriptor.j("minLength", true);
        pluginGeneratedSerialDescriptor.j("maxLength", true);
        pluginGeneratedSerialDescriptor.k(new xmb(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = StringProperty.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(srgVar);
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = StringProperty.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                list = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else if (iX == 3) {
                num = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 4, e79.a, num2);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StringProperty(i, str, list, str2, num, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StringProperty stringProperty = (StringProperty) obj;
        encoder.getClass();
        stringProperty.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StringProperty.write$Self$api(stringProperty, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
