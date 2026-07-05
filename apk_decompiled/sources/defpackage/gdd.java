package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gdd {
    public static final gdd c = new gdd(fdd.E, 0);
    public static final gdd d = new gdd(fdd.J, 1);
    public final fdd a;
    public final int b;

    public gdd(fdd fddVar, int i) {
        this.a = fddVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gdd.class != obj.getClass()) {
            return false;
        }
        gdd gddVar = (gdd) obj;
        return this.a == gddVar.a && this.b == gddVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "slice" : "meet");
        return sb.toString();
    }
}
