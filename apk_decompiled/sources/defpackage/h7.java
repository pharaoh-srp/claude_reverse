package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ z7j G;
    public final /* synthetic */ WebView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(z7j z7jVar, WebView webView, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = z7jVar;
        this.H = webView;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        WebView webView = this.H;
        z7j z7jVar = this.G;
        switch (i) {
            case 0:
                return new h7(z7jVar, webView, tp4Var, 0);
            default:
                return new h7(z7jVar, webView, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((h7) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((h7) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return m45Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        z7j z7jVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw sq6.y(obj);
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this.F = 1;
                z7jVar.a(this.H, this);
                return m45Var;
            default:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw sq6.y(obj);
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                n2g n2gVar = z7jVar.a;
                l33 l33Var = new l33(4);
                this.F = 1;
                n2gVar.a(l33Var, this);
                return m45Var;
        }
    }
}
