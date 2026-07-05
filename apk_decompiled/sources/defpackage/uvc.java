package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewRendered;
import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewResult;

/* JADX INFO: loaded from: classes2.dex */
public final class uvc {
    public final qi3 a;
    public final mn5 b;
    public final boolean c;
    public final long d;
    public Integer e;
    public boolean f;

    public uvc(qi3 qi3Var, mn5 mn5Var, boolean z) {
        qi3Var.getClass();
        mn5Var.getClass();
        this.a = qi3Var;
        this.b = mn5Var;
        this.c = z;
        this.d = mn5Var.a();
    }

    public final void a(MessageFileEvents$PdfPreviewResult messageFileEvents$PdfPreviewResult) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.e(new MessageFileEvents$PdfPreviewRendered(messageFileEvents$PdfPreviewResult, this.b.a() - this.d, this.e, this.c), iv1.J(jce.b(MessageFileEvents$PdfPreviewRendered.class)));
    }
}
