package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c28 implements ohb {
    public static final c28 b = new c28(0);
    public final /* synthetic */ int a;

    public /* synthetic */ c28(int i) {
        this.a = i;
    }

    @Override // defpackage.ohb
    public final f2e a(Class cls) {
        switch (this.a) {
            case 0:
                if (!v28.class.isAssignableFrom(cls)) {
                    sz6.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (f2e) v28.b(cls.asSubclass(v28.class)).a(3);
                } catch (Exception e) {
                    xh6.f("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.ohb
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return v28.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
