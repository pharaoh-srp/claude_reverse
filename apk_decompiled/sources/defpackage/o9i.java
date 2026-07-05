package defpackage;

import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class o9i extends j08 implements dm4 {
    public static final cm4 k0;
    public final gfa h0;
    public final q16 i0;
    public tg3 j0;

    static {
        kce kceVar = jce.a;
        kceVar.g(new mrd(kceVar.b(o9i.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        k0 = new cm4();
    }

    public o9i(gfa gfaVar, q16 q16Var, tg3 tg3Var, o9i o9iVar, wc0 wc0Var, int i, neg negVar) {
        super(i, wc0Var, q16Var, o9iVar, ygg.e, negVar);
        this.h0 = gfaVar;
        this.i0 = q16Var;
        xz xzVar = new xz(this, 19, tg3Var);
        gfaVar.getClass();
        new cfa(gfaVar, xzVar);
        this.j0 = tg3Var;
    }

    @Override // defpackage.j08, defpackage.e92
    public final e92 M(qqb qqbVar, int i, ow5 ow5Var) {
        qqbVar.getClass();
        if (i == 0) {
            throw null;
        }
        ow5Var.getClass();
        i08 i08VarT0 = T0(a.b);
        i08VarT0.F = qqbVar;
        i08VarT0.G = i;
        i08VarT0.H = ow5Var;
        i08VarT0.J = 2;
        i08VarT0.Q = false;
        j08 j08VarQ0 = i08VarT0.b0.Q0(i08VarT0);
        j08VarQ0.getClass();
        return (o9i) j08VarQ0;
    }

    @Override // defpackage.eo5
    /* JADX INFO: renamed from: M0 */
    public final do5 a() {
        h08 h08VarA = super.a();
        h08VarA.getClass();
        return (o9i) h08VarA;
    }

    @Override // defpackage.j08
    public final j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        bo5Var.getClass();
        if (i == 0) {
            throw null;
        }
        wc0Var.getClass();
        if (i != 1) {
        }
        return new o9i(this.h0, this.i0, this.j0, this, wc0Var, 1, negVar);
    }

    public final tg3 Y0() {
        return this.j0;
    }

    @Override // defpackage.j08, defpackage.h08, defpackage.vwg
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final o9i e(a aVar) {
        aVar.getClass();
        h08 h08VarE = super.e(aVar);
        h08VarE.getClass();
        o9i o9iVar = (o9i) h08VarE;
        yr9 yr9Var = o9iVar.K;
        yr9Var.getClass();
        tg3 tg3VarE = this.j0.a().e(a.d(yr9Var));
        if (tg3VarE == null) {
            return null;
        }
        o9iVar.j0 = tg3VarE;
        return o9iVar;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final c92 a() {
        h08 h08VarA = super.a();
        h08VarA.getClass();
        return (o9i) h08VarA;
    }

    @Override // defpackage.j08, defpackage.c92
    public final yr9 getReturnType() {
        yr9 yr9Var = this.K;
        yr9Var.getClass();
        return yr9Var;
    }

    @Override // defpackage.eo5, defpackage.bo5
    public final yh3 h() {
        return this.i0;
    }

    @Override // defpackage.dm4
    public final qqb s() {
        qqb qqbVarS = this.j0.s();
        qqbVarS.getClass();
        return qqbVarS;
    }

    @Override // defpackage.eo5, defpackage.bo5
    public final bo5 h() {
        return this.i0;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final e92 a() {
        h08 h08VarA = super.a();
        h08VarA.getClass();
        return (o9i) h08VarA;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final bo5 a() {
        h08 h08VarA = super.a();
        h08VarA.getClass();
        return (o9i) h08VarA;
    }

    @Override // defpackage.j08, defpackage.eo5, defpackage.co5, defpackage.bo5
    public final h08 a() {
        h08 h08VarA = super.a();
        h08VarA.getClass();
        return (o9i) h08VarA;
    }
}
