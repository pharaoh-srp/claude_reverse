package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x49 {
    public final boolean a;

    public x49(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x49) {
            return this.a == ((x49) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.a;
    }
}
