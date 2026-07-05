package defpackage;

import com.anthropic.claude.api.kyc.KycStatus;
import com.anthropic.claude.api.kyc.KycStatusResponse;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ms9 implements w28 {
    public static final ms9 a;
    private static final SerialDescriptor descriptor;

    static {
        ms9 ms9Var = new ms9();
        a = ms9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.kyc.KycStatusResponse", ms9Var, 5);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("vendor_inquiry_id", true);
        pluginGeneratedSerialDescriptor.j("vendor_inquiry_url", true);
        pluginGeneratedSerialDescriptor.j("should_poll", true);
        pluginGeneratedSerialDescriptor.j("created_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{os9.d, d4c.S(srgVar), d4c.S(srgVar), zt1.a, d4c.S(bc9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        KycStatus kycStatus = null;
        String str = null;
        String str2 = null;
        Date date = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                kycStatus = (KycStatus) ud4VarC.l(serialDescriptor, 0, os9.d, kycStatus);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else if (iX == 3) {
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                date = (Date) ud4VarC.m(serialDescriptor, 4, bc9.a, date);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new KycStatusResponse(i, kycStatus, str, str2, zU, date, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        KycStatusResponse kycStatusResponse = (KycStatusResponse) obj;
        encoder.getClass();
        kycStatusResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        KycStatusResponse.write$Self$api(kycStatusResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
