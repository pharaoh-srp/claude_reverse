package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class juj {
    public static final w5l f;
    public final Context a;
    public final vs9 b;
    public final yxk c;
    public boolean d;
    public awk e;

    static {
        s2l s2lVar = n4l.I;
        Object[] objArr = {"com.google.android.gms.mlkit.langid", "com.google.android.gms.mlkit.nlclassifier", "com.google.android.gms.tflite_dynamite"};
        dbj.b(3, objArr);
        f = new w5l(3, objArr);
    }

    public juj(Context context, vs9 vs9Var) {
        yxk yxkVar;
        this.a = context;
        this.b = vs9Var;
        synchronized (kyk.class) {
            axk axkVar = new axk();
            synchronized (kyk.class) {
                try {
                    if (kyk.a == null) {
                        kyk.a = new iyk(0);
                    }
                    yxkVar = (yxk) kyk.a.i(axkVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c = yxkVar;
        }
        this.c = yxkVar;
    }

    public final ArrayList a(String str) throws MlKitException {
        if (this.e == null) {
            c();
        }
        awk awkVar = this.e;
        dgj.v(awkVar);
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(awkVar.k);
            parcelObtain.writeString(str);
            parcelObtain.writeFloat(0.5f);
            Parcel parcelJ = awkVar.J(parcelObtain, 3);
            ArrayList<mwk> arrayListCreateTypedArrayList = parcelJ.createTypedArrayList(mwk.CREATOR);
            parcelJ.recycle();
            ArrayList arrayList = new ArrayList();
            for (mwk mwkVar : arrayListCreateTypedArrayList) {
                arrayList.add(new IdentifiedLanguage(mwkVar.E, mwkVar.F));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to run language identifier.", e);
        }
    }

    public final void b() {
        c();
    }

    public final void c() throws MlKitException {
        boolean z;
        lwk cwkVar;
        r5l r5lVarC;
        nyj nyjVar = b99.m;
        if (this.e != null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g88.b.getClass();
        Context context = this.a;
        int iA = g88.a(context);
        lmk lmkVar = lmk.OPTIONAL_MODULE_NOT_AVAILABLE;
        if (iA < 211800000) {
            d(jElapsedRealtime, lmkVar);
            throw new MlKitException("Language identification module is not supported on current google play service version, please upgrade");
        }
        jf7[] jf7VarArr = ojc.a;
        int iA2 = g88.a(context);
        ee0 ee0Var = fe0.a;
        final int i = 0;
        final int i2 = 1;
        w5l w5lVar = f;
        if (iA2 >= 221500000) {
            final jf7[] jf7VarArrA = ojc.a(ojc.d, w5lVar);
            try {
                r5l r5lVarD = new b99(context, nyjVar, ee0Var, d88.c).d(new njc() { // from class: v0l
                    @Override // defpackage.njc
                    public final jf7[] c() {
                        int i3 = i;
                        jf7[] jf7VarArr2 = jf7VarArrA;
                        switch (i3) {
                            case 0:
                                jf7[] jf7VarArr3 = ojc.a;
                                break;
                            default:
                                jf7[] jf7VarArr4 = ojc.a;
                                break;
                        }
                        return jf7VarArr2;
                    }
                });
                pyk pykVar = pyk.Y;
                r5lVarD.getClass();
                r5lVarD.b(y5h.a, pykVar);
                z = ((pqb) ez1.r(r5lVarD)).E;
            } catch (InterruptedException | ExecutionException e) {
                Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
                z = false;
            }
        } else {
            try {
                s2l s2lVarListIterator = w5lVar.listIterator(0);
                while (s2lVarListIterator.hasNext()) {
                    si6.c(context, si6.b, (String) s2lVarListIterator.next());
                }
                z = true;
            } catch (DynamiteModule$LoadingException unused) {
                z = false;
            }
        }
        if (z) {
            try {
                IBinder iBinderB = si6.c(context, si6.b, "com.google.android.gms.mlkit.langid").b("com.google.android.gms.mlkit.langid.LanguageIdentifierCreator");
                int i3 = iwk.i;
                if (iBinderB == null) {
                    cwkVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.mlkit.nl.languageid.aidls.ILanguageIdentifierCreator");
                    cwkVar = iInterfaceQueryLocalInterface instanceof lwk ? (lwk) iInterfaceQueryLocalInterface : new cwk(iBinderB, "com.google.mlkit.nl.languageid.aidls.ILanguageIdentifierCreator", 4);
                }
                cbc cbcVar = new cbc(context);
                this.b.getClass();
                awk awkVarO = ((cwk) cwkVar).O(cbcVar, new uwk(null));
                this.e = awkVarO;
                try {
                    awkVarO.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(awkVarO.k);
                    awkVarO.L(parcelObtain, 1);
                    d(jElapsedRealtime, lmk.NO_ERROR);
                    return;
                } catch (RemoteException e2) {
                    this.e = null;
                    d(jElapsedRealtime, lmk.OPTIONAL_MODULE_INIT_ERROR);
                    throw new MlKitException("Failed to init language identifier.", e2);
                }
            } catch (RemoteException e3) {
                d(jElapsedRealtime, lmk.OPTIONAL_MODULE_CREATE_ERROR);
                throw new MlKitException("Failed to create thin language identifier.", e3);
            } catch (DynamiteModule$LoadingException e4) {
                d(jElapsedRealtime, lmkVar);
                throw new MlKitException("Waiting for the langid optional module to be downloaded. Please wait.", e4);
            }
        }
        if (!this.d) {
            Object[] objArr = {"langid", "nlclassifier", "tflite_dynamite"};
            dbj.b(3, objArr);
            w5l w5lVar2 = new w5l(3, objArr);
            g88.b.getClass();
            if (g88.a(context) >= 221500000) {
                final jf7[] jf7VarArrA2 = ojc.a(ojc.c, w5lVar2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new njc() { // from class: v0l
                    @Override // defpackage.njc
                    public final jf7[] c() {
                        int i32 = i2;
                        jf7[] jf7VarArr2 = jf7VarArrA2;
                        switch (i32) {
                            case 0:
                                jf7[] jf7VarArr3 = ojc.a;
                                break;
                            default:
                                jf7[] jf7VarArr4 = ojc.a;
                                break;
                        }
                        return jf7VarArr2;
                    }
                });
                dgj.n("APIs must not be empty.", !arrayList.isEmpty());
                b99 b99Var = new b99(context, nyjVar, ee0Var, d88.c);
                df0 df0VarL0 = df0.l0(arrayList, true);
                if (df0VarL0.E.isEmpty()) {
                    r5lVarC = ez1.E(new wqb(0, false));
                } else {
                    w19 w19VarB = w19.b();
                    w19VarB.d = new jf7[]{jik.b};
                    w19VarB.a = true;
                    w19VarB.b = 27304;
                    w19VarB.c = new xzd(b99Var, df0VarL0, 24);
                    r5lVarC = b99Var.c(0, w19VarB.a());
                }
                r5lVarC.a(c0l.Z);
            } else {
                Intent intent = new Intent();
                intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", w5lVar2));
                intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
                context.sendBroadcast(intent);
            }
            this.d = true;
        }
        d(jElapsedRealtime, lmkVar);
        throw new MlKitException("Waiting for the langid optional module to be downloaded. Please wait.");
    }

    public final void d(long j, lmk lmkVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        smk smkVar = new smk();
        smkVar.c = jmk.TYPE_THIN;
        c6k c6kVar = new c6k();
        dke dkeVar = new dke();
        dkeVar.E = Long.valueOf(Long.MAX_VALUE & (jElapsedRealtime - j));
        dkeVar.F = lmkVar;
        c6kVar.E = new nlk(dkeVar);
        smkVar.d = new kqk(c6kVar);
        dke dkeVar2 = new dke();
        dkeVar2.F = new ptk();
        dkeVar2.E = smkVar;
        lyk.v();
        yxk yxkVar = this.c;
        r5l r5lVar = yxkVar.e;
        qjk.E.execute(new ije(yxkVar, dkeVar2, r5lVar.g() ? (String) r5lVar.e() : n3a.c.a(yxkVar.g), 11));
    }
}
