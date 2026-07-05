package defpackage;

import com.anthropic.claude.api.chat.MessageAttachment;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class jw2 implements ow2 {
    public final UUID a;
    public final MessageAttachment b;
    public final String c;
    public final boolean d;

    public jw2(UUID uuid, MessageAttachment messageAttachment) {
        uuid.getClass();
        messageAttachment.getClass();
        this.a = uuid;
        this.b = messageAttachment;
        this.c = messageAttachment.getFile_name();
        this.d = true;
    }

    @Override // defpackage.ww2
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw2)) {
            return false;
        }
        jw2 jw2Var = (jw2) obj;
        return x44.r(this.a, jw2Var.a) && x44.r(this.b, jw2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ww2
    public final UUID j() {
        return this.a;
    }

    public final MessageAttachment m() {
        return this.b;
    }

    public final String toString() {
        return "Embedded(localId=" + this.a + ", attachment=" + this.b + ")";
    }
}
