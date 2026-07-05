package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.view.ViewGroup;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.mainactivity.MainActivity;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.location.LocationAvailability;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class fnf implements z47, zwg, nb, nji, mec, WebViewStartUpCallbackBoundaryInterface, WebViewStartUpConfigBoundaryInterface, see, eba, pec, tok, aik {
    public final /* synthetic */ int E;
    public Object F;

    public fnf(int i) {
        this.E = i;
        switch (i) {
            case 10:
                this.F = new qv5();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                this.F = new r5l();
                break;
            default:
                this.F = new bm4();
                break;
        }
    }

    @Override // defpackage.pec
    public void a() {
        try {
            a5l a5lVar = (a5l) ((kt8) this.F);
            Parcel parcelH = a5lVar.H();
            try {
                a5lVar.j.transact(2, parcelH, null, 1);
            } finally {
                parcelH.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        switch (this.E) {
            case 16:
                vnj vnjVar = new vnj(0, (j5h) obj2);
                enj enjVar = (enj) ((znj) obj).t();
                df0 df0Var = (df0) this.F;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(enjVar.k);
                int i = rmj.a;
                parcelObtain.writeStrongBinder(vnjVar);
                rmj.c(parcelObtain, df0Var);
                enjVar.c(parcelObtain, 1);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                coj cojVar = (coj) this.F;
                boj bojVar = new boj((j5h) obj2);
                soj sojVar = (soj) ((doj) obj).t();
                String str = cojVar.k;
                Parcel parcelD = sojVar.d();
                int i2 = hoj.a;
                parcelD.writeStrongBinder(bojVar);
                parcelD.writeString(str);
                sojVar.D(parcelD, 2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                aoj aojVar = new aoj(1, (j5h) obj2);
                soj sojVar2 = (soj) ((doj) obj).t();
                l48 l48Var = (l48) this.F;
                Parcel parcelD2 = sojVar2.d();
                int i3 = hoj.a;
                parcelD2.writeStrongBinder(aojVar);
                hoj.c(parcelD2, l48Var);
                sojVar2.D(parcelD2, 3);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            default:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.F;
                a99 a99Var = new a99(1, (j5h) obj2);
                vt8 vt8Var = (vt8) ((qv8) obj).t();
                hf0 hf0VarM = grk.m();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i4 = yyj.a;
                parcelObtain2.writeStrongBinder(a99Var);
                yyj.b(parcelObtain2, getCredentialRequest);
                yyj.b(parcelObtain2, hf0VarM);
                ((tt8) vt8Var).b(parcelObtain2, 1);
                break;
            case 21:
                j5h j5hVar = (j5h) obj2;
                v6k v6kVar = (v6k) obj;
                sea seaVar = (sea) this.F;
                dgj.n("locationSettingsRequest can't be null", seaVar != null);
                c5l c5lVar = (c5l) v6kVar.t();
                e4k e4kVar = new e4k(0, j5hVar);
                Parcel parcelH = c5lVar.H();
                zyj.b(parcelH, seaVar);
                parcelH.writeStrongBinder(e4kVar);
                parcelH.writeString(null);
                c5lVar.L(parcelH, 63);
                break;
        }
    }

    @Override // defpackage.z47
    public g4e b() throws Throwable {
        hwe hweVarB;
        IOException iOException = null;
        while (!((z4e) this.F).l.V) {
            try {
                hweVarB = ((z4e) this.F).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    mwa.p(iOException, e);
                }
                if (!((z4e) this.F).a(null)) {
                    throw iOException;
                }
            }
            if (!hweVarB.a()) {
                gwe gweVarD = hweVarB.d();
                if (gweVarD.b == null && gweVarD.c == null) {
                    gweVarD = hweVarB.g();
                }
                hwe hweVar = gweVarD.b;
                Throwable th = gweVarD.c;
                if (th != null) {
                    throw th;
                }
                if (hweVar != null) {
                    ((z4e) this.F).q.addFirst(hweVar);
                }
            }
            return hweVarB.c();
        }
        xh6.c("Canceled");
        return null;
    }

    @Override // defpackage.z47
    public z4e c() {
        return (z4e) this.F;
    }

    @Override // defpackage.aik
    public void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((o0l) this.F).E(str, i, th, bArr, map);
    }

    @Override // defpackage.eba
    public /* synthetic */ void e(Object obj) {
        ((pea) obj).onLocationAvailability((LocationAvailability) this.F);
    }

    @Override // defpackage.nji
    public FileChannel f() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.F;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        sz6.p("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
        return null;
    }

    public long g(long j) {
        qv5 qv5Var = (qv5) this.F;
        qv5Var.getClass();
        if (qsi.d(j) <= MTTypesetterKt.kLineSkipLimitMultiplier || qsi.e(j) <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            b39.c("maximumVelocity should be a positive value. You specified=" + ((Object) qsi.i(j)));
        }
        return lvj.e(qv5Var.a.b(qsi.d(j)), qv5Var.b.b(qsi.e(j)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        return ((g8j) this.F).a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Set getProfileNamesToLoad() {
        return null;
    }

    public ViewGroup h() {
        return ((ire) this.F).i();
    }

    public boolean i() {
        return ((r5l) this.F).f();
    }

    public void j(pec pecVar) {
        ((r5l) this.F).c(y5h.a, new fnf(19, pecVar));
    }

    public void k(lrb lrbVar) {
        x7b x7bVar = (x7b) this.F;
        x7bVar.a = lrbVar;
        Iterator it = ((LinkedList) x7bVar.c).iterator();
        while (it.hasNext()) {
            ((mnj) it.next()).b();
        }
        ((LinkedList) x7bVar.c).clear();
        x7bVar.b = null;
    }

    public void l() {
        qv5 qv5Var = (qv5) this.F;
        ssi ssiVar = qv5Var.a;
        dg5[] dg5VarArr = ssiVar.d;
        mp0.z0(0, dg5VarArr.length, null, dg5VarArr);
        ssiVar.e = 0;
        ssi ssiVar2 = qv5Var.b;
        dg5[] dg5VarArr2 = ssiVar2.d;
        mp0.z0(0, dg5VarArr2.length, null, dg5VarArr2);
        ssiVar2.e = 0;
        qv5Var.c = 0L;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        int i;
        ArrayList arrayList;
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) nv1.b(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Throwable> it = blockingStartUpLocations.iterator();
        while (true) {
            i = 25;
            if (!it.hasNext()) {
                break;
            }
            it.next();
            arrayList2.add(new am4(i));
        }
        if (t7j.f.b()) {
            List<Throwable> asyncStartUpLocations = webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations();
            arrayList = new ArrayList();
            for (Throwable th : asyncStartUpLocations) {
                arrayList.add(new am4(i));
            }
        } else {
            arrayList = null;
        }
        ((jke) this.F).b(new f8j(arrayList2, arrayList, webViewStartUpResultBoundaryInterface));
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        return true;
    }

    @Override // defpackage.tok
    public Object zza() {
        snk snkVar = (snk) this.F;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = snkVar.E.acquireUnstableContentProviderClient(snkVar.F);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(snkVar.F, snk.M, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map bp0Var = count <= 256 ? new bp0(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        bp0Var.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return bp0Var;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } finally {
                }
            } catch (RemoteException e) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    public /* synthetic */ fnf(int i, boolean z) {
        this.E = i;
    }

    public /* synthetic */ fnf(e88 e88Var, a4 a4Var, int i) {
        this.E = i;
        this.F = a4Var;
    }

    public fnf(MainActivity mainActivity) {
        ire ireVar;
        this.E = 2;
        if (Build.VERSION.SDK_INT >= 31) {
            ireVar = new mig(mainActivity);
        } else {
            ireVar = new ire(mainActivity);
        }
        ireVar.f();
        this.F = ireVar;
    }

    public /* synthetic */ fnf(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.mec
    public /* synthetic */ void onSuccess(Object obj) {
        switch (this.E) {
            case 9:
                ((lc) this.F).invoke(obj);
                break;
            default:
                ((pec) this.F).a();
                break;
        }
    }
}
