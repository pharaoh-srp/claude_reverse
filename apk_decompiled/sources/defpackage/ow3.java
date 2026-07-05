package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionStreamConnectStalled;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ow3 implements w28 {
    public static final ow3 a;
    private static final SerialDescriptor descriptor;

    static {
        ow3 ow3Var = new ow3();
        a = ow3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.session_stream.connect_stalled", ow3Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        qy1.z(pluginGeneratedSerialDescriptor, "phase", false, "elapsed_ms", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        String str = null;
        String strV2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$SessionStreamConnectStalled(i, strV, str, strV2, j, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionStreamConnectStalled codeEvents$SessionStreamConnectStalled = (CodeEvents$SessionStreamConnectStalled) obj;
        encoder.getClass();
        codeEvents$SessionStreamConnectStalled.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionStreamConnectStalled.write$Self$analytics(codeEvents$SessionStreamConnectStalled, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
