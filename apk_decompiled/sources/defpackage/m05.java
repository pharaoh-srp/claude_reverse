package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m05 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ p05 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m05(p05 p05Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = p05Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        p05 p05Var = this.G;
        switch (i) {
            case 0:
                return new m05(p05Var, tp4Var, 0);
            default:
                return new m05(p05Var, tp4Var, 1);
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
        return ((m05) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        p05 p05Var = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    er4 er4Var = p05Var.c;
                    String str = p05Var.d;
                    this.F = 1;
                    obj = er4Var.f(str, this);
                    if (obj == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                boolean z = apiResult instanceof of0;
                if (z) {
                    p05Var.X(new dz4((List) ((of0) apiResult).b));
                } else if (!(apiResult instanceof nf0)) {
                    wg6.i();
                }
                if (!z) {
                    if (!(apiResult instanceof nf0)) {
                        wg6.i();
                    } else {
                        String string = p05Var.b.getString(R.string.conway_schedule_error_load);
                        string.getClass();
                        p05Var.X(new cz4(string));
                    }
                }
                break;
            default:
                lsc lscVar = p05Var.n;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    er4 er4Var2 = p05Var.c;
                    String str2 = p05Var.d;
                    this.F = 1;
                    obj = er4Var2.i(str2, this);
                    if (obj == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ApiResult apiResult2 = (ApiResult) obj;
                boolean z2 = apiResult2 instanceof of0;
                if (z2) {
                    lscVar.setValue(new dz4((List) ((of0) apiResult2).b));
                } else if (!(apiResult2 instanceof nf0)) {
                    wg6.i();
                }
                if (!z2) {
                    if (!(apiResult2 instanceof nf0)) {
                        wg6.i();
                    } else {
                        String string2 = p05Var.b.getString(R.string.conway_webhook_error_load);
                        string2.getClass();
                        lscVar.setValue(new cz4(string2));
                    }
                }
                break;
        }
        return null;
    }
}
