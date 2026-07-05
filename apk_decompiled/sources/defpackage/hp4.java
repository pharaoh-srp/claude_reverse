package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp4 {
    public final lsc a = mpk.P(ep4.a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hp4) {
            return x44.r((gp4) ((hp4) obj).a.getValue(), (gp4) this.a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((gp4) this.a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((gp4) this.a.getValue()) + ')';
    }
}
