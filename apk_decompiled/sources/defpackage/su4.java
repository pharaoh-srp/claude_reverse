package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwaySendQueued;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class su4 implements w28 {
    public static final su4 a;
    private static final SerialDescriptor descriptor;

    static {
        su4 su4Var = new su4();
        a = su4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("conway_send_queued", su4Var, 1);
        pluginGeneratedSerialDescriptor.j("depth", false);
        pluginGeneratedSerialDescriptor.k(new pi(17));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new ConwayEvents$ConwaySendQueued(i, iR, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 0);
                i = 1;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwayEvents$ConwaySendQueued conwayEvents$ConwaySendQueued = (ConwayEvents$ConwaySendQueued) obj;
        encoder.getClass();
        conwayEvents$ConwaySendQueued.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.l(0, conwayEvents$ConwaySendQueued.depth, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
