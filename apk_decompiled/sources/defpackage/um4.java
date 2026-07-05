package defpackage;

import com.anthropic.claude.conway.protocol.ContainerHealthResponse;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class um4 implements w28 {
    public static final um4 a;
    private static final SerialDescriptor descriptor;

    static {
        um4 um4Var = new um4();
        a = um4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ContainerHealthResponse", um4Var, 4);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("version", false);
        pluginGeneratedSerialDescriptor.j("protocol", false);
        pluginGeneratedSerialDescriptor.j("endpoints", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ContainerHealthResponse.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ContainerHealthResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), map);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ContainerHealthResponse(i, strV, strV2, strV3, map, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContainerHealthResponse containerHealthResponse = (ContainerHealthResponse) obj;
        encoder.getClass();
        containerHealthResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ContainerHealthResponse.write$Self$conway(containerHealthResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
