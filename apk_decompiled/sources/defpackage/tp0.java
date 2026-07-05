package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class tp0 {
    public final ctk a;
    public final ArtifactMetadata b;
    public final jz0 c;

    public tp0(ctk ctkVar, ArtifactMetadata artifactMetadata, jz0 jz0Var) {
        artifactMetadata.getClass();
        this.a = ctkVar;
        this.b = artifactMetadata;
        this.c = jz0Var;
    }

    public final ArtifactMetadata a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp0)) {
            return false;
        }
        tp0 tp0Var = (tp0) obj;
        return this.a.equals(tp0Var.a) && x44.r(this.b, tp0Var.b) && x44.r(this.c, tp0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jz0 jz0Var = this.c;
        return iHashCode + (jz0Var == null ? 0 : jz0Var.hashCode());
    }

    public final String toString() {
        return "Artifact(content=" + this.a + ", metadata=" + this.b + ", markdownRoot=" + this.c + ")";
    }
}
