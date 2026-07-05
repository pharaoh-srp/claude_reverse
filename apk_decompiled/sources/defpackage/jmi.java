package defpackage;

import com.anthropic.claude.api.artifacts.UserArtifactsListResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jmi implements w28 {
    public static final jmi a;
    private static final SerialDescriptor descriptor;

    static {
        jmi jmiVar = new jmi();
        a = jmiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.artifacts.UserArtifactsListResponse", jmiVar, 1);
        pluginGeneratedSerialDescriptor.j("artifacts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{UserArtifactsListResponse.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UserArtifactsListResponse.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UserArtifactsListResponse(i, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserArtifactsListResponse userArtifactsListResponse = (UserArtifactsListResponse) obj;
        encoder.getClass();
        userArtifactsListResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) UserArtifactsListResponse.$childSerializers[0].getValue(), userArtifactsListResponse.artifacts);
        vd4VarC.b(serialDescriptor);
    }
}
