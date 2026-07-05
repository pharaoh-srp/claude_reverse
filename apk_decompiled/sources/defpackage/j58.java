package defpackage;

import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.GitHubRepoOwner;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j58 implements w28 {
    public static final j58 a;
    private static final SerialDescriptor descriptor;

    static {
        j58 j58Var = new j58();
        a = j58Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GitHubRepo", j58Var, 6);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("owner", false);
        pluginGeneratedSerialDescriptor.j("default_branch", false);
        pluginGeneratedSerialDescriptor.j("visibility", true);
        pluginGeneratedSerialDescriptor.j("sourceUrl", true);
        pluginGeneratedSerialDescriptor.j("gheConfigurationId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, l58.a, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        GitHubRepoOwner gitHubRepoOwner = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
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
                    gitHubRepoOwner = (GitHubRepoOwner) ud4VarC.l(serialDescriptor, 1, l58.a, gitHubRepoOwner);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GitHubRepo(i, strV, gitHubRepoOwner, strV2, str, str2, num, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GitHubRepo gitHubRepo = (GitHubRepo) obj;
        encoder.getClass();
        gitHubRepo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GitHubRepo.write$Self$sessions(gitHubRepo, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
