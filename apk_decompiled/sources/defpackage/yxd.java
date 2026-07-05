package defpackage;

import com.anthropic.claude.analytics.events.PushEvents$ChatNotificationDisplayed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yxd implements w28 {
    public static final yxd a;
    private static final SerialDescriptor descriptor;

    static {
        yxd yxdVar = new yxd();
        a = yxdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.push.chat_notification_displayed", yxdVar, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("account_uuid", true);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", true);
        pluginGeneratedSerialDescriptor.j("feature_category", false);
        pluginGeneratedSerialDescriptor.k(new gl0(9));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), srgVar};
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
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PushEvents$ChatNotificationDisplayed(i, strV, str, str2, strV2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PushEvents$ChatNotificationDisplayed pushEvents$ChatNotificationDisplayed = (PushEvents$ChatNotificationDisplayed) obj;
        encoder.getClass();
        pushEvents$ChatNotificationDisplayed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PushEvents$ChatNotificationDisplayed.write$Self$analytics(pushEvents$ChatNotificationDisplayed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
