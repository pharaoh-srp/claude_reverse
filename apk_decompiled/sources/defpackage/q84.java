package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class q84 extends s84 {
    public static s84 f(int i) {
        return i < 0 ? s84.b : i > 0 ? s84.c : s84.a;
    }

    @Override // defpackage.s84
    public final s84 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.s84
    public final s84 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.s84
    public final s84 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.s84
    public final s84 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.s84
    public final int e() {
        return 0;
    }
}
