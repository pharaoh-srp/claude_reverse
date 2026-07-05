package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public enum er8 extends hr8 {
    public er8() {
        super("InBody", 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0289, code lost:
    
        r16 = r3;
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0335, code lost:
    
        r32.k(r30);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0237 A[SYNTHETIC] */
    @Override // defpackage.hr8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.hsh r31, defpackage.iq8 r32) {
        /*
            Method dump skipped, instruction units count: 3674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er8.d(hsh, iq8):boolean");
    }

    public final boolean e(hsh hshVar, iq8 iq8Var) {
        hshVar.getClass();
        String str = ((csh) hshVar).e;
        ArrayList arrayList = iq8Var.e;
        if (iq8Var.o(str) == null) {
            iq8Var.k(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            yj6 yj6Var = (yj6) arrayList.get(size);
            if (yj6Var.w(str)) {
                iq8Var.m(str);
                if (!iq8Var.i(str)) {
                    iq8Var.k(this);
                }
                iq8Var.G(str);
                return true;
            }
            if (iq8.B(yj6Var)) {
                iq8Var.k(this);
                return false;
            }
        }
        return true;
    }
}
