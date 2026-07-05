package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gl2 {
    public final h86 a;
    public final ny2 b;

    public gl2(h86 h86Var, ny2 ny2Var) {
        this.a = h86Var;
        this.b = ny2Var;
    }

    public static Object a(gl2 gl2Var, String str, List list, Set set, boolean z, ArtifactMetadata artifactMetadata, poj pojVar, pr1 pr1Var, vp4 vp4Var, int i) {
        return gb9.c0(gl2Var.a.getDefault(), new fl2((i & 16) != 0 ? null : artifactMetadata, str, z, pojVar, gl2Var, list, (i & 64) != 0 ? null : pr1Var, set, null), vp4Var);
    }
}
