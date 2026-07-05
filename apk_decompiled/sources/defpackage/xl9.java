package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xl9 extends im9 implements pl9, dm9, ho9 {
    public static final /* synthetic */ int H = 0;
    public final Class F;
    public final fce G;

    public xl9(Class cls) {
        cls.getClass();
        this.F = cls;
        this.G = new fce(new sl9(this, 8));
    }

    @Override // defpackage.sg3
    public final Class a() {
        return this.F;
    }

    @Override // defpackage.pl9
    public final String d() {
        ece eceVar = ((ul9) this.G.a()).e;
        wn9 wn9Var = ul9.l[3];
        return (String) eceVar.a();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xl9) && ez1.J(this).equals(ez1.J((pl9) obj));
    }

    @Override // defpackage.pl9
    public final String f() {
        ece eceVar = ((ul9) this.G.a()).d;
        wn9 wn9Var = ul9.l[2];
        return (String) eceVar.a();
    }

    @Override // defpackage.pl9
    public final int hashCode() {
        return ez1.J(this).hashCode();
    }

    @Override // defpackage.im9
    public final Collection l() {
        qqb descriptor = getDescriptor();
        if (descriptor.m() == 2 || descriptor.m() == 6) {
            return lm6.E;
        }
        Collection collectionJ = descriptor.j();
        collectionJ.getClass();
        return collectionJ;
    }

    @Override // defpackage.im9
    public final Collection m(sxb sxbVar) {
        Collection collectionG = getDescriptor().W().G().g(sxbVar, 8);
        fab fabVarB0 = getDescriptor().b0();
        fabVarB0.getClass();
        return w44.a1(collectionG, fabVarB0.g(sxbVar, 8));
    }

    @Override // defpackage.pl9
    public final boolean n(Object obj) {
        List list = yae.a;
        Class cls = this.F;
        cls.getClass();
        Integer num = (Integer) yae.d.get(cls);
        if (num != null) {
            return nai.N(num.intValue(), obj);
        }
        Class cls2 = (Class) yae.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.im9
    public final hrd o(int i) {
        Class<?> declaringClass;
        Class cls = this.F;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((xl9) jce.a.b(declaringClass)).o(i);
        }
        qqb descriptor = getDescriptor();
        c16 c16Var = descriptor instanceof c16 ? (c16) descriptor : null;
        if (c16Var != null) {
            esd esdVar = c16Var.I;
            t28 t28Var = el9.j;
            t28Var.getClass();
            ctd ctdVar = (ctd) uik.j(esdVar, t28Var, i);
            if (ctdVar != null) {
                wk wkVar = c16Var.P;
                return (hrd) vpi.f(this.F, ctdVar, (txb) wkVar.e, (cbi) wkVar.f, c16Var.J, wl9.E);
            }
        }
        return null;
    }

    @Override // defpackage.im9
    public final Collection r(sxb sxbVar) {
        Collection collectionD = getDescriptor().W().G().d(sxbVar, 8);
        fab fabVarB0 = getDescriptor().b0();
        fabVarB0.getClass();
        return w44.a1(collectionD, fabVarB0.d(sxbVar, 8));
    }

    public final String toString() {
        gh3 gh3VarX = x();
        ww7 ww7VarG = gh3VarX.g();
        ww7VarG.getClass();
        String strConcat = ww7VarG.d() ? "" : ww7VarG.b().concat(".");
        String strReplace = gh3VarX.h().b().replace('.', '$');
        strReplace.getClass();
        return "class ".concat(strConcat.concat(strReplace));
    }

    public final gh3 x() {
        vfd vfdVarC;
        gh3 gh3Var = jze.a;
        Class cls = this.F;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            vfdVarC = componentType.isPrimitive() ? nk9.b(componentType.getSimpleName()).c() : null;
            return vfdVarC != null ? new gh3(pkg.j, vfdVarC.F) : gh3.j(okg.g.g());
        }
        if (cls.equals(Void.TYPE)) {
            return jze.a;
        }
        vfdVarC = cls.isPrimitive() ? nk9.b(cls.getSimpleName()).c() : null;
        if (vfdVarC != null) {
            return new gh3(pkg.j, vfdVarC.E);
        }
        gh3 gh3VarA = yae.a(cls);
        if (!gh3VarA.c) {
            String str = ue9.a;
            gh3 gh3VarF = ue9.f(gh3VarA.b());
            if (gh3VarF != null) {
                return gh3VarF;
            }
        }
        return gh3VarA;
    }

    @Override // defpackage.dm9
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final qqb getDescriptor() {
        return ((ul9) this.G.a()).a();
    }
}
