package defpackage;

import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.api.artifacts.UpdateVisibilityRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rii implements w28 {
    public static final rii a;
    private static final SerialDescriptor descriptor;

    static {
        rii riiVar = new rii();
        a = riiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.artifacts.UpdateVisibilityRequest", riiVar, 1);
        pluginGeneratedSerialDescriptor.j("visibility", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{fu0.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ArtifactVisibility artifactVisibility = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                artifactVisibility = (ArtifactVisibility) ud4VarC.l(serialDescriptor, 0, fu0.d, artifactVisibility);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UpdateVisibilityRequest(i, artifactVisibility, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UpdateVisibilityRequest updateVisibilityRequest = (UpdateVisibilityRequest) obj;
        encoder.getClass();
        updateVisibilityRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, fu0.d, updateVisibilityRequest.visibility);
        vd4VarC.b(serialDescriptor);
    }
}
