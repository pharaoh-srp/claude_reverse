package defpackage;

import com.anthropic.claude.api.notification.NotificationPreferencesUpsertParams;
import com.anthropic.claude.api.notification.Preferences;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a9c implements w28 {
    public static final a9c a;
    private static final SerialDescriptor descriptor;

    static {
        a9c a9cVar = new a9c();
        a = a9cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notification.NotificationPreferencesUpsertParams", a9cVar, 1);
        pluginGeneratedSerialDescriptor.j("preferences", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vbd.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Preferences preferences = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                preferences = (Preferences) ud4VarC.l(serialDescriptor, 0, vbd.a, preferences);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new NotificationPreferencesUpsertParams(i, preferences, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        NotificationPreferencesUpsertParams notificationPreferencesUpsertParams = (NotificationPreferencesUpsertParams) obj;
        encoder.getClass();
        notificationPreferencesUpsertParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, vbd.a, notificationPreferencesUpsertParams.preferences);
        vd4VarC.b(serialDescriptor);
    }
}
