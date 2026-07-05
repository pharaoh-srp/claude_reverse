package defpackage;

import com.anthropic.claude.sessions.types.GitProxyCompareResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u58 implements w28 {
    public static final u58 a;
    private static final SerialDescriptor descriptor;

    static {
        u58 u58Var = new u58();
        a = u58Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GitProxyCompareResponse", u58Var, 7);
        pluginGeneratedSerialDescriptor.j("base_branch", false);
        pluginGeneratedSerialDescriptor.j("head_branch", false);
        pluginGeneratedSerialDescriptor.j("ahead_by", false);
        pluginGeneratedSerialDescriptor.j("behind_by", false);
        pluginGeneratedSerialDescriptor.j("total_commits", false);
        pluginGeneratedSerialDescriptor.j("files", false);
        pluginGeneratedSerialDescriptor.j("diff_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = GitProxyCompareResponse.$childSerializers;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, e79Var, e79Var, e79Var, kw9VarArr[5].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GitProxyCompareResponse.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        String strV = null;
        String strV2 = null;
        List list = null;
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
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iR3 = ud4VarC.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list);
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
        return new GitProxyCompareResponse(i, strV, strV2, iR, iR2, iR3, list, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GitProxyCompareResponse gitProxyCompareResponse = (GitProxyCompareResponse) obj;
        encoder.getClass();
        gitProxyCompareResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GitProxyCompareResponse.write$Self$sessions(gitProxyCompareResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
