package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class mw9 extends co5 implements l6e {
    public final /* synthetic */ int G = 1;
    public final bo5 H;
    public final m6e I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw9(bo5 bo5Var, t3 t3Var, wc0 wc0Var, sxb sxbVar) {
        super(wc0Var, sxbVar);
        if (bo5Var == null) {
            M0(3);
            throw null;
        }
        if (wc0Var == null) {
            M0(5);
            throw null;
        }
        if (sxbVar == null) {
            M0(6);
            throw null;
        }
        this.H = bo5Var;
        this.I = t3Var;
    }

    public static /* synthetic */ void M0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = ExperienceToggle.DEFAULT_PARAM_KEY;
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void N0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.i(this, obj);
    }

    @Override // defpackage.c92
    public final List I() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N0(7);
        throw null;
    }

    @Override // defpackage.vwg
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final mw9 e(a aVar) {
        if (aVar == null) {
            N0(3);
            throw null;
        }
        if (!aVar.a.f()) {
            yr9 yr9VarK = h() instanceof qqb ? aVar.k(3, getType()) : aVar.k(1, getType());
            if (yr9VarK == null) {
                return null;
            }
            if (yr9VarK != getType()) {
                return new mw9(h(), new m5i(yr9VarK), getAnnotations());
            }
        }
        return this;
    }

    @Override // defpackage.c92
    public final l6e P() {
        return null;
    }

    @Override // defpackage.c92
    public final l6e S() {
        return null;
    }

    @Override // defpackage.co5, defpackage.bo5
    public final bo5 a() {
        return this;
    }

    @Override // defpackage.co5, defpackage.bo5
    public final c92 a() {
        return this;
    }

    @Override // defpackage.do5
    public final neg d() {
        return neg.n;
    }

    @Override // defpackage.c92
    public final yr9 getReturnType() {
        return getType();
    }

    @Override // defpackage.tqi
    public final yr9 getType() {
        yr9 type = getValue().getType();
        if (type != null) {
            return type;
        }
        N0(6);
        throw null;
    }

    @Override // defpackage.c92
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N0(5);
        throw null;
    }

    @Override // defpackage.l6e
    public final m6e getValue() {
        int i = this.G;
        m6e m6eVar = this.I;
        switch (i) {
            case 0:
                tz8 tz8Var = (tz8) m6eVar;
                if (tz8Var != null) {
                    return tz8Var;
                }
                k0(1);
                throw null;
            default:
                t3 t3Var = (t3) m6eVar;
                if (t3Var != null) {
                    return t3Var;
                }
                M0(7);
                throw null;
        }
    }

    @Override // defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        p06 p06Var = q06.f;
        if (p06Var != null) {
            return p06Var;
        }
        N0(9);
        throw null;
    }

    @Override // defpackage.bo5
    public final bo5 h() {
        int i = this.G;
        bo5 bo5Var = this.H;
        switch (i) {
            case 0:
                qqb qqbVar = (qqb) bo5Var;
                if (qqbVar != null) {
                    return qqbVar;
                }
                k0(2);
                throw null;
            default:
                if (bo5Var != null) {
                    return bo5Var;
                }
                M0(8);
                throw null;
        }
    }

    @Override // defpackage.c92
    public final Collection i() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        N0(8);
        throw null;
    }

    @Override // defpackage.co5
    public String toString() {
        switch (this.G) {
            case 0:
                return "class " + ((qqb) this.H).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.c92
    public final boolean v() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mw9(bo5 bo5Var, t3 t3Var, wc0 wc0Var) {
        this(bo5Var, t3Var, wc0Var, ygg.d);
        if (bo5Var == null) {
            M0(0);
            throw null;
        }
        if (wc0Var != null) {
        } else {
            M0(2);
            throw null;
        }
    }

    public mw9(qqb qqbVar) {
        super(dd8.F, ygg.d);
        this.H = qqbVar;
        this.I = new tz8(qqbVar);
    }
}
