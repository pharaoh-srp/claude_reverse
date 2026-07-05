package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentListResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xq6 implements w28 {
    public static final xq6 a;
    private static final SerialDescriptor descriptor;

    static {
        xq6 xq6Var = new xq6();
        a = xq6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.EnvironmentListResponse", xq6Var, 4);
        pluginGeneratedSerialDescriptor.j("environments", false);
        pluginGeneratedSerialDescriptor.j("has_more", false);
        pluginGeneratedSerialDescriptor.j("first_id", true);
        pluginGeneratedSerialDescriptor.j("last_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{EnvironmentListResponse.$childSerializers[0].getValue(), zt1.a, d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EnvironmentListResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EnvironmentListResponse(i, list, zU, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnvironmentListResponse environmentListResponse = (EnvironmentListResponse) obj;
        encoder.getClass();
        environmentListResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnvironmentListResponse.write$Self$sessions(environmentListResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
