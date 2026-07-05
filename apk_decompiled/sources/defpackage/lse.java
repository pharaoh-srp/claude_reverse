package defpackage;

import com.anthropic.claude.api.consent.ConsentType;
import com.anthropic.claude.api.consent.EntityType;
import com.anthropic.claude.api.consent.RevokeConsentRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lse implements w28 {
    public static final lse a;
    private static final SerialDescriptor descriptor;

    static {
        lse lseVar = new lse();
        a = lseVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.consent.RevokeConsentRequest", lseVar, 4);
        pluginGeneratedSerialDescriptor.j("consent_uuid", true);
        pluginGeneratedSerialDescriptor.j("consent_type", true);
        pluginGeneratedSerialDescriptor.j("entity_type", true);
        pluginGeneratedSerialDescriptor.j("entity_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = RevokeConsentRequest.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[1].getValue()), d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = RevokeConsentRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        ConsentType consentType = null;
        EntityType entityType = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                consentType = (ConsentType) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), consentType);
                i |= 2;
            } else if (iX == 2) {
                entityType = (EntityType) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), entityType);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RevokeConsentRequest(i, str, consentType, entityType, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RevokeConsentRequest revokeConsentRequest = (RevokeConsentRequest) obj;
        encoder.getClass();
        revokeConsentRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RevokeConsentRequest.write$Self$api(revokeConsentRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
