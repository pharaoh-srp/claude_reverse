package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.webkit.CookieManager;
import com.anthropic.claude.widget.ClaudeAppWidgetReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o41 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(x0a x0aVar, int i, koc kocVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 5;
        this.H = x0aVar;
        this.G = i;
        this.I = kocVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                o41 o41Var = new o41(this.G, (p41) obj2, tp4Var);
                o41Var.H = obj;
                return o41Var;
            case 1:
                return new o41((mo1) this.H, (zy1) obj2, this.G, tp4Var, 1);
            case 2:
                o41 o41Var2 = new o41((c61) obj2, tp4Var);
                o41Var2.H = obj;
                return o41Var2;
            case 3:
                return new o41((lv4) this.H, (String) obj2, this.G, tp4Var, 3);
            case 4:
                return new o41((ClaudeAppWidgetReceiver) this.H, (Context) obj2, this.G, tp4Var, 4);
            case 5:
                return new o41((x0a) this.H, this.G, (koc) obj2, tp4Var);
            default:
                return new o41((qnd) this.H, (String) obj2, this.G, tp4Var, 6);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((o41) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objI;
        ?? r2;
        tkb tkbVar;
        Object objInvoke;
        Object objP;
        int i = this.E;
        boolean z = false;
        z = false;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        Object obj2 = this.I;
        vs8 vs8VarC = null;
        boolean z2 = false;
        switch (i) {
            case 0:
                int i2 = this.G;
                aid aidVar = (aid) this.H;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    AudioManager audioManager = ((p41) obj2).b;
                    if (audioManager != null && audioManager.getStreamVolume(i2) == 0) {
                        z = true;
                    }
                    iik.i(aidVar, Boolean.valueOf(z));
                    n41 n41Var = new n41(aidVar, audioManager, i2);
                    Context context = x44.d;
                    if (context != null) {
                        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, n41Var);
                        k6 k6Var = new k6(context, 27, n41Var);
                        this.H = null;
                        this.F = 1;
                        return v40.k(aidVar, k6Var, this) == m45Var ? m45Var : ieiVar;
                    }
                    sz6.j("Context not initialized");
                } else {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    int i5 = this.G;
                    this.F = 1;
                    return mo1.a((mo1) this.H, (zy1) obj2, i5, this) == m45Var ? m45Var : ieiVar;
                }
                if (i4 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                JsonObject jsonObject = (JsonObject) this.H;
                int i6 = this.G;
                if (i6 == 0) {
                    sf5.h0(obj);
                    String strA = gt4.a("text", jsonObject);
                    if (strA != null) {
                        if (bsg.I0(strA)) {
                            strA = null;
                        }
                        if (strA != null) {
                            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "save");
                            Boolean boolE = jsonElement != null ? ch9.e(ch9.j(jsonElement)) : null;
                            boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
                            this.H = null;
                            this.F = zBooleanValue ? 1 : 0;
                            this.G = 1;
                            objI = ((c61) obj2).I(this, strA, zBooleanValue);
                            r2 = zBooleanValue;
                            if (objI == m45Var) {
                                return m45Var;
                            }
                        }
                    }
                    i15 i15Var = i15.d;
                    return new i15(null, "missing text", 2, false);
                }
                if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = this.F;
                sf5.h0(obj);
                r2 = i7;
                objI = obj;
                String str = (String) objI;
                i15 i15Var2 = i15.d;
                rh9 rh9Var = new rh9();
                mpk.U(rh9Var, "status", "started");
                if (str != null) {
                    mpk.U(rh9Var, "saving_to", str);
                } else if (r2 != 0) {
                    mpk.U(rh9Var, "save_error", "could not create the file (requires Android 10+; on newer devices the MediaStore insert itself failed)");
                }
                return zl4.o(rh9Var.a().toString());
            case 3:
                String str2 = (String) obj2;
                lv4 lv4Var = (lv4) this.H;
                int i8 = this.F;
                try {
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    if (lv4Var.l == 0) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj3)).getClass();
                                arrayList.add(obj3);
                            }
                            if (!arrayList.isEmpty()) {
                                String strQ = sq6.q(zfa.a, e, "conway shell token mint failed: ");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfa.WARN, "Conway", strQ);
                                }
                            }
                        }
                    } else {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : copyOnWriteArrayList2) {
                                ((n30) ((zfa) obj4)).getClass();
                                arrayList2.add(obj4);
                            }
                            if (!arrayList2.isEmpty()) {
                                zfa.a.getClass();
                                String strI = ij0.i("conway shell token mint failed again: ", e.getMessage());
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    ((n30) ((zfa) it2.next())).b(sfa.DEBUG, "Conway", strI);
                                }
                            }
                        }
                    }
                    tkbVar = null;
                }
                if (i8 == 0) {
                    sf5.h0(obj);
                    zy7 zy7Var = lv4Var.d;
                    if (zy7Var != null) {
                        zy7Var.a();
                    }
                    if (lv4Var.a) {
                        bz7 bz7Var = lv4Var.b;
                        this.F = 1;
                        objInvoke = bz7Var.invoke(this);
                        if (objInvoke == m45Var) {
                            return m45Var;
                        }
                    }
                    lv4Var.m.loadUrl(str2);
                    return ieiVar;
                }
                if (i8 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                objInvoke = obj;
                tkbVar = (tkb) objInvoke;
                if (tkbVar == null) {
                    bz7 bz7Var2 = lv4Var.g;
                    if (bz7Var2 != null) {
                        bz7Var2.invoke(Boolean.TRUE);
                    }
                    long jMin = Math.min(30000 << Math.min(lv4Var.l, 8), 300000L);
                    lv4Var.l++;
                    lv4Var.k = gb9.D(lv4Var.c, null, null, new kv4(jMin, lv4Var, (String) obj2, this.G, null), 3);
                    return ieiVar;
                }
                lv4Var.l = 0;
                bz7 bz7Var3 = lv4Var.g;
                if (bz7Var3 != null) {
                    bz7Var3.invoke(Boolean.FALSE);
                }
                str2.getClass();
                try {
                    us8 us8Var = new us8();
                    us8Var.h(null, str2);
                    vs8VarC = us8Var.c();
                    break;
                } catch (IllegalArgumentException unused) {
                }
                if (vs8VarC != null) {
                    String strC = ij0.C(vs8VarC.a, "://", vs8VarC.d);
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.setAcceptCookie(true);
                    cookieManager.setCookie(strC, "__Host-conway_jwt=" + tkbVar.a + "; HttpOnly; Secure; Path=/; Max-Age=" + tkbVar.b);
                }
                lv4Var.m.loadUrl(str2);
                return ieiVar;
            case 4:
                int i9 = this.F;
                if (i9 != 0) {
                    if (i9 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                ive iveVar = ((ClaudeAppWidgetReceiver) this.H).b;
                Context context2 = (Context) obj2;
                int i10 = this.G;
                this.F = 1;
                iveVar.getClass();
                AtomicBoolean atomicBoolean = l3i.a;
                if (Build.VERSION.SDK_INT >= 29 && l3i.a.get()) {
                    le0.a();
                }
                Object objT = iveVar.t(context2, new nm0(i10), null, new j68(4, z2 ? 1 : 0, z ? 1 : 0), this);
                if (objT != m45Var) {
                    objT = ieiVar;
                }
                return objT == m45Var ? m45Var : ieiVar;
            case 5:
                int i11 = this.F;
                if (i11 == 0) {
                    sf5.h0(obj);
                    x0a x0aVar = (x0a) this.H;
                    int i12 = this.G;
                    this.F = 1;
                    y5f y5fVar = x0a.y;
                    if (x0aVar.f(i12, 0, this) != m45Var) {
                    }
                    return m45Var;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this.F = 2;
                if (koc.r((koc) obj2, 0, this) != m45Var) {
                    return ieiVar;
                }
                return m45Var;
            default:
                qnd qndVar = (qnd) this.H;
                int i13 = this.F;
                if (i13 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    objP = qndVar.b.p(qnd.i, (String) obj2, this);
                    if (objP == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i13 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objP = obj;
                }
                List list = (List) objP;
                if (list == null || qndVar.f != this.G) {
                    return ieiVar;
                }
                qndVar.d.setValue(list);
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(c61 c61Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.I = c61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(int i, p41 p41Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 0;
        this.I = p41Var;
        this.G = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o41(Object obj, Object obj2, int i, tp4 tp4Var, int i2) {
        super(2, tp4Var);
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.G = i;
    }
}
