package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ModelChangeViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ip2 implements w28 {
    public static final ip2 a;
    private static final SerialDescriptor descriptor;

    static {
        ip2 ip2Var = new ip2();
        a = ip2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.chat.model_change.viewed", ip2Var, 3);
        pluginGeneratedSerialDescriptor.j("from_model_id", false);
        qy1.u(pluginGeneratedSerialDescriptor, "to_model_id", false, "is_temporary_chat", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, zt1.a};
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
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$ModelChangeViewed(i, strV, strV2, zU, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$ModelChangeViewed chatEvents$ModelChangeViewed = (ChatEvents$ModelChangeViewed) obj;
        encoder.getClass();
        chatEvents$ModelChangeViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$ModelChangeViewed.write$Self$analytics(chatEvents$ModelChangeViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
