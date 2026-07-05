package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w5j extends tmc {
    public static final int c;

    static {
        new lz1(5, TimeUnit.MINUTES);
        c = 3;
    }

    @Override // defpackage.tmc
    public final int a(StringBuilder sb, umc umcVar) {
        sb.append("dd=");
        if (umcVar.e != -128) {
            sb.append("s:");
            sb.append(umcVar.e);
        }
        g4h g4hVar = umcVar.f;
        if (g4hVar != null) {
            if (sb.length() > c) {
                sb.append(';');
            }
            sb.append("o:");
            sb.append(g4hVar.a(a4h.W3C));
        }
        return sb.length();
    }

    @Override // defpackage.tmc
    public final int b(StringBuilder sb, umc umcVar, int i) {
        if (i == c) {
            i = 0;
            sb.setLength(0);
        }
        umcVar.getClass();
        return i;
    }

    @Override // defpackage.tmc
    public final int c(StringBuilder sb, b4h b4hVar, b4h b4hVar2, int i) {
        int i2;
        a4h a4hVar = a4h.W3C;
        if (i >= 256) {
            return i;
        }
        if (i > c) {
            sb.append(';');
            i2 = i + 1;
        } else {
            i2 = i;
        }
        CharSequence charSequenceA = b4hVar.a(a4hVar);
        sb.append(charSequenceA);
        int length = charSequenceA.length() + i2;
        sb.append(':');
        CharSequence charSequenceA2 = b4hVar2.a(a4hVar);
        sb.append(charSequenceA2);
        int length2 = charSequenceA2.length() + length + 1;
        if (length2 <= 256) {
            return length2;
        }
        sb.setLength(i);
        return i;
    }

    @Override // defpackage.tmc
    public final int e(umc umcVar) {
        int iB = umcVar.b() + c + 1;
        if (umcVar.f != null) {
            iB += umcVar.f.length() + 3;
        }
        return umcVar.e != -128 ? iB + 5 : iB;
    }

    @Override // defpackage.tmc
    public final boolean f(int i, StringBuilder sb) {
        return i <= c;
    }

    @Override // defpackage.tmc
    public final boolean g(int i) {
        return i > 256;
    }
}
