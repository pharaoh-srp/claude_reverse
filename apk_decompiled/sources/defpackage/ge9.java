package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ge9 extends c7g implements ud9 {
    public static final e16 j0 = new e16();
    public static final e16 k0 = new e16();
    public int h0;
    public final boolean i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge9(bo5 bo5Var, c7g c7gVar, wc0 wc0Var, sxb sxbVar, int i, neg negVar, boolean z) {
        super(bo5Var, c7gVar, wc0Var, sxbVar, i, negVar);
        if (bo5Var == null) {
            k0(0);
            throw null;
        }
        if (wc0Var == null) {
            k0(1);
            throw null;
        }
        if (sxbVar == null) {
            k0(2);
            throw null;
        }
        if (i == 0) {
            k0(3);
            throw null;
        }
        this.h0 = 0;
        this.i0 = z;
    }

    public static ge9 c1(bo5 bo5Var, sx9 sx9Var, sxb sxbVar, ize izeVar, boolean z) {
        if (bo5Var == null) {
            k0(5);
            throw null;
        }
        if (sxbVar != null) {
            return new ge9(bo5Var, null, sx9Var, sxbVar, 1, izeVar, z);
        }
        k0(7);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 4:
            case 8:
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case 21:
                break;
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.c7g, defpackage.j08
    public final j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        if (bo5Var == null) {
            k0(14);
            throw null;
        }
        if (i == 0) {
            k0(15);
            throw null;
        }
        if (wc0Var == null) {
            k0(16);
            throw null;
        }
        c7g c7gVar = (c7g) h08Var;
        if (sxbVar == null) {
            sxbVar = getName();
        }
        ge9 ge9Var = new ge9(bo5Var, c7gVar, wc0Var, sxbVar, i, negVar, this.i0);
        int i2 = this.h0;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        ge9Var.d1(z, ms6.d(i2));
        return ge9Var;
    }

    @Override // defpackage.c7g
    public final c7g b1(l6e l6eVar, l6e l6eVar2, List list, List list2, List list3, yr9 yr9Var, int i, ow5 ow5Var, Map map) {
        be3 be3Var;
        if (list == null) {
            k0(9);
            throw null;
        }
        if (list2 == null) {
            k0(10);
            throw null;
        }
        if (list3 == null) {
            k0(11);
            throw null;
        }
        if (ow5Var == null) {
            k0(12);
            throw null;
        }
        super.b1(l6eVar, l6eVar2, list, list2, list3, yr9Var, i, ow5Var, map);
        for (he3 he3Var : ijc.a) {
            ide ideVar = he3Var.b;
            sxb sxbVar = he3Var.a;
            if (sxbVar == null || x44.r(getName(), sxbVar)) {
                if (ideVar != null) {
                    String strB = getName().b();
                    strB.getClass();
                    if (!ideVar.f(strB)) {
                        continue;
                    }
                }
                Collection collection = he3Var.c;
                if (collection == null || collection.contains(getName())) {
                    wd3[] wd3VarArr = he3Var.e;
                    int length = wd3VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            be3Var = ((String) he3Var.d.invoke(this)) != null ? new be3(false) : be3.c;
                        } else {
                            if (wd3VarArr[i2].b(this) != null) {
                                be3Var = new be3(false);
                                break;
                            }
                            i2++;
                        }
                    }
                    this.Q = be3Var.a;
                    return this;
                }
            }
        }
        be3Var = be3.b;
        this.Q = be3Var.a;
        return this;
    }

    public final void d1(boolean z, boolean z2) {
        this.h0 = z ? z2 ? 4 : 2 : z2 ? 3 : 1;
    }

    @Override // defpackage.ud9
    public final ud9 h0(yr9 yr9Var, ArrayList arrayList, yr9 yr9Var2, cpc cpcVar) {
        ArrayList arrayListC = ntj.c(arrayList, I(), this);
        mw9 mw9VarU = yr9Var == null ? null : xzk.u(this, yr9Var, dd8.F);
        i08 i08VarT0 = T0(a.b);
        i08VarT0.K = arrayListC;
        i08VarT0.O = yr9Var2;
        i08VarT0.M = mw9VarU;
        i08VarT0.T = true;
        i08VarT0.S = true;
        ge9 ge9Var = (ge9) i08VarT0.b0.Q0(i08VarT0);
        if (cpcVar != null) {
            ge9Var.U0((e16) cpcVar.E, cpcVar.F);
        }
        if (ge9Var != null) {
            return ge9Var;
        }
        k0(21);
        throw null;
    }

    @Override // defpackage.j08, defpackage.c92
    public final boolean v() {
        return ms6.d(this.h0);
    }
}
