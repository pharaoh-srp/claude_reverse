package defpackage;

import com.anthropic.claude.api.trusteddevice.EnrollTrustedDeviceRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uo6 implements w28 {
    public static final uo6 a;
    private static final SerialDescriptor descriptor;

    static {
        uo6 uo6Var = new uo6();
        a = uo6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.trusteddevice.EnrollTrustedDeviceRequest", uo6Var, 4);
        pluginGeneratedSerialDescriptor.j("display_name", false);
        pluginGeneratedSerialDescriptor.j("device_public_key", true);
        pluginGeneratedSerialDescriptor.j("reattest_public_key", true);
        pluginGeneratedSerialDescriptor.j("platform", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EnrollTrustedDeviceRequest(i, strV, str, str2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnrollTrustedDeviceRequest enrollTrustedDeviceRequest = (EnrollTrustedDeviceRequest) obj;
        encoder.getClass();
        enrollTrustedDeviceRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnrollTrustedDeviceRequest.write$Self$api(enrollTrustedDeviceRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
