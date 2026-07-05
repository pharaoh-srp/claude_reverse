package defpackage;

import androidx.glance.appwidget.protobuf.f;

/* JADX INFO: loaded from: classes2.dex */
public final class vv9 extends f {
    private static final vv9 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile ttc PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private xv9 layout_;

    static {
        vv9 vv9Var = new vv9();
        DEFAULT_INSTANCE = vv9Var;
        f.i(vv9.class, vv9Var);
    }

    public static void k(vv9 vv9Var, xv9 xv9Var) {
        vv9Var.getClass();
        xv9Var.getClass();
        vv9Var.layout_ = xv9Var;
        vv9Var.bitField0_ |= 1;
    }

    public static void l(vv9 vv9Var, int i) {
        vv9Var.layoutIndex_ = i;
    }

    public static uv9 o() {
        return (uv9) ((e28) DEFAULT_INSTANCE.b(5));
    }

    @Override // androidx.glance.appwidget.protobuf.f
    public final Object b(int i) {
        ttc k28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new vv9();
            case 4:
                return new uv9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ttc ttcVar = PARSER;
                if (ttcVar != null) {
                    return ttcVar;
                }
                synchronized (vv9.class) {
                    try {
                        k28Var = PARSER;
                        if (k28Var == null) {
                            k28Var = new k28();
                            PARSER = k28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return k28Var;
            default:
                mr9.x();
                return null;
        }
    }

    public final xv9 m() {
        xv9 xv9Var = this.layout_;
        return xv9Var == null ? xv9.w() : xv9Var;
    }

    public final int n() {
        return this.layoutIndex_;
    }
}
