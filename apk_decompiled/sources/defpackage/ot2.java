package defpackage;

import android.net.Uri;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ScreenSource;

/* JADX INFO: loaded from: classes3.dex */
public final class ot2 extends xzg implements rz7 {
    public int E;
    public /* synthetic */ c09 F;
    public /* synthetic */ zy7 G;
    public final /* synthetic */ pt2 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ ScreenSource J;
    public final /* synthetic */ pz7 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot2(pt2 pt2Var, String str, ScreenSource screenSource, pz7 pz7Var, tp4 tp4Var) {
        super(3, tp4Var);
        this.H = pt2Var;
        this.I = str;
        this.J = screenSource;
        this.K = pz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScreenSource screenSource = this.J;
        pz7 pz7Var = this.K;
        ot2 ot2Var = new ot2(this.H, this.I, screenSource, pz7Var, (tp4) obj3);
        ot2Var.F = (c09) obj;
        ot2Var.G = (zy7) obj2;
        return ot2Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        c09 c09Var = this.F;
        zy7 zy7Var = this.G;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            yw2 yw2Var = this.H.a;
            Uri uri = c09Var.a;
            ChatEvents$AttachmentSource chatEvents$AttachmentSource = ChatEvents$AttachmentSource.APP_SHARE;
            String str = c09Var.c;
            this.F = null;
            this.G = null;
            this.E = 1;
            Object objA = yw2Var.a(uri, this.I, chatEvents$AttachmentSource, this.J, this.K, str, zy7Var, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
