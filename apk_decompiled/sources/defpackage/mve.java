package defpackage;

import com.anthropic.claude.api.trusteddevice.RotateReattestRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mve implements w28 {
    public static final mve a;
    private static final SerialDescriptor descriptor;

    static {
        mve mveVar = new mve();
        a = mveVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.trusteddevice.RotateReattestRequest", mveVar, 7);
        pluginGeneratedSerialDescriptor.j("new_reattest_public_key", false);
        pluginGeneratedSerialDescriptor.j("device_binding_timestamp", false);
        pluginGeneratedSerialDescriptor.j("device_binding_signature", false);
        pluginGeneratedSerialDescriptor.j("predecessor_kid", true);
        pluginGeneratedSerialDescriptor.j("device_binding_kid", true);
        pluginGeneratedSerialDescriptor.j("platform", false);
        pluginGeneratedSerialDescriptor.j("attestation_blob", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, xka.a, srgVar, d4c.S(srgVar), d4c.S(srgVar), srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        String strV3 = null;
        String strV4 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = ud4VarC.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    strV3 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV4 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RotateReattestRequest(i, strV, j, strV2, str, str2, strV3, strV4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RotateReattestRequest rotateReattestRequest = (RotateReattestRequest) obj;
        encoder.getClass();
        rotateReattestRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RotateReattestRequest.write$Self$api(rotateReattestRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
