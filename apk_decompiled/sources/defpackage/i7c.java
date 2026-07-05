package defpackage;

import com.anthropic.claude.api.notification.ClientPlatform;
import com.anthropic.claude.api.notification.NotificationChannelType;
import com.anthropic.claude.api.notification.NotificationChannelUpdateParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i7c implements w28 {
    public static final i7c a;
    private static final SerialDescriptor descriptor;

    static {
        i7c i7cVar = new i7c();
        a = i7cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notification.NotificationChannelUpdateParams", i7cVar, 5);
        pluginGeneratedSerialDescriptor.j("channel_type", false);
        pluginGeneratedSerialDescriptor.j("client_app_name", false);
        pluginGeneratedSerialDescriptor.j("client_platform", false);
        pluginGeneratedSerialDescriptor.j("registration_token", false);
        pluginGeneratedSerialDescriptor.j("os_push_permission_granted", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = NotificationChannelUpdateParams.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), srgVar, kw9VarArr[2].getValue(), srgVar, d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = NotificationChannelUpdateParams.$childSerializers;
        boolean z = true;
        int i = 0;
        NotificationChannelType notificationChannelType = null;
        String strV = null;
        ClientPlatform clientPlatform = null;
        String strV2 = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                notificationChannelType = (NotificationChannelType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), notificationChannelType);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                clientPlatform = (ClientPlatform) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), clientPlatform);
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
        return new NotificationChannelUpdateParams(i, notificationChannelType, strV, clientPlatform, strV2, bool, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        NotificationChannelUpdateParams notificationChannelUpdateParams = (NotificationChannelUpdateParams) obj;
        encoder.getClass();
        notificationChannelUpdateParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        NotificationChannelUpdateParams.write$Self$api(notificationChannelUpdateParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
