package defpackage;

import android.net.Uri;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageFile;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class qw2 implements rw2, uw2 {
    public final UUID a;
    public final MessageImageFile b;
    public final Uri c;

    public qw2(UUID uuid, MessageImageFile messageImageFile, Uri uri) {
        uuid.getClass();
        this.a = uuid;
        this.b = messageImageFile;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw2)) {
            return false;
        }
        qw2 qw2Var = (qw2) obj;
        return x44.r(this.a, qw2Var.a) && x44.r(this.b, qw2Var.b) && x44.r(this.c, qw2Var.c);
    }

    @Override // defpackage.uw2
    public final MessageFile f() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    @Override // defpackage.ww2
    public final UUID j() {
        return this.a;
    }

    public final MessageImageFile m() {
        return this.b;
    }

    public final String toString() {
        return "ServerImage(localId=" + this.a + ", file=" + this.b + ", localUri=" + this.c + ")";
    }

    public /* synthetic */ qw2(UUID uuid, MessageImageFile messageImageFile) {
        this(uuid, messageImageFile, null);
    }
}
