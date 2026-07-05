package defpackage;

import androidx.datastore.preferences.protobuf.f;

/* JADX INFO: loaded from: classes.dex */
public final class d28 implements phb {
    public static final d28 b = new d28(0);
    public final /* synthetic */ int a;

    public /* synthetic */ d28(int i) {
        this.a = i;
    }

    @Override // defpackage.phb
    public final g2e a(Class cls) {
        switch (this.a) {
            case 0:
                if (!f.class.isAssignableFrom(cls)) {
                    sz6.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (g2e) f.c(cls.asSubclass(f.class)).b(3);
                } catch (Exception e) {
                    xh6.f("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.phb
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return f.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
