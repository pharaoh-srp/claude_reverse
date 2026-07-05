package defpackage;

import com.anthropic.claude.sessions.types.SdkWorkflowProgressUnknown;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ldf implements w28 {
    public static final ldf a;
    private static final SerialDescriptor descriptor;

    static {
        ldf ldfVar = new ldf();
        a = ldfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkWorkflowProgressUnknown", ldfVar, 1);
        pluginGeneratedSerialDescriptor.j("index", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new SdkWorkflowProgressUnknown(i, iR, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 0);
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
        SdkWorkflowProgressUnknown sdkWorkflowProgressUnknown = (SdkWorkflowProgressUnknown) obj;
        encoder.getClass();
        sdkWorkflowProgressUnknown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkWorkflowProgressUnknown.write$Self$sessions(sdkWorkflowProgressUnknown, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
