package defpackage;

import com.anthropic.claude.mcpapps.transport.SafeAreaInsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v2f implements w28 {
    public static final v2f a;
    private static final SerialDescriptor descriptor;

    static {
        v2f v2fVar = new v2f();
        a = v2fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.SafeAreaInsets", v2fVar, 4);
        pluginGeneratedSerialDescriptor.j("top", false);
        pluginGeneratedSerialDescriptor.j("right", false);
        pluginGeneratedSerialDescriptor.j("bottom", false);
        pluginGeneratedSerialDescriptor.j("left", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR2 = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                iR3 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                iR4 = ud4VarC.r(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SafeAreaInsets(i, iR, iR2, iR3, iR4, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SafeAreaInsets safeAreaInsets = (SafeAreaInsets) obj;
        encoder.getClass();
        safeAreaInsets.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SafeAreaInsets.write$Self$Claude_mcpapp(safeAreaInsets, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
