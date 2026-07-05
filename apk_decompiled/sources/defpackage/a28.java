package defpackage;

import androidx.health.platform.client.proto.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a28 implements mhb {
    public static final a28 b = new a28(0);
    public final /* synthetic */ int a;

    public /* synthetic */ a28(int i) {
        this.a = i;
    }

    @Override // defpackage.mhb
    public final d2e a(Class cls) {
        switch (this.a) {
            case 0:
                if (!n.class.isAssignableFrom(cls)) {
                    sz6.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (d2e) n.f(cls.asSubclass(n.class)).e(3);
                } catch (Exception e) {
                    xh6.f("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.mhb
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return n.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
