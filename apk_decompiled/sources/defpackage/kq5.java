package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq5 implements zz7 {
    public static final kq5 E = new kq5();

    @Override // defpackage.zz7
    public final qz7 d() {
        return new m08(4, lq5.class, "<init>", "<init>(Lcom/arkivanov/essenty/lifecycle/Lifecycle;Lcom/arkivanov/essenty/statekeeper/StateKeeper;Lcom/arkivanov/essenty/instancekeeper/InstanceKeeper;Lcom/arkivanov/essenty/backhandler/BackHandler;)V", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kq5) {
            return d().equals(((zz7) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
