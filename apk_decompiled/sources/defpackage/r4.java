package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r4 extends eo5 implements qai {
    public final int I;
    public final boolean J;
    public final int K;
    public final dfa L;
    public final dfa M;
    public final gfa N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(gfa gfaVar, bo5 bo5Var, wc0 wc0Var, sxb sxbVar, int i, boolean z, int i2, zp3 zp3Var) {
        super(bo5Var, wc0Var, sxbVar, neg.n);
        int i3 = 0;
        if (gfaVar == null) {
            k0(0);
            throw null;
        }
        if (bo5Var == null) {
            k0(1);
            throw null;
        }
        if (wc0Var == null) {
            k0(2);
            throw null;
        }
        if (sxbVar == null) {
            k0(3);
            throw null;
        }
        if (i == 0) {
            k0(4);
            throw null;
        }
        if (zp3Var == null) {
            k0(6);
            throw null;
        }
        this.I = i;
        this.J = z;
        this.K = i2;
        this.L = new dfa(gfaVar, new n4(this, gfaVar, zp3Var));
        this.M = new dfa(gfaVar, new p4(this, sxbVar, i3));
        this.N = gfaVar;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.h(this, obj);
    }

    @Override // defpackage.eo5
    /* JADX INFO: renamed from: M0 */
    public final do5 a() {
        return this;
    }

    public List N0(List list) {
        return list;
    }

    public abstract List O0();

    @Override // defpackage.qai
    public final gfa Q() {
        gfa gfaVar = this.N;
        if (gfaVar != null) {
            return gfaVar;
        }
        k0(14);
        throw null;
    }

    @Override // defpackage.qai
    public final boolean U() {
        return false;
    }

    @Override // defpackage.xh3
    public final j7g W() {
        j7g j7gVar = (j7g) this.M.a();
        if (j7gVar != null) {
            return j7gVar;
        }
        k0(10);
        throw null;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final bo5 a() {
        return this;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final xh3 a() {
        return this;
    }

    @Override // defpackage.qai
    public final int getIndex() {
        return this.K;
    }

    @Override // defpackage.qai
    public final List getUpperBounds() {
        List listI = ((q4) p()).b();
        if (listI != null) {
            return listI;
        }
        k0(8);
        throw null;
    }

    @Override // defpackage.xh3
    public final u9i p() {
        u9i u9iVar = (u9i) this.L.a();
        if (u9iVar != null) {
            return u9iVar;
        }
        k0(9);
        throw null;
    }

    @Override // defpackage.qai
    public final boolean u() {
        return this.J;
    }

    @Override // defpackage.qai
    public final int z() {
        int i = this.I;
        if (i != 0) {
            return i;
        }
        k0(7);
        throw null;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final qai a() {
        return this;
    }
}
