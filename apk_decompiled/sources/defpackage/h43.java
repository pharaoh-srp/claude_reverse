package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.ui.components.snackbar.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h43 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ t53 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h43(t53 t53Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                return new h43(t53Var, tp4Var, 0);
            case 1:
                return new h43(t53Var, tp4Var, 1);
            case 2:
                return new h43(t53Var, tp4Var, 2);
            case 3:
                return new h43(t53Var, tp4Var, 3);
            case 4:
                return new h43(t53Var, tp4Var, 4);
            case 5:
                return new h43(t53Var, tp4Var, 5);
            case 6:
                return new h43(t53Var, tp4Var, 6);
            case 7:
                return new h43(t53Var, tp4Var, 7);
            case 8:
                return new h43(t53Var, tp4Var, 8);
            default:
                return new h43(t53Var, tp4Var, 9);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((h43) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t53 t53Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    z8c z8cVar = t53Var.Q;
                    this.F = 1;
                    obj = z8cVar.c(g9c.G, true, this);
                    if (obj == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (!(apiResult instanceof of0)) {
                    if (!(apiResult instanceof nf0)) {
                        wg6.i();
                    } else {
                        t53Var.j0.r(new pt6(R.string.generic_error_something_went_wrong));
                    }
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    kah kahVar = t53Var.t;
                    String str = t53Var.L0;
                    this.F = 1;
                    if (((uah) kahVar).e(str, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    fkg fkgVar = t53Var.C1;
                    if (fkgVar != null) {
                        this.F = 1;
                        obj = fkgVar.n(this);
                        if (obj == m45Var) {
                        }
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = t53Var.i0;
                    f63 f63Var = new f63(true, false);
                    this.F = 1;
                    if (zy1Var.b(this, f63Var) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 4:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    dl2 dl2Var = t53Var.i;
                    String str2 = t53Var.d.e;
                    String str3 = t53Var.L0;
                    this.F = 1;
                    Object objP = dl2Var.p(str2, str3, this);
                    if (objP == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 5:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    f fVar = t53Var.r;
                    this.F = 1;
                    if (fVar.m(this) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 6:
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    dl2 dl2Var2 = t53Var.i;
                    String str4 = t53Var.d.e;
                    String str5 = t53Var.L0;
                    this.F = 1;
                    if (dl2Var2.p(str4, str5, this) == m45Var) {
                    }
                } else if (i8 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 7:
                int i9 = this.F;
                if (i9 == 0) {
                    sf5.h0(obj);
                    dl2 dl2Var3 = t53Var.i;
                    String str6 = t53Var.d.e;
                    String str7 = t53Var.L0;
                    this.F = 1;
                    obj = dl2Var3.p(str6, str7, this);
                    if (obj == m45Var) {
                    }
                } else if (i9 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ApiResult apiResult2 = (ApiResult) obj;
                a.a(apiResult2, t53Var.j0);
                if (!(apiResult2 instanceof of0)) {
                    if (!(apiResult2 instanceof nf0)) {
                        wg6.i();
                    } else if (x44.r(t53Var.U0(), z03.a)) {
                        t53Var.A1(a13.a);
                    }
                }
                break;
            case 8:
                int i10 = this.F;
                if (i10 == 0) {
                    sf5.h0(obj);
                    dl2 dl2Var4 = t53Var.i;
                    String str8 = t53Var.d.e;
                    String str9 = t53Var.L0;
                    this.F = 1;
                    if (dl2Var4.p(str8, str9, this) != m45Var) {
                    }
                } else if (i10 == 1) {
                    sf5.h0(obj);
                } else if (i10 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                this.F = 2;
                Object objP0 = t53.p0(t53Var, null, this, 4);
                if (objP0 != m45Var) {
                }
                break;
            default:
                int i11 = this.F;
                if (i11 == 0) {
                    sf5.h0(obj);
                    dl2 dl2Var5 = t53Var.i;
                    String str10 = t53Var.d.e;
                    String str11 = t53Var.L0;
                    this.F = 1;
                    Object objP2 = dl2Var5.p(str10, str11, this);
                    if (objP2 == m45Var) {
                    }
                } else if (i11 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
