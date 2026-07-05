package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface y3i {
    void a(long j, int i, int i2, int i3, x3i x3iVar);

    void b(ssc sscVar, int i, int i2);

    default int c(og5 og5Var, int i, boolean z) {
        return f(og5Var, i, z);
    }

    default void d(long j) {
    }

    default void e(int i, ssc sscVar) {
        b(sscVar, i, 0);
    }

    int f(og5 og5Var, int i, boolean z);

    void g(jw7 jw7Var);
}
