package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jba {
    public final Object a;
    public z5l b = new z5l();
    public boolean c;
    public boolean d;

    public jba(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jba.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((jba) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
