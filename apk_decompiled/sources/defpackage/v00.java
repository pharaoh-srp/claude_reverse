package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import androidx.health.platform.client.proto.g;
import java.util.ServiceLoader;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class v00 extends ts9 implements zy7 {
    public static final v00 G;
    public static final v00 H;
    public static final v00 I;
    public static final v00 J;
    public static final v00 K;
    public static final v00 L;
    public static final v00 M;
    public static final v00 N;
    public static final v00 O;
    public static final v00 P;
    public static final v00 Q;
    public static final v00 R;
    public static final v00 S;
    public static final v00 T;
    public static final v00 U;
    public static final v00 V;
    public static final v00 W;
    public static final v00 X;
    public static final v00 Y;
    public static final v00 Z;
    public static final v00 a0;
    public static final v00 b0;
    public static final v00 c0;
    public static final v00 d0;
    public static final v00 e0;
    public static final v00 f0;
    public static final v00 g0;
    public static final v00 h0;
    public static final v00 i0;
    public static final v00 j0;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new v00(i, 0);
        H = new v00(i, 1);
        I = new v00(i, 2);
        J = new v00(i, 3);
        K = new v00(i, 4);
        L = new v00(i, 5);
        M = new v00(i, 6);
        N = new v00(i, 7);
        O = new v00(i, 8);
        P = new v00(i, 9);
        Q = new v00(i, 10);
        R = new v00(i, 11);
        S = new v00(i, 12);
        T = new v00(i, 13);
        U = new v00(i, 14);
        V = new v00(i, 15);
        W = new v00(i, 16);
        X = new v00(i, 17);
        Y = new v00(i, 18);
        Z = new v00(i, 19);
        a0 = new v00(i, 20);
        b0 = new v00(i, 21);
        c0 = new v00(i, 22);
        d0 = new v00(i, 23);
        e0 = new v00(i, 24);
        f0 = new v00(i, 25);
        g0 = new v00(i, 26);
        h0 = new v00(i, 27);
        i0 = new v00(i, 28);
        j0 = new v00(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v00(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        Choreographer choreographer;
        int i = 2;
        switch (this.F) {
            case 0:
                w00.a("LocalConfiguration");
                throw null;
            case 1:
                w00.a("LocalContext");
                throw null;
            case 2:
                w00.a("LocalImageVectorCache");
                throw null;
            case 3:
                w00.a("LocalResourceIdCache");
                throw null;
            case 4:
                w00.a("LocalView");
                throw null;
            case 5:
                return Boolean.FALSE;
            case 6:
                return "DEFAULT_TEST_TAG";
            case 7:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    ft5 ft5Var = g86.a;
                    choreographer = (Choreographer) gb9.V(tpa.a, new vj(i));
                }
                y60 y60Var = new y60(choreographer, dgj.A(Looper.getMainLooper()));
                return nai.Z(y60Var, y60Var.P);
            case 8:
                return "[Mobile Metric] Batch Deleted";
            case 9:
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(sz1.class, sz1.class.getClassLoader());
                serviceLoaderLoad.getClass();
                sz1 sz1Var = (sz1) w44.M0(serviceLoaderLoad);
                if (sz1Var != null) {
                    return sz1Var;
                }
                sz6.j("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 10:
                return new av9(2);
            case 11:
            case 12:
                return null;
            case 13:
                ve4.b("LocalAutofillManager");
                throw null;
            case 14:
                ve4.b("LocalAutofillTree");
                throw null;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ve4.b("LocalClipboard");
                throw null;
            case 16:
                ve4.b("LocalClipboardManager");
                throw null;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Boolean.TRUE;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ve4.b("LocalDensity");
                throw null;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ve4.b("LocalFocusManager");
                throw null;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ve4.b("LocalFontFamilyResolver");
                throw null;
            case 21:
                ve4.b("LocalFontLoader");
                throw null;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ve4.b("LocalGraphicsContext");
                throw null;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ve4.b("LocalHapticFeedback");
                throw null;
            case 24:
                ve4.b("LocalInputManager");
                throw null;
            case BuildConfig.VERSION_CODE /* 25 */:
                ve4.b("LocalLayoutDirection");
                throw null;
            case 26:
                return null;
            case 27:
                ve4.b("LocalProvidableLocaleList");
                throw null;
            case 28:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
