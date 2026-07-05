package defpackage;

import com.anthropic.claude.analytics.events.SettingsEvents$SettingsWebSearchToggle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bzf implements w28 {
    public static final bzf a;
    private static final SerialDescriptor descriptor;

    static {
        bzf bzfVar = new bzf();
        a = bzfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("settings_web_search_toggle", bzfVar, 1);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.k(new xmb(14));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new SettingsEvents$SettingsWebSearchToggle(i, zU, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 0);
                i = 1;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SettingsEvents$SettingsWebSearchToggle settingsEvents$SettingsWebSearchToggle = (SettingsEvents$SettingsWebSearchToggle) obj;
        encoder.getClass();
        settingsEvents$SettingsWebSearchToggle.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.p(serialDescriptor, 0, settingsEvents$SettingsWebSearchToggle.enabled);
        vd4VarC.b(serialDescriptor);
    }
}
