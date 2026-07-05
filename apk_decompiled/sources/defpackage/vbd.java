package defpackage;

import com.anthropic.claude.api.notification.FeaturePreference;
import com.anthropic.claude.api.notification.Preferences;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vbd implements w28 {
    public static final vbd a;
    private static final SerialDescriptor descriptor;

    static {
        vbd vbdVar = new vbd();
        a = vbdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notification.Preferences", vbdVar, 1);
        pluginGeneratedSerialDescriptor.j("feature_preference", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(ng7.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        FeaturePreference featurePreference = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                featurePreference = (FeaturePreference) ud4VarC.m(serialDescriptor, 0, ng7.a, featurePreference);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Preferences(i, featurePreference, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Preferences preferences = (Preferences) obj;
        encoder.getClass();
        preferences.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Preferences.write$Self$api(preferences, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
