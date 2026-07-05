package defpackage;

import com.anthropic.claude.api.mcp.DirectoryServerListResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l56 implements w28 {
    public static final l56 a;
    private static final SerialDescriptor descriptor;

    static {
        l56 l56Var = new l56();
        a = l56Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.DirectoryServerListResponse", l56Var, 3);
        pluginGeneratedSerialDescriptor.j("servers", true);
        pluginGeneratedSerialDescriptor.j("total", true);
        pluginGeneratedSerialDescriptor.j("next_cursor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DirectoryServerListResponse.$childSerializers[0].getValue(), e79.a, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DirectoryServerListResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        List list = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DirectoryServerListResponse(i, list, iR, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DirectoryServerListResponse directoryServerListResponse = (DirectoryServerListResponse) obj;
        encoder.getClass();
        directoryServerListResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DirectoryServerListResponse.write$Self$api(directoryServerListResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
