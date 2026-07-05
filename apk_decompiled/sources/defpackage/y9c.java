package defpackage;

import com.anthropic.claude.api.chat.tool.NumberProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y9c implements w28 {
    public static final y9c a;
    private static final SerialDescriptor descriptor;

    static {
        y9c y9cVar = new y9c();
        a = y9cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("number", y9cVar, 3);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("minimum", true);
        pluginGeneratedSerialDescriptor.j("maximum", true);
        pluginGeneratedSerialDescriptor.k(new xmb(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(srg.a);
        na6 na6Var = na6.a;
        return new KSerializer[]{kSerializerS, d4c.S(na6Var), d4c.S(na6Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        Double d = null;
        Double d2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                d = (Double) ud4VarC.m(serialDescriptor, 1, na6.a, d);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                d2 = (Double) ud4VarC.m(serialDescriptor, 2, na6.a, d2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new NumberProperty(i, str, d, d2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        NumberProperty numberProperty = (NumberProperty) obj;
        encoder.getClass();
        numberProperty.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        NumberProperty.write$Self$api(numberProperty, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
