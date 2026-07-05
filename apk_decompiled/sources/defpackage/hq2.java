package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$RecentPhotosStripOverflowTapped;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hq2 implements w28 {
    public static final hq2 a;
    private static final SerialDescriptor descriptor;

    static {
        hq2 hq2Var = new hq2();
        a = hq2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_recent_photos_strip_overflow_tapped", hq2Var, 1);
        pluginGeneratedSerialDescriptor.j("selected_count", false);
        pluginGeneratedSerialDescriptor.k(new pi(10));
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
                return new ChatEvents$RecentPhotosStripOverflowTapped(i, iR, vnfVar);
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
        ChatEvents$RecentPhotosStripOverflowTapped chatEvents$RecentPhotosStripOverflowTapped = (ChatEvents$RecentPhotosStripOverflowTapped) obj;
        encoder.getClass();
        chatEvents$RecentPhotosStripOverflowTapped.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.l(0, chatEvents$RecentPhotosStripOverflowTapped.selected_count, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
