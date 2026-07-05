package defpackage;

import com.anthropic.claude.api.sync.PreAuthState;
import com.anthropic.claude.api.sync.StartAuthRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vkg implements w28 {
    public static final vkg a;
    private static final SerialDescriptor descriptor;

    static {
        vkg vkgVar = new vkg();
        a = vkgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.sync.StartAuthRequest", vkgVar, 2);
        pluginGeneratedSerialDescriptor.j("redirect_uri", true);
        pluginGeneratedSerialDescriptor.j("pre_auth_state", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), qad.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        PreAuthState preAuthState = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                preAuthState = (PreAuthState) ud4VarC.l(serialDescriptor, 1, qad.a, preAuthState);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StartAuthRequest(i, str, preAuthState, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StartAuthRequest startAuthRequest = (StartAuthRequest) obj;
        encoder.getClass();
        startAuthRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StartAuthRequest.write$Self$api(startAuthRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
