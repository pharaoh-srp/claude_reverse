package defpackage;

import com.anthropic.claude.mcpapps.transport.ContainerDimensions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class om4 implements w28 {
    public static final om4 a;
    private static final SerialDescriptor descriptor;

    static {
        om4 om4Var = new om4();
        a = om4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.ContainerDimensions", om4Var, 4);
        pluginGeneratedSerialDescriptor.j("width", true);
        pluginGeneratedSerialDescriptor.j("maxWidth", true);
        pluginGeneratedSerialDescriptor.j("height", true);
        pluginGeneratedSerialDescriptor.j("maxHeight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                num2 = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num2);
                i |= 2;
            } else if (iX == 2) {
                num3 = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                num4 = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num4);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ContainerDimensions(i, num, num2, num3, num4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContainerDimensions containerDimensions = (ContainerDimensions) obj;
        encoder.getClass();
        containerDimensions.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ContainerDimensions.write$Self$Claude_mcpapp(containerDimensions, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
