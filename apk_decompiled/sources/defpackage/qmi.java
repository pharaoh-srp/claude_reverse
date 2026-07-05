package defpackage;

import com.anthropic.claude.api.consent.ConsentType;
import com.anthropic.claude.api.consent.EntityType;
import com.anthropic.claude.api.consent.UserConsentResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qmi implements w28 {
    public static final qmi a;
    private static final SerialDescriptor descriptor;

    static {
        qmi qmiVar = new qmi();
        a = qmiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.consent.UserConsentResponse", qmiVar, 7);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("consent_type", false);
        pluginGeneratedSerialDescriptor.j("consent_hash", false);
        pluginGeneratedSerialDescriptor.j("entity_type", false);
        pluginGeneratedSerialDescriptor.j("entity_id", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("revoked_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = UserConsentResponse.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kw9VarArr[1].getValue(), srgVar, kw9VarArr[3].getValue(), srgVar, srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UserConsentResponse.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        ConsentType consentType = null;
        String strV2 = null;
        EntityType entityType = null;
        String strV3 = null;
        String strV4 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    consentType = (ConsentType) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), consentType);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    entityType = (EntityType) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), entityType);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new UserConsentResponse(i, strV, consentType, strV2, entityType, strV3, strV4, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserConsentResponse userConsentResponse = (UserConsentResponse) obj;
        encoder.getClass();
        userConsentResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UserConsentResponse.write$Self$api(userConsentResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
