package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oe {
    public final bpc a;
    public final String b;
    public final pz7 c;
    public final szh d;
    public final bz7 e;

    public oe(bpc bpcVar, String str, ta4 ta4Var, szh szhVar, bz7 bz7Var, int i) {
        ta4Var = (i & 4) != 0 ? null : ta4Var;
        bpcVar.getClass();
        str.getClass();
        bz7Var.getClass();
        this.a = bpcVar;
        this.b = str;
        this.c = ta4Var;
        this.d = szhVar;
        this.e = bz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return x44.r(this.a, oeVar.a) && x44.r(this.b, oeVar.b) && x44.r(this.c, oeVar.c) && this.d.equals(oeVar.d) && x44.r(this.e, oeVar.e);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        pz7 pz7Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iL + (pz7Var == null ? 0 : pz7Var.hashCode())) * 961)) * 31);
    }

    public final String toString() {
        return "AddToChatSettingToggleState(icon=" + this.a + ", title=" + this.b + ", badge=" + this.c + ", description=null, setting=" + this.d + ", onCheckedChange=" + this.e + ")";
    }
}
