package defpackage;

import com.anthropic.claude.sessions.types.GheSource;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.RepoStatus;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yhe implements w28 {
    public static final yhe a;
    private static final SerialDescriptor descriptor;

    static {
        yhe yheVar = new yhe();
        a = yheVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.RepoWithStatus", yheVar, 4);
        pluginGeneratedSerialDescriptor.j("repo", false);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("ghe", true);
        pluginGeneratedSerialDescriptor.j("source_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j58.a, d4c.S(uhe.a), d4c.S(s48.a), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        GitHubRepo gitHubRepo = null;
        RepoStatus repoStatus = null;
        GheSource gheSource = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                gitHubRepo = (GitHubRepo) ud4VarC.l(serialDescriptor, 0, j58.a, gitHubRepo);
                i |= 1;
            } else if (iX == 1) {
                repoStatus = (RepoStatus) ud4VarC.m(serialDescriptor, 1, uhe.a, repoStatus);
                i |= 2;
            } else if (iX == 2) {
                gheSource = (GheSource) ud4VarC.m(serialDescriptor, 2, s48.a, gheSource);
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
        return new RepoWithStatus(i, gitHubRepo, repoStatus, gheSource, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RepoWithStatus repoWithStatus = (RepoWithStatus) obj;
        encoder.getClass();
        repoWithStatus.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RepoWithStatus.write$Self$sessions(repoWithStatus, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
