package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public final class cbi implements tb0, mec, cec, ydc, g1l {
    public final Object E;

    public cbi(ttd ttdVar) {
        ttdVar.getClass();
        List list = ttdVar.G;
        if ((ttdVar.F & 1) == 1) {
            int i = ttdVar.H;
            list.getClass();
            List list2 = list;
            ArrayList arrayList = new ArrayList(x44.y(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    x44.n0();
                    throw null;
                }
                ntd ntdVarH = (ntd) obj;
                if (i2 >= i) {
                    ntdVarH.getClass();
                    mtd mtdVarR = ntd.r(ntdVarH);
                    mtdVarR.H |= 2;
                    mtdVarR.J = true;
                    ntdVarH = mtdVarR.h();
                    if (!ntdVarH.b()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(ntdVarH);
                i2 = i3;
            }
            list = arrayList;
        }
        list.getClass();
        this.E = list;
    }

    public static cbi e(String str) {
        return new cbi((TextUtils.isEmpty(str) || str.length() > 1) ? mrk.UNINITIALIZED : qrk.c(str.charAt(0)));
    }

    @Override // defpackage.ydc
    public void a() {
        ((CountDownLatch) this.E).countDown();
    }

    public ntd b(int i) {
        return (ntd) ((List) this.E).get(i);
    }

    @Override // defpackage.g1l
    public void c(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        o0l o0lVar = (o0l) this.E;
        if (!zIsEmpty) {
            o0lVar.O().T0(new me2(this, str, str2, bundle, 8));
            return;
        }
        umk umkVar = o0lVar.P;
        if (umkVar != null) {
            qgk qgkVar = umkVar.M;
            umk.d(qgkVar);
            qgkVar.J.c("AppId not known when logging event", str2);
        }
    }

    public void d(boolean z) {
        ((fdj) this.E).d(z);
    }

    @Override // defpackage.tb0
    public jo7 get(int i) {
        return (vo7) this.E;
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.E).countDown();
    }

    @Override // defpackage.mec
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.E).countDown();
    }

    public /* synthetic */ cbi(kf5 kf5Var) {
        hsi hsiVar = new hsi(5, kf5Var);
        this.E = ypj.a(new bnh(7, ypj.a(new w3c(ypj.a(new cbf(hsiVar, 26, ypj.a(new bnh(10, hsiVar)))), ypj.a(new hsi(3, hsiVar)), hsiVar, 14))));
    }

    public cbi(Context context) {
        bnh bnhVar = new bnh(3, context);
        this.E = nlj.a(new w9h(nlj.a(new cbf(bnhVar, nlj.a(ilj.a), new xxi(bnhVar)))));
    }

    public /* synthetic */ cbi() {
        this.E = new CountDownLatch(1);
    }

    public /* synthetic */ cbi(Object obj) {
        this.E = obj;
    }

    public cbi(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.E = new edj(window);
        } else if (i >= 30) {
            this.E = new ddj(window);
        } else {
            this.E = new cdj(window);
        }
    }

    public cbi(float f, float f2) {
        this.E = new vo7(f, f2, 0.01f);
    }
}
