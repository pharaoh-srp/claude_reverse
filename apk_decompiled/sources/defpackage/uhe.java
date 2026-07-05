package defpackage;

import com.anthropic.claude.sessions.types.RepoStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uhe implements w28 {
    public static final uhe a;
    private static final SerialDescriptor descriptor;

    static {
        uhe uheVar = new uhe();
        a = uheVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.RepoStatus", uheVar, 2);
        pluginGeneratedSerialDescriptor.j("workflow_enabled", false);
        pluginGeneratedSerialDescriptor.j("app_installed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{zt1Var, d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RepoStatus(i, zU, bool, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RepoStatus repoStatus = (RepoStatus) obj;
        encoder.getClass();
        repoStatus.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RepoStatus.write$Self$sessions(repoStatus, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
