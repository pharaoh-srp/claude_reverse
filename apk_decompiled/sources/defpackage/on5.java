package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class on5 implements pzi {
    public final nl5 a;
    public final int b;
    public final int c;
    public final int d;
    public final poj e;

    public on5(nl5 nl5Var) {
        this.a = nl5Var;
        String str = nl5Var.a;
        char c = nl5Var.b;
        this.b = bsg.F0(str, c, 0, 6);
        this.c = bsg.K0(str, c, 0, 6);
        this.d = nl5Var.c.length();
        this.e = new poj(this);
    }

    @Override // defpackage.pzi
    public final f5i a(zb0 zb0Var) {
        int length = zb0Var.F.length();
        String strSubstring = zb0Var.F;
        int i = 0;
        int i2 = this.d;
        if (length > i2) {
            b79 b79VarH0 = wd6.H0(0, i2);
            strSubstring.getClass();
            b79VarH0.getClass();
            strSubstring = strSubstring.substring(b79VarH0.E, b79VarH0.F + 1);
        }
        String string = "";
        int i3 = 0;
        while (i < strSubstring.length()) {
            int i4 = i3 + 1;
            string = string + strSubstring.charAt(i);
            if (i4 == this.b || i3 + 2 == this.c) {
                StringBuilder sbO = ij0.o(string);
                sbO.append(this.a.b);
                string = sbO.toString();
            }
            i++;
            i3 = i4;
        }
        return new f5i(new zb0(string), this.e);
    }
}
