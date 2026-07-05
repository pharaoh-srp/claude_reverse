package defpackage;

import com.anthropic.claude.api.chat.tool.IntegerProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l79 implements w28 {
    public static final l79 a;
    private static final SerialDescriptor descriptor;

    static {
        l79 l79Var = new l79();
        a = l79Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("integer", l79Var, 3);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("minimum", true);
        pluginGeneratedSerialDescriptor.j("maximum", true);
        pluginGeneratedSerialDescriptor.k(new xmb(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(srg.a);
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
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
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new IntegerProperty(i, str, num, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        IntegerProperty integerProperty = (IntegerProperty) obj;
        encoder.getClass();
        integerProperty.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        IntegerProperty.write$Self$api(integerProperty, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
