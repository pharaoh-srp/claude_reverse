package defpackage;

import com.anthropic.claude.sessions.types.BranchPullRequest;
import com.anthropic.claude.sessions.types.BranchStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vw1 implements w28 {
    public static final vw1 a;
    private static final SerialDescriptor descriptor;

    static {
        vw1 vw1Var = new vw1();
        a = vw1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.BranchStatus", vw1Var, 7);
        pluginGeneratedSerialDescriptor.j("repo", false);
        pluginGeneratedSerialDescriptor.j("branch", false);
        pluginGeneratedSerialDescriptor.j("pull_request", true);
        pluginGeneratedSerialDescriptor.j("has_changes", true);
        pluginGeneratedSerialDescriptor.j("commits", true);
        pluginGeneratedSerialDescriptor.j("branch_exists", true);
        pluginGeneratedSerialDescriptor.j("has_session_binding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(sw1.a);
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS, zt1Var, e79.a, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        int iR = 0;
        boolean zU2 = false;
        boolean zU3 = false;
        String strV = null;
        String strV2 = null;
        BranchPullRequest branchPullRequest = null;
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
                    branchPullRequest = (BranchPullRequest) ud4VarC.m(serialDescriptor, 2, sw1.a, branchPullRequest);
                    i |= 4;
                    break;
                case 3:
                    zU = ud4VarC.u(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iR = ud4VarC.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zU2 = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zU3 = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BranchStatus(i, strV, strV2, branchPullRequest, zU, iR, zU2, zU3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BranchStatus branchStatus = (BranchStatus) obj;
        encoder.getClass();
        branchStatus.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BranchStatus.write$Self$sessions(branchStatus, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
