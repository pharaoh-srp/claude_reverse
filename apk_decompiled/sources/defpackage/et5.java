package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.a1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a2;
import io.sentry.android.core.cache.a;
import io.sentry.android.core.internal.gestures.g;
import io.sentry.android.core.x;
import io.sentry.cache.c;
import io.sentry.f1;
import io.sentry.f4;
import io.sentry.g4;
import io.sentry.g7;
import io.sentry.h0;
import io.sentry.h7;
import io.sentry.hints.h;
import io.sentry.j4;
import io.sentry.j5;
import io.sentry.n0;
import io.sentry.p;
import io.sentry.protocol.r;
import io.sentry.r1;
import io.sentry.t5;
import io.sentry.util.b;
import io.sentry.w6;
import io.sentry.y4;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class et5 implements t0h, dv5, gxg, m92, j4, qze, b, f4, g4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ et5(sze szeVar, ArrayList arrayList, g91 g91Var) {
        this.E = 6;
        this.F = szeVar;
        this.H = arrayList;
        this.G = g91Var;
    }

    @Override // defpackage.gxg
    public r5l a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.F;
        String str = (String) this.G;
        g5e g5eVar = (g5e) this.H;
        String str2 = (String) obj;
        x2g x2gVarC = FirebaseMessaging.c(firebaseMessaging.b);
        String strD = firebaseMessaging.d();
        String strB = firebaseMessaging.h.b();
        synchronized (x2gVarC) {
            String strA = g5e.a(System.currentTimeMillis(), str2, strB);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = x2gVarC.a.edit();
                editorEdit.putString(x2g.a(strD, str), strA);
                editorEdit.commit();
            }
        }
        if (g5eVar == null || !str2.equals((String) g5eVar.b)) {
            pl7 pl7Var = firebaseMessaging.a;
            pl7Var.a();
            if ("[DEFAULT]".equals(pl7Var.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    pl7Var.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new i49(firebaseMessaging.b).X0(intent);
            }
        }
        return ez1.E(str2);
    }

    @Override // io.sentry.util.b
    public void accept(Object obj) {
        Long lValueOf;
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 8:
                ((h) obj).c(false);
                ((h0) obj4).g.b(t5.INFO, (Throwable) obj3, "File '%s' won't retry.", ((File) obj2).getAbsolutePath());
                return;
            default:
                a aVar = (a) obj4;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj3;
                io.sentry.android.core.cache.b bVar = (io.sentry.android.core.cache.b) obj2;
                switch (aVar.d.E) {
                    case 16:
                        lValueOf = Long.valueOf(((x) obj).H);
                        break;
                    default:
                        lValueOf = Long.valueOf(((a2) obj).H);
                        break;
                }
                a1 logger = sentryAndroidOptions.getLogger();
                t5 t5Var = t5.DEBUG;
                String str = aVar.b;
                logger.h(t5Var, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                String str2 = aVar.c;
                w6 w6Var = bVar.E;
                String cacheDirPath = w6Var.getCacheDirPath();
                if (cacheDirPath == null) {
                    w6Var.getLogger().h(t5Var, ij0.j("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                    try {
                        fileOutputStream.write(String.valueOf(lValueOf).getBytes(c.M));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                } catch (Throwable th2) {
                    w6Var.getLogger().d(t5.ERROR, ij0.j("Error writing the ", str, " marker to the disk"), th2);
                    return;
                }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.qze
    public Object apply(Object obj) {
        sze szeVar;
        int i = this.E;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        Object obj2 = this.H;
        Object obj3 = this.G;
        int i6 = 1;
        int i7 = 2;
        sze szeVar2 = (sze) this.F;
        switch (i) {
            case 6:
                ArrayList arrayList = (ArrayList) obj2;
                g91 g91Var = (g91) obj3;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    int i8 = cursor.getInt(7) != 0 ? i6 : 0;
                    rl rlVar = new rl();
                    rlVar.J = new HashMap();
                    String string = cursor.getString(i6);
                    if (string == null) {
                        mr9.h("Null transportName");
                        return null;
                    }
                    rlVar.E = string;
                    rlVar.H = Long.valueOf(cursor.getLong(i7));
                    rlVar.I = Long.valueOf(cursor.getLong(i5));
                    if (i8 != 0) {
                        String string2 = cursor.getString(4);
                        rlVar.G = new bn6(string2 == null ? sze.J : new en6(string2), cursor.getBlob(5));
                        szeVar = szeVar2;
                    } else {
                        String string3 = cursor.getString(4);
                        en6 en6Var = string3 == null ? sze.J : new en6(string3);
                        Cursor cursorQuery = szeVar2.c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                                break;
                            }
                            byte[] bArr = new byte[length];
                            int i9 = 0;
                            int length2 = 0;
                            while (i9 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i9);
                                sze szeVar3 = szeVar2;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i9++;
                                szeVar2 = szeVar3;
                            }
                            szeVar = szeVar2;
                            cursorQuery.close();
                            rlVar.G = new bn6(en6Var, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        rlVar.F = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new y81(j, g91Var, rlVar.s()));
                    szeVar2 = szeVar;
                    i5 = 3;
                    i6 = 1;
                    i7 = 2;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                c61 c61Var = (c61) obj2;
                ArrayList arrayList3 = (ArrayList) c61Var.G;
                Cursor cursor2 = (Cursor) obj;
                szeVar2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i10 = cursor2.getInt(1);
                    nfa nfaVar = nfa.REASON_UNKNOWN;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            nfaVar = nfa.MESSAGE_TOO_OLD;
                        } else if (i10 == 2) {
                            nfaVar = nfa.CACHE_FULL;
                        } else if (i10 == 3) {
                            nfaVar = nfa.PAYLOAD_TOO_BIG;
                        } else if (i10 == i4) {
                            nfaVar = nfa.MAX_RETRIES_REACHED;
                        } else if (i10 == i3) {
                            nfaVar = nfa.INVALID_PAYLOD;
                        } else if (i10 == i2) {
                            nfaVar = nfa.SERVER_ERROR;
                        } else {
                            j8.x(Integer.valueOf(i10), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    long j2 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new ofa(j2, nfaVar));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i11 = wfa.c;
                    new ArrayList();
                    arrayList3.add(new wfa((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                long jA = szeVar2.F.a();
                SQLiteDatabase sQLiteDatabaseC = szeVar2.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    fqh fqhVar = (fqh) sze.x(sQLiteDatabaseC.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new d61(jA));
                    sQLiteDatabaseC.setTransactionSuccessful();
                    sQLiteDatabaseC.endTransaction();
                    c61Var.F = fqhVar;
                    c61Var.H = new q78(new cpg(szeVar2.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * szeVar2.c().compileStatement("PRAGMA page_count").simpleQueryForLong(), p81.f.a));
                    c61Var.I = (String) szeVar2.I.get();
                    return new bp3((fqh) c61Var.F, Collections.unmodifiableList(arrayList3), (q78) c61Var.H, (String) c61Var.I);
                } catch (Throwable th2) {
                    sQLiteDatabaseC.endTransaction();
                    throw th2;
                }
        }
    }

    @Override // io.sentry.f4
    public void b(h7 h7Var) {
        ConcurrentHashMap concurrentHashMap;
        y4 y4Var = (y4) this.F;
        j5 j5Var = (j5) this.G;
        n0 n0Var = (n0) this.H;
        if (h7Var == null) {
            ((w6) y4Var.b).getLogger().h(t5.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strE = null;
        g7 g7Var = j5Var.g() != null ? g7.Crashed : null;
        boolean z = g7.Crashed == g7Var || j5Var.h();
        r rVar = j5Var.H;
        String str = (rVar == null || (concurrentHashMap = rVar.J) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) j5Var.H.J.get("user-agent");
        Object objB = n0Var.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.a) {
            strE = ((io.sentry.hints.a) objB).e();
            g7Var = g7.Abnormal;
        }
        if (!h7Var.d(g7Var, str, z, strE) || h7Var.K == g7.Ok) {
            return;
        }
        h7Var.b(p.k());
    }

    @Override // io.sentry.g4
    public void c(r1 r1Var) {
        g gVar = (g) this.F;
        f1 f1Var = (f1) this.G;
        r1 r1Var2 = (r1) this.H;
        if (r1Var == null) {
            f1Var.Q(r1Var2);
        } else {
            gVar.c.getLogger().h(t5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", r1Var2.getName());
        }
    }

    @Override // defpackage.m92
    public Object d(androidx.concurrent.futures.b bVar) {
        int i = this.E;
        x46 x46Var = x46.E;
        Object obj = this.H;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 3:
                c45 c45Var = (c45) obj3;
                o45 o45Var = (o45) obj2;
                pz7 pz7Var = (pz7) obj;
                fc fcVar = new fc(27, (lf9) c45Var.x0(dd8.J));
                dne dneVar = bVar.c;
                if (dneVar != null) {
                    dneVar.a(fcVar, x46Var);
                }
                return gb9.D(fd9.c(c45Var), null, o45Var, new ba9(pz7Var, bVar, null, 2), 1);
            default:
                Executor executor = (Executor) obj3;
                String str = (String) obj2;
                zy7 zy7Var = (zy7) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                taa taaVar = new taa(atomicBoolean, 0);
                dne dneVar2 = bVar.c;
                if (dneVar2 != null) {
                    dneVar2.a(taaVar, x46Var);
                }
                executor.execute(new uaa(atomicBoolean, bVar, zy7Var, 0));
                return str;
        }
    }

    @Override // defpackage.dv5
    public vde e(int i, v3i v3iVar, int[] iArr) {
        bv5 bv5Var = (bv5) this.F;
        String str = (String) this.G;
        String str2 = (String) this.H;
        hz8 hz8VarO = nz8.o();
        for (int i2 = 0; i2 < v3iVar.a; i2++) {
            hz8VarO.b(new cv5(i, v3iVar, i2, bv5Var, iArr[i2], str, str2));
        }
        return hz8VarO.g();
    }

    @Override // defpackage.t0h
    public Object execute() {
        gt5 gt5Var = (gt5) this.F;
        g91 g91Var = (g91) this.G;
        o81 o81Var = (o81) this.H;
        sze szeVar = gt5Var.d;
        szeVar.getClass();
        agd agdVar = g91Var.c;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(agdVar);
        }
        ((Long) szeVar.e(new pze(szeVar, o81Var, g91Var))).getClass();
        gt5Var.a.I(g91Var, 1, false);
        return null;
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        String str = (String) this.F;
        SilentException silentException = (SilentException) this.G;
        ozf ozfVar = (ozf) this.H;
        f1Var.getClass();
        f1Var.o(x44.X("MessageSseParser", str, "{{ default }}"));
        SilentException.a(silentException, ozfVar, false, 2);
    }

    public /* synthetic */ et5(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }
}
