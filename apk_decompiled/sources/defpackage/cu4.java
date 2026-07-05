package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwayForkCreated;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cu4 implements w28 {
    public static final cu4 a;
    private static final SerialDescriptor descriptor;

    static {
        cu4 cu4Var = new cu4();
        a = cu4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("conway_fork_created", cu4Var, 0);
        pluginGeneratedSerialDescriptor.k(new pi(17));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int iX = ud4VarC.x(serialDescriptor);
        vnf vnfVar = null;
        if (iX == -1) {
            ud4VarC.b(serialDescriptor);
            return new ConwayEvents$ConwayForkCreated(0, vnfVar);
        }
        sz6.e(iX);
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwayEvents$ConwayForkCreated conwayEvents$ConwayForkCreated = (ConwayEvents$ConwayForkCreated) obj;
        encoder.getClass();
        conwayEvents$ConwayForkCreated.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayEvents$ConwayForkCreated.write$Self$analytics(conwayEvents$ConwayForkCreated, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
