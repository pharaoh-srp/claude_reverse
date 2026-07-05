package defpackage;

import com.anthropic.claude.api.kyc.KycStatusResponse;
import com.anthropic.claude.api.purchase.VerifyPurchaseResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kti implements w28 {
    public static final kti a;
    private static final SerialDescriptor descriptor;

    static {
        kti ktiVar = new kti();
        a = ktiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.purchase.VerifyPurchaseResponse", ktiVar, 2);
        pluginGeneratedSerialDescriptor.j("success", true);
        pluginGeneratedSerialDescriptor.j("idv_requirement", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a, d4c.S(ms9.a)};
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
        KycStatusResponse kycStatusResponse = null;
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
                kycStatusResponse = (KycStatusResponse) ud4VarC.m(serialDescriptor, 1, ms9.a, kycStatusResponse);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VerifyPurchaseResponse(i, zU, kycStatusResponse, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) obj;
        encoder.getClass();
        verifyPurchaseResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VerifyPurchaseResponse.write$Self$api(verifyPurchaseResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
