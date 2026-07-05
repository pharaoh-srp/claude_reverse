package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i5d {
    public static final i5d c = new i5d(0, false);
    public final boolean a;
    public final int b;

    public i5d() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5d)) {
            return false;
        }
        i5d i5dVar = (i5d) obj;
        return this.a == i5dVar.a && this.b == i5dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) vl6.a(this.b)) + ')';
    }

    public i5d(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
