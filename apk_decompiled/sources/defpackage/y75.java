package defpackage;

import com.anthropic.claude.sessions.types.CreatePullRequestRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y75 implements w28 {
    public static final y75 a;
    private static final SerialDescriptor descriptor;

    static {
        y75 y75Var = new y75();
        a = y75Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.CreatePullRequestRequest", y75Var, 6);
        pluginGeneratedSerialDescriptor.j("repo", false);
        pluginGeneratedSerialDescriptor.j("head", false);
        pluginGeneratedSerialDescriptor.j("base", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("body", true);
        pluginGeneratedSerialDescriptor.j("draft", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreatePullRequestRequest(i, strV, strV2, str, str2, str3, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreatePullRequestRequest createPullRequestRequest = (CreatePullRequestRequest) obj;
        encoder.getClass();
        createPullRequestRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreatePullRequestRequest.write$Self$sessions(createPullRequestRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
