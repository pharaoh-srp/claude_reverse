package defpackage;

import com.anthropic.claude.sessions.types.SdkTaskUsage;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ecf implements w28 {
    public static final ecf a;
    private static final SerialDescriptor descriptor;

    static {
        ecf ecfVar = new ecf();
        a = ecfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkTaskUsage", ecfVar, 3);
        pluginGeneratedSerialDescriptor.j("total_tokens", true);
        pluginGeneratedSerialDescriptor.j("tool_uses", true);
        pluginGeneratedSerialDescriptor.j("duration_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        long j = 0;
        boolean z = true;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkTaskUsage(i, iR, iR2, j, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkTaskUsage sdkTaskUsage = (SdkTaskUsage) obj;
        encoder.getClass();
        sdkTaskUsage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkTaskUsage.write$Self$sessions(sdkTaskUsage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
