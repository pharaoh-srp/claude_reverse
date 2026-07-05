package defpackage;

import android.net.Uri;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ScreenSource;

/* JADX INFO: loaded from: classes3.dex */
public final class jt2 extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Uri G;
    public /* synthetic */ zy7 H;
    public final /* synthetic */ pt2 I;
    public final /* synthetic */ String J;
    public final /* synthetic */ ChatEvents$AttachmentSource K;
    public final /* synthetic */ ScreenSource L;
    public final /* synthetic */ m08 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt2(pt2 pt2Var, String str, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, m08 m08Var, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.I = pt2Var;
        this.J = str;
        this.K = chatEvents$AttachmentSource;
        this.L = screenSource;
        this.M = m08Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        m08 m08Var = this.M;
        Uri uri = (Uri) obj;
        zy7 zy7Var = (zy7) obj2;
        tp4 tp4Var = (tp4) obj3;
        switch (i) {
            case 0:
                jt2 jt2Var = new jt2(this.I, this.J, this.K, this.L, (sm) m08Var, tp4Var, 0);
                jt2Var.G = uri;
                jt2Var.H = zy7Var;
                return jt2Var.invokeSuspend(ieiVar);
            default:
                jt2 jt2Var2 = new jt2(this.I, this.J, this.K, this.L, (sm) m08Var, tp4Var, 1);
                jt2Var2.G = uri;
                jt2Var2.H = zy7Var;
                return jt2Var2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m08 m08Var = this.M;
        pt2 pt2Var = this.I;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                Uri uri = this.G;
                zy7 zy7Var = this.H;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.H = null;
                    this.F = 1;
                    if (pt2Var.a.a(uri, this.J, this.K, this.L, (sm) m08Var, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? new xq2(15) : zy7Var, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                Uri uri2 = this.G;
                zy7 zy7Var2 = this.H;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.H = null;
                    this.F = 1;
                    if (pt2Var.a.a(uri2, this.J, this.K, this.L, (sm) m08Var, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? new xq2(15) : zy7Var2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
