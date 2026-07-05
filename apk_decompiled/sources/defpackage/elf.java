package defpackage;

import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class elf implements glf {
    public final String a;
    public final InputMode b;

    public elf(String str, InputMode inputMode) {
        inputMode.getClass();
        this.a = str;
        this.b = inputMode;
    }

    @Override // defpackage.glf
    public final InputMode a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elf)) {
            return false;
        }
        elf elfVar = (elf) obj;
        return MessageId.m1054equalsimpl0(this.a, elfVar.a) && this.b == elfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (MessageId.m1055hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return "Edit(parentId=" + MessageId.m1056toStringimpl(this.a) + ", inputMode=" + this.b + ")";
    }
}
