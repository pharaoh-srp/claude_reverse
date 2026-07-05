package defpackage;

import com.anthropic.claude.analytics.events.ChatSharingEvents$SharedChatViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pb3 implements w28 {
    public static final pb3 a;
    private static final SerialDescriptor descriptor;

    static {
        pb3 pb3Var = new pb3();
        a = pb3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_shared_chat_viewed", pb3Var, 4);
        pluginGeneratedSerialDescriptor.j("viewer_organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("snapshot_uuid", false);
        pluginGeneratedSerialDescriptor.j("message_count", true);
        pluginGeneratedSerialDescriptor.j("is_public", false);
        pluginGeneratedSerialDescriptor.k(new pi(13));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(e79.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        Integer num = null;
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
            } else if (iX == 2) {
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSharingEvents$SharedChatViewed(i, strV, strV2, num, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSharingEvents$SharedChatViewed chatSharingEvents$SharedChatViewed = (ChatSharingEvents$SharedChatViewed) obj;
        encoder.getClass();
        chatSharingEvents$SharedChatViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSharingEvents$SharedChatViewed.write$Self$analytics(chatSharingEvents$SharedChatViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
