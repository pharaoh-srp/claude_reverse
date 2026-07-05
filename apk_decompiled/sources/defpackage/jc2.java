package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jc2 implements ic2 {
    public final vai a;
    public l2c b;

    public jc2(vai vaiVar) {
        vaiVar.getClass();
        this.a = vaiVar;
        vaiVar.a();
    }

    @Override // defpackage.u9i
    public final /* bridge */ /* synthetic */ xh3 a() {
        return null;
    }

    @Override // defpackage.u9i
    public final Collection b() {
        vai vaiVar = this.a;
        yr9 yr9VarB = vaiVar.a() == 3 ? vaiVar.b() : f().n();
        yr9VarB.getClass();
        return x44.W(yr9VarB);
    }

    @Override // defpackage.u9i
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ic2
    public final vai d() {
        return this.a;
    }

    public final l2c e() {
        return this.b;
    }

    @Override // defpackage.u9i
    public final or9 f() {
        or9 or9VarF = this.a.b().O().f();
        or9VarF.getClass();
        return or9VarF;
    }

    public final void g(l2c l2cVar) {
        this.b = l2cVar;
    }

    @Override // defpackage.u9i
    public final List getParameters() {
        return lm6.E;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
