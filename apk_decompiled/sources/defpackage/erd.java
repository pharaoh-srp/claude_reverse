package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class erd extends eo5 implements h08 {
    public boolean I;
    public final boolean J;
    public final int K;
    public final hrd L;
    public final boolean M;
    public final int N;
    public ow5 O;
    public h08 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erd(int i, ow5 ow5Var, hrd hrdVar, wc0 wc0Var, sxb sxbVar, boolean z, boolean z2, boolean z3, int i2, neg negVar) {
        super(hrdVar.h(), wc0Var, sxbVar, negVar);
        if (i == 0) {
            k0(0);
            throw null;
        }
        if (ow5Var == null) {
            k0(1);
            throw null;
        }
        if (wc0Var == null) {
            k0(3);
            throw null;
        }
        if (negVar == null) {
            k0(5);
            throw null;
        }
        this.P = null;
        this.K = i;
        this.O = ow5Var;
        this.L = hrdVar;
        this.I = z;
        this.J = z2;
        this.M = z3;
        this.N = i2;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.h08
    public final boolean B() {
        return false;
    }

    @Override // defpackage.e92
    public final e92 M(qqb qqbVar, int i, ow5 ow5Var) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.h08
    public final h08 N() {
        return this.P;
    }

    public final hrd N0() {
        hrd hrdVar = this.L;
        if (hrdVar != null) {
            return hrdVar;
        }
        k0(13);
        throw null;
    }

    public final ArrayList O0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (hrd hrdVar : N0().i()) {
            w9b w9bVarB = z ? hrdVar.b() : hrdVar.c();
            if (w9bVarB != null) {
                arrayList.add(w9bVarB);
            }
        }
        return arrayList;
    }

    @Override // defpackage.c92
    public final l6e P() {
        return N0().P();
    }

    public final boolean P0() {
        return this.I;
    }

    public final void Q0() {
        this.I = false;
    }

    public final void R0(ow5 ow5Var) {
        this.O = ow5Var;
    }

    @Override // defpackage.c92
    public final l6e S() {
        return N0().S();
    }

    @Override // defpackage.c92
    public final List X() {
        List listX = N0().X();
        if (listX != null) {
            return listX;
        }
        k0(14);
        throw null;
    }

    @Override // defpackage.h08
    public final boolean c0() {
        return false;
    }

    @Override // defpackage.e92
    public final void d0(Collection collection) {
        if (collection != null) {
            return;
        }
        k0(16);
        throw null;
    }

    @Override // defpackage.h08, defpackage.vwg
    public final h08 e(a aVar) {
        if (aVar != null) {
            return this;
        }
        k0(7);
        throw null;
    }

    @Override // defpackage.h08
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.e92
    public final int getKind() {
        int i = this.N;
        if (i != 0) {
            return i;
        }
        k0(6);
        throw null;
    }

    @Override // defpackage.c92
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(9);
        throw null;
    }

    @Override // defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        ow5 ow5Var = this.O;
        if (ow5Var != null) {
            return ow5Var;
        }
        k0(11);
        throw null;
    }

    @Override // defpackage.w9b
    public final boolean isExternal() {
        return this.J;
    }

    @Override // defpackage.h08
    public final boolean isInfix() {
        return false;
    }

    @Override // defpackage.h08
    public final boolean isInline() {
        return this.M;
    }

    @Override // defpackage.h08
    public final boolean isOperator() {
        return false;
    }

    @Override // defpackage.h08
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.c92
    public final Object n(e16 e16Var) {
        return null;
    }

    @Override // defpackage.w9b
    public final int q() {
        int i = this.K;
        if (i != 0) {
            return i;
        }
        k0(10);
        throw null;
    }

    @Override // defpackage.c92
    public final boolean v() {
        return false;
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return false;
    }

    @Override // defpackage.vwg
    public final /* bridge */ /* synthetic */ do5 e(a aVar) {
        e(aVar);
        return this;
    }
}
