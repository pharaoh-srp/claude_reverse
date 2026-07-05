package defpackage;

import com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinksLoadSuccess;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xb3 implements w28 {
    public static final xb3 a;
    private static final SerialDescriptor descriptor;

    static {
        xb3 xb3Var = new xb3();
        a = xb3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_shared_links_load_success", xb3Var, 2);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("link_count", false);
        pluginGeneratedSerialDescriptor.k(new pi(13));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSharingEvents$SharedLinksLoadSuccess(i, strV, iR, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSharingEvents$SharedLinksLoadSuccess chatSharingEvents$SharedLinksLoadSuccess = (ChatSharingEvents$SharedLinksLoadSuccess) obj;
        encoder.getClass();
        chatSharingEvents$SharedLinksLoadSuccess.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSharingEvents$SharedLinksLoadSuccess.write$Self$analytics(chatSharingEvents$SharedLinksLoadSuccess, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
