package defpackage;

import com.anthropic.claude.analytics.events.UpdateEvents$RequiredUpdateShown;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gii implements w28 {
    public static final gii a;
    private static final SerialDescriptor descriptor;

    static {
        gii giiVar = new gii();
        a = giiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.required_update.shown", giiVar, 1);
        pluginGeneratedSerialDescriptor.j("is_google_play", false);
        pluginGeneratedSerialDescriptor.k(new xmb(18));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new UpdateEvents$RequiredUpdateShown(i, zU, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 0);
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
        UpdateEvents$RequiredUpdateShown updateEvents$RequiredUpdateShown = (UpdateEvents$RequiredUpdateShown) obj;
        encoder.getClass();
        updateEvents$RequiredUpdateShown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.p(serialDescriptor, 0, updateEvents$RequiredUpdateShown.is_google_play);
        vd4VarC.b(serialDescriptor);
    }
}
