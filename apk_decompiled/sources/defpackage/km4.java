package defpackage;

import com.anthropic.claude.conway.protocol.ClientMeta;
import com.anthropic.claude.conway.protocol.ContainerCreateRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class km4 implements w28 {
    public static final km4 a;
    private static final SerialDescriptor descriptor;

    static {
        km4 km4Var = new km4();
        a = km4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ContainerCreateRequest", km4Var, 2);
        pluginGeneratedSerialDescriptor.j("client", false);
        pluginGeneratedSerialDescriptor.j("force_new", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zo3.a, d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ClientMeta clientMeta = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                clientMeta = (ClientMeta) ud4VarC.l(serialDescriptor, 0, zo3.a, clientMeta);
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
        return new ContainerCreateRequest(i, clientMeta, bool, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContainerCreateRequest containerCreateRequest = (ContainerCreateRequest) obj;
        encoder.getClass();
        containerCreateRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ContainerCreateRequest.write$Self$conway(containerCreateRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
