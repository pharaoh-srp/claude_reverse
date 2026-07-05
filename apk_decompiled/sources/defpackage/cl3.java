package defpackage;

import io.sentry.t4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class cl3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ el3 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl3(el3 el3Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = el3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        el3 el3Var = this.G;
        switch (i) {
            case 0:
                return new cl3(el3Var, tp4Var, 0);
            case 1:
                return new cl3(el3Var, tp4Var, 1);
            default:
                return new cl3(el3Var, tp4Var, 2);
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
        return ((cl3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        el3 el3Var = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    nb5 nb5Var = el3Var.c;
                    this.F = 1;
                    Object objC0 = gb9.c0(nb5Var.d.getDefault(), new mb5(nb5Var, null), this);
                    if (objC0 != m45Var) {
                        objC0 = ieiVar;
                    }
                    if (objC0 == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    t88 t88Var = el3Var.i;
                    this.F = 1;
                    obj = t88Var.b(this);
                    if (obj == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    t4.n("store_country_code", str);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    ab0 ab0Var = new ab0(el3Var, tp4Var, 5);
                    this.F = 1;
                    if (iuj.N(ab0Var, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                m78 m78Var = el3Var.f;
                KSerializer kSerializerSerializer = JsonObject.INSTANCE.serializer();
                kSerializerSerializer.getClass();
                m78Var.a.i("mobile_global_aa", kSerializerSerializer);
                break;
        }
        return ieiVar;
    }
}
