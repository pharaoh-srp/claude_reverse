package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends qqb {
    public final sxb E;
    public final dfa F;
    public final dfa G;
    public final dfa H;

    public i0(gfa gfaVar, sxb sxbVar) {
        int i = 0;
        if (gfaVar == null) {
            t0(0);
            throw null;
        }
        int i2 = 1;
        if (sxbVar == null) {
            t0(1);
            throw null;
        }
        this.E = sxbVar;
        this.F = new dfa(gfaVar, new h0(this, i));
        this.G = new dfa(gfaVar, new h0(this, i2));
        this.H = new dfa(gfaVar, new h0(this, 2));
    }

    public static /* synthetic */ void t0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[0] = "typeSubstitution";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[2] = "getMemberScope";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.y(this, obj);
    }

    @Override // defpackage.qqb
    public fab H(bbi bbiVar, es9 es9Var) {
        if (!bbiVar.f()) {
            return new wwg(m0(es9Var), a.e(bbiVar));
        }
        fab fabVarM0 = m0(es9Var);
        if (fabVarM0 != null) {
            return fabVarM0;
        }
        t0(12);
        throw null;
    }

    @Override // defpackage.qqb
    /* JADX INFO: renamed from: K */
    public final qqb a() {
        return this;
    }

    @Override // defpackage.qqb, defpackage.xh3
    public final j7g W() {
        j7g j7gVar = (j7g) this.F.a();
        if (j7gVar != null) {
            return j7gVar;
        }
        t0(20);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.bo5
    public final bo5 a() {
        return this;
    }

    @Override // defpackage.qqb, defpackage.bo5
    public final xh3 a() {
        return this;
    }

    @Override // defpackage.bo5
    public final sxb getName() {
        sxb sxbVar = this.E;
        if (sxbVar != null) {
            return sxbVar;
        }
        t0(2);
        throw null;
    }

    @Override // defpackage.qqb
    public final l6e j0() {
        l6e l6eVar = (l6e) this.H.a();
        if (l6eVar != null) {
            return l6eVar;
        }
        t0(5);
        throw null;
    }

    @Override // defpackage.qqb
    public List k() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(6);
        throw null;
    }

    @Override // defpackage.qqb
    public fab k0() {
        fab fabVar = (fab) this.G.a();
        if (fabVar != null) {
            return fabVar;
        }
        t0(4);
        throw null;
    }

    @Override // defpackage.qqb
    public fab l0() {
        o06.h(m06.d(this));
        fab fabVarM0 = m0(es9.a);
        if (fabVarM0 != null) {
            return fabVarM0;
        }
        t0(17);
        throw null;
    }

    @Override // defpackage.qqb
    public final fab o(bbi bbiVar) {
        o06.h(m06.d(this));
        fab fabVarH = H(bbiVar, es9.a);
        if (fabVarH != null) {
            return fabVarH;
        }
        t0(16);
        throw null;
    }

    @Override // defpackage.vwg
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public qqb e(a aVar) {
        if (aVar != null) {
            return aVar.h() ? this : new v1a(this, aVar);
        }
        t0(18);
        throw null;
    }
}
