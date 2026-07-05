package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.r;
import androidx.health.platform.client.proto.s;
import com.anthropic.claude.api.errors.ResponseJsonParseException;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.sentry.a1;
import io.sentry.android.core.o1;
import io.sentry.android.core.u1;
import io.sentry.c;
import io.sentry.e4;
import io.sentry.f1;
import io.sentry.f7;
import io.sentry.g4;
import io.sentry.h0;
import io.sentry.hints.h;
import io.sentry.j4;
import io.sentry.m;
import io.sentry.protocol.i0;
import io.sentry.protocol.w;
import io.sentry.r1;
import io.sentry.r3;
import io.sentry.t5;
import io.sentry.util.b;
import io.sentry.w6;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u95 implements cec, iba, hba, zdc, m92, r6b, gm4, k5g, qze, j4, wee, t0h, b, g4, o1, e4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ u95(Object obj, int i, Object obj2) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    @Override // io.sentry.android.core.o1
    public void a() {
        u1 u1Var = (u1) this.G;
        Activity activity = (Activity) ((WeakReference) this.F).get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.runOnUiThread(new tui(u1Var, 12, activity));
    }

    @Override // defpackage.gm4
    public void accept(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        Object obj3 = this.G;
        switch (i) {
            case 9:
                tg6 tg6Var = (tg6) obj3;
                ((f8b) obj).c(tg6Var.a, tg6Var.b, (l7b) obj2);
                break;
            case 21:
                File file = (File) obj2;
                boolean zA = ((h) obj).a();
                a1 a1Var = ((h0) obj3).g;
                if (!zA) {
                    try {
                        if (!file.delete()) {
                            a1Var.h(t5.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
                        }
                    } catch (Throwable th) {
                        a1Var.b(t5.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
                    }
                    a1Var.h(t5.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                } else {
                    a1Var.h(t5.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
                }
                break;
            default:
                r3.c((r3) obj3, (File) obj2, (h) obj);
                break;
        }
    }

    @Override // defpackage.qze
    public Object apply(Object obj) {
        sze szeVar = (sze) this.G;
        g91 g91Var = (g91) this.F;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        p81 p81Var = szeVar.H;
        ArrayList arrayListF = szeVar.f(sQLiteDatabase, g91Var, p81Var.b);
        for (agd agdVar : agd.values()) {
            if (agdVar != g91Var.c) {
                int size = p81Var.b - arrayListF.size();
                if (size <= 0) {
                    break;
                }
                fj0 fj0VarA = g91.a();
                fj0VarA.J(g91Var.a);
                if (agdVar == null) {
                    mr9.h("Null priority");
                    return null;
                }
                fj0VarA.G = agdVar;
                fj0VarA.F = g91Var.b;
                arrayListF.addAll(szeVar.f(sQLiteDatabase, fj0VarA.h(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListF.size(); i++) {
            sb.append(((y81) arrayListF.get(i)).a);
            if (i < arrayListF.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", ExperienceToggle.DEFAULT_PARAM_KEY}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new rze(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListF.listIterator();
        while (listIterator.hasNext()) {
            y81 y81Var = (y81) listIterator.next();
            long j2 = y81Var.a;
            if (map.containsKey(Long.valueOf(j2))) {
                rl rlVarC = y81Var.c.c();
                for (rze rzeVar : (Set) map.get(Long.valueOf(j2))) {
                    rlVarC.q(rzeVar.a, rzeVar.b);
                }
                listIterator.set(new y81(j2, y81Var.b, rlVarC.s()));
            }
        }
        return arrayListF;
    }

    @Override // defpackage.k5g
    public boolean b() {
        kcd kcdVar = (kcd) this.G;
        w91 w91Var = (w91) this.F;
        if (!kcdVar.q) {
            kcdVar.i();
            w91Var.a = w91.a(kcdVar.o, w91Var.a);
            kcdVar.q = !kcdVar.h(kcdVar.n, r1 + w91Var.b);
        }
        return kcdVar.q;
    }

    @Override // io.sentry.g4
    public void c(r1 r1Var) {
        int i = this.E;
        Object obj = this.F;
        Object obj2 = this.G;
        switch (i) {
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                f1 f1Var = (f1) obj;
                if (r1Var == ((f7) obj2)) {
                    f1Var.x();
                }
                break;
            case 24:
                f1 f1Var2 = (f1) obj;
                if (r1Var == ((r1) obj2)) {
                    f1Var2.x();
                }
                break;
            default:
                f1 f1Var3 = (f1) obj;
                if (r1Var == ((io.sentry.android.core.internal.gestures.g) obj2).e) {
                    f1Var3.x();
                }
                break;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2 A[Catch: all -> 0x00fc, TryCatch #13 {all -> 0x00fc, blocks: (B:29:0x00cb, B:30:0x00d6, B:36:0x00e2, B:43:0x00eb, B:45:0x00f2, B:47:0x00fb, B:46:0x00f5, B:50:0x00ff), top: B:105:0x00cb, outer: #12, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[Catch: all -> 0x00fc, TryCatch #13 {all -> 0x00fc, blocks: (B:29:0x00cb, B:30:0x00d6, B:36:0x00e2, B:43:0x00eb, B:45:0x00f2, B:47:0x00fb, B:46:0x00f5, B:50:0x00ff), top: B:105:0x00cb, outer: #12, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    @Override // defpackage.m92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(androidx.concurrent.futures.b r13) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u95.d(androidx.concurrent.futures.b):java.lang.Object");
    }

    @Override // defpackage.r6b
    public int e(Object obj) {
        Context context = (Context) this.G;
        jw7 jw7Var = (jw7) this.F;
        g6b g6bVar = (g6b) obj;
        String str = g6bVar.b;
        return ((str.equals(jw7Var.o) || str.equals(s6b.c(jw7Var))) && g6bVar.c(context, jw7Var, false) && g6bVar.d(jw7Var)) ? 1 : 0;
    }

    @Override // defpackage.t0h
    public Object execute() {
        int i = this.E;
        Object obj = this.F;
        wk wkVar = (wk) this.G;
        switch (i) {
            case g.AVG_FIELD_NUMBER /* 18 */:
                Iterable iterable = (Iterable) obj;
                sze szeVar = (sze) wkVar.a;
                szeVar.getClass();
                if (iterable.iterator().hasNext()) {
                    szeVar.c().compileStatement("DELETE FROM events WHERE _id in ".concat(sze.n(iterable))).execute();
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((sze) wkVar.i).i(((Integer) r2.getValue()).intValue(), nfa.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:341:0x05d9 A[PHI: r12
      0x05d9: PHI (r12v17 int) = (r12v16 int), (r12v15 int), (r12v15 int), (r12v15 int) binds: [B:348:0x05ea, B:330:0x05be, B:331:0x05c0, B:332:0x05c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0678 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.iba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.Object r22, defpackage.en7 r23) {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u95.f(java.lang.Object, en7):void");
    }

    @Override // io.sentry.e4
    public void g(m mVar) {
        f1 f1Var = (f1) this.G;
        w6 w6Var = (w6) this.F;
        c cVar = (c) mVar.d;
        if (cVar.f) {
            m mVarD = f1Var.D();
            w wVarN = f1Var.n();
            cVar.c("sentry-trace_id", ((w) mVarD.b).toString());
            cVar.c("sentry-public_key", w6Var.retrieveParsedDsn().b);
            cVar.c("sentry-release", w6Var.getRelease());
            cVar.c("sentry-environment", w6Var.getEnvironment());
            if (!w.F.equals(wVarN)) {
                cVar.c("sentry-replay_id", wVarN.toString());
            }
            cVar.c("sentry-org_id", w6Var.getEffectiveOrgId());
            cVar.c("sentry-transaction", null);
            if (cVar.f) {
                cVar.c = null;
            }
            cVar.c("sentry-sampled", null);
            cVar.f = false;
        }
    }

    @Override // defpackage.wee
    public void h(IInterface iInterface, exf exfVar) {
        Parcel parcelObtain;
        Parcel parcelObtain2;
        int i = this.E;
        Object obj = this.F;
        yof yofVar = (yof) this.G;
        switch (i) {
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                st8 st8Var = (st8) iInterface;
                aje ajeVarB = yofVar.b();
                Set set = (Set) obj;
                ArrayList arrayList = new ArrayList(x44.y(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Permission((r) it.next()));
                }
                List listP1 = w44.p1(arrayList);
                ir irVar = new ir(exfVar, 1);
                qt8 qt8Var = (qt8) st8Var;
                qt8Var.getClass();
                parcelObtain = Parcel.obtain();
                parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    gtk.k(parcelObtain, ajeVarB);
                    int size = listP1.size();
                    parcelObtain.writeInt(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        gtk.k(parcelObtain, (Parcelable) listP1.get(i2));
                    }
                    parcelObtain.writeStrongInterface(irVar);
                    qt8Var.i.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                }
            case 16:
                c3e c3eVar = (c3e) obj;
                aje ajeVarB2 = yofVar.b();
                ir irVar2 = new ir(exfVar, 2);
                qt8 qt8Var2 = (qt8) ((st8) iInterface);
                qt8Var2.getClass();
                parcelObtain = Parcel.obtain();
                parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    gtk.k(parcelObtain, ajeVarB2);
                    gtk.k(parcelObtain, c3eVar);
                    parcelObtain.writeStrongInterface(irVar2);
                    qt8Var2.i.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                }
            default:
                aje ajeVarB3 = yofVar.b();
                jr jrVar = new jr((s) obj);
                ir irVar3 = new ir(exfVar, 0);
                qt8 qt8Var3 = (qt8) ((st8) iInterface);
                qt8Var3.getClass();
                parcelObtain = Parcel.obtain();
                parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    gtk.k(parcelObtain, ajeVarB3);
                    gtk.k(parcelObtain, jrVar);
                    parcelObtain.writeStrongInterface(irVar3);
                    qt8Var3.i.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                }
        }
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        String str;
        t5 t5Var;
        String string;
        int i = this.E;
        Object obj = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 12:
                Throwable th = (Throwable) obj;
                f1Var.getClass();
                f1Var.p("redacted_request_url", s9e.a((kie) obj2));
                if (th instanceof ResponseJsonParseException) {
                    f1Var.p("json_parse_failed_content", ((ResponseJsonParseException) th).E);
                }
                break;
            case 13:
                String str2 = (String) obj2;
                String str3 = (String) obj;
                f1Var.getClass();
                i0 i0VarS = f1Var.S();
                if (i0VarS != null) {
                    if (!x44.r(i0VarS.F, str2)) {
                        mr9.f(ij0.k("Tried to clear user with ID ", str2, " but current user has ID ", i0VarS.F));
                    } else {
                        ConcurrentHashMap concurrentHashMap = i0VarS.K;
                        if (concurrentHashMap != null && (str = (String) concurrentHashMap.get("current_organization_id")) != null && !x44.r(str3, str)) {
                            SilentException.a(new SilentException(ij0.k("Tried to clear user with org ID ", str3, " but current user has org ID ", str)), null, false, 3);
                        }
                    }
                }
                f1Var.e(null);
                f1Var.t("subscription_level");
                break;
            case 14:
                Map map = (Map) obj;
                f1Var.getClass();
                int iOrdinal = ((ozf) obj2).ordinal();
                if (iOrdinal == 0) {
                    t5Var = t5.INFO;
                } else if (iOrdinal == 1) {
                    t5Var = t5.WARNING;
                } else if (iOrdinal == 2) {
                    t5Var = t5.ERROR;
                } else if (iOrdinal != 3) {
                    wg6.i();
                } else {
                    t5Var = t5.FATAL;
                }
                f1Var.w(t5Var);
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (string = value.toString()) == null) {
                        string = "null";
                    }
                    f1Var.p(str4, string);
                }
                break;
            default:
                f1Var.O(new et5((io.sentry.android.core.internal.gestures.g) obj2, f1Var, (r1) obj, 11));
                break;
        }
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        kx kxVar = (kx) this.G;
        l7b l7bVar = (l7b) this.F;
        q7b q7bVar = (q7b) obj;
        q7bVar.getClass();
        z7b z7bVar = kxVar.d;
        if (z7bVar == null) {
            return;
        }
        jw7 jw7Var = l7bVar.b;
        jw7Var.getClass();
        bt5 bt5Var = q7bVar.c;
        mqh mqhVar = kxVar.b;
        z7bVar.getClass();
        qb5 qb5Var = new qb5((Object) jw7Var, (Object) bt5Var.c(mqhVar, z7bVar), false);
        int i = l7bVar.a;
        if (i != 0) {
            if (i == 1) {
                q7bVar.q = qb5Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                q7bVar.r = qb5Var;
                return;
            }
        }
        q7bVar.p = qb5Var;
    }

    @Override // defpackage.zdc
    public void onComplete(d5h d5hVar) {
        ((FirebaseMessagingService) this.G).a((Intent) this.F);
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        int i = this.E;
        Object obj = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2((CredentialProviderBeginSignInController) obj2, (CancellationSignal) obj, exc);
                break;
            default:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3((CredentialProviderGetSignInIntentController) obj2, (CancellationSignal) obj, exc);
                break;
        }
    }
}
