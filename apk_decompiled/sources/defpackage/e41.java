package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryFilesViewed;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.ui.components.snackbar.a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e41 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public int G;
    public /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e41(Object obj, int i, tp4 tp4Var, int i2) {
        super(2, tp4Var);
        this.E = i2;
        this.H = obj;
        this.G = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                e41 e41Var = new e41(this.G, tp4Var);
                e41Var.H = obj;
                return e41Var;
            case 1:
                return new e41((em2) this.H, this.G, tp4Var, 1);
            case 2:
                return new e41((ub8) this.H, tp4Var, 2);
            case 3:
                return new e41((g0a) this.H, this.G, tp4Var, 3);
            case 4:
                return new e41((pbb) this.H, tp4Var, 4);
            default:
                return new e41((meg) this.H, this.G, tp4Var, 5);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((e41) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objF;
        ?? r5;
        int i;
        int i2 = this.E;
        int i3 = 2;
        boolean z = false;
        z = false;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        int i4 = 1;
        Object objW = null;
        boolean z2 = false;
        switch (i2) {
            case 0:
                aid aidVar = (aid) this.H;
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    xg0 xg0Var = new xg0(i3, aidVar);
                    Context context = x44.d;
                    if (context != null) {
                        IntentFilter intentFilter = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                        if (Build.VERSION.SDK_INT >= 33) {
                            context.registerReceiver(xg0Var, intentFilter, 2);
                        } else {
                            context.registerReceiver(xg0Var, intentFilter);
                        }
                        aidVar.r(new Integer(this.G));
                        k6 k6Var = new k6(context, 21, xg0Var);
                        this.H = null;
                        this.F = 1;
                        if (v40.k(aidVar, k6Var, this) == m45Var) {
                        }
                    } else {
                        sz6.j("Context not initialized");
                    }
                } else if (i5 == 1) {
                    sf5.h0(obj);
                } else {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            case 1:
                int i6 = this.G;
                em2 em2Var = (em2) this.H;
                int i7 = this.F;
                if (i7 != 0) {
                    if (i7 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    b3f b3fVarD0 = mpk.d0(new t51(em2Var, i6, i4));
                    zl2 zl2Var = new zl2(i3, z2 ? 1 : 0, z ? 1 : 0);
                    this.F = 1;
                    if (j8.H(b3fVarD0, zl2Var, this) == m45Var) {
                    }
                }
                if (em2Var.u.h() == i6 && !em2Var.w) {
                    z = true;
                }
                break;
            case 2:
                ub8 ub8Var = (ub8) this.H;
                q7 q7Var = ub8Var.c;
                int i8 = this.G;
                if (i8 == 0) {
                    sf5.h0(obj);
                    boolean z3 = ub8Var.R() && ub8Var.Q();
                    o7 o7Var = ub8Var.d;
                    AccountSettings.Companion.getClass();
                    AccountSettings accountSettingsM107copyNcesMF4$default = AccountSettings.m107copyNcesMF4$default(AccountSettings.DEFAULT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z3), null, null, null, null, null, null, null, 267386879, null);
                    this.F = z3 ? 1 : 0;
                    this.G = 1;
                    objF = o7Var.f(accountSettingsM107copyNcesMF4$default, this);
                    r5 = z3;
                    if (objF == m45Var) {
                    }
                } else if (i8 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i9 = this.F;
                    sf5.h0(obj);
                    r5 = i9;
                    objF = obj;
                }
                ApiResult apiResult = (ApiResult) objF;
                if (apiResult instanceof of0) {
                    Account accountA = q7Var.a();
                    AccountSettings settings = q7Var.a().getSettings();
                    if (settings == null) {
                        AccountSettings.Companion.getClass();
                        settings = AccountSettings.DEFAULT;
                    }
                    q7Var.c(Account.m101copyl0kCUe4$default(accountA, null, null, null, null, null, null, null, AccountSettings.m107copyNcesMF4$default(settings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(r5 != 0), null, null, null, null, null, null, null, 267386879, null), false, 383, null));
                    ub8Var.g.r(vb8.a);
                } else if (!(apiResult instanceof nf0)) {
                    wg6.i();
                }
                a.a(apiResult, ub8Var.h);
                ub8Var.m.setValue(Boolean.FALSE);
                break;
            case 3:
                int i10 = this.F;
                if (i10 == 0) {
                    sf5.h0(obj);
                    a0a a0aVar = ((g0a) this.H).T;
                    int i11 = this.G;
                    this.F = 1;
                    if (a0aVar.f(i11, this) == m45Var) {
                    }
                } else if (i10 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 4:
                pbb pbbVar = (pbb) this.H;
                obb obbVar = pbbVar.b;
                int i12 = this.G;
                if (i12 == 0) {
                    sf5.h0(obj);
                    int i13 = obbVar.a() != null ? 1 : 0;
                    this.F = i13;
                    this.G = 1;
                    if (obbVar.b(this) != m45Var) {
                        i = i13;
                    }
                } else if (i12 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i = this.F;
                    sf5.h0(obj);
                }
                nf0 nf0Var = (nf0) obbVar.f.getValue();
                List listA = obbVar.a();
                if (nf0Var != null) {
                    if (i != 0) {
                        a.a(nf0Var, pbbVar.d);
                    }
                    break;
                } else if (!pbbVar.e && listA != null) {
                    pbbVar.e = true;
                    pbbVar.c.e(new MemoryEvents$MemoryFilesViewed(listA.size()), MemoryEvents$MemoryFilesViewed.Companion.serializer());
                    break;
                }
                break;
            default:
                meg megVar = (meg) this.H;
                int i14 = this.F;
                if (i14 == 0) {
                    sf5.h0(obj);
                    int i15 = this.G;
                    this.F = 1;
                    v84 v84Var = (v84) megVar.d.get(new Integer(i15));
                    if (v84Var != null && (objW = v84Var.w(this)) != m45Var) {
                        objW = ieiVar;
                    }
                    if (objW == m45Var) {
                    }
                } else if (i14 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                if (!((Boolean) megVar.c.a()).booleanValue()) {
                    megVar.e.play(this.G, 1.0f, 1.0f, 0, 0, 1.0f);
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e41(iwe iweVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = iweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e41(int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 0;
        this.G = i;
    }
}
