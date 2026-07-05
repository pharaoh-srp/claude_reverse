package defpackage;

import com.anthropic.claude.api.trusteddevice.EnrollTrustedDeviceResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wo6 implements w28 {
    public static final wo6 a;
    private static final SerialDescriptor descriptor;

    static {
        wo6 wo6Var = new wo6();
        a = wo6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.trusteddevice.EnrollTrustedDeviceResponse", wo6Var, 4);
        pluginGeneratedSerialDescriptor.j("device_id", false);
        pluginGeneratedSerialDescriptor.j("device_token", true);
        pluginGeneratedSerialDescriptor.j("reattest_kid", true);
        pluginGeneratedSerialDescriptor.j("device_binding_kid", true);
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
        return new EnrollTrustedDeviceResponse(i, strV, str, str2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnrollTrustedDeviceResponse enrollTrustedDeviceResponse = (EnrollTrustedDeviceResponse) obj;
        encoder.getClass();
        enrollTrustedDeviceResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnrollTrustedDeviceResponse.write$Self$api(enrollTrustedDeviceResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
