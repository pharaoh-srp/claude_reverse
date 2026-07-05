package defpackage;

import com.anthropic.claude.api.project.ProjectKnowledgeStats;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bnd implements w28 {
    public static final bnd a;
    private static final SerialDescriptor descriptor;

    static {
        bnd bndVar = new bnd();
        a = bndVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.project.ProjectKnowledgeStats", bndVar, 4);
        pluginGeneratedSerialDescriptor.j("knowledge_size", false);
        pluginGeneratedSerialDescriptor.j("max_knowledge_size", false);
        pluginGeneratedSerialDescriptor.j("project_knowledge_search_threshold", false);
        pluginGeneratedSerialDescriptor.j("use_project_knowledge_search", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{xkaVar, xkaVar, d4c.S(xkaVar), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        boolean zU = false;
        long j = 0;
        long j2 = 0;
        Long l = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                j = ud4VarC.j(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j2 = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                l = (Long) ud4VarC.m(serialDescriptor, 2, xka.a, l);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectKnowledgeStats(i, j, j2, l, zU, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectKnowledgeStats projectKnowledgeStats = (ProjectKnowledgeStats) obj;
        encoder.getClass();
        projectKnowledgeStats.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectKnowledgeStats.write$Self$api(projectKnowledgeStats, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
