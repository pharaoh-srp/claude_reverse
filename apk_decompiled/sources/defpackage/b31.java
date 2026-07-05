package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface b31 extends c31 {
    int a();

    @Override // defpackage.c31
    default String getKey() {
        return grc.p(a(), "photo_");
    }
}
