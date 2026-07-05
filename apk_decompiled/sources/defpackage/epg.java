package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class epg {
    public vlg a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof epg) && x44.r(this.a, ((epg) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        vlg vlgVar = this.a;
        if (vlgVar != null) {
            return vlgVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Container(state=" + this.a + ")";
    }
}
