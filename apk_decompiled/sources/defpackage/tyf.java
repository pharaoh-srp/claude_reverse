package defpackage;

import com.anthropic.claude.analytics.events.SettingsEvents$SettingsHapticFeedbackToggle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tyf implements w28 {
    public static final tyf a;
    private static final SerialDescriptor descriptor;

    static {
        tyf tyfVar = new tyf();
        a = tyfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("settings_haptic_feedback_toggle", tyfVar, 1);
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
                return new SettingsEvents$SettingsHapticFeedbackToggle(i, zU, vnfVar);
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
        SettingsEvents$SettingsHapticFeedbackToggle settingsEvents$SettingsHapticFeedbackToggle = (SettingsEvents$SettingsHapticFeedbackToggle) obj;
        encoder.getClass();
        settingsEvents$SettingsHapticFeedbackToggle.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.p(serialDescriptor, 0, settingsEvents$SettingsHapticFeedbackToggle.enabled);
        vd4VarC.b(serialDescriptor);
    }
}
