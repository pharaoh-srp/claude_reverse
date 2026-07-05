package defpackage;

import com.anthropic.claude.api.experience.TrackActionedData;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3i implements w28 {
    public static final p3i a;
    private static final SerialDescriptor descriptor;

    static {
        p3i p3iVar = new p3i();
        a = p3iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("actioned", p3iVar, 2);
        pluginGeneratedSerialDescriptor.j("actions", true);
        pluginGeneratedSerialDescriptor.j("success", true);
        pluginGeneratedSerialDescriptor.k(new gl0(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TrackActionedData.$childSerializers[0].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = TrackActionedData.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TrackActionedData(i, list, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TrackActionedData trackActionedData = (TrackActionedData) obj;
        encoder.getClass();
        trackActionedData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TrackActionedData.write$Self$api(trackActionedData, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
