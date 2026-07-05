package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.artifact.model.ArtifactUuid;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.artifact.model.c;
import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes.dex */
public final class saj {
    public final String a;
    public final ul0 b;
    public final ze0 c;
    public final z74 d;
    public final mdg e;
    public final pdg f;
    public final pdg g;

    public saj(String str, ul0 ul0Var, ze0 ze0Var, z74 z74Var) {
        str.getClass();
        this.a = str;
        this.b = ul0Var;
        this.c = ze0Var;
        this.d = z74Var;
        this.e = new mdg();
        this.f = new pdg();
        this.g = new pdg();
    }

    public static ArtifactType b(String str) {
        str.getClass();
        String strA = ikb.a(str);
        if (strA.equals("jsx") || strA.equals("tsx")) {
            return ArtifactType.React.INSTANCE;
        }
        if (strA.equals("html") || strA.equals("htm")) {
            return ArtifactType.Html.INSTANCE;
        }
        if (strA.equals("mermaid") || strA.equals("mmd")) {
            return ArtifactType.Mermaid.INSTANCE;
        }
        if (ikb.e().contains(strA)) {
            return ArtifactType.Code.INSTANCE;
        }
        String strC = ikb.c(str, "text/plain");
        ArtifactType.Companion.getClass();
        return c.a(strC);
    }

    public final tp0 a(String str, ctk ctkVar, ArtifactType artifactType, boolean z) {
        jz0 jz0VarA;
        ArtifactUuid.Companion.getClass();
        ArtifactMetadata artifactMetadata = new ArtifactMetadata(tt0.a(), (String) null, (String) null, artifactType, bsg.e1(str, "/", str), ikb.a(str), z, 6, (mq5) null);
        if (x44.r(artifactType, ArtifactType.Markdown.INSTANCE) && (ctkVar instanceof jq0)) {
            jz0VarA = this.d.a(((jq0) ctkVar).k());
        } else {
            jz0VarA = null;
        }
        return new tp0(ctkVar, artifactMetadata, jz0VarA);
    }

    public final void c(String str) {
        str.getClass();
        b54.x0(this.e.G, new hti(str, 1));
        b54.x0(this.f, new hti(str, 2));
        b54.x0(this.g, new hti(str, 3));
    }

    public final void d(WiggleArtifactIdentifier wiggleArtifactIdentifier, String str, String str2, boolean z) {
        ArtifactType artifactTypeB = b(str2);
        if (artifactTypeB instanceof ArtifactType.BinaryDocument) {
            SilentException.a(new SilentException(ij0.i("Unsupported type to cache ", artifactTypeB.getMimeType())), ozf.F, false, 2);
        } else {
            this.e.put(wiggleArtifactIdentifier, a(wiggleArtifactIdentifier.getEncodedPath(), new jq0(str), artifactTypeB, z));
        }
    }
}
