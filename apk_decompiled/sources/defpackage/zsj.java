package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.RoundedCorner;
import androidx.compose.foundation.layout.b;
import androidx.credentials.exceptions.CreateCredentialException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zsj {
    public static final ta4 a = new ta4(-1024572307, false, new m14(7));
    public static final ta4 b = new ta4(-1929093144, false, new m14(8));
    public static final ta4 c = new ta4(1428410833, false, new m14(9));
    public static final Object d = new Object();

    public static final void a(z02 z02Var, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        z02Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-660641578);
        int i2 = i | (e18Var.f(z02Var) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            float f = p02.b;
            fqb fqbVar = fqb.E;
            iqb iqbVarO = b.o(gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, 11), z02Var.b(e18Var));
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarO);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y(6, ta4Var, e18Var, true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(z02Var, i, iqbVar2, ta4Var, 17);
        }
    }

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = no9.O;
        return j;
    }

    public static final void c(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1545304683);
        int i2 = (e18Var.h(zy7Var2) ? 32 : 16) | i | (e18Var.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            wpk.a(zy7Var, null, fd9.q0(1095489822, new v56(zy7Var2, zy7Var3, 6), e18Var), e18Var, 390, 2);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xa0(zy7Var, zy7Var2, zy7Var3, i, 1);
        }
    }

    public static final int f(long j) {
        return (int) (j >> 32);
    }

    public static uve g(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        sz6.p(grc.p(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new uve(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static CreateCredentialException h(Intent intent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i5.a(intent);
        }
        int i = CreateCredentialException.E;
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
        if (bundleExtra == null) {
            return null;
        }
        String string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
        if (string != null) {
            return urk.i(bundleExtra.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string);
        }
        sz6.p("Bundle was missing exception type.");
        return null;
    }

    public static l65 i(Intent intent, String str) {
        String string;
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 34) {
            return i5.b(intent, str);
        }
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
        if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
            return null;
        }
        return quk.g(string, bundle);
    }

    public abstract String d(byte[] bArr, int i, int i2);

    public abstract int e(String str, byte[] bArr, int i, int i2);
}
