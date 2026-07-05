package defpackage;

import com.anthropic.claude.sessions.types.GitProxyFileRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w58 implements w28 {
    public static final w58 a;
    private static final SerialDescriptor descriptor;

    static {
        w58 w58Var = new w58();
        a = w58Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GitProxyFileRequest", w58Var, 4);
        pluginGeneratedSerialDescriptor.j("owner", false);
        pluginGeneratedSerialDescriptor.j("repo", false);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("ref", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV3 = ud4VarC.v(serialDescriptor, 2);
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
        return new GitProxyFileRequest(i, strV, strV2, strV3, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GitProxyFileRequest gitProxyFileRequest = (GitProxyFileRequest) obj;
        encoder.getClass();
        gitProxyFileRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GitProxyFileRequest.write$Self$sessions(gitProxyFileRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
