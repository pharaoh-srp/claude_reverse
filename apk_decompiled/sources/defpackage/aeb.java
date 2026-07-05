package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aeb implements co4 {
    public final int a;
    public final boolean b;

    public aeb(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        if (pnaVar.K.a.contains(qna.E)) {
            return new beb(this);
        }
        oga.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
