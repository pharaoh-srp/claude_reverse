package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class lk5 extends tmc {
    public final int c;

    static {
        new lz1(5, TimeUnit.MINUTES);
    }

    public lk5(int i) {
        this.c = i;
    }

    @Override // defpackage.tmc
    public final int a(StringBuilder sb, umc umcVar) {
        return umcVar.b();
    }

    @Override // defpackage.tmc
    public final int b(StringBuilder sb, umc umcVar, int i) {
        return i;
    }

    @Override // defpackage.tmc
    public final int c(StringBuilder sb, b4h b4hVar, b4h b4hVar2, int i) {
        if (i <= this.c) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            a4h a4hVar = a4h.DATADOG;
            sb.append(b4hVar.a(a4hVar));
            sb.append('=');
            sb.append(b4hVar2.a(a4hVar));
        }
        return i;
    }

    @Override // defpackage.tmc
    public final int e(umc umcVar) {
        return umcVar.b();
    }

    @Override // defpackage.tmc
    public final boolean f(int i, StringBuilder sb) {
        return sb.length() == 0;
    }

    @Override // defpackage.tmc
    public final boolean g(int i) {
        return i > this.c;
    }
}
