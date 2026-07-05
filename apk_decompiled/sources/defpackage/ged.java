package defpackage;

import com.anthropic.claude.types.strings.FileId;

/* JADX INFO: loaded from: classes3.dex */
public final class ged {
    public final String a;
    public final String b;

    public ged(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ged)) {
            return false;
        }
        ged gedVar = (ged) obj;
        return FileId.m1017equalsimpl0(this.a, gedVar.a) && this.b.equals(gedVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (FileId.m1018hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("PreviewDocument(fileId=", FileId.m1019toStringimpl(this.a), ", content=", this.b, ")");
    }
}
