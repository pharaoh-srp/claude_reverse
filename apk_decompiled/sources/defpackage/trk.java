package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.tool.model.MessageComposeV1InputKind;

/* JADX INFO: loaded from: classes3.dex */
public abstract class trk {
    public static final ta4 a = new ta4(828690935, false, new tb4(27));
    public static final ta4 b = new ta4(1741217918, false, new vb4(3));
    public static final ta4 c = new ta4(-1605259649, false, new vb4(4));

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r12, int r13, defpackage.ld4 r14, defpackage.zy7 r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trk.a(int, int, ld4, zy7, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.zy7 r30, final defpackage.ta4 r31, defpackage.iqb r32, defpackage.pz7 r33, final defpackage.pz7 r34, defpackage.pz7 r35, defpackage.e0g r36, long r37, long r39, long r41, long r43, defpackage.c36 r45, defpackage.ld4 r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trk.b(zy7, ta4, iqb, pz7, pz7, pz7, e0g, long, long, long, long, c36, ld4, int, int, int):void");
    }

    public static final qhb c(MessageComposeV1InputKind messageComposeV1InputKind) {
        int i = ofb.a[messageComposeV1InputKind.ordinal()];
        if (i == 1) {
            return qhb.E;
        }
        if (i == 2) {
            return qhb.F;
        }
        if (i == 3) {
            return qhb.G;
        }
        wg6.i();
        return null;
    }

    public static jpe d(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("headers");
            return new jpe(bh9VarS != null ? grk.e(bh9VarS.g()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Response", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Response", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Response", e3);
            return null;
        }
    }

    public static final Activity e(Context context) {
        context.getClass();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return (Activity) context;
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static lf9 h(l45 l45Var, b6c b6cVar, pz7 pz7Var) {
        b6cVar.getClass();
        return gb9.C(l45Var, b6cVar, o45.E, pz7Var);
    }

    public static final iqb i(iqb iqbVar, e18 e18Var, int i) {
        iqbVar.getClass();
        return mpk.b0(b.g(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, (i & 1) != 0 ? 320.0f : 160.0f, 1), mpk.Y(e18Var), true);
    }

    public static final ta4 j(pz7 pz7Var, ld4 ld4Var) {
        return fd9.q0(21899129, new dt(pz7Var, 15, (byte) 0), ld4Var);
    }
}
