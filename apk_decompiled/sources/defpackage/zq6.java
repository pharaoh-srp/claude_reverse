package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.sessions.types.BridgeEnvironmentInfo;
import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.EnvironmentState;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zq6 implements w28 {
    public static final zq6 a;
    private static final SerialDescriptor descriptor;

    static {
        zq6 zq6Var = new zq6();
        a = zq6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.EnvironmentResource", zq6Var, 7);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("environment_id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("config", true);
        pluginGeneratedSerialDescriptor.j("bridge_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = EnvironmentResource.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{uq6.a, srgVar, srgVar, g69.a, kw9VarArr[4].getValue(), d4c.S((KSerializer) kw9VarArr[5].getValue()), d4c.S(ex1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EnvironmentResource.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        EnvironmentKind environmentKind = null;
        String strV = null;
        String strV2 = null;
        c69 c69Var = null;
        EnvironmentState environmentState = null;
        EnvironmentConfiguration environmentConfiguration = null;
        BridgeEnvironmentInfo bridgeEnvironmentInfo = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    environmentKind = (EnvironmentKind) ud4VarC.l(serialDescriptor, 0, uq6.a, environmentKind);
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    c69Var = (c69) ud4VarC.l(serialDescriptor, 3, g69.a, c69Var);
                    i |= 8;
                    break;
                case 4:
                    environmentState = (EnvironmentState) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), environmentState);
                    i |= 16;
                    break;
                case 5:
                    environmentConfiguration = (EnvironmentConfiguration) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), environmentConfiguration);
                    i |= 32;
                    break;
                case 6:
                    bridgeEnvironmentInfo = (BridgeEnvironmentInfo) ud4VarC.m(serialDescriptor, 6, ex1.a, bridgeEnvironmentInfo);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new EnvironmentResource(i, environmentKind, strV, strV2, c69Var, environmentState, environmentConfiguration, bridgeEnvironmentInfo, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnvironmentResource environmentResource = (EnvironmentResource) obj;
        encoder.getClass();
        environmentResource.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnvironmentResource.write$Self$sessions(environmentResource, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
