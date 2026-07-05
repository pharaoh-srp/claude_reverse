package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d8g implements iif {
    public final boolean a;
    public final int b;
    public final int c;
    public final ohf d;
    public final tgf e;

    public d8g(boolean z, int i, int i2, ohf ohfVar, tgf tgfVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = ohfVar;
        this.e = tgfVar;
    }

    @Override // defpackage.iif
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.iif
    public final tgf b() {
        return this.e;
    }

    @Override // defpackage.iif
    public final int c() {
        return 1;
    }

    @Override // defpackage.iif
    public final ohf d() {
        return this.d;
    }

    @Override // defpackage.iif
    public final tgf e() {
        return this.e;
    }

    @Override // defpackage.iif
    public final void f(bz7 bz7Var) {
    }

    @Override // defpackage.iif
    public final int g() {
        return this.c;
    }

    @Override // defpackage.iif
    public final tgf h() {
        return this.e;
    }

    @Override // defpackage.iif
    public final hc5 i() {
        int i = this.b;
        int i2 = this.c;
        return i < i2 ? hc5.F : i > i2 ? hc5.E : this.e.b();
    }

    @Override // defpackage.iif
    public final tgf j() {
        return this.e;
    }

    @Override // defpackage.iif
    public final int k() {
        return this.b;
    }

    @Override // defpackage.iif
    public final boolean l(iif iifVar) {
        if (this.d == null || iifVar == null || !(iifVar instanceof d8g)) {
            return true;
        }
        d8g d8gVar = (d8g) iifVar;
        if (this.b != d8gVar.b || this.c != d8gVar.c || this.a != d8gVar.a) {
            return true;
        }
        tgf tgfVar = d8gVar.e;
        tgf tgfVar2 = this.e;
        return (tgfVar2.a == tgfVar.a && tgfVar2.c == tgfVar.c && tgfVar2.d == tgfVar.d) ? false : true;
    }

    @Override // defpackage.iif
    public final evb m(ohf ohfVar) {
        boolean z = ohfVar.c;
        nhf nhfVar = ohfVar.b;
        nhf nhfVar2 = ohfVar.a;
        if ((!z && nhfVar2.b > nhfVar.b) || (z && nhfVar2.b <= nhfVar.b)) {
            ohfVar = ohf.a(ohfVar, null, null, !z, 3);
        }
        long j = this.e.a;
        evb evbVar = kka.a;
        evb evbVar2 = new evb();
        evbVar2.h(j, ohfVar);
        return evbVar2;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + i() + ", info=\n\t" + this.e + ')';
    }
}
