package defpackage;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lxe extends ts9 implements bz7 {
    public static final lxe G;
    public static final lxe H;
    public static final lxe I;
    public static final lxe J;
    public static final lxe K;
    public static final lxe L;
    public static final lxe M;
    public static final lxe N;
    public static final lxe O;
    public final /* synthetic */ int F;

    static {
        int i = 1;
        G = new lxe(i, 0);
        H = new lxe(i, 1);
        I = new lxe(i, 2);
        J = new lxe(i, 3);
        K = new lxe(i, 4);
        L = new lxe(i, 5);
        M = new lxe(i, 6);
        N = new lxe(i, 7);
        O = new lxe(i, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxe(int i, Object obj) {
        super(1);
        this.F = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(weakReference.get() == null);
            case 1:
                k99 k99Var = (k99) obj;
                k99Var.getClass();
                return new gk5(k99Var);
            case 2:
                return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 3:
                return Boolean.valueOf(((zo6) obj) == zo6.F);
            case 4:
                fpg fpgVar = (fpg) obj;
                fpgVar.getClass();
                return Boolean.valueOf(fpgVar.b.get() == null);
            case 5:
                return ieiVar;
            case 6:
                int i2 = ((ty8) obj).a;
                return ieiVar;
            case 7:
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.getClass();
                return motionEventObtain;
            case 8:
                ((hf) obj).getClass();
                return ieiVar;
            case 9:
                return ieiVar;
            case 10:
                return ieiVar;
            case 11:
                return ieiVar;
            case 12:
                String str = (String) obj;
                str.getClass();
                int iF0 = bsg.F0(str, ':', 0, 6);
                if (iF0 > 0 ? tj5.b.contains(str.substring(0, iF0)) : false) {
                    return null;
                }
                return str;
            default:
                ((gh3) obj).getClass();
                return neg.n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxe(int i, int i2) {
        super(i);
        this.F = i2;
    }
}
