package defpackage;

import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatShareVisibility;
import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatVisibilityChanged;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kb3 implements w28 {
    public static final kb3 a;
    private static final SerialDescriptor descriptor;

    static {
        kb3 kb3Var = new kb3();
        a = kb3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_chat_visibility_changed", kb3Var, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("message_count", true);
        pluginGeneratedSerialDescriptor.j("from_visibility", false);
        pluginGeneratedSerialDescriptor.j("to_visibility", false);
        pluginGeneratedSerialDescriptor.k(new pi(13));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatSharingEvents$ChatVisibilityChanged.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(e79.a), kw9VarArr[3].getValue(), kw9VarArr[4].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatSharingEvents$ChatVisibilityChanged.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        Integer num = null;
        ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility = null;
        ChatSharingEvents$ChatShareVisibility chatSharingEvents$ChatShareVisibility2 = null;
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
            } else if (iX == 3) {
                chatSharingEvents$ChatShareVisibility = (ChatSharingEvents$ChatShareVisibility) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatSharingEvents$ChatShareVisibility);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                chatSharingEvents$ChatShareVisibility2 = (ChatSharingEvents$ChatShareVisibility) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), chatSharingEvents$ChatShareVisibility2);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatSharingEvents$ChatVisibilityChanged(i, strV, strV2, num, chatSharingEvents$ChatShareVisibility, chatSharingEvents$ChatShareVisibility2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatSharingEvents$ChatVisibilityChanged chatSharingEvents$ChatVisibilityChanged = (ChatSharingEvents$ChatVisibilityChanged) obj;
        encoder.getClass();
        chatSharingEvents$ChatVisibilityChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatSharingEvents$ChatVisibilityChanged.write$Self$analytics(chatSharingEvents$ChatVisibilityChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
