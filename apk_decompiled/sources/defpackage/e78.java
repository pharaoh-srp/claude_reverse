package defpackage;

import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e78 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ g78 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e78(g78 g78Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = g78Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new e78(this.G, tp4Var, 0);
            default:
                return new e78(this.G, tp4Var, 1);
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
        return ((e78) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        g78 g78Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                vn5 vn5Var = g78Var.c;
                long j = pk0.a;
                w73 w73Var = new w73(g78Var, tp4Var, 2);
                this.F = 1;
                Object objA = vn5Var.a(j, w73Var, this);
                return objA == m45Var ? m45Var : objA;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    obj = gb9.c0(g78Var.d.b(), new e78(g78Var, tp4Var, 0), this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult == null) {
                    List list = xah.a;
                    xah.e(6, "Global bootstrap refresh skipped due to debounce", null, null);
                } else {
                    boolean z = apiResult instanceof of0;
                    if (!z) {
                        if (!(apiResult instanceof nf0)) {
                            mr9.b();
                        }
                        return null;
                    }
                    List list2 = xah.a;
                    xah.e(6, "Global bootstrap refreshed", null, null);
                    if (!z) {
                        if (apiResult instanceof nf0) {
                            nf0 nf0Var = (nf0) apiResult;
                            if (nf0Var instanceof lf0) {
                                List list3 = xah.a;
                                xah.f(new ClaudeApiErrorException(((lf0) apiResult).b(), "Failed to refresh global bootstrap"), "Failed to refresh global bootstrap", null, null, 28);
                            } else if (!(nf0Var instanceof mf0)) {
                                mr9.b();
                            }
                        } else {
                            mr9.b();
                        }
                        return null;
                    }
                }
                return iei.a;
        }
    }
}
