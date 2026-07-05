package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class zg3 extends xg3 {
    public final int K;
    public final int L;
    public final ph3 M;
    public fab N;
    public Set O;
    public tg3 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg3(bo5 bo5Var, sxb sxbVar, int i, int i2, Collection collection, gfa gfaVar) {
        super(gfaVar, bo5Var, sxbVar, neg.n);
        if (bo5Var == null) {
            t0(0);
            throw null;
        }
        if (sxbVar == null) {
            t0(1);
            throw null;
        }
        if (i == 0) {
            t0(2);
            throw null;
        }
        if (i2 == 0) {
            t0(3);
            throw null;
        }
        if (gfaVar == null) {
            t0(6);
            throw null;
        }
        this.K = i;
        this.L = i2;
        this.M = new ph3(this, Collections.EMPTY_LIST, collection, gfaVar);
    }

    public static /* synthetic */ void t0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[1] = "getVisibility";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.qqb
    public final Collection O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(19);
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
        return dd8.F;
    }

    @Override // defpackage.qqb, defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        p06 p06Var = q06.e;
        if (p06Var != null) {
            return p06Var;
        }
        t0(17);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(18);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.qqb
    public final Collection j() {
        Set set = this.O;
        if (set != null) {
            return set;
        }
        t0(11);
        throw null;
    }

    @Override // defpackage.qqb
    public final int m() {
        int i = this.L;
        if (i != 0) {
            return i;
        }
        t0(15);
        throw null;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        fab fabVar = this.N;
        if (fabVar != null) {
            return fabVar;
        }
        t0(13);
        throw null;
    }

    @Override // defpackage.qqb
    public final tg3 n0() {
        return this.P;
    }

    @Override // defpackage.qqb
    public final sqi o0() {
        return null;
    }

    @Override // defpackage.xh3
    public final u9i p() {
        ph3 ph3Var = this.M;
        if (ph3Var != null) {
            return ph3Var;
        }
        t0(10);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.qqb, defpackage.w9b
    public final int q() {
        int i = this.K;
        if (i != 0) {
            return i;
        }
        t0(16);
        throw null;
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

    public String toString() {
        return "class " + getName();
    }

    public final void v0(fab fabVar, Set set, tg3 tg3Var) {
        this.N = fabVar;
        this.O = set;
        this.P = tg3Var;
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
