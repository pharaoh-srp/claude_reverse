package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nz9 implements q5b {
    public final jz9 E;
    public final gvg F;
    public final kz9 G;
    public final xub H;

    public nz9(jz9 jz9Var, gvg gvgVar) {
        this.E = jz9Var;
        this.F = gvgVar;
        this.G = (kz9) jz9Var.b.a();
        x69.a();
        this.H = new xub();
    }

    @Override // defpackage.cz5
    public final float D(long j) {
        return this.F.D(j);
    }

    @Override // defpackage.cz5
    public final int E0(long j) {
        return this.F.E0(j);
    }

    @Override // defpackage.q5b
    public final p5b J0(int i, int i2, Map map, bz7 bz7Var, bz7 bz7Var2) {
        return this.F.J0(i, i2, map, bz7Var, bz7Var2);
    }

    @Override // defpackage.cz5
    public final int M0(float f) {
        return this.F.M0(f);
    }

    @Override // defpackage.cz5
    public final long T(int i) {
        return this.F.T(i);
    }

    @Override // defpackage.q5b
    public final p5b U(int i, int i2, Map map, bz7 bz7Var) {
        return this.F.U(i, i2, map, bz7Var);
    }

    @Override // defpackage.cz5
    public final long U0(long j) {
        return this.F.U0(j);
    }

    @Override // defpackage.cz5
    public final long W(float f) {
        return this.F.W(f);
    }

    @Override // defpackage.cz5
    public final float W0(long j) {
        return this.F.W0(j);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a(int i) {
        xub xubVar = this.H;
        List list = (List) xubVar.b(i);
        if (list != null) {
            return list;
        }
        kz9 kz9Var = this.G;
        Object objC = kz9Var.c(i);
        List listP = this.F.p(this.E.a(objC, i, kz9Var.d(i)), objC);
        xubVar.i(i, listP);
        return listP;
    }

    @Override // defpackage.cz5
    public final float c0(int i) {
        return this.F.c0(i);
    }

    @Override // defpackage.cz5
    public final float g0(float f) {
        return this.F.g0(f);
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.F.getDensity();
    }

    @Override // defpackage.xa9
    public final fu9 getLayoutDirection() {
        return this.F.getLayoutDirection();
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.F.k0();
    }

    @Override // defpackage.xa9
    public final boolean n0() {
        return this.F.n0();
    }

    @Override // defpackage.cz5
    public final float q0(float f) {
        return this.F.q0(f);
    }

    @Override // defpackage.cz5
    public final long r(float f) {
        return this.F.r(f);
    }

    @Override // defpackage.cz5
    public final long s(long j) {
        return this.F.s(j);
    }
}
