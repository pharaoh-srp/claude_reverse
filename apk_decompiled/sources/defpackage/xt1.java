package defpackage;

import com.anthropic.claude.api.chat.tool.BooleanProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xt1 implements w28 {
    public static final xt1 a;
    private static final SerialDescriptor descriptor;

    static {
        xt1 xt1Var = new xt1();
        a = xt1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("boolean", xt1Var, 1);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.k(new xmb(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BooleanProperty(i, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BooleanProperty booleanProperty = (BooleanProperty) obj;
        encoder.getClass();
        booleanProperty.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BooleanProperty.write$Self$api(booleanProperty, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
