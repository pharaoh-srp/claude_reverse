package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jf {
    public final /* synthetic */ int a = 0;
    public final boolean b;
    public final String c;

    public jf(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public String a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public jf(boolean z, String str) {
        this.b = z;
        this.c = str;
    }
}
