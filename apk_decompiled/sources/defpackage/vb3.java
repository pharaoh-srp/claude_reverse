package defpackage;

import com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinksLoadFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vb3 implements w28 {
    public static final vb3 a;
    private static final SerialDescriptor descriptor;

    static {
        vb3 vb3Var = new vb3();
        a = vb3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_shared_links_load_failed", vb3Var, 2);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("cause", false);
        pluginGeneratedSerialDescriptor.k(new pi(13));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
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
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSharingEvents$SharedLinksLoadFailed(i, strV, strV2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSharingEvents$SharedLinksLoadFailed chatSharingEvents$SharedLinksLoadFailed = (ChatSharingEvents$SharedLinksLoadFailed) obj;
        encoder.getClass();
        chatSharingEvents$SharedLinksLoadFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSharingEvents$SharedLinksLoadFailed.write$Self$analytics(chatSharingEvents$SharedLinksLoadFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
