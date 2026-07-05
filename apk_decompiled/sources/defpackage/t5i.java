package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface t5i {
    default boolean a(Enum r2, Enum r3) {
        return r2.equals(b()) && r3.equals(c());
    }

    Object b();

    Object c();
}
