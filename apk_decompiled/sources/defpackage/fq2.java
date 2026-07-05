package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$RecentPhotosStripAttached;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fq2 implements w28 {
    public static final fq2 a;
    private static final SerialDescriptor descriptor;

    static {
        fq2 fq2Var = new fq2();
        a = fq2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_recent_photos_strip_attached", fq2Var, 2);
        pluginGeneratedSerialDescriptor.j("count", false);
        pluginGeneratedSerialDescriptor.j("positions", false);
        pluginGeneratedSerialDescriptor.k(new pi(10));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a, ChatEvents$RecentPhotosStripAttached.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$RecentPhotosStripAttached.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$RecentPhotosStripAttached(i, iR, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$RecentPhotosStripAttached chatEvents$RecentPhotosStripAttached = (ChatEvents$RecentPhotosStripAttached) obj;
        encoder.getClass();
        chatEvents$RecentPhotosStripAttached.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$RecentPhotosStripAttached.write$Self$analytics(chatEvents$RecentPhotosStripAttached, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
