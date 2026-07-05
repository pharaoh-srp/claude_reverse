package defpackage;

import com.anthropic.claude.analytics.events.PushEvents$PushNotificationDisplayed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nyd implements w28 {
    public static final nyd a;
    private static final SerialDescriptor descriptor;

    static {
        nyd nydVar = new nyd();
        a = nydVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.push.notification_displayed", nydVar, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("account_uuid", true);
        pluginGeneratedSerialDescriptor.j("feature_category", false);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", true);
        pluginGeneratedSerialDescriptor.k(new gl0(9));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(srgVar)};
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
        String strV2 = null;
        String str2 = null;
        String str3 = null;
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
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PushEvents$PushNotificationDisplayed(i, strV, str, strV2, str2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PushEvents$PushNotificationDisplayed pushEvents$PushNotificationDisplayed = (PushEvents$PushNotificationDisplayed) obj;
        encoder.getClass();
        pushEvents$PushNotificationDisplayed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PushEvents$PushNotificationDisplayed.write$Self$analytics(pushEvents$PushNotificationDisplayed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
