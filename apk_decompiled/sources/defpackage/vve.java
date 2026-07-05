package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class vve implements e0g, na9 {
    public final t35 a;
    public final t35 b;
    public final t35 c;
    public final t35 d;

    public vve(t35 t35Var, t35 t35Var2, t35 t35Var3, t35 t35Var4) {
        this.a = t35Var;
        this.b = t35Var2;
        this.c = t35Var3;
        this.d = t35Var4;
    }

    public static vve c(vve vveVar, t35 t35Var, t35 t35Var2, t35 t35Var3, t35 t35Var4, int i) {
        if ((i & 1) != 0) {
            t35Var = vveVar.a;
        }
        if ((i & 2) != 0) {
            t35Var2 = vveVar.b;
        }
        if ((i & 4) != 0) {
            t35Var3 = vveVar.c;
        }
        if ((i & 8) != 0) {
            t35Var4 = vveVar.d;
        }
        vveVar.getClass();
        return new vve(t35Var, t35Var2, t35Var3, t35Var4);
    }

    @Override // defpackage.e0g
    public final knk a(long j, fu9 fu9Var, cz5 cz5Var) {
        float fA = this.a.a(j, cz5Var);
        float fA2 = this.b.a(j, cz5Var);
        float fA3 = this.c.a(j, cz5Var);
        float fA4 = this.d.a(j, cz5Var);
        float fD = k8g.d(j);
        float f = fA + fA4;
        if (f > fD) {
            float f2 = fD / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fD) {
            float f4 = fD / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < MTTypesetterKt.kLineSkipLimitMultiplier || fA2 < MTTypesetterKt.kLineSkipLimitMultiplier || fA3 < MTTypesetterKt.kLineSkipLimitMultiplier || fA4 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            e39.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return new flc(d4c.x(0L, j));
        }
        l9e l9eVarX = d4c.x(0L, j);
        fu9 fu9Var2 = fu9.E;
        float f5 = fu9Var == fu9Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        if (fu9Var == fu9Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA)) << 32);
        float f6 = fu9Var == fu9Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (fu9Var != fu9Var2) {
            fA4 = fA3;
        }
        return new glc(gb9.e(l9eVarX, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    @Override // defpackage.na9
    public final Object b(Object obj, float f) {
        if (x44.r(obj, zni.b) || obj == null) {
            vve vveVar = xve.a;
            nzd nzdVar = new nzd(MTTypesetterKt.kLineSkipLimitMultiplier);
            obj = new vve(nzdVar, nzdVar, nzdVar, nzdVar);
        }
        if (!(obj instanceof vve)) {
            return null;
        }
        vve vveVar2 = (vve) obj;
        vve vveVar3 = xve.a;
        return new vve(new wve(this.a, vveVar2.a, f), new wve(this.b, vveVar2.b, f), new wve(this.c, vveVar2.c, f), new wve(this.d, vveVar2.d, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vve)) {
            return false;
        }
        vve vveVar = (vve) obj;
        return x44.r(this.a, vveVar.a) && x44.r(this.b, vveVar.b) && x44.r(this.c, vveVar.c) && x44.r(this.d, vveVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
