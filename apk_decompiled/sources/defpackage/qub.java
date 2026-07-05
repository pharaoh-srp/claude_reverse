package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qub extends xg3 {
    public final int K;
    public int L;
    public ow5 M;
    public ph3 N;
    public ArrayList O;
    public final ArrayList P;
    public final gfa Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qub(pm6 pm6Var, sxb sxbVar, gfa gfaVar) {
        super(gfaVar, pm6Var, sxbVar, neg.n);
        if (sxbVar == null) {
            t0(2);
            throw null;
        }
        if (gfaVar == null) {
            t0(4);
            throw null;
        }
        this.P = new ArrayList();
        this.Q = gfaVar;
        this.K = 2;
    }

    public static /* synthetic */ void t0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        ow5 ow5Var = this.M;
        if (ow5Var != null) {
            return ow5Var;
        }
        t0(10);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            return arrayList;
        }
        t0(15);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.qqb
    public final Collection j() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        t0(13);
        throw null;
    }

    @Override // defpackage.qqb
    public final int m() {
        int i = this.K;
        if (i != 0) {
            return i;
        }
        t0(8);
        throw null;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        return eab.b;
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
        ph3 ph3Var = this.N;
        if (ph3Var != null) {
            return ph3Var;
        }
        t0(11);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.qqb, defpackage.w9b
    public final int q() {
        int i = this.L;
        if (i != 0) {
            return i;
        }
        t0(7);
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

    public final String toString() {
        return co5.L0(this);
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
