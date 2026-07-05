package defpackage;

import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.chat.tool.PropertyDefinition;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fp0 implements w28 {
    public static final fp0 a;
    private static final SerialDescriptor descriptor;

    static {
        fp0 fp0Var = new fp0();
        a = fp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("array", fp0Var, 4);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("minItems", true);
        pluginGeneratedSerialDescriptor.j("maxItems", true);
        pluginGeneratedSerialDescriptor.k(new xmb(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArrayProperty.$childSerializers;
        KSerializer kSerializerS = d4c.S(srg.a);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArrayProperty.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        PropertyDefinition propertyDefinition = null;
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
                propertyDefinition = (PropertyDefinition) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), propertyDefinition);
                i |= 2;
            } else if (iX == 2) {
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArrayProperty(i, str, propertyDefinition, num, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArrayProperty arrayProperty = (ArrayProperty) obj;
        encoder.getClass();
        arrayProperty.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArrayProperty.write$Self$api(arrayProperty, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
