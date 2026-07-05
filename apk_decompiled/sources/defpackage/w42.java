package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class w42 {
    public final int a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public w42(int i, String str) {
        this.a = 0;
        this.b = null;
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(String str, int i, String str2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new k42(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<k42> arrayList = this.c;
        if (arrayList != null) {
            for (k42 k42Var : arrayList) {
                sb.append('[');
                String str2 = k42Var.a;
                String str3 = k42Var.c;
                sb.append(str2);
                int iF = sq6.F(k42Var.b);
                if (iF == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iF == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iF == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<n42> arrayList2 = this.d;
        if (arrayList2 != null) {
            for (n42 n42Var : arrayList2) {
                sb.append(':');
                sb.append(n42Var);
            }
        }
        return sb.toString();
    }
}
