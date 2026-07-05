package defpackage;

import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageFile;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class lw2 implements ow2, uw2 {
    public final UUID a;
    public final MessageBlobFile b;

    public lw2(UUID uuid, MessageBlobFile messageBlobFile) {
        uuid.getClass();
        this.a = uuid;
        this.b = messageBlobFile;
        messageBlobFile.getFile_name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw2)) {
            return false;
        }
        lw2 lw2Var = (lw2) obj;
        return x44.r(this.a, lw2Var.a) && this.b.equals(lw2Var.b);
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

    public final MessageBlobFile m() {
        return this.b;
    }

    public final String toString() {
        return "ServerBlob(localId=" + this.a + ", file=" + this.b + ")";
    }
}
