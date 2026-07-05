package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.TrackEvent;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class gx implements lvg {
    public static final yw Companion = new yw();
    public static ql8 K = new ql8(15);
    public final eg4 E;
    public final /* synthetic */ el5 F;
    public final u0h G;
    public final u0h H;
    public wmi I;
    public boolean J;

    public gx(eg4 eg4Var, el5 el5Var) {
        this.E = eg4Var;
        this.F = el5Var;
        mff mffVar = (mff) this;
        this.G = new u0h(new fx(mffVar, 1));
        int i = 0;
        this.H = new u0h(new fx(mffVar, i));
        tmi tmiVar = wmi.Companion;
        oog oogVarA = a();
        tmiVar.getClass();
        oogVarA.getClass();
        String strA = oogVarA.a(1);
        ag9 ag9Var = bg9.d;
        int i2 = 2;
        String strA2 = oogVarA.a(2);
        strA2 = strA2 == null ? "{}" : strA2;
        ag9Var.getClass();
        JsonObject jsonObject = (JsonObject) ag9Var.b(strA2, d4c.S(JsonObject.INSTANCE.serializer()));
        String strA3 = oogVarA.a(3);
        this.I = new wmi(strA3 == null ? vb7.i() : strA3, strA, jsonObject);
        this.J = true;
        tp4 tp4Var = null;
        if (bsg.I0(eg4Var.a)) {
            sz6.p("invalid configuration");
            throw null;
        }
        b().a(new tlg());
        b().a(new kp4());
        b().a(new nk5(i2));
        wah.E.c("analytics_mobile.invoke", new e0(4, mffVar));
        gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new zw(mffVar, tp4Var, i), 2);
    }

    public static void d(gx gxVar, String str, JsonObject jsonObject, int i) {
        if ((i & 2) != 0) {
            jsonObject = s47.a;
        }
        str.getClass();
        jsonObject.getClass();
        gxVar.c(new ScreenEvent(str, "", jsonObject), null);
    }

    public static void e(gx gxVar, String str, JsonObject jsonObject, int i) {
        if ((i & 2) != 0) {
            jsonObject = s47.a;
        }
        str.getClass();
        jsonObject.getClass();
        gxVar.c(new TrackEvent(jsonObject, str), null);
    }

    public final oog a() {
        return (oog) this.H.getValue();
    }

    public final lqh b() {
        return (lqh) this.G.getValue();
    }

    public final void c(BaseEvent baseEvent, bz7 bz7Var) {
        if (this.J) {
            baseEvent.applyBaseData$core(bz7Var);
            yb5.z(this, "applying base attributes on " + Thread.currentThread().getName());
            el5 el5Var = this.F;
            gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new dx(baseEvent, this, (tp4) null), 2);
        }
    }
}
