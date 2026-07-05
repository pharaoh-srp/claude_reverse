package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bn6 {
    public final en6 a;
    public final byte[] b;

    public bn6(en6 en6Var, byte[] bArr) {
        if (en6Var == null) {
            mr9.h("encoding is null");
            throw null;
        }
        if (bArr == null) {
            mr9.h("bytes is null");
            throw null;
        }
        this.a = en6Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn6)) {
            return false;
        }
        bn6 bn6Var = (bn6) obj;
        if (this.a.equals(bn6Var.a)) {
            return Arrays.equals(this.b, bn6Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
