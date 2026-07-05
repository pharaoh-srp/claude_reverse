package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w3i {
    public static final w3i d = new w3i(new v3i[0]);
    public final int a;
    public final vde b;
    public int c;

    static {
        tpi.w(0);
    }

    public w3i(v3i... v3iVarArr) {
        vde vdeVarR = nz8.r(v3iVarArr);
        this.b = vdeVarR;
        this.a = v3iVarArr.length;
        int i = 0;
        while (i < vdeVarR.H) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < vdeVarR.H; i3++) {
                if (((v3i) vdeVarR.get(i)).equals(vdeVarR.get(i3))) {
                    ysj.k("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final v3i a(int i) {
        return (v3i) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w3i.class != obj.getClass()) {
            return false;
        }
        w3i w3iVar = (w3i) obj;
        return this.a == w3iVar.a && this.b.equals(w3iVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
