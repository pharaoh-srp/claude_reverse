package defpackage;

import com.anthropic.claude.api.wiggle.WiggleDeleteFileResponse;
import com.anthropic.claude.api.wiggle.WiggleDeleteFileResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oaj implements w28 {
    public static final oaj a;
    private static final SerialDescriptor descriptor;

    static {
        oaj oajVar = new oaj();
        a = oajVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.wiggle.WiggleDeleteFileResponse", oajVar, 2);
        pluginGeneratedSerialDescriptor.j("success", false);
        pluginGeneratedSerialDescriptor.j("result", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a, raj.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        WiggleDeleteFileResult wiggleDeleteFileResult = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                wiggleDeleteFileResult = (WiggleDeleteFileResult) ud4VarC.l(serialDescriptor, 1, raj.d, wiggleDeleteFileResult);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WiggleDeleteFileResponse(i, zU, wiggleDeleteFileResult, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WiggleDeleteFileResponse wiggleDeleteFileResponse = (WiggleDeleteFileResponse) obj;
        encoder.getClass();
        wiggleDeleteFileResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WiggleDeleteFileResponse.write$Self$api(wiggleDeleteFileResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
