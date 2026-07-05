package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jq6 extends xg3 {
    public final ph3 K;
    public final iq6 L;
    public final u6c M;
    public final wc0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq6(gfa gfaVar, qqb qqbVar, j7g j7gVar, sxb sxbVar, u6c u6cVar, wc0 wc0Var, neg negVar) {
        super(gfaVar, qqbVar, sxbVar, negVar);
        if (gfaVar == null) {
            t0(6);
            throw null;
        }
        if (qqbVar == null) {
            t0(7);
            throw null;
        }
        if (j7gVar == null) {
            t0(8);
            throw null;
        }
        if (sxbVar == null) {
            t0(9);
            throw null;
        }
        if (u6cVar == null) {
            t0(10);
            throw null;
        }
        this.N = wc0Var;
        this.K = new ph3(this, Collections.EMPTY_LIST, Collections.singleton(j7gVar), gfaVar);
        this.L = new iq6(this, gfaVar);
        this.M = u6cVar;
    }

    public static /* synthetic */ void t0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[1] = "getTypeConstructor";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getKind";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getModality";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static jq6 v0(gfa gfaVar, qqb qqbVar, sxb sxbVar, dfa dfaVar, wc0 wc0Var, neg negVar) {
        if (gfaVar == null) {
            t0(0);
            throw null;
        }
        if (qqbVar == null) {
            t0(1);
            throw null;
        }
        if (sxbVar == null) {
            t0(2);
            throw null;
        }
        if (dfaVar != null) {
            return new jq6(gfaVar, qqbVar, qqbVar.W(), sxbVar, dfaVar, wc0Var, negVar);
        }
        t0(3);
        throw null;
    }

    @Override // defpackage.qqb
    public final Collection O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(23);
        throw null;
    }

    @Override // defpackage.qqb
    public final fab b0() {
        return eab.b;
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.ub0
    public final wc0 getAnnotations() {
        wc0 wc0Var = this.N;
        if (wc0Var != null) {
            return wc0Var;
        }
        t0(21);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        p06 p06Var = q06.e;
        if (p06Var != null) {
            return p06Var;
        }
        t0(20);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(22);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.qqb
    public final Collection j() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(16);
        throw null;
    }

    @Override // defpackage.qqb
    public final int m() {
        return 4;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        iq6 iq6Var = this.L;
        if (iq6Var != null) {
            return iq6Var;
        }
        t0(14);
        throw null;
    }

    @Override // defpackage.qqb
    public final tg3 n0() {
        return null;
    }

    @Override // defpackage.qqb
    public final sqi o0() {
        return null;
    }

    @Override // defpackage.xh3
    public final u9i p() {
        ph3 ph3Var = this.K;
        if (ph3Var != null) {
            return ph3Var;
        }
        t0(17);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.qqb, defpackage.w9b
    public final int q() {
        return 1;
    }

    @Override // defpackage.qqb
    public final boolean q0() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean r0() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return false;
    }

    @Override // defpackage.yh3
    public final boolean y() {
        return false;
    }
}
