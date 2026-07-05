package defpackage;

import com.anthropic.claude.api.conway.UpdateWebhookRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tii implements w28 {
    public static final tii a;
    private static final SerialDescriptor descriptor;

    static {
        tii tiiVar = new tii();
        a = tiiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.conway.UpdateWebhookRequest", tiiVar, 4);
        pluginGeneratedSerialDescriptor.j("enabled", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("auth_type", true);
        pluginGeneratedSerialDescriptor.j("secret_header", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(zt1.a);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
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
        return new UpdateWebhookRequest(i, bool, str, str2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UpdateWebhookRequest updateWebhookRequest = (UpdateWebhookRequest) obj;
        encoder.getClass();
        updateWebhookRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UpdateWebhookRequest.write$Self$api(updateWebhookRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
