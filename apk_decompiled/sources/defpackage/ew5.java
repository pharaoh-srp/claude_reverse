package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ew5 {
    public final y8g a;
    public final j6f b;
    public final s5i c;
    public final uad d;

    public ew5(y8g y8gVar, j6f j6fVar, s5i s5iVar, uad uadVar) {
        this.a = y8gVar;
        this.b = j6fVar;
        this.c = s5iVar;
        this.d = uadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew5)) {
            return false;
        }
        ew5 ew5Var = (ew5) obj;
        return x44.r(this.a, ew5Var.a) && this.b == ew5Var.b && x44.r(this.c, ew5Var.c) && this.d == ew5Var.d;
    }

    public final int hashCode() {
        y8g y8gVar = this.a;
        int iHashCode = (y8gVar != null ? y8gVar.hashCode() : 0) * 31;
        j6f j6fVar = this.b;
        int iHashCode2 = (iHashCode + (j6fVar != null ? j6fVar.hashCode() : 0)) * 28629151;
        s5i s5iVar = this.c;
        int iHashCode3 = (iHashCode2 + (s5iVar != null ? s5iVar.hashCode() : 0)) * 31;
        uad uadVar = this.d;
        return (iHashCode3 + (uadVar != null ? uadVar.hashCode() : 0)) * 887503681;
    }
}
