package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes.dex */
public class jrd extends jri implements hrd {
    public final boolean J;
    public cfa K;
    public zy7 L;
    public final int M;
    public ow5 N;
    public Collection O;
    public final hrd P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public List W;
    public l6e X;
    public l6e Y;
    public ArrayList Z;
    public krd a0;
    public prd b0;
    public nh7 c0;
    public nh7 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrd(bo5 bo5Var, hrd hrdVar, wc0 wc0Var, int i, ow5 ow5Var, boolean z, sxb sxbVar, int i2, neg negVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(bo5Var, wc0Var, sxbVar, null, negVar);
        if (bo5Var == null) {
            k0(0);
            throw null;
        }
        if (wc0Var == null) {
            k0(1);
            throw null;
        }
        if (i == 0) {
            k0(2);
            throw null;
        }
        if (ow5Var == null) {
            k0(3);
            throw null;
        }
        if (sxbVar == null) {
            k0(4);
            throw null;
        }
        if (i2 == 0) {
            k0(5);
            throw null;
        }
        if (negVar == null) {
            k0(6);
            throw null;
        }
        this.J = z;
        this.O = null;
        this.W = Collections.EMPTY_LIST;
        this.M = i;
        this.N = ow5Var;
        this.P = hrdVar == null ? this : hrdVar;
        this.Q = i2;
        this.R = z2;
        this.S = z3;
        this.T = z4;
        this.U = z5;
        this.V = z6;
    }

    public static jrd O0(bo5 bo5Var, int i, ow5 ow5Var, boolean z, sxb sxbVar, int i2, neg negVar) {
        vc0 vc0Var = dd8.F;
        if (bo5Var == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(9);
            throw null;
        }
        if (ow5Var == null) {
            k0(10);
            throw null;
        }
        if (sxbVar == null) {
            k0(11);
            throw null;
        }
        if (i2 == 0) {
            k0(12);
            throw null;
        }
        if (negVar != null) {
            return new jrd(bo5Var, null, vc0Var, i, ow5Var, z, sxbVar, i2, negVar, false, false, false, false, false);
        }
        k0(13);
        throw null;
    }

    public static h08 Q0(a aVar, erd erdVar) {
        if (erdVar == null) {
            k0(31);
            throw null;
        }
        if (erdVar.N() != null) {
            return erdVar.N().e(aVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void k0(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrd.k0(int):void");
    }

    @Override // defpackage.hrd
    public final boolean A() {
        return this.V;
    }

    @Override // defpackage.iri
    public final il4 D() {
        cfa cfaVar = this.K;
        if (cfaVar != null) {
            return (il4) cfaVar.a();
        }
        return null;
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.v(this, obj);
    }

    @Override // defpackage.e92
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final jrd M(bo5 bo5Var, int i, ow5 ow5Var) {
        ird irdVar = new ird(this);
        irdVar.g(bo5Var);
        irdVar.f(null);
        irdVar.e(i);
        irdVar.i(ow5Var);
        irdVar.d();
        irdVar.c();
        jrd jrdVarB = irdVar.b();
        if (jrdVarB != null) {
            return jrdVarB;
        }
        k0(42);
        throw null;
    }

    @Override // defpackage.jri, defpackage.c92
    public final l6e P() {
        return this.X;
    }

    public jrd P0(bo5 bo5Var, int i, ow5 ow5Var, hrd hrdVar, int i2, sxb sxbVar) {
        if (bo5Var == null) {
            k0(32);
            throw null;
        }
        if (i == 0) {
            k0(33);
            throw null;
        }
        if (ow5Var == null) {
            k0(34);
            throw null;
        }
        if (i2 == 0) {
            k0(35);
            throw null;
        }
        if (sxbVar == null) {
            k0(36);
            throw null;
        }
        return new jrd(bo5Var, hrdVar, getAnnotations(), i, ow5Var, this.J, sxbVar, i2, neg.n, this.R, r(), this.T, isExternal(), this.V);
    }

    @Override // defpackage.iri
    public final boolean R() {
        return this.J;
    }

    public final void R0(krd krdVar, prd prdVar, nh7 nh7Var, nh7 nh7Var2) {
        this.a0 = krdVar;
        this.b0 = prdVar;
        this.c0 = nh7Var;
        this.d0 = nh7Var2;
    }

    @Override // defpackage.jri, defpackage.c92
    public final l6e S() {
        return this.Y;
    }

    public final void S0(cfa cfaVar, zy7 zy7Var) {
        if (zy7Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.L = zy7Var;
        if (cfaVar == null) {
            cfaVar = (cfa) zy7Var.a();
        }
        this.K = cfaVar;
    }

    @Override // defpackage.hrd
    public final nh7 T() {
        return this.d0;
    }

    public void T0(yr9 yr9Var) {
    }

    public final void U0(yr9 yr9Var, List list, l6e l6eVar, mw9 mw9Var, List list2) {
        if (yr9Var == null) {
            k0(17);
            throw null;
        }
        if (list == null) {
            k0(18);
            throw null;
        }
        if (list2 == null) {
            k0(19);
            throw null;
        }
        this.I = yr9Var;
        this.Z = new ArrayList(list);
        this.Y = mw9Var;
        this.X = l6eVar;
        this.W = list2;
    }

    @Override // defpackage.hrd
    public final nh7 V() {
        return this.c0;
    }

    @Override // defpackage.c92
    public final List X() {
        List list = this.W;
        if (list != null) {
            return list;
        }
        k0(22);
        throw null;
    }

    @Override // defpackage.iri
    public final boolean Y() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [hrd] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final hrd a() {
        hrd hrdVar = this.P;
        ?? A = this;
        if (hrdVar != this) {
            A = hrdVar.a();
        }
        if (A != 0) {
            return A;
        }
        k0(38);
        throw null;
    }

    @Override // defpackage.hrd
    public final krd b() {
        return this.a0;
    }

    @Override // defpackage.hrd
    public final prd c() {
        return this.b0;
    }

    @Override // defpackage.e92
    public final void d0(Collection collection) {
        if (collection != null) {
            this.O = collection;
        } else {
            k0(40);
            throw null;
        }
    }

    @Override // defpackage.vwg
    public final hrd e(a aVar) {
        if (aVar == null) {
            k0(27);
            throw null;
        }
        if (aVar.h()) {
            return this;
        }
        ird irdVar = new ird(this);
        irdVar.h(aVar.g());
        irdVar.f(a());
        return irdVar.b();
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.e92
    public final int getKind() {
        int i = this.Q;
        if (i != 0) {
            return i;
        }
        k0(39);
        throw null;
    }

    @Override // defpackage.jri, defpackage.c92
    public final yr9 getReturnType() {
        yr9 type = getType();
        if (type != null) {
            return type;
        }
        k0(23);
        throw null;
    }

    @Override // defpackage.jri, defpackage.c92
    public final List getTypeParameters() {
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            return arrayList;
        }
        sz6.j("typeParameters == null for ".concat(co5.L0(this)));
        return null;
    }

    @Override // defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        ow5 ow5Var = this.N;
        if (ow5Var != null) {
            return ow5Var;
        }
        k0(25);
        throw null;
    }

    @Override // defpackage.c92
    public final Collection i() {
        Collection collection = this.O;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        k0(41);
        throw null;
    }

    @Override // defpackage.w9b
    public boolean isExternal() {
        return this.U;
    }

    @Override // defpackage.hrd
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList(2);
        krd krdVar = this.a0;
        if (krdVar != null) {
            arrayList.add(krdVar);
        }
        prd prdVar = this.b0;
        if (prdVar != null) {
            arrayList.add(prdVar);
        }
        return arrayList;
    }

    public Object n(e16 e16Var) {
        return null;
    }

    @Override // defpackage.w9b
    public final int q() {
        int i = this.M;
        if (i != 0) {
            return i;
        }
        k0(24);
        throw null;
    }

    public boolean r() {
        return this.S;
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return this.T;
    }
}
