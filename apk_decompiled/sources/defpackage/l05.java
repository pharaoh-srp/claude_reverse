package defpackage;

import com.anthropic.claude.conway.protocol.y;
import java.io.File;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class l05 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ p05 H;
    public final /* synthetic */ hsf I;
    public final /* synthetic */ String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l05(p05 p05Var, hsf hsfVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = p05Var;
        this.I = hsfVar;
        this.J = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                l05 l05Var = new l05(this.H, this.I, this.J, tp4Var, 0);
                l05Var.G = obj;
                return l05Var;
            default:
                l05 l05Var2 = new l05(this.H, this.I, this.J, tp4Var, 1);
                l05Var2.G = obj;
                return l05Var2;
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
        return ((l05) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object hreVar;
        Object hreVar2;
        int i = this.E;
        hsf hsfVar = this.I;
        m45 m45Var = m45.E;
        p05 p05Var = this.H;
        switch (i) {
            case 0:
                int i2 = this.F;
                tp4 tp4Var = null;
                try {
                    if (i2 == 0) {
                        sf5.h0(obj);
                        String str = this.J;
                        File file = new File(p05Var.b.getCacheDir(), "tmp");
                        file.mkdirs();
                        c61 c61VarA = ((uw4) p05Var.e).a(hsfVar.b, hsfVar.c);
                        this.G = null;
                        this.F = 1;
                        obj = gb9.c0(((h86) c61VarA.I).b(), new zn(c61VarA, str, file, tp4Var, 10), this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i2 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    hreVar = (File) obj;
                    break;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                Throwable thA = jre.a(hreVar);
                if (thA != null && (thA instanceof CancellationException)) {
                    throw thA;
                }
                Throwable thA2 = jre.a(hreVar);
                if (thA2 != null) {
                    p05Var.U(p05.O(p05Var, thA2));
                }
                if (hreVar instanceof hre) {
                    return null;
                }
                return hreVar;
            default:
                int i3 = this.F;
                iei ieiVar = iei.a;
                try {
                    if (i3 == 0) {
                        sf5.h0(obj);
                        String str2 = this.J;
                        c61 c61VarA2 = ((uw4) p05Var.e).a(hsfVar.b, hsfVar.c);
                        this.G = null;
                        this.F = 1;
                        Object objC0 = gb9.c0(((h86) c61VarA2.I).b(), new y(str2, c61VarA2, null), this);
                        if (objC0 != m45Var) {
                            objC0 = ieiVar;
                        }
                        if (objC0 == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i3 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    hreVar2 = ieiVar;
                    break;
                } catch (Throwable th2) {
                    hreVar2 = new hre(th2);
                }
                Throwable thA3 = jre.a(hreVar2);
                if (thA3 != null && (thA3 instanceof CancellationException)) {
                    throw thA3;
                }
                Throwable thA4 = jre.a(hreVar2);
                if (thA4 != null) {
                    p05Var.U(p05.O(p05Var, thA4));
                }
                if (!(hreVar2 instanceof hre)) {
                    p05Var.S();
                    p05Var.h.a();
                }
                return ieiVar;
        }
    }
}
