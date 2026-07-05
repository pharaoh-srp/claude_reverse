package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.tool.calendar.EventInfo;
import com.anthropic.claude.types.strings.ModelId;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.arkivanov.essenty.statekeeper.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.Thread;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Sink;
import okio.Socket;
import okio.Source;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes.dex */
public final class dpf implements h91, if7, bh5, jki, Socket, vg3, gsi, fe7 {
    public static dpf J;
    public static final mrg K = new mrg("_root_");
    public final /* synthetic */ int E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;

    public dpf(c16 c16Var) {
        this.E = 10;
        this.I = c16Var;
        List list = c16Var.I.X;
        list.getClass();
        List list2 = list;
        int iD0 = tta.d0(x44.y(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj : list2) {
            linkedHashMap.put(iv1.w((txb) c16Var.P.e, ((psd) obj).H), obj);
        }
        this.F = linkedHashMap;
        c16 c16Var2 = (c16) this.I;
        this.G = ((r06) c16Var2.P.d).a.c(new g4(this, 6, c16Var2));
        gfa gfaVar = ((r06) ((c16) this.I).P.d).a;
        v01 v01Var = new v01(12, this);
        gfaVar.getClass();
        this.H = new dfa(gfaVar, v01Var);
    }

    public static synchronized dpf K() {
        try {
            if (J == null) {
                J = new dpf(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return J;
    }

    public static void T(dpf dpfVar, c4e c4eVar, f4e f4eVar, c4e c4eVar2, int i) {
        d86 d86Var;
        c4e c4eVarD;
        if ((i & 1) != 0) {
            c4eVar = null;
        }
        if ((i & 2) != 0) {
            f4eVar = null;
        }
        if ((i & 4) != 0) {
            c4eVar2 = null;
        }
        dpfVar.getClass();
        TimeZone timeZone = blj.a;
        boolean zIsShutdown = ((ThreadPoolExecutor) dpfVar.B()).isShutdown();
        synchronized (dpfVar) {
            if (f4eVar != null) {
                try {
                    if (!((ArrayDeque) dpfVar.H).remove(f4eVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c4eVar2 != null) {
                c4eVar2.F.decrementAndGet();
                if (!((ArrayDeque) dpfVar.G).remove(c4eVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (c4eVar != null) {
                ((ArrayDeque) dpfVar.I).add(c4eVar);
                f4e f4eVar2 = c4eVar.G;
                if (!f4eVar2.G && (c4eVarD = dpfVar.D(f4eVar2.F.a.d)) != null) {
                    c4eVar.F = c4eVarD.F;
                }
            }
            if ((f4eVar != null || c4eVar2 != null) && (zIsShutdown || ((ArrayDeque) dpfVar.G).isEmpty())) {
                ((ArrayDeque) dpfVar.H).isEmpty();
            }
            if (zIsShutdown) {
                List listP1 = w44.p1((ArrayDeque) dpfVar.I);
                ((ArrayDeque) dpfVar.I).clear();
                d86Var = new d86(listP1);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) dpfVar.I).iterator();
                it.getClass();
                while (it.hasNext()) {
                    c4e c4eVar3 = (c4e) it.next();
                    if (((ArrayDeque) dpfVar.G).size() >= 64) {
                        break;
                    }
                    if (c4eVar3.F.get() < 5) {
                        it.remove();
                        c4eVar3.F.incrementAndGet();
                        arrayList.add(c4eVar3);
                        ((ArrayDeque) dpfVar.G).add(c4eVar3);
                    }
                }
                d86Var = new d86(arrayList);
            }
        }
        int size = d86Var.a.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            c4e c4eVar4 = (c4e) d86Var.a.get(i2);
            if (c4eVar4 == c4eVar) {
                z = false;
            } else {
                c4eVar4.G.I.getClass();
            }
            if (zIsShutdown) {
                c4eVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                f4e f4eVar3 = c4eVar4.G;
                f4eVar3.j(interruptedIOException);
                c4eVar4.E.onFailure(f4eVar3, interruptedIOException);
            } else {
                ExecutorService executorServiceB = dpfVar.B();
                c4eVar4.getClass();
                f4e f4eVar4 = c4eVar4.G;
                f4eVar4.E.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceB).execute(c4eVar4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        f4e f4eVar5 = c4eVar4.G;
                        f4eVar5.j(interruptedIOException2);
                        c4eVar4.E.onFailure(f4eVar5, interruptedIOException2);
                        dpf dpfVar2 = f4eVar4.E.a;
                        dpfVar2.getClass();
                        T(dpfVar2, null, null, c4eVar4, 3);
                    }
                } catch (Throwable th2) {
                    dpf dpfVar3 = f4eVar4.E.a;
                    dpfVar3.getClass();
                    T(dpfVar3, null, null, c4eVar4, 3);
                    throw th2;
                }
            }
        }
        if (!z || c4eVar == null) {
            return;
        }
        c4eVar.G.I.getClass();
    }

    public static void t(dpf dpfVar, jzb jzbVar) {
        dpfVar.getClass();
        jzbVar.getClass();
        if (((LinkedHashSet) dpfVar.H).add(jzbVar)) {
            mzb mzbVar = (mzb) dpfVar.G;
            mzbVar.getClass();
            if (jzbVar.c != null) {
                xh6.l(jzbVar, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            mzbVar.e.addFirst(jzbVar);
            jzbVar.c = dpfVar;
            mzbVar.b();
        }
    }

    public cpc A(String str) {
        boolean zR;
        Uri uriBuild;
        Account account = (Account) w44.N0(((w72) this.H).a("_id = ?", new String[]{str}));
        if (account != null) {
            Uri.Builder builderBuildUpon = CalendarContract.Events.CONTENT_URI.buildUpon();
            zR = x44.r(account.type, "LOCAL");
            if (zR) {
                builderBuildUpon.appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", account.name).appendQueryParameter("account_type", account.type);
            }
            uriBuild = builderBuildUpon.build();
        } else {
            zR = false;
            uriBuild = null;
        }
        return new cpc(uriBuild, Boolean.valueOf(zR));
    }

    public synchronized ExecutorService B() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.F) == null) {
                this.F = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new alj(blj.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.F;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public cx7 C(String str) {
        wx7 wx7Var = (wx7) ((HashMap) this.G).get(str);
        if (wx7Var != null) {
            return wx7Var.j();
        }
        return null;
    }

    public c4e D(String str) {
        Iterator it = ((ArrayDeque) this.G).iterator();
        it.getClass();
        while (it.hasNext()) {
            c4e c4eVar = (c4e) it.next();
            if (x44.r(c4eVar.G.F.a.d, str)) {
                return c4eVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.I).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            c4e c4eVar2 = (c4e) it2.next();
            if (x44.r(c4eVar2.G.F.a.d, str)) {
                return c4eVar2;
            }
        }
        return null;
    }

    public cx7 E(String str) {
        for (wx7 wx7Var : ((HashMap) this.G).values()) {
            if (wx7Var != null) {
                cx7 cx7VarJ = wx7Var.j();
                if (!str.equals(cx7VarJ.I)) {
                    cx7VarJ = cx7VarJ.Z.c.E(str);
                }
                if (cx7VarJ != null) {
                    return cx7VarJ;
                }
            }
        }
        return null;
    }

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        for (wx7 wx7Var : ((HashMap) this.G).values()) {
            if (wx7Var != null) {
                arrayList.add(wx7Var);
            }
        }
        return arrayList;
    }

    public ArrayList G() {
        ArrayList arrayList = new ArrayList();
        for (wx7 wx7Var : ((HashMap) this.G).values()) {
            if (wx7Var != null) {
                arrayList.add(wx7Var.j());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public qqb H(gh3 gh3Var, List list) {
        gh3Var.getClass();
        return (qqb) ((afa) this.I).invoke(new r6c(gh3Var, list));
    }

    public List I(List list) throws IOException {
        if (list.isEmpty()) {
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = ((Context) this.F).getContentResolver().query(CalendarContract.Events.CONTENT_URI, new String[]{"_id", "title", "dtstart", "dtend", "_sync_id"}, ij0.j("_id IN (", w44.S0(list, ",", null, null, new hz6(1), 30), ")"), (String[]) list.toArray(new String[0]), null);
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_sync_id"));
                String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("title"));
                if (string3 == null) {
                    string3 = "";
                }
                String str = string3;
                long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("dtstart"));
                long j2 = !cursorQuery.isNull(cursorQuery.getColumnIndexOrThrow("dtend")) ? cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("dtend")) : 0L;
                OffsetDateTime offsetDateTimeOfInstant = OffsetDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
                OffsetDateTime offsetDateTimeOfInstant2 = j2 > 0 ? OffsetDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()) : null;
                string.getClass();
                offsetDateTimeOfInstant.getClass();
                arrayList.add(new EventInfo(string, str, offsetDateTimeOfInstant, offsetDateTimeOfInstant2, string2));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public List J() {
        ArrayList arrayList;
        if (((ArrayList) this.F).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.F)) {
            arrayList = new ArrayList((ArrayList) this.F);
        }
        return arrayList;
    }

    public vxi L(pl9 pl9Var, String str) {
        vxi vxiVar;
        vxi vxiVarA;
        pl9Var.getClass();
        synchronized (((efk) this.I)) {
            try {
                dyi dyiVar = (dyi) this.F;
                dyiVar.getClass();
                vxiVar = (vxi) dyiVar.a.get(str);
                if (pl9Var.n(vxiVar)) {
                    zxi zxiVar = (zxi) this.G;
                    if (zxiVar instanceof v5f) {
                        vxiVar.getClass();
                        ((v5f) zxiVar).e(vxiVar);
                    }
                    vxiVar.getClass();
                } else {
                    sub subVar = new sub((j95) this.H);
                    subVar.a.put(cyi.a, str);
                    zxi zxiVar2 = (zxi) this.G;
                    zxiVar2.getClass();
                    try {
                        try {
                            vxiVarA = zxiVar2.c(pl9Var, subVar);
                        } catch (AbstractMethodError unused) {
                            vxiVarA = zxiVar2.a(ez1.I(pl9Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        vxiVarA = zxiVar2.b(ez1.I(pl9Var), subVar);
                    }
                    vxiVar = vxiVarA;
                    dyi dyiVar2 = (dyi) this.F;
                    dyiVar2.getClass();
                    vxiVar.getClass();
                    vxi vxiVar2 = (vxi) dyiVar2.a.put(str, vxiVar);
                    if (vxiVar2 != null) {
                        vxiVar2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vxiVar;
    }

    public boolean M(Context context) {
        if (((Boolean) this.H) == null) {
            this.H = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.G).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.H).booleanValue();
    }

    public boolean N(Context context) {
        if (((Boolean) this.G) == null) {
            this.G = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.G).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.G).booleanValue();
    }

    public oe3 O(Object obj, String str, SerializableContainer serializableContainer, kd4 kd4Var) {
        obj.getClass();
        str.getClass();
        q4a q4aVar = new q4a();
        q4aVar.E = um6.E;
        q4aVar.F = z3a.F;
        n78 n78Var = new n78((b4a) this.G, q4aVar);
        b bVar = new b(serializableContainer);
        if (kd4Var == null) {
            kd4Var = new kd4();
        }
        kd4 kd4Var2 = kd4Var;
        jq5 jq5Var = new jq5((jq5) this.H, true, 0);
        pz7 pz7Var = (pz7) this.I;
        ((kq5) this.F).getClass();
        return new oe3(obj, str, pz7Var.invoke(obj, new lq5(n78Var, bVar, kd4Var2, jq5Var)), q4aVar, bVar, kd4Var2, jq5Var);
    }

    public String P(String str) {
        return ij0.k("ChatScreenDataStateKeeper_", str, "_", (String) this.F);
    }

    public void Q(wx7 wx7Var) {
        cx7 cx7VarJ = wx7Var.j();
        String str = cx7VarJ.I;
        HashMap map = (HashMap) this.G;
        if (map.get(str) != null) {
            return;
        }
        map.put(cx7VarJ.I, wx7Var);
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + cx7VarJ);
        }
    }

    public void R(wx7 wx7Var) {
        HashMap map = (HashMap) this.G;
        cx7 cx7VarJ = wx7Var.j();
        if (cx7VarJ.g0) {
            ((tx7) this.I).f(cx7VarJ);
        }
        if (map.get(cx7VarJ.I) == wx7Var && ((wx7) map.put(cx7VarJ.I, null)) != null && rx7.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + cx7VarJ);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:0|2|(1:4)|5|(1:7)(1:8)|9|(1:11)(1:12)|13|(2:15|(1:(25:18|(1:(1:(23:26|31|209|32|(4:(8:36|220|37|(1:39)|(2:44|234)|45|34|216)|233|48|49)(1:59)|75|(1:77)(1:78)|79|214|80|(4:(8:84|224|85|(1:101)(2:89|(2:91|(2:93|(1:95)(1:98))(1:99))(1:100))|102|103|82|212)|230|104|105)(1:115)|131|(1:133)|211|134|(1:188)(4:141|(1:143)(2:147|(1:149)(2:150|(1:152)(2:153|(1:155)(2:156|(5:158|(2:160|(2:162|(2:164|(1:166)(2:168|169))(1:170))(1:171))(1:172)|167|173|174)(0)))))|144|(0)(0))|189|(5:192|(2:195|193)|226|196|(3:198|(2:201|199)|227))|202|(1:204)(1:206)|205|207|208)(1:27))(1:29))(1:30)|28|31|209|32|(0)(0)|75|(0)(0)|79|214|80|(0)(0)|131|(0)|211|134|(2:136|188)(0)|189|(0)|202|(0)(0)|205|207|208)(1:19))(1:21))(1:22)|20|(0)(0)|28|31|209|32|(0)(0)|75|(0)(0)|79|214|80|(0)(0)|131|(0)|211|134|(0)(0)|189|(0)|202|(0)(0)|205|207|208|(3:(0)|(1:219)|(1:223))) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021f, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0315, code lost:
    
        defpackage.zfa.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x031e, code lost:
    
        if (defpackage.yfa.b() != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0321, code lost:
    
        r1 = defpackage.iuj.E(r20);
        r5 = defpackage.yfa.b;
        r7 = new java.util.ArrayList();
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0336, code lost:
    
        r11 = r5.next();
        ((defpackage.n30) ((defpackage.zfa) r11)).getClass();
        r7.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x034b, code lost:
    
        if (r7.isEmpty() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x034d, code lost:
    
        defpackage.zfa.a.getClass();
        r0 = defpackage.ij0.k("Failed to get recurrence for event ", r12, ": ", defpackage.gsk.c(r0));
        r3 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0366, code lost:
    
        ((defpackage.n30) ((defpackage.zfa) r3.next())).b(r2, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r26 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0293 A[Catch: Exception -> 0x02af, TryCatch #1 {Exception -> 0x02af, blocks: (B:134:0x028b, B:136:0x0293, B:138:0x0299, B:141:0x02a1, B:143:0x02aa, B:158:0x02d7, B:173:0x02ff, B:168:0x02f0, B:169:0x02f5, B:147:0x02b2, B:149:0x02ba, B:150:0x02bd, B:152:0x02c5, B:153:0x02c8, B:155:0x02d0), top: B:211:0x028b }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d7 A[Catch: Exception -> 0x02af, TryCatch #1 {Exception -> 0x02af, blocks: (B:134:0x028b, B:136:0x0293, B:138:0x0299, B:141:0x02a1, B:143:0x02aa, B:158:0x02d7, B:173:0x02ff, B:168:0x02f0, B:169:0x02f5, B:147:0x02b2, B:149:0x02ba, B:150:0x02bd, B:152:0x02c5, B:153:0x02c8, B:155:0x02d0), top: B:211:0x028b }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01be A[EXC_TOP_SPLITTER, LOOP:4: B:212:0x01be->B:103:0x0201, LOOP_START, PHI: r0 r5 r7 r20
      0x01be: PHI (r0v59 java.lang.String) = (r0v37 java.lang.String), (r0v69 java.lang.String) binds: [B:81:0x01bc, B:103:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r5v19 java.lang.Object) = (r5v24 java.lang.Object), (r5v23 java.lang.Object) binds: [B:81:0x01bc, B:103:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r7v23 java.lang.String) = (r7v9 java.lang.String), (r7v25 java.lang.String) binds: [B:81:0x01bc, B:103:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r20v7 java.lang.Object) = (r20v18 java.lang.Object), (r20v19 java.lang.Object) binds: [B:81:0x01bc, B:103:0x0201] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00e9 A[EXC_TOP_SPLITTER, LOOP:7: B:216:0x00e9->B:45:0x0112, LOOP_START, PHI: r0 r4
      0x00e9: PHI (r0v74 java.lang.String) = (r0v26 java.lang.String), (r0v82 java.lang.String) binds: [B:33:0x00e7, B:45:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r4v10 java.lang.String) = (r4v3 java.lang.String), (r4v15 java.lang.String) binds: [B:33:0x00e7, B:45:0x0112] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem S(android.database.Cursor r38, android.content.ContentResolver r39) {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpf.S(android.database.Cursor, android.content.ContentResolver):com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem");
    }

    public Bundle U(String str, Bundle bundle) {
        HashMap map = (HashMap) this.H;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void V(hlg hlgVar) {
        hlgVar.getClass();
        yw5 yw5Var = new yw5(this, 26, hlgVar);
        synchronized (this.H) {
        }
        ((Handler) ((n78) this.F).F).postDelayed(yw5Var, 5400000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[Catch: NumberFormatException | JSONException -> 0x0108, NumberFormatException | JSONException -> 0x0108, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0108, blocks: (B:9:0x002f, B:21:0x005b, B:21:0x005b, B:23:0x0063, B:23:0x0063, B:25:0x0070, B:25:0x0070, B:27:0x0082, B:27:0x0082, B:28:0x008b, B:28:0x008b, B:46:0x00fc, B:46:0x00fc, B:29:0x0090, B:29:0x0090, B:31:0x0098, B:31:0x0098, B:33:0x00a5, B:33:0x00a5, B:35:0x00b7, B:35:0x00b7, B:36:0x00c0, B:36:0x00c0, B:37:0x00c4, B:37:0x00c4, B:39:0x00cc, B:39:0x00cc, B:40:0x00d4, B:40:0x00d4, B:42:0x00dc, B:42:0x00dc, B:43:0x00e8, B:43:0x00e8, B:45:0x00f0, B:45:0x00f0), top: B:60:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle W() {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpf.W():android.os.Bundle");
    }

    public void X(Bundle bundle) {
        vik vikVar = (vik) this.I;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = vikVar.T0().edit();
        int size = bundle.size();
        String str = (String) this.F;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        b4l.a();
                        if (((umk) vikVar.E).K.X0(null, zvj.G0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "d");
                            } else {
                                vikVar.b0().J.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                vikVar.b0().J.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        vikVar.b0().J.c("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.H = bundle;
    }

    @Override // defpackage.if7
    public void b() {
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) this.I);
        ((AtomicBoolean) this.H).set(false);
    }

    @Override // okio.Socket
    public void cancel() throws IOException {
        ((java.net.Socket) this.F).close();
    }

    @Override // okio.Socket
    public Source d() {
        return (pt5) this.H;
    }

    @Override // defpackage.dsi
    public long e(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        int iB = sb0Var.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((tb0) this.F).get(i).c(sb0Var.a(i), sb0Var2.a(i), sb0Var3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.dsi
    public sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        if (((sb0) this.H) == null) {
            this.H = sb0Var3.c();
        }
        sb0 sb0Var4 = (sb0) this.H;
        if (sb0Var4 == null) {
            x44.o0("velocityVector");
            throw null;
        }
        int iB = sb0Var4.b();
        int i = 0;
        while (true) {
            sb0 sb0Var5 = (sb0) this.H;
            if (i >= iB) {
                if (sb0Var5 != null) {
                    return sb0Var5;
                }
                x44.o0("velocityVector");
                throw null;
            }
            if (sb0Var5 == null) {
                x44.o0("velocityVector");
                throw null;
            }
            sb0Var5.e(i, ((tb0) this.F).get(i).b(j, sb0Var.a(i), sb0Var2.a(i), sb0Var3.a(i)));
            i++;
        }
    }

    @Override // defpackage.jki
    public void g() {
        v40.p((ScheduledThreadPoolExecutor) this.G, kgh.o((String) this.F, ": data upload"), (h99) this.H, (ei5) this.I);
    }

    @Override // defpackage.ivd
    public Object get() {
        return new dpf((Executor) ((ivd) this.F).get(), (sze) ((ivd) this.G).get(), (fj0) ((w3c) this.H).get(), (sze) ((ivd) this.I).get(), 25);
    }

    @Override // defpackage.if7
    public String getName() {
        return (String) this.F;
    }

    @Override // defpackage.bh5
    public void i(UUID uuid, hj6 hj6Var) {
        v40.p((ob1) this.F, "dataStoreWrite", (h99) this.G, new f60(this, uuid, hj6Var, 2));
    }

    @Override // defpackage.if7
    public void j(Context context) {
        context.getClass();
        this.I = Thread.getDefaultUncaughtExceptionHandler();
        vj5 vj5Var = new vj5((qj5) this.G, context);
        vj5Var.G = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(vj5Var);
        ((AtomicBoolean) this.H).set(true);
    }

    @Override // defpackage.vg3
    public ug3 l(gh3 gh3Var) {
        gh3Var.getClass();
        esd esdVar = (esd) ((LinkedHashMap) this.I).get(gh3Var);
        if (esdVar == null) {
            return null;
        }
        return new ug3((q28) this.F, esdVar, (qz1) this.G, (neg) ((lxe) this.H).invoke(gh3Var));
    }

    @Override // defpackage.jki
    public void m() {
        ((ScheduledThreadPoolExecutor) this.G).remove((ei5) this.I);
    }

    @Override // okio.Socket
    public Sink n() {
        return (ot5) this.I;
    }

    @Override // defpackage.dsi
    public sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        if (((sb0) this.G) == null) {
            this.G = sb0Var.c();
        }
        sb0 sb0Var4 = (sb0) this.G;
        if (sb0Var4 == null) {
            x44.o0("valueVector");
            throw null;
        }
        int iB = sb0Var4.b();
        int i = 0;
        while (true) {
            sb0 sb0Var5 = (sb0) this.G;
            if (i >= iB) {
                if (sb0Var5 != null) {
                    return sb0Var5;
                }
                x44.o0("valueVector");
                throw null;
            }
            if (sb0Var5 == null) {
                x44.o0("valueVector");
                throw null;
            }
            sb0Var5.e(i, ((tb0) this.F).get(i).e(j, sb0Var.a(i), sb0Var2.a(i), sb0Var3.a(i)));
            i++;
        }
    }

    @Override // defpackage.dsi
    public sb0 q(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        if (((sb0) this.I) == null) {
            this.I = sb0Var3.c();
        }
        sb0 sb0Var4 = (sb0) this.I;
        if (sb0Var4 == null) {
            x44.o0("endVelocityVector");
            throw null;
        }
        int iB = sb0Var4.b();
        int i = 0;
        while (true) {
            sb0 sb0Var5 = (sb0) this.I;
            if (i >= iB) {
                if (sb0Var5 != null) {
                    return sb0Var5;
                }
                x44.o0("endVelocityVector");
                throw null;
            }
            if (sb0Var5 == null) {
                x44.o0("endVelocityVector");
                throw null;
            }
            sb0Var5.e(i, ((tb0) this.F).get(i).d(sb0Var.a(i), sb0Var2.a(i), sb0Var3.a(i)));
            i++;
        }
    }

    @Override // defpackage.bh5
    public void r(efe efeVar, efk efkVar) {
        v40.p((ob1) this.F, "dataStoreRead", (h99) this.G, new fy1(this, efkVar, efeVar, 1));
    }

    public void s(cx7 cx7Var) {
        if (((ArrayList) this.F).contains(cx7Var)) {
            xh6.m("Fragment already added: ", cx7Var);
            return;
        }
        synchronized (((ArrayList) this.F)) {
            ((ArrayList) this.F).add(cx7Var);
        }
        cx7Var.O = true;
    }

    public String toString() {
        switch (this.E) {
            case 9:
                String string = ((java.net.Socket) this.F).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public void u(lzb lzbVar) {
        if (((LinkedHashSet) this.I).add(lzbVar)) {
            ((mzb) this.G).a(this, lzbVar, -1);
        }
    }

    public void v(mdc mdcVar, int i) {
        if (i != 1 && i != 0) {
            mr9.q(grc.p(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.I).add(mdcVar)) {
            ((mzb) this.G).a(this, mdcVar, i);
        }
    }

    public void w(hlg hlgVar) {
        Runnable runnable;
        hlgVar.getClass();
        synchronized (this.H) {
            runnable = (Runnable) ((LinkedHashMap) this.I).remove(hlgVar);
        }
        if (runnable != null) {
            ((Handler) ((n78) this.F).F).removeCallbacks(runnable);
        }
    }

    public m7f x(String str, xai xaiVar, Object obj) throws ScopeAlreadyCreatedException {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.H;
        str.getClass();
        er9 er9Var = (er9) this.F;
        rok rokVar = er9Var.a;
        rokVar.getClass();
        k3a k3aVar = k3a.E;
        rokVar.u0(k3aVar, "| (+) Scope - id:'" + str + "' q:'" + xaiVar + '\'');
        Set set = (Set) this.G;
        if (!set.contains(xaiVar)) {
            rok rokVar2 = er9Var.a;
            rokVar2.getClass();
            rokVar2.u0(k3aVar, "| Scope '" + xaiVar + "' not defined. Creating it ...");
            set.add(xaiVar);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new ScopeAlreadyCreatedException(ij0.j("Scope with id '", str, "' is already created"));
        }
        m7f m7fVar = new m7f(xaiVar, str, er9Var, 4);
        if (obj != null) {
            rok rokVar3 = er9Var.a;
            rokVar3.getClass();
            rokVar3.u0(k3aVar, "|- Scope source set id:'" + str + "' -> " + obj);
            m7fVar.g = obj;
        }
        m7f[] m7fVarArr = {(m7f) this.I};
        if (m7fVar.c) {
            sz6.j("Can't add scope link to a root scope");
            return null;
        }
        m7fVar.f.addAll(0, mp0.Y0(m7fVarArr));
        concurrentHashMap.put(str, m7fVar);
        return m7fVar;
    }

    public void y(m7f m7fVar) {
        String str = m7fVar.b;
        fj0 fj0Var = ((er9) this.F).d;
        fj0Var.getClass();
        x59[] x59VarArr = (x59[]) ((ConcurrentHashMap) fj0Var.F).values().toArray(new x59[0]);
        ArrayList<w7f> arrayList = new ArrayList();
        for (x59 x59Var : x59VarArr) {
            if (x59Var instanceof w7f) {
                arrayList.add(x59Var);
            }
        }
        for (w7f w7fVar : arrayList) {
            HashMap map = w7fVar.c;
            bz7 bz7Var = w7fVar.a.g.a;
            if (bz7Var != null) {
                bz7Var.invoke(map.get(str));
            }
            map.remove(str);
        }
        ((ConcurrentHashMap) this.H).remove(str);
    }

    public void z(lzb lzbVar, hzb hzbVar) {
        mzb mzbVar = (mzb) this.G;
        mzbVar.getClass();
        if (mzbVar.g != 0) {
            return;
        }
        jzb jzbVarC = mzbVar.c(-1);
        mzbVar.f = jzbVarC;
        mzbVar.g = -1;
        mzbVar.h = lzbVar;
        if (hzbVar != null) {
            if (jzbVarC != null) {
                jzbVarC.d(hzbVar);
            }
            amg amgVar = mzbVar.a;
            ozb ozbVar = new ozb(hzbVar);
            amgVar.getClass();
            amgVar.n(null, ozbVar);
        }
    }

    public /* synthetic */ dpf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public dpf(String str, b bVar, b33 b33Var, t43 t43Var) {
        this.E = 4;
        str.getClass();
        bVar.getClass();
        this.F = str;
        this.G = bVar;
        this.H = b33Var;
        this.I = t43Var;
        final int i = 0;
        bVar.b(P("isCreatedChat"), zt1.a, new zy7(this) { // from class: v53
            public final /* synthetic */ dpf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                dpf dpfVar = this.F;
                switch (i2) {
                    case 0:
                        return (Boolean) ((b33) dpfVar.H).a();
                    default:
                        ModelId modelId = (ModelId) ((t43) dpfVar.I).a();
                        String strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                        String str2 = strM1064unboximpl != null ? strM1064unboximpl : null;
                        return str2 == null ? "" : str2;
                }
            }
        });
        final int i2 = 1;
        bVar.b(P("selectedModel"), srg.a, new zy7(this) { // from class: v53
            public final /* synthetic */ dpf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                dpf dpfVar = this.F;
                switch (i22) {
                    case 0:
                        return (Boolean) ((b33) dpfVar.H).a();
                    default:
                        ModelId modelId = (ModelId) ((t43) dpfVar.I).a();
                        String strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                        String str2 = strM1064unboximpl != null ? strM1064unboximpl : null;
                        return str2 == null ? "" : str2;
                }
            }
        });
    }

    public dpf(kq5 kq5Var, b4a b4aVar, jq5 jq5Var, pz7 pz7Var) {
        this.E = 8;
        kq5Var.getClass();
        b4aVar.getClass();
        this.F = kq5Var;
        this.G = b4aVar;
        this.H = jq5Var;
        this.I = pz7Var;
    }

    public dpf(qj5 qj5Var) {
        this.E = 5;
        this.G = qj5Var;
        this.H = new AtomicBoolean(false);
        this.I = Thread.getDefaultUncaughtExceptionHandler();
        this.F = "crash";
    }

    public dpf(h99 h99Var, h35 h35Var, n78 n78Var, Handler handler) {
        this.E = 18;
        h99Var.getClass();
        this.F = h99Var;
        this.G = h35Var;
        this.H = n78Var;
        this.I = handler;
    }

    public dpf(int i, lp4 lp4Var, fi5 fi5Var, h99 h99Var, b1c b1cVar, pog pogVar, p1h p1hVar, String str, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, nyj nyjVar) {
        this.E = 7;
        str.getClass();
        pogVar.getClass();
        fi5Var.getClass();
        lp4Var.getClass();
        b1cVar.getClass();
        p1hVar.getClass();
        h99Var.getClass();
        this.F = str;
        this.G = scheduledThreadPoolExecutor;
        this.H = h99Var;
        this.I = new ei5(i, lp4Var, fi5Var, h99Var, b1cVar, pogVar, p1hVar, str, scheduledThreadPoolExecutor, nyjVar);
    }

    public dpf(ob1 ob1Var, h99 h99Var, el5 el5Var, el5 el5Var2) {
        this.E = 6;
        h99Var.getClass();
        this.F = ob1Var;
        this.G = h99Var;
        this.H = el5Var;
        this.I = el5Var2;
    }

    public dpf(gfa gfaVar, tqb tqbVar) {
        this.E = 16;
        tqbVar.getClass();
        this.F = gfaVar;
        this.G = tqbVar;
        this.H = gfaVar.b(new t6c(this, 1));
        this.I = gfaVar.b(new t6c(this, 0));
    }

    public dpf(atd atdVar, q28 q28Var, qz1 qz1Var, lxe lxeVar) {
        this.E = 17;
        this.F = q28Var;
        this.G = qz1Var;
        this.H = lxeVar;
        List list = atdVar.K;
        list.getClass();
        List list2 = list;
        int iD0 = tta.d0(x44.y(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj : list2) {
            linkedHashMap.put(iv1.u((q28) this.F, ((esd) obj).I), obj);
        }
        this.I = linkedHashMap;
    }

    public dpf(mp4 mp4Var, jwf jwfVar) {
        this.E = 2;
        this.F = mp4Var;
        this.G = jwfVar;
        this.H = new mdg();
        this.I = new LinkedHashSet();
    }

    public dpf(mp4 mp4Var, a2 a2Var, z35 z35Var, dx dxVar) {
        this.E = 20;
        this.F = mp4Var;
        this.G = dxVar;
        this.H = wd6.P(Integer.MAX_VALUE, 6, null);
        this.I = new tk5(4);
        lf9 lf9Var = (lf9) mp4Var.E.x0(dd8.J);
        if (lf9Var != null) {
            lf9Var.D0(new nf1(a2Var, this, z35Var, 22));
        }
    }

    public dpf(dyi dyiVar, zxi zxiVar, j95 j95Var) {
        this.E = 24;
        dyiVar.getClass();
        zxiVar.getClass();
        j95Var.getClass();
        this.F = dyiVar;
        this.G = zxiVar;
        this.H = j95Var;
        this.I = new efk(28);
    }

    public dpf(er9 er9Var) {
        this.E = 1;
        this.F = er9Var;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.G = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.H = concurrentHashMap;
        mrg mrgVar = K;
        m7f m7fVar = new m7f(mrgVar, "_root_", er9Var, 8);
        this.I = m7fVar;
        setNewSetFromMap.add(mrgVar);
        concurrentHashMap.put("_root_", m7fVar);
    }

    public dpf(java.net.Socket socket) {
        this.E = 9;
        this.F = socket;
        this.G = new AtomicInteger();
        this.H = new pt5(this);
        this.I = new ot5(this);
    }

    public dpf(AndroidComposeView androidComposeView, n91 n91Var) {
        this.E = 3;
        this.F = androidComposeView;
        this.G = n91Var;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.H = autofillManager;
            androidComposeView.setImportantForAutofill(1);
            AutofillId autofillId = androidComposeView.getAutofillId();
            if (autofillId != null) {
                this.I = autofillId;
                return;
            }
            throw sq6.z("Required value was null.");
        }
        sz6.j("Autofill service could not be located.");
        throw null;
    }

    public dpf(cd cdVar) {
        this.E = 14;
        this.F = cdVar;
        this.G = new mzb();
        new LinkedHashSet();
        this.H = new LinkedHashSet();
        this.I = new LinkedHashSet();
    }

    public dpf(vik vikVar, String str) {
        this.E = 27;
        this.I = vikVar;
        dgj.s(str);
        this.F = str;
        this.G = new Bundle();
    }

    public dpf(int i) {
        this.E = i;
        switch (i) {
            case 11:
                this.I = new ArrayDeque();
                this.G = new ArrayDeque();
                this.H = new ArrayDeque();
                break;
            case 12:
            case 14:
            default:
                this.F = null;
                this.G = null;
                this.H = null;
                this.I = new ArrayDeque();
                break;
            case 13:
                this.F = new ArrayList();
                this.G = new HashMap();
                this.H = new HashMap();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                AtomicInteger atomicInteger = new AtomicInteger(0);
                AtomicInteger atomicInteger2 = new AtomicInteger(0);
                AtomicInteger atomicInteger3 = new AtomicInteger(0);
                AtomicInteger atomicInteger4 = new AtomicInteger(0);
                this.F = atomicInteger;
                this.G = atomicInteger2;
                this.H = atomicInteger3;
                this.I = atomicInteger4;
                break;
        }
    }

    public dpf(n78 n78Var, cbf cbfVar) {
        this.E = 22;
        n78Var.getClass();
        this.F = n78Var;
        this.G = cbfVar;
        this.H = new Object();
        this.I = new LinkedHashMap();
    }

    public dpf(long j, long j2, long j3) {
        this.E = 21;
        this.F = mpk.P(new k8g(j));
        this.G = mpk.P(new fcc(j2));
        this.H = mpk.P(new fcc(j3));
        this.I = mpk.P(new fcc(j2));
    }

    public dpf(tb0 tb0Var) {
        this.E = 23;
        this.F = tb0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dpf(jo7 jo7Var) {
        this(new hsi(0, jo7Var));
        this.E = 23;
    }
}
