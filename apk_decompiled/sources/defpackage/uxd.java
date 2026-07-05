package defpackage;

import com.anthropic.claude.analytics.events.PushEvents$ChatDataPushReceived;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uxd implements w28 {
    public static final uxd a;
    private static final SerialDescriptor descriptor;

    static {
        uxd uxdVar = new uxd();
        a = uxdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.push.chat_data_push_received", uxdVar, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("account_uuid", true);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", true);
        pluginGeneratedSerialDescriptor.j("feature_category", false);
        pluginGeneratedSerialDescriptor.j("is_unknown_account", true);
        pluginGeneratedSerialDescriptor.k(new gl0(9));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), srgVar, d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        String strV2 = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else if (iX == 3) {
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PushEvents$ChatDataPushReceived(i, strV, str, str2, strV2, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PushEvents$ChatDataPushReceived pushEvents$ChatDataPushReceived = (PushEvents$ChatDataPushReceived) obj;
        encoder.getClass();
        pushEvents$ChatDataPushReceived.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PushEvents$ChatDataPushReceived.write$Self$analytics(pushEvents$ChatDataPushReceived, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
