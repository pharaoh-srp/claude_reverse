package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import com.anthropic.claude.sessions.types.EnvironmentCreateRequest;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qq6 implements w28 {
    public static final qq6 a;
    private static final SerialDescriptor descriptor;

    static {
        qq6 qq6Var = new qq6();
        a = qq6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.EnvironmentCreateRequest", qq6Var, 4);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) EnvironmentCreateRequest.$childSerializers[3].getValue());
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, uq6.a, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EnvironmentCreateRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        EnvironmentKind environmentKind = null;
        String strV2 = null;
        EnvironmentConfiguration environmentConfiguration = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                environmentKind = (EnvironmentKind) ud4VarC.l(serialDescriptor, 1, uq6.a, environmentKind);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                environmentConfiguration = (EnvironmentConfiguration) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), environmentConfiguration);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EnvironmentCreateRequest(i, strV, environmentKind, strV2, environmentConfiguration, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnvironmentCreateRequest environmentCreateRequest = (EnvironmentCreateRequest) obj;
        encoder.getClass();
        environmentCreateRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnvironmentCreateRequest.write$Self$sessions(environmentCreateRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
