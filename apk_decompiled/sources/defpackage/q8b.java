package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q8b {
    public static final q8b b = new q8b("text/*");
    public static final q8b c = new q8b("*/*");
    public final String a;

    public q8b(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8b)) {
            return false;
        }
        return this.a.equals(((q8b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.m(new StringBuilder("MediaType(representation='"), this.a, "')");
    }
}
