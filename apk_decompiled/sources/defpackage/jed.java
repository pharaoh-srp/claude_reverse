package defpackage;

import com.anthropic.claude.api.chat.MessageDocumentFile;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jed implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hed F;
    public final /* synthetic */ MessageDocumentFile G;

    public /* synthetic */ jed(hed hedVar, MessageDocumentFile messageDocumentFile, int i) {
        this.E = i;
        this.F = hedVar;
        this.G = messageDocumentFile;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        MessageDocumentFile messageDocumentFile = this.G;
        hed hedVar = this.F;
        switch (i) {
            case 0:
                hedVar.O(messageDocumentFile);
                break;
            default:
                hedVar.O(messageDocumentFile);
                break;
        }
        return ieiVar;
    }
}
