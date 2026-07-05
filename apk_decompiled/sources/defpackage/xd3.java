package defpackage;

import com.anthropic.claude.api.consent.CheckConsentRequest;
import com.anthropic.claude.api.consent.ConsentType;
import com.anthropic.claude.api.consent.EntityType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xd3 implements w28 {
    public static final xd3 a;
    private static final SerialDescriptor descriptor;

    static {
        xd3 xd3Var = new xd3();
        a = xd3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.consent.CheckConsentRequest", xd3Var, 4);
        pluginGeneratedSerialDescriptor.j("consent_type", false);
        pluginGeneratedSerialDescriptor.j("entity_type", false);
        pluginGeneratedSerialDescriptor.j("entity_id", false);
        pluginGeneratedSerialDescriptor.j("consent_hash", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CheckConsentRequest.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CheckConsentRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        ConsentType consentType = null;
        EntityType entityType = null;
        String strV = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                consentType = (ConsentType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), consentType);
                i |= 1;
            } else if (iX == 1) {
                entityType = (EntityType) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), entityType);
                i |= 2;
            } else if (iX == 2) {
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CheckConsentRequest(i, consentType, entityType, strV, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CheckConsentRequest checkConsentRequest = (CheckConsentRequest) obj;
        encoder.getClass();
        checkConsentRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CheckConsentRequest.write$Self$api(checkConsentRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
