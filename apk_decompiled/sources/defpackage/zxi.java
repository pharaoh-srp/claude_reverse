package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface zxi {
    default vxi a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default vxi b(Class cls, sub subVar) {
        return a(cls);
    }

    default vxi c(pl9 pl9Var, sub subVar) {
        pl9Var.getClass();
        return b(ez1.I(pl9Var), subVar);
    }
}
