package defpackage;

import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.dialogs.d;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.tasks.ui.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ oa0(List list, t4g t4gVar, iqb iqbVar, bz7 bz7Var, pz7 pz7Var, int i, int i2) {
        this.E = 4;
        this.H = list;
        this.I = t4gVar;
        this.K = iqbVar;
        this.J = bz7Var;
        this.F = pz7Var;
        this.G = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.J;
        Object obj4 = this.F;
        int i2 = this.G;
        Object obj5 = this.I;
        Object obj6 = this.H;
        iei ieiVar = iei.a;
        Object obj7 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                iuj.k((m9j) obj6, (kja) obj5, (WelcomeNotice) obj3, (zy7) obj4, (iqb) obj7, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d.a((ChatScreenParams) obj6, (t53) obj5, (rwe) obj3, (zy7) obj4, (lq0) obj7, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                mwa.f(this.H, this.I, this.J, (m4a) obj4, (bz7) obj7, (ld4) obj, iP0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                jwa.a((n54) obj6, (zrb) obj5, (j1g) obj3, (zbi) obj4, (pz7) obj7, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                q.j((List) obj6, (t4g) obj5, (iqb) obj7, (bz7) obj3, (pz7) obj4, (ld4) obj, x44.p0(1), this.G);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                nai.g((a6i) obj6, (v5i) obj5, this.J, this.F, (kl7) obj7, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ oa0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.F = obj4;
        this.K = obj5;
        this.G = i;
    }
}
