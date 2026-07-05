package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class heh extends zdh {
    public final String b;
    public final int c;
    public final bz7 d;

    public heh(Object obj, String str, int i, bz7 bz7Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = bz7Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return vb7.r(sb, this.c, ')');
    }
}
