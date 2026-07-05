package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class pbi {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final c61 b;
    public volatile int c = 0;

    public pbi(c61 c61Var, int i) {
        this.b = c61Var;
        this.a = i;
    }

    public final int a(int i) {
        njb njbVarB = b();
        int iA = njbVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) njbVarB.d;
        int i2 = iA + njbVarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final njb b() {
        ThreadLocal threadLocal = d;
        njb njbVar = (njb) threadLocal.get();
        if (njbVar == null) {
            njbVar = new njb();
            threadLocal.set(njbVar);
        }
        ojb ojbVar = (ojb) this.b.F;
        int iA = ojbVar.a(6);
        if (iA != 0) {
            int i = iA + ojbVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) ojbVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ojbVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ojbVar.d;
            njbVar.d = byteBuffer;
            if (byteBuffer != null) {
                njbVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                njbVar.b = i4;
                njbVar.c = ((ByteBuffer) njbVar.d).getShort(i4);
                return njbVar;
            }
            njbVar.a = 0;
            njbVar.b = 0;
            njbVar.c = 0;
        }
        return njbVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        njb njbVarB = b();
        int iA = njbVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) njbVarB.d).getInt(iA + njbVarB.a) : 0));
        sb.append(", codepoints:");
        njb njbVarB2 = b();
        int iA2 = njbVarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + njbVarB2.a;
            i = ((ByteBuffer) njbVarB2.d).getInt(((ByteBuffer) njbVarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
