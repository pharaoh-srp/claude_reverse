package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwayForkArchived;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class au4 implements w28 {
    public static final au4 a;
    private static final SerialDescriptor descriptor;

    static {
        au4 au4Var = new au4();
        a = au4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("conway_fork_archived", au4Var, 0);
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
            return new ConwayEvents$ConwayForkArchived(0, vnfVar);
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
        ConwayEvents$ConwayForkArchived conwayEvents$ConwayForkArchived = (ConwayEvents$ConwayForkArchived) obj;
        encoder.getClass();
        conwayEvents$ConwayForkArchived.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayEvents$ConwayForkArchived.write$Self$analytics(conwayEvents$ConwayForkArchived, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
