package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kj9 {
    public final iie a;
    public final iie b;
    public final Map c = nm6.E;
    public final boolean d;

    public kj9(iie iieVar, iie iieVar2) {
        this.a = iieVar;
        this.b = iieVar2;
        new u0h(new l4(18, this));
        iie iieVar3 = iie.IGNORE;
        this.d = iieVar == iieVar3 && iieVar2 == iieVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj9)) {
            return false;
        }
        kj9 kj9Var = (kj9) obj;
        return this.a == kj9Var.a && this.b == kj9Var.b && this.c.equals(kj9Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iie iieVar = this.b;
        return this.c.hashCode() + ((iHashCode + (iieVar == null ? 0 : iieVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
