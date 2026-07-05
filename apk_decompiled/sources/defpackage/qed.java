package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewSeen;
import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewSurface;

/* JADX INFO: loaded from: classes2.dex */
public final class qed extends xzg implements bz7 {
    public final /* synthetic */ qi3 E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ej7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qed(qi3 qi3Var, String str, String str2, ej7 ej7Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = qi3Var;
        this.F = str;
        this.G = str2;
        this.H = ej7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new qed(this.E, this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        qed qedVar = (qed) create((tp4) obj);
        iei ieiVar = iei.a;
        qedVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface;
        sf5.h0(obj);
        String str = this.F;
        if (str == null) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        ej7 ej7Var = this.H;
        if (ej7Var instanceof cj7) {
            messageFileEvents$FilePreviewSurface = MessageFileEvents$FilePreviewSurface.CHAT;
        } else {
            if (!ej7Var.equals(dj7.a)) {
                wg6.i();
                return null;
            }
            messageFileEvents$FilePreviewSurface = MessageFileEvents$FilePreviewSurface.PROJECT_KNOWLEDGE;
        }
        this.E.e(new MessageFileEvents$FilePreviewSeen(str, this.G, messageFileEvents$FilePreviewSurface), iv1.J(jce.b(MessageFileEvents$FilePreviewSeen.class)));
        return iei.a;
    }
}
