package defpackage;

import com.anthropic.claude.api.mcp.CompleteMcpAuthResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a94 implements w28 {
    public static final a94 a;
    private static final SerialDescriptor descriptor;

    static {
        a94 a94Var = new a94();
        a = a94Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.CompleteMcpAuthResponse", a94Var, 2);
        pluginGeneratedSerialDescriptor.j("success", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(zt1.a), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CompleteMcpAuthResponse(i, bool, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CompleteMcpAuthResponse completeMcpAuthResponse = (CompleteMcpAuthResponse) obj;
        encoder.getClass();
        completeMcpAuthResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CompleteMcpAuthResponse.write$Self$api(completeMcpAuthResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
