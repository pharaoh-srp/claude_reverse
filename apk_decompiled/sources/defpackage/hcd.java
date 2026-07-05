package defpackage;

import androidx.datastore.preferences.protobuf.f;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class hcd extends f {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final hcd DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile ytc PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        hcd hcdVar = new hcd();
        DEFAULT_INSTANCE = hcdVar;
        f.j(hcd.class, hcdVar);
    }

    public static gcd E() {
        return (gcd) ((j28) DEFAULT_INSTANCE.b(5));
    }

    public static void m(hcd hcdVar, long j) {
        hcdVar.valueCase_ = 4;
        hcdVar.value_ = Long.valueOf(j);
    }

    public static void n(hcd hcdVar, String str) {
        hcdVar.getClass();
        hcdVar.valueCase_ = 5;
        hcdVar.value_ = str;
    }

    public static void o(hcd hcdVar, fcd fcdVar) {
        hcdVar.getClass();
        hcdVar.value_ = fcdVar;
        hcdVar.valueCase_ = 6;
    }

    public static void p(hcd hcdVar, double d) {
        hcdVar.valueCase_ = 7;
        hcdVar.value_ = Double.valueOf(d);
    }

    public static void q(hcd hcdVar, i22 i22Var) {
        hcdVar.getClass();
        hcdVar.valueCase_ = 8;
        hcdVar.value_ = i22Var;
    }

    public static void r(hcd hcdVar, boolean z) {
        hcdVar.valueCase_ = 1;
        hcdVar.value_ = Boolean.valueOf(z);
    }

    public static void s(hcd hcdVar, float f) {
        hcdVar.valueCase_ = 2;
        hcdVar.value_ = Float.valueOf(f);
    }

    public static void t(hcd hcdVar, int i) {
        hcdVar.valueCase_ = 3;
        hcdVar.value_ = Integer.valueOf(i);
    }

    public static hcd w() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String B() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final fcd C() {
        return this.valueCase_ == 6 ? (fcd) this.value_ : fcd.o();
    }

    public final int D() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final Object b(int i) {
        ytc o28Var;
        int iF = sq6.F(i);
        if (iF == 0) {
            return (byte) 1;
        }
        if (iF == 2) {
            return new g2e(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", fcd.class});
        }
        if (iF == 3) {
            return new hcd();
        }
        if (iF == 4) {
            return new gcd(DEFAULT_INSTANCE);
        }
        if (iF == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iF != 6) {
            throw null;
        }
        ytc ytcVar = PARSER;
        if (ytcVar != null) {
            return ytcVar;
        }
        synchronized (hcd.class) {
            try {
                o28Var = PARSER;
                if (o28Var == null) {
                    o28Var = new o28();
                    PARSER = o28Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o28Var;
    }

    public final boolean u() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final i22 v() {
        return this.valueCase_ == 8 ? (i22) this.value_ : i22.G;
    }

    public final double x() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float y() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final int z() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }
}
