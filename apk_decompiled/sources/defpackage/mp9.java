package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp9 {
    public static final mp9 g;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final gea f;

    static {
        int i = 0;
        g = new mp9(i, i, i, 127);
    }

    public /* synthetic */ mp9(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : Boolean.FALSE, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, null, null);
    }

    public static mp9 a() {
        mp9 mp9Var = g;
        return new mp9(3, mp9Var.b, mp9Var.c, mp9Var.d, null, null);
    }

    public final int b() {
        int i = this.d;
        ty8 ty8Var = new ty8(i);
        if (i == -1) {
            ty8Var = null;
        }
        if (ty8Var != null) {
            return ty8Var.a;
        }
        return 1;
    }

    public final xy8 c(boolean z) {
        int i = this.a;
        lp9 lp9Var = new lp9(i);
        if (i == -1) {
            lp9Var = null;
        }
        int i2 = lp9Var != null ? lp9Var.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        np9 np9Var = i3 != 0 ? new np9(i3) : null;
        int i4 = np9Var != null ? np9Var.a : 1;
        int iB = b();
        gea geaVar = this.f;
        if (geaVar == null) {
            geaVar = gea.G;
        }
        return new xy8(z, i2, zBooleanValue, i4, iB, geaVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp9)) {
            return false;
        }
        mp9 mp9Var = (mp9) obj;
        return this.a == mp9Var.a && x44.r(this.b, mp9Var.b) && this.c == mp9Var.c && this.d == mp9Var.d && x44.r(this.e, mp9Var.e) && x44.r(this.f, mp9Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iC = vb7.c(this.d, vb7.c(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        int iHashCode2 = (iC + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        gea geaVar = this.f;
        return iHashCode2 + (geaVar != null ? geaVar.E.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) lp9.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) np9.a(this.c)) + ", imeAction=" + ((Object) ty8.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.e + ", hintLocales=" + this.f + ')';
    }

    public mp9(int i, Boolean bool, int i2, int i3, Boolean bool2, gea geaVar) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = bool2;
        this.f = geaVar;
    }
}
