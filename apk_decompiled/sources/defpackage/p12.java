package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class p12 {
    public final qo0 a;
    public int b;

    public p12(int i) {
        switch (i) {
            case 1:
                this.a = new qo0();
                break;
            default:
                this.a = new qo0();
                break;
        }
    }

    public void a(byte[] bArr) {
        bArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < ep0.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public void b(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < ep0.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public byte[] c(int i) {
        byte[] bArr;
        synchronized (this) {
            qo0 qo0Var = this.a;
            bArr = null;
            byte[] bArr2 = (byte[]) (qo0Var.isEmpty() ? null : qo0Var.removeLast());
            if (bArr2 != null) {
                this.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public char[] d(int i) {
        char[] cArr;
        synchronized (this) {
            qo0 qo0Var = this.a;
            cArr = null;
            char[] cArr2 = (char[]) (qo0Var.isEmpty() ? null : qo0Var.removeLast());
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
