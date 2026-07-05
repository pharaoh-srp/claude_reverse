package defpackage;

import com.anthropic.claude.api.chat.InputMode;

/* JADX INFO: loaded from: classes2.dex */
public final class dlf implements glf {
    public final InputMode a;

    public dlf(InputMode inputMode) {
        inputMode.getClass();
        this.a = inputMode;
    }

    @Override // defpackage.glf
    public final InputMode a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlf) && this.a == ((dlf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Compose(inputMode=" + this.a + ")";
    }
}
