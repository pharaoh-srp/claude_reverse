package defpackage;

import com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinkUnshareFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rb3 implements w28 {
    public static final rb3 a;
    private static final SerialDescriptor descriptor;

    static {
        rb3 rb3Var = new rb3();
        a = rb3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_shared_link_unshare_failed", rb3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("snapshot_uuid", false);
        pluginGeneratedSerialDescriptor.j("cause", false);
        pluginGeneratedSerialDescriptor.k(new pi(13));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
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
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSharingEvents$SharedLinkUnshareFailed(i, strV, strV2, strV3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSharingEvents$SharedLinkUnshareFailed chatSharingEvents$SharedLinkUnshareFailed = (ChatSharingEvents$SharedLinkUnshareFailed) obj;
        encoder.getClass();
        chatSharingEvents$SharedLinkUnshareFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSharingEvents$SharedLinkUnshareFailed.write$Self$analytics(chatSharingEvents$SharedLinkUnshareFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
