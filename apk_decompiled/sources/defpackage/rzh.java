package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface rzh {
    default int a() {
        return (isVisible() && c(null, ynb.a)) ? 1 : 0;
    }

    boolean c(String str, znb znbVar);

    int e(String str, znb znbVar);

    boolean g();

    default szh h(String str, znb znbVar) {
        int iE = e(str, znbVar);
        return new szh(iE, isVisible(), g() && iE == 0, c(str, znbVar));
    }

    boolean isVisible();
}
