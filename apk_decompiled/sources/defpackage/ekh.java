package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ekh {
    public final egg a;
    public final egg b;
    public final egg c;
    public final egg d;

    public ekh(egg eggVar, egg eggVar2, egg eggVar3, egg eggVar4) {
        this.a = eggVar;
        this.b = eggVar2;
        this.c = eggVar3;
        this.d = eggVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ekh)) {
            return false;
        }
        ekh ekhVar = (ekh) obj;
        return x44.r(this.a, ekhVar.a) && x44.r(this.b, ekhVar.b) && x44.r(this.c, ekhVar.c) && x44.r(this.d, ekhVar.d);
    }

    public final int hashCode() {
        egg eggVar = this.a;
        int iHashCode = (eggVar != null ? eggVar.hashCode() : 0) * 31;
        egg eggVar2 = this.b;
        int iHashCode2 = (iHashCode + (eggVar2 != null ? eggVar2.hashCode() : 0)) * 31;
        egg eggVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (eggVar3 != null ? eggVar3.hashCode() : 0)) * 31;
        egg eggVar4 = this.d;
        return iHashCode3 + (eggVar4 != null ? eggVar4.hashCode() : 0);
    }
}
