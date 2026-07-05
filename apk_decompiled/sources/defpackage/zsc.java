package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zsc implements mtc {
    public final String a;
    public final jz0 b;
    public final ArtifactMetadata c;
    public final List d;
    public final boolean e;

    public zsc(String str, jz0 jz0Var, ArtifactMetadata artifactMetadata, List list, boolean z) {
        artifactMetadata.getClass();
        list.getClass();
        this.a = str;
        this.b = jz0Var;
        this.c = artifactMetadata;
        this.d = list;
        this.e = z;
    }

    public static zsc a(zsc zscVar, ArtifactMetadata artifactMetadata, int i) {
        String str = zscVar.a;
        jz0 jz0Var = zscVar.b;
        if ((i & 4) != 0) {
            artifactMetadata = zscVar.c;
        }
        ArtifactMetadata artifactMetadata2 = artifactMetadata;
        List list = zscVar.d;
        boolean z = (i & 16) != 0 ? zscVar.e : true;
        artifactMetadata2.getClass();
        list.getClass();
        return new zsc(str, jz0Var, artifactMetadata2, list, z);
    }

    public final jz0 b() {
        return this.b;
    }

    public final ArtifactMetadata c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsc)) {
            return false;
        }
        zsc zscVar = (zsc) obj;
        return this.a.equals(zscVar.a) && x44.r(this.b, zscVar.b) && x44.r(this.c, zscVar.c) && x44.r(this.d, zscVar.d) && this.e == zscVar.e;
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jz0 jz0Var = this.b;
        return Boolean.hashCode(this.e) + kgh.m((this.c.hashCode() + ((iHashCode + (jz0Var == null ? 0 : jz0Var.hashCode())) * 31)) * 31, 31, this.d);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete */
    public final boolean getIsComplete() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Artifact(body=");
        sb.append(this.a);
        sb.append(", markdownRoot=");
        sb.append(this.b);
        sb.append(", metadata=");
        sb.append(this.c);
        sb.append(", citations=");
        sb.append(this.d);
        sb.append(", isComplete=");
        return sq6.v(")", sb, this.e);
    }
}
