package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l2c implements ic2 {
    public final vai a;
    public zy7 b;
    public final l2c c;
    public final qai d;
    public final kw9 e;

    public l2c(vai vaiVar, zy7 zy7Var, l2c l2cVar, qai qaiVar) {
        vaiVar.getClass();
        this.a = vaiVar;
        this.b = zy7Var;
        this.c = l2cVar;
        this.d = qaiVar;
        this.e = yb5.w(w1a.F, new k2c(0, this));
    }

    @Override // defpackage.u9i
    public final xh3 a() {
        return null;
    }

    @Override // defpackage.u9i
    public final Collection b() {
        Collection collection = (List) this.e.getValue();
        if (collection == null) {
            collection = lm6.E;
        }
        return collection;
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ic2
    public final vai d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l2c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        l2c l2cVar = (l2c) obj;
        l2c l2cVar2 = this.c;
        if (l2cVar2 != null) {
            this = l2cVar2;
        }
        l2c l2cVar3 = l2cVar.c;
        if (l2cVar3 != null) {
            l2cVar = l2cVar3;
        }
        return this == l2cVar;
    }

    @Override // defpackage.u9i
    public final or9 f() {
        yr9 yr9VarB = this.a.b();
        yr9VarB.getClass();
        return jwk.x(yr9VarB);
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return lm6.E;
    }

    public final int hashCode() {
        l2c l2cVar = this.c;
        return l2cVar != null ? l2cVar.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    public /* synthetic */ l2c(vai vaiVar, j2c j2cVar, qai qaiVar, int i) {
        this(vaiVar, (i & 2) != 0 ? null : j2cVar, (l2c) null, (i & 8) != 0 ? null : qaiVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l2c(vai vaiVar, ArrayList arrayList) {
        this(vaiVar, new j2c(0, arrayList), (qai) null, 8);
        vaiVar.getClass();
    }
}
