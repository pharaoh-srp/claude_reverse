package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class l2e extends hde {
    public static final Pattern d = Pattern.compile("");
    public final pvc c;

    public l2e(pvc pvcVar) {
        super(d);
        this.c = pvcVar;
    }

    @Override // defpackage.hde
    public final ro6 b(String str) {
        w1c w1cVar = new w1c();
        pvc pvcVar = this.c;
        w1cVar.c = pvcVar;
        w1cVar.d = new int[(pvcVar.F.d * 2) + 2];
        ro6 ro6Var = new ro6((byte) 0, 10);
        ro6Var.F = str;
        w1cVar.e = ro6Var;
        w1cVar.a = str.length();
        w1cVar.b = false;
        return new ro6(22, w1cVar);
    }

    @Override // defpackage.hde
    public final String toString() {
        return this.c.E;
    }
}
