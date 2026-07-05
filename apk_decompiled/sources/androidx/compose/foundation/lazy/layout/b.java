package androidx.compose.foundation.lazy.layout;

import defpackage.s0a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:103:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[Catch: ItemFoundInScroll -> 0x01b8, TRY_ENTER, TRY_LEAVE, TryCatch #5 {ItemFoundInScroll -> 0x01b8, blocks: (B:35:0x00c2, B:42:0x00e0, B:56:0x010a, B:58:0x0120, B:62:0x0135, B:66:0x013d), top: B:116:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x018d -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.s0a r28, int r29, int r30, int r31, defpackage.cz5 r32, defpackage.vp4 r33) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.a(s0a, int, int, int, cz5, vp4):java.lang.Object");
    }

    public static final boolean b(boolean z, s0a s0aVar, int i, int i2) {
        if (z) {
            if (s0aVar.c() > i) {
                return true;
            }
            return s0aVar.c() == i && s0aVar.d() > i2;
        }
        if (s0aVar.c() < i) {
            return true;
        }
        return s0aVar.c() == i && s0aVar.d() < i2;
    }

    public static final boolean c(s0a s0aVar, int i) {
        return i <= s0aVar.e() && s0aVar.c() <= i;
    }
}
