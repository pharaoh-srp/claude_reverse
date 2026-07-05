package defpackage;

import com.anthropic.claude.api.consent.ConsentType;
import com.anthropic.claude.api.consent.EntityType;
import com.anthropic.claude.api.consent.UserConsentRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class omi implements w28 {
    public static final omi a;
    private static final SerialDescriptor descriptor;

    static {
        omi omiVar = new omi();
        a = omiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.consent.UserConsentRequest", omiVar, 4);
        pluginGeneratedSerialDescriptor.j("consent_type", false);
        pluginGeneratedSerialDescriptor.j("consent_hash", false);
        pluginGeneratedSerialDescriptor.j("entity_type", false);
        pluginGeneratedSerialDescriptor.j("entity_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = UserConsentRequest.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), srgVar, kw9VarArr[2].getValue(), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UserConsentRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        ConsentType consentType = null;
        String strV = null;
        EntityType entityType = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                consentType = (ConsentType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), consentType);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                entityType = (EntityType) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), entityType);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UserConsentRequest(i, consentType, strV, entityType, strV2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserConsentRequest userConsentRequest = (UserConsentRequest) obj;
        encoder.getClass();
        userConsentRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UserConsentRequest.write$Self$api(userConsentRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
