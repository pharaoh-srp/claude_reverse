package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fuf implements fvf {
    public final mqg a;

    public fuf(mqg mqgVar) {
        this.a = mqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuf) && x44.r(this.a, ((fuf) obj).a);
    }

    public final int hashCode() {
        mqg mqgVar = this.a;
        if (mqgVar == null) {
            return 0;
        }
        return mqgVar.hashCode();
    }

    public final String toString() {
        return "AssistantStreamingTextChanged(snapshot=" + this.a + ")";
    }
}
