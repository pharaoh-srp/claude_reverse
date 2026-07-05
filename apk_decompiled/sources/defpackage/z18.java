package defpackage;

import androidx.glance.appwidget.protobuf.f;

/* JADX INFO: loaded from: classes2.dex */
public final class z18 implements lhb {
    public static final z18 b = new z18(0);
    public final /* synthetic */ int a;

    public /* synthetic */ z18(int i) {
        this.a = i;
    }

    @Override // defpackage.lhb
    public final c2e a(Class cls) {
        switch (this.a) {
            case 0:
                if (!f.class.isAssignableFrom(cls)) {
                    sz6.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (c2e) f.c(cls.asSubclass(f.class)).b(3);
                } catch (Exception e) {
                    xh6.f("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.lhb
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return f.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
