package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadRequested;
import com.anthropic.claude.api.chat.MessageDocumentFile;

/* JADX INFO: loaded from: classes2.dex */
public final class hed extends iwe {
    public final ej7 b;
    public final sa6 c;
    public final lgb d;
    public final qi3 e;
    public final zy1 f;
    public final ybg g;
    public final wlg h;

    public hed(ej7 ej7Var, sa6 sa6Var, lgb lgbVar, rc8 rc8Var, qi3 qi3Var, h86 h86Var) {
        super(h86Var);
        this.b = ej7Var;
        this.c = sa6Var;
        this.d = lgbVar;
        this.e = qi3Var;
        this.f = x44.a();
        this.g = new ybg();
        this.h = rc8Var.m("claude_document_preview_download_button_visible");
    }

    public final void O(MessageDocumentFile messageDocumentFile) {
        messageDocumentFile.getClass();
        ej7 ej7Var = this.b;
        cj7 cj7Var = ej7Var instanceof cj7 ? (cj7) ej7Var : null;
        if (cj7Var == null) {
            sz6.j("startDownload is gated by showDownloadButton");
            return;
        }
        String strA = ikb.a(messageDocumentFile.getFile_name());
        this.e.e(new MessageFileEvents$FileDownloadRequested(MessageFileEvents$DownloadSource.DOCUMENT_PREVIEW, strA), iv1.J(jce.b(MessageFileEvents$FileDownloadRequested.class)));
        gb9.D(this.a, null, null, new lza(this, messageDocumentFile, strA, cj7Var, (tp4) null, 7), 3);
    }
}
