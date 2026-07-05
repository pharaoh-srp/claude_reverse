package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes2.dex */
public final class kq0 {
    public final String a;
    public final String b;
    public final ArtifactMetadata c;

    public kq0(String str, String str2, ArtifactMetadata artifactMetadata) {
        str.getClass();
        str2.getClass();
        artifactMetadata.getClass();
        this.a = str;
        this.b = str2;
        this.c = artifactMetadata;
    }

    public final String a() {
        return this.b;
    }

    public final ArtifactMetadata b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq0)) {
            return false;
        }
        kq0 kq0Var = (kq0) obj;
        return ChatId.m981equalsimpl0(this.a, kq0Var.a) && x44.r(this.b, kq0Var.b) && x44.r(this.c, kq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(ChatId.m982hashCodeimpl(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("CachedArtifactContent(chatId=", ChatId.m983toStringimpl(this.a), ", body=", this.b, ", metadata=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
