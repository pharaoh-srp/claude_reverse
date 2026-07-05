package defpackage;

import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class nw2 implements ow2, uw2 {
    public final UUID a;
    public final MessageUnknownFile b;
    public final String c;

    public nw2(UUID uuid, MessageUnknownFile messageUnknownFile) {
        uuid.getClass();
        this.a = uuid;
        this.b = messageUnknownFile;
        this.c = messageUnknownFile.getFile_name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw2)) {
            return false;
        }
        nw2 nw2Var = (nw2) obj;
        return x44.r(this.a, nw2Var.a) && this.b.equals(nw2Var.b);
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

    public final String toString() {
        return "UnknownServerDocument(localId=" + this.a + ", file=" + this.b + ")";
    }
}
