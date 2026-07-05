package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwayMessageSent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iu4 implements w28 {
    public static final iu4 a;
    private static final SerialDescriptor descriptor;

    static {
        iu4 iu4Var = new iu4();
        a = iu4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("conway_message_sent", iu4Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("container_id", false);
        pluginGeneratedSerialDescriptor.j("message_length", false);
        pluginGeneratedSerialDescriptor.k(new pi(17));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        String strV2 = null;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConwayEvents$ConwayMessageSent(i, strV, strV2, iR, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwayEvents$ConwayMessageSent conwayEvents$ConwayMessageSent = (ConwayEvents$ConwayMessageSent) obj;
        encoder.getClass();
        conwayEvents$ConwayMessageSent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayEvents$ConwayMessageSent.write$Self$analytics(conwayEvents$ConwayMessageSent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
