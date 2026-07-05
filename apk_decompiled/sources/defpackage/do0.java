package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.util.Log;
import android.view.inputmethod.InputContentInfo;
import androidx.health.platform.client.proto.g;
import androidx.media3.common.PlaybackException;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class do0 implements io0, lz7, wee, mec, hba, dv5, y5c, tp1, ehe, e49 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ do0(kx kxVar, Object obj, long j) {
        this.E = 15;
        this.F = obj;
    }

    @Override // defpackage.tp1
    public long a(long j) {
        zm7 zm7Var = (zm7) this.F;
        return tpi.h((j * ((long) zm7Var.e)) / 1000000, 0L, zm7Var.j - 1);
    }

    @Override // defpackage.lz7
    public Object apply(Object obj) {
        yof yofVar = (yof) this.F;
        yofVar.e = ((Integer) obj).intValue();
        return Integer.valueOf(yofVar.e);
    }

    @Override // defpackage.io0
    public int b(int i, fu9 fu9Var) {
        return ((wo1) this.F).a(0, i);
    }

    @Override // defpackage.e49
    public boolean c(ax5 ax5Var, int i, Bundle bundle) {
        xn4 pojVar;
        eh0 eh0Var = (eh0) this.F;
        if ((i & 1) != 0) {
            try {
                ax5Var.E();
                InputContentInfo inputContentInfo = (InputContentInfo) ((ro6) ax5Var.F).F;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipData clipData = new ClipData(ax5Var.s(), new ClipData.Item(ax5Var.q()));
        if (Build.VERSION.SDK_INT >= 31) {
            pojVar = new poj(clipData, 2);
        } else {
            yn4 yn4Var = new yn4();
            yn4Var.F = clipData;
            yn4Var.G = 2;
            pojVar = yn4Var;
        }
        pojVar.c(ax5Var.u());
        pojVar.setExtras(bundle);
        return mvi.f(eh0Var, pojVar.build()) == null;
    }

    @Override // defpackage.ehe
    public void d(long j, ssc sscVar) {
        fik.g(j, sscVar, ((dy7) this.F).I);
    }

    @Override // defpackage.dv5
    public vde e(int i, v3i v3iVar, int[] iArr) {
        bv5 bv5Var = (bv5) this.F;
        hz8 hz8VarO = nz8.o();
        for (int i2 = 0; i2 < v3iVar.a; i2++) {
            hz8VarO.b(new yu5(i, v3iVar, i2, bv5Var, iArr[i2]));
        }
        return hz8VarO.g();
    }

    @Override // defpackage.y5c
    public void f(c5c c5cVar, int i) {
        StringBuilder sb = (StringBuilder) this.F;
        if (c5cVar instanceof xf5) {
            sb.append(((xf5) c5cVar).O());
        } else if (c5cVar instanceof l74) {
            sb.append(((l74) c5cVar).O());
        } else if (c5cVar instanceof h42) {
            sb.append(((h42) c5cVar).O());
        }
    }

    @Override // defpackage.wee
    public void h(IInterface iInterface, exf exfVar) {
        ((poc) this.F).getClass();
        exfVar.l(poc.b(iInterface));
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 13:
                ((q7b) obj).o = (PlaybackException) obj2;
                break;
            case 14:
                qo5 qo5Var = (qo5) obj2;
                q7b q7bVar = (q7b) obj;
                q7bVar.y += qo5Var.g;
                q7bVar.z += qo5Var.e;
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((q7b) obj).getClass();
                break;
            case 16:
            case g.MAX_FIELD_NUMBER /* 17 */:
            default:
                ((u6d) obj).r((List) obj2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((u6d) obj).p((n7b) obj2);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((u6d) obj).l((fd5) obj2);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((u6d) obj).p(((r77) obj2).E.N);
                break;
            case 21:
                ((u6d) obj).e((gjb) obj2);
                break;
        }
    }

    @Override // defpackage.mec
    public void onSuccess(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 6:
                ((r95) obj2).invoke(obj);
                break;
            case 7:
                ((ia5) obj2).invoke(obj);
                break;
            case 8:
                ((ma5) obj2).invoke(obj);
                break;
            case 9:
                ((sa5) obj2).invoke(obj);
                break;
            case 10:
                ((wa5) obj2).invoke(obj);
                break;
            case 11:
                ((ta5) obj2).invoke(obj);
                break;
            case 12:
                ((va5) obj2).invoke(obj);
                break;
            case 24:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                iq3 iq3Var = (iq3) obj;
                if (iq3Var != null) {
                    zni.M(iq3Var.E);
                    firebaseMessaging.f();
                }
                break;
            default:
                ((q38) obj2).invoke(obj);
                break;
        }
    }

    public /* synthetic */ do0(kx kxVar, Object obj, int i) {
        this.E = i;
        this.F = obj;
    }

    public /* synthetic */ do0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
