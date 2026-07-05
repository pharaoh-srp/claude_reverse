package defpackage;

import com.anthropic.claude.app.SettingsScreenParams;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mzf implements w28 {
    public static final mzf a;
    private static final SerialDescriptor descriptor;

    static {
        mzf mzfVar = new mzf();
        a = mzfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.SettingsScreenParams", mzfVar, 2);
        pluginGeneratedSerialDescriptor.j("initialScreens", true);
        pluginGeneratedSerialDescriptor.j("deepLinkNonce", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SettingsScreenParams.$childSerializers[0].getValue(), xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SettingsScreenParams.$childSerializers;
        int i = 0;
        List list = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SettingsScreenParams(i, list, j, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SettingsScreenParams settingsScreenParams = (SettingsScreenParams) obj;
        encoder.getClass();
        settingsScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SettingsScreenParams.write$Self$app(settingsScreenParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
