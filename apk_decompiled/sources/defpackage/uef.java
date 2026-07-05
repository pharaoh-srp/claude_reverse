package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uef {
    public final xef a;
    public final xef b;

    public uef(xef xefVar, xef xefVar2) {
        this.a = xefVar;
        this.b = xefVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uef.class == obj.getClass()) {
            uef uefVar = (uef) obj;
            if (this.a.equals(uefVar.a) && this.b.equals(uefVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        xef xefVar = this.a;
        sb.append(xefVar);
        xef xefVar2 = this.b;
        if (xefVar.equals(xefVar2)) {
            str = "";
        } else {
            str = ", " + xefVar2;
        }
        return ij0.m(sb, str, "]");
    }
}
