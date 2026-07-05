package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b28 implements nhb {
    public static final b28 b = new b28(0);
    public final /* synthetic */ int a;

    public /* synthetic */ b28(int i) {
        this.a = i;
    }

    @Override // defpackage.nhb
    public final e2e a(Class cls) {
        switch (this.a) {
            case 0:
                if (!f.class.isAssignableFrom(cls)) {
                    sz6.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (e2e) f.j(cls.asSubclass(f.class)).i(3);
                } catch (Exception e) {
                    xh6.f("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.nhb
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return f.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
