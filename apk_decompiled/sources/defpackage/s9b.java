package defpackage;

import com.anthropic.claude.api.memory.MelangeReadRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s9b implements w28 {
    public static final s9b a;
    private static final SerialDescriptor descriptor;

    static {
        s9b s9bVar = new s9b();
        a = s9bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.memory.MelangeReadRequest", s9bVar, 2);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("resolve_wikilinks", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MelangeReadRequest(i, strV, bool, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MelangeReadRequest melangeReadRequest = (MelangeReadRequest) obj;
        encoder.getClass();
        melangeReadRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MelangeReadRequest.write$Self$api(melangeReadRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
