package defpackage;

import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class mw2 implements ow2, uw2 {
    public final UUID a;
    public final MessageDocumentFile b;
    public final String c;

    public mw2(UUID uuid, MessageDocumentFile messageDocumentFile) {
        uuid.getClass();
        this.a = uuid;
        this.b = messageDocumentFile;
        this.c = messageDocumentFile.getFile_name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw2)) {
            return false;
        }
        mw2 mw2Var = (mw2) obj;
        return x44.r(this.a, mw2Var.a) && this.b.equals(mw2Var.b);
    }

    @Override // defpackage.uw2
    public final MessageFile f() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ww2
    public final UUID j() {
        return this.a;
    }

    public final MessageDocumentFile m() {
        return this.b;
    }

    public final String toString() {
        return "ServerDocument(localId=" + this.a + ", file=" + this.b + ")";
    }
}
