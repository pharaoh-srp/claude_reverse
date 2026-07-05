package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwayManageConnectorsTapped;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gu4 implements w28 {
    public static final gu4 a;
    private static final SerialDescriptor descriptor;

    static {
        gu4 gu4Var = new gu4();
        a = gu4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("conway_manage_connectors_tapped", gu4Var, 0);
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
            return new ConwayEvents$ConwayManageConnectorsTapped(0, vnfVar);
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
        ConwayEvents$ConwayManageConnectorsTapped conwayEvents$ConwayManageConnectorsTapped = (ConwayEvents$ConwayManageConnectorsTapped) obj;
        encoder.getClass();
        conwayEvents$ConwayManageConnectorsTapped.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayEvents$ConwayManageConnectorsTapped.write$Self$analytics(conwayEvents$ConwayManageConnectorsTapped, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
