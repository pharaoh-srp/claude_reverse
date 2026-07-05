package defpackage;

import com.anthropic.claude.sessions.types.BranchPullRequest;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sw1 implements w28 {
    public static final sw1 a;
    private static final SerialDescriptor descriptor;

    static {
        sw1 sw1Var = new sw1();
        a = sw1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.BranchPullRequest", sw1Var, 8);
        pluginGeneratedSerialDescriptor.j("number", false);
        pluginGeneratedSerialDescriptor.j("additions", false);
        pluginGeneratedSerialDescriptor.j("deletions", false);
        pluginGeneratedSerialDescriptor.j("commits", false);
        pluginGeneratedSerialDescriptor.j("auto_merge_enabled", true);
        pluginGeneratedSerialDescriptor.j("state", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, e79Var, e79Var, zt1.a, kSerializerS, kSerializerS2, kSerializerS3};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        boolean zU = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iR = ud4VarC.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iR2 = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iR3 = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR4 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zU = ud4VarC.u(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str2);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new BranchPullRequest(i, iR, iR2, iR3, iR4, zU, str, str2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BranchPullRequest branchPullRequest = (BranchPullRequest) obj;
        encoder.getClass();
        branchPullRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BranchPullRequest.write$Self$sessions(branchPullRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
