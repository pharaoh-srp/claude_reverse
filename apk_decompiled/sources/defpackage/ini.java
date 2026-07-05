package defpackage;

import com.anthropic.claude.tool.model.UserLocationV0Input;
import com.anthropic.claude.tool.model.UserLocationV0InputAccuracy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ini implements w28 {
    public static final ini a;
    private static final SerialDescriptor descriptor;

    static {
        ini iniVar = new ini();
        a = iniVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.UserLocationV0Input", iniVar, 1);
        pluginGeneratedSerialDescriptor.j("accuracy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lni.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        UserLocationV0InputAccuracy userLocationV0InputAccuracy = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                userLocationV0InputAccuracy = (UserLocationV0InputAccuracy) ud4VarC.l(serialDescriptor, 0, lni.d, userLocationV0InputAccuracy);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UserLocationV0Input(i, userLocationV0InputAccuracy, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserLocationV0Input userLocationV0Input = (UserLocationV0Input) obj;
        encoder.getClass();
        userLocationV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, lni.d, userLocationV0Input.accuracy);
        vd4VarC.b(serialDescriptor);
    }
}
