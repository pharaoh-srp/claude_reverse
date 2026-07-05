package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.health.platform.client.proto.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class mnk extends yxj implements pfk {
    public final o0l i;
    public Boolean j;
    public String k;

    public mnk(o0l o0lVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        dgj.v(o0lVar);
        this.i = o0lVar;
        this.k = null;
    }

    @Override // defpackage.pfk
    public final void A(u1l u1lVar) {
        E(u1lVar);
        D(new ynk(this, u1lVar, 0));
    }

    @Override // defpackage.pfk
    public final lrj B(u1l u1lVar) {
        E(u1lVar);
        String str = u1lVar.E;
        dgj.s(str);
        o0l o0lVar = this.i;
        try {
            return (lrj) o0lVar.O().S0(new nsj(this, u1lVar, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            o0lVar.b0().J.a(qgk.Q0(str), e, "Failed to get consent. appId");
            return new lrj(null);
        }
    }

    @Override // defpackage.pfk
    public final void C(u1l u1lVar) {
        dgj.s(u1lVar.E);
        dgj.v(u1lVar.Z);
        c(new ank(this, u1lVar, 0));
    }

    public final void D(Runnable runnable) {
        o0l o0lVar = this.i;
        if (o0lVar.O().V0()) {
            runnable.run();
        } else {
            o0lVar.O().T0(runnable);
        }
    }

    public final void E(u1l u1lVar) {
        dgj.v(u1lVar);
        String str = u1lVar.E;
        dgj.s(str);
        d(str, false);
        this.i.Y().v1(u1lVar.F, u1lVar.U);
    }

    public final void F(rvj rvjVar, u1l u1lVar) {
        o0l o0lVar = this.i;
        o0lVar.Z();
        o0lVar.o(rvjVar, u1lVar);
    }

    @Override // defpackage.yxj
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        boolean z = false;
        switch (i) {
            case 1:
                rvj rvjVar = (rvj) qxj.a(parcel, rvj.CREATOR);
                u1l u1lVar = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                y(rvjVar, u1lVar);
                parcel2.writeNoException();
                return true;
            case 2:
                e1l e1lVar = (e1l) qxj.a(parcel, e1l.CREATOR);
                u1l u1lVar2 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                o(e1lVar, u1lVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            default:
                return false;
            case 4:
                u1l u1lVar3 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                q(u1lVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                rvj rvjVar2 = (rvj) qxj.a(parcel, rvj.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                qxj.e(parcel);
                dgj.v(rvjVar2);
                dgj.s(string);
                d(string, true);
                D(new ije((Object) this, (a4) rvjVar2, (Object) string, 8));
                parcel2.writeNoException();
                return true;
            case 6:
                u1l u1lVar4 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                A(u1lVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                u1l u1lVar5 = (u1l) qxj.a(parcel, u1l.CREATOR);
                boolean zG = qxj.g(parcel);
                qxj.e(parcel);
                E(u1lVar5);
                String str = u1lVar5.E;
                dgj.v(str);
                o0l o0lVar = this.i;
                try {
                    List<f1l> list = (List) o0lVar.O().P0(new nsj(this, str, 2)).get();
                    arrayList = new ArrayList(list.size());
                    for (f1l f1lVar : list) {
                        if (zG || !h1l.P1(f1lVar.c)) {
                            arrayList.add(new e1l(f1lVar));
                        }
                        break;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    o0lVar.b0().J.a(qgk.Q0(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                } catch (ExecutionException e2) {
                    e = e2;
                    o0lVar.b0().J.a(qgk.Q0(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                rvj rvjVar3 = (rvj) qxj.a(parcel, rvj.CREATOR);
                String string2 = parcel.readString();
                qxj.e(parcel);
                byte[] bArrN = n(rvjVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrN);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                qxj.e(parcel);
                h(string3, string4, string5, j);
                parcel2.writeNoException();
                return true;
            case 11:
                u1l u1lVar6 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                String strV = v(u1lVar6);
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 12:
                kqj kqjVar = (kqj) qxj.a(parcel, kqj.CREATOR);
                u1l u1lVar7 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                w(kqjVar, u1lVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                kqj kqjVar2 = (kqj) qxj.a(parcel, kqj.CREATOR);
                qxj.e(parcel);
                dgj.v(kqjVar2);
                dgj.v(kqjVar2.G);
                dgj.s(kqjVar2.E);
                d(kqjVar2.E, true);
                D(new s2k(this, new kqj(kqjVar2), z, 15));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean zG2 = qxj.g(parcel);
                u1l u1lVar8 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                List listS = s(string6, string7, zG2, u1lVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listS);
                return true;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean zG3 = qxj.g(parcel);
                qxj.e(parcel);
                List listI = i(string8, string9, string10, zG3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                u1l u1lVar9 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                List listP = p(string11, string12, u1lVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP);
                return true;
            case g.MAX_FIELD_NUMBER /* 17 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                qxj.e(parcel);
                List listT = t(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listT);
                return true;
            case g.AVG_FIELD_NUMBER /* 18 */:
                u1l u1lVar10 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                u(u1lVar10);
                parcel2.writeNoException();
                return true;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Bundle bundle = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                u1l u1lVar11 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                mo1199e(bundle, u1lVar11);
                parcel2.writeNoException();
                return true;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                u1l u1lVar12 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                g(u1lVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                u1l u1lVar13 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                lrj lrjVarB = B(u1lVar13);
                parcel2.writeNoException();
                qxj.f(parcel2, lrjVarB);
                return true;
            case 24:
                u1l u1lVar14 = (u1l) qxj.a(parcel, u1l.CREATOR);
                Bundle bundle2 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                qxj.e(parcel);
                List listE = e(bundle2, u1lVar14);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE);
                return true;
            case BuildConfig.VERSION_CODE /* 25 */:
                u1l u1lVar15 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                C(u1lVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                u1l u1lVar16 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                l(u1lVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                u1l u1lVar17 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                x(u1lVar17);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) qxj.a(parcel, Bundle.CREATOR);
                u1l u1lVar18 = (u1l) qxj.a(parcel, u1l.CREATOR);
                qxj.e(parcel);
                z(bundle3, u1lVar18);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void c(Runnable runnable) {
        o0l o0lVar = this.i;
        if (o0lVar.O().V0()) {
            runnable.run();
        } else {
            o0lVar.O().U0(runnable);
        }
    }

    public final void d(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        o0l o0lVar = this.i;
        if (zIsEmpty) {
            o0lVar.b0().J.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.j == null) {
                    this.j = Boolean.valueOf("com.google.android.gms".equals(this.k) || oq5.H(o0lVar.P.E, Binder.getCallingUid()) || u98.a(o0lVar.P.E).c(Binder.getCallingUid()));
                }
                if (this.j.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                o0lVar.b0().J.c("Measurement Service called with invalid calling package. appId", qgk.Q0(str));
                throw e;
            }
        }
        if (this.k == null) {
            Context context = o0lVar.P.E;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = z88.a;
            if (oq5.U(callingUid, context, str)) {
                this.k = str;
            }
        }
        if (str.equals(this.k)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // defpackage.pfk
    public final List e(Bundle bundle, u1l u1lVar) {
        E(u1lVar);
        String str = u1lVar.E;
        dgj.v(str);
        o0l o0lVar = this.i;
        try {
            return (List) o0lVar.O().P0(new rqj(this, u1lVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            o0lVar.b0().J.a(qgk.Q0(str), e, "Failed to get trigger URIs. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.pfk
    public final void g(u1l u1lVar) {
        dgj.s(u1lVar.E);
        dgj.v(u1lVar.Z);
        c(new ank(this, u1lVar, 2));
    }

    @Override // defpackage.pfk
    public final void h(String str, String str2, String str3, long j) {
        D(new a3i(this, str2, str3, str, j, 1));
    }

    @Override // defpackage.pfk
    public final List i(String str, String str2, String str3, boolean z) {
        d(str, true);
        o0l o0lVar = this.i;
        try {
            List<f1l> list = (List) o0lVar.O().P0(new apk(this, str, str2, str3, 2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (f1l f1lVar : list) {
                if (z || !h1l.P1(f1lVar.c)) {
                    arrayList.add(new e1l(f1lVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            o0lVar.b0().J.a(qgk.Q0(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            o0lVar.b0().J.a(qgk.Q0(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.pfk
    public final void l(u1l u1lVar) {
        dgj.s(u1lVar.E);
        dgj.v(u1lVar.Z);
        c(new ank(this, u1lVar, 1));
    }

    @Override // defpackage.pfk
    public final byte[] n(rvj rvjVar, String str) {
        dgj.s(str);
        dgj.v(rvjVar);
        d(str, true);
        o0l o0lVar = this.i;
        ygk ygkVar = o0lVar.b0().Q;
        umk umkVar = o0lVar.P;
        ogk ogkVar = umkVar.Q;
        String str2 = rvjVar.E;
        ygkVar.c("Log and bundle. event", ogkVar.b(str2));
        o0lVar.zzb().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) o0lVar.O().S0(new eqb(this, rvjVar, str)).get();
            if (bArr == null) {
                o0lVar.b0().J.c("Log and bundle returned null. appId", qgk.Q0(str));
                bArr = new byte[0];
            }
            o0lVar.zzb().getClass();
            o0lVar.b0().Q.d("Log and bundle processed. event, size, time_ms", umkVar.Q.b(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            o0lVar.b0().J.d("Failed to log and bundle. appId, event, error", qgk.Q0(str), umkVar.Q.b(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            o0lVar.b0().J.d("Failed to log and bundle. appId, event, error", qgk.Q0(str), umkVar.Q.b(str2), e);
            return null;
        }
    }

    @Override // defpackage.pfk
    public final void o(e1l e1lVar, u1l u1lVar) {
        dgj.v(e1lVar);
        E(u1lVar);
        D(new ije((Object) this, (a4) e1lVar, (Object) u1lVar, 9));
    }

    @Override // defpackage.pfk
    public final List p(String str, String str2, u1l u1lVar) {
        E(u1lVar);
        String str3 = u1lVar.E;
        dgj.v(str3);
        o0l o0lVar = this.i;
        try {
            return (List) o0lVar.O().P0(new apk(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e) {
            o0lVar.b0().J.c("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.pfk
    public final void q(u1l u1lVar) {
        E(u1lVar);
        D(new ynk(this, u1lVar, 1));
    }

    @Override // defpackage.pfk
    public final List s(String str, String str2, boolean z, u1l u1lVar) {
        E(u1lVar);
        String str3 = u1lVar.E;
        dgj.v(str3);
        o0l o0lVar = this.i;
        try {
            List<f1l> list = (List) o0lVar.O().P0(new apk(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (f1l f1lVar : list) {
                if (z || !h1l.P1(f1lVar.c)) {
                    arrayList.add(new e1l(f1lVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            o0lVar.b0().J.a(qgk.Q0(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            o0lVar.b0().J.a(qgk.Q0(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.pfk
    public final List t(String str, String str2, String str3) {
        d(str, true);
        o0l o0lVar = this.i;
        try {
            return (List) o0lVar.O().P0(new apk(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            o0lVar.b0().J.c("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.pfk
    public final void u(u1l u1lVar) {
        dgj.s(u1lVar.E);
        d(u1lVar.E, false);
        D(new iok(this, u1lVar, 1));
    }

    @Override // defpackage.pfk
    public final String v(u1l u1lVar) {
        E(u1lVar);
        o0l o0lVar = this.i;
        try {
            return (String) o0lVar.O().P0(new b1l(o0lVar, u1lVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            o0lVar.b0().J.a(qgk.Q0(u1lVar.E), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.pfk
    public final void w(kqj kqjVar, u1l u1lVar) {
        dgj.v(kqjVar);
        dgj.v(kqjVar.G);
        E(u1lVar);
        kqj kqjVar2 = new kqj(kqjVar);
        kqjVar2.E = u1lVar.E;
        D(new ije((Object) this, (a4) kqjVar2, (Object) u1lVar, 7));
    }

    @Override // defpackage.pfk
    public final void x(u1l u1lVar) {
        E(u1lVar);
        D(new iok(this, u1lVar, 0));
    }

    @Override // defpackage.pfk
    public final void y(rvj rvjVar, u1l u1lVar) {
        dgj.v(rvjVar);
        E(u1lVar);
        D(new eok(this, rvjVar, u1lVar));
    }

    @Override // defpackage.pfk
    public final void z(Bundle bundle, u1l u1lVar) {
        a2l.F.get();
        if (this.i.N().X0(null, zvj.j1)) {
            E(u1lVar);
            String str = u1lVar.E;
            dgj.v(str);
            D(new ije(this, bundle, str, 6));
        }
    }

    @Override // defpackage.pfk
    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public final void mo1199e(Bundle bundle, u1l u1lVar) {
        E(u1lVar);
        String str = u1lVar.E;
        dgj.v(str);
        eok eokVar = new eok();
        eokVar.F = this;
        eokVar.G = bundle;
        eokVar.H = str;
        D(eokVar);
    }
}
