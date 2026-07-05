package defpackage;

import com.anthropic.claude.api.notification.ClientPlatform;
import com.anthropic.claude.api.notification.NotificationChannelSchema;
import com.anthropic.claude.api.notification.NotificationChannelStatus;
import com.anthropic.claude.api.notification.NotificationChannelType;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e7c implements w28 {
    public static final e7c a;
    private static final SerialDescriptor descriptor;

    static {
        e7c e7cVar = new e7c();
        a = e7cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notification.NotificationChannelSchema", e7cVar, 9);
        pluginGeneratedSerialDescriptor.j("channel_type", false);
        pluginGeneratedSerialDescriptor.j("client_app_name", false);
        pluginGeneratedSerialDescriptor.j("client_platform", false);
        pluginGeneratedSerialDescriptor.j("device_id", false);
        pluginGeneratedSerialDescriptor.j("last_successful_delivery_time", true);
        pluginGeneratedSerialDescriptor.j("last_token_refresh_time", false);
        pluginGeneratedSerialDescriptor.j("registration_token", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = NotificationChannelSchema.$childSerializers;
        srg srgVar = srg.a;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), srgVar, kw9VarArr[2].getValue(), srgVar, d4c.S(bc9Var), bc9Var, srgVar, kw9VarArr[7].getValue(), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = NotificationChannelSchema.$childSerializers;
        Object obj = null;
        boolean z = true;
        NotificationChannelStatus notificationChannelStatus = null;
        NotificationChannelType notificationChannelType = null;
        String strV = null;
        ClientPlatform clientPlatform = null;
        String strV2 = null;
        Date date = null;
        Date date2 = null;
        String strV3 = null;
        String strV4 = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    notificationChannelType = (NotificationChannelType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), notificationChannelType);
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    clientPlatform = (ClientPlatform) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), clientPlatform);
                    i |= 4;
                    break;
                case 3:
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    date = (Date) ud4VarC.m(serialDescriptor, 4, bc9.a, date);
                    i |= 16;
                    break;
                case 5:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 5, bc9.a, date2);
                    i |= 32;
                    break;
                case 6:
                    strV3 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    notificationChannelStatus = (NotificationChannelStatus) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), notificationChannelStatus);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    strV4 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new NotificationChannelSchema(i, notificationChannelType, strV, clientPlatform, strV2, date, date2, strV3, notificationChannelStatus, strV4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        NotificationChannelSchema notificationChannelSchema = (NotificationChannelSchema) obj;
        encoder.getClass();
        notificationChannelSchema.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        NotificationChannelSchema.write$Self$api(notificationChannelSchema, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
